package com.github.javagentdoc.doclet;

import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;

import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.lang.model.SourceVersion;
import javax.tools.Diagnostic;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.*;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;

import com.sun.source.util.DocTrees;
import com.sun.source.doctree.DocCommentTree;
import com.sun.source.doctree.DocTree;

/**
 * A custom Javadoc doclet that generates semantic XML documentation
 * suitable for AI processing and conversion to Markdown.
 *
 * This doclet processes Java source code documentation and outputs
 * it in a structured XML format that preserves semantic information
 * about classes, methods, fields, and their documentation comments.
 */
public final class SemanticXmlDoclet implements Doclet {

    private Reporter reporter;
    private Locale locale;

    private Path outFile = Paths.get("target/semantic-javadoc.xml");
    private OutputFormat outputFormat = OutputFormat.XML;
    private Path outputDir = null; // For directory-based output
    private final Set<String> markdownTypeQNames = new HashSet<>();

    private enum OutputFormat {
        XML, MARKDOWN
    }

    @Override
    public void init(Locale locale, Reporter reporter) {
        this.locale = locale;
        this.reporter = reporter;
    }

    @Override
    public String getName() {
        return "semantic-xml-doclet";
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_17;
    }

    @Override
    public Set<? extends Option> getSupportedOptions() {
        return Set.of(
            createOutOption(),
            createFormatOption()
        );
    }

    private Option createOutOption() {
        return new Option() {
            @Override
            public int getArgumentCount() {
                return 1;
            }

            @Override
            public String getDescription() {
                return "Output file path for semantic documentation";
            }

            @Override
            public Kind getKind() {
                return Kind.STANDARD;
            }

            @Override
            public List<String> getNames() {
                return List.of("--semanticOut");
            }

            @Override
            public String getParameters() {
                return "<file>";
            }

            @Override
            public boolean process(String option, List<String> arguments) {
                outFile = Paths.get(arguments.get(0));
                return true;
            }
        };
    }

    private Option createFormatOption() {
        return new Option() {
            @Override
            public int getArgumentCount() {
                return 1;
            }

            @Override
            public String getDescription() {
                return "Output format: xml or markdown";
            }

            @Override
            public Kind getKind() {
                return Kind.STANDARD;
            }

            @Override
            public List<String> getNames() {
                return List.of("--semanticFormat");
            }

            @Override
            public String getParameters() {
                return "xml|markdown";
            }

            @Override
            public boolean process(String option, List<String> arguments) {
                String format = arguments.get(0).toLowerCase(Locale.ROOT);
                outputFormat = "markdown".equals(format) ? OutputFormat.MARKDOWN : OutputFormat.XML;
                return true;
            }
        };
    }

    @Override
    public boolean run(DocletEnvironment env) {
        try {
            Files.createDirectories(outFile.toAbsolutePath().getParent());

            Elements elements = env.getElementUtils();
            Types types = env.getTypeUtils();
            DocTrees docTrees = env.getDocTrees();

            switch (outputFormat) {
                case XML:
                    generateXml(env, docTrees, elements);
                    break;
                case MARKDOWN:
                    generateMarkdown(env, docTrees);
                    break;
            }

            reporter.print(Diagnostic.Kind.NOTE, "Wrote: " + outFile.toAbsolutePath());
            return true;
        } catch (Exception ex) {
            reporter.print(Diagnostic.Kind.ERROR, "Doclet failed: " + ex);
            ex.printStackTrace();
            return false;
        }
    }

    private void generateXml(DocletEnvironment env, DocTrees docTrees, Elements elements) throws Exception {
        try (OutputStream os = Files.newOutputStream(outFile)) {
            XMLOutputFactory f = XMLOutputFactory.newFactory();
            XMLStreamWriter x = f.createXMLStreamWriter(os, "UTF-8");

            x.writeStartDocument("UTF-8", "1.0");
            x.writeStartElement("api");
            x.writeAttribute("version", "1.0");

            for (Element e : env.getIncludedElements()) {
                if (e.getKind() == ElementKind.MODULE) {
                    writeModule(x, (ModuleElement) e, docTrees);
                } else if (e.getKind() == ElementKind.PACKAGE) {
                    writePackage(x, (PackageElement) e, docTrees, elements);
                }
            }

            x.writeEndElement();
            x.writeEndDocument();
            x.flush();
        }
    }

    private void generateMarkdown(DocletEnvironment env, DocTrees docTrees) throws Exception {
        // Determine output directory (parent of outFile)
        outputDir = outFile.getParent();
        if (outputDir == null) {
            outputDir = Paths.get(".");
        }

        // Clean and create output directory
        if (Files.exists(outputDir)) {
            // Delete existing markdown files and directories
            Files.walk(outputDir)
                .filter(p -> p.toString().endsWith(".md") || Files.isDirectory(p))
                .sorted(java.util.Comparator.reverseOrder())
                .forEach(p -> {
                    try {
                        if (!p.equals(outputDir)) {
                            Files.deleteIfExists(p);
                        }
                    } catch (IOException e) {
                        // Ignore
                    }
                });
        }
        Files.createDirectories(outputDir);

        // Build the set of types that will actually be documented in markdown.
        markdownTypeQNames.clear();
        Map<PackageElement, List<TypeElement>> packageTypes = new LinkedHashMap<>();
        List<PackageElement> packages = env.getIncludedElements().stream()
            .filter(e -> e.getKind() == ElementKind.PACKAGE)
            .map(PackageElement.class::cast)
            .sorted(Comparator.comparing(pkg -> pkg.getQualifiedName().toString()))
            .toList();

        for (PackageElement pkg : packages) {
            List<TypeElement> types = pkg.getEnclosedElements().stream()
                .filter(enclosed -> enclosed.getKind().isClass() || enclosed.getKind().isInterface())
                .map(TypeElement.class::cast)
                .filter(this::shouldDocumentType)
                .sorted(Comparator.comparing(type -> type.getSimpleName().toString()))
                .toList();

            if (!types.isEmpty()) {
                packageTypes.put(pkg, types);
                for (TypeElement type : types) {
                    markdownTypeQNames.add(type.getQualifiedName().toString());
                }
            }
        }

        // Generate README.md as index
        StringBuilder indexMd = new StringBuilder();
        indexMd.append("# API Documentation\n\n");
        indexMd.append("## Packages\n\n");

        // Process each package
        for (Map.Entry<PackageElement, List<TypeElement>> entry : packageTypes.entrySet()) {
            PackageElement pkg = entry.getKey();
            String pkgName = pkg.getQualifiedName().toString();

            // Add to index
            String pkgPath = pkgName.replace('.', '/');
            indexMd.append("- [").append(pkgName).append("](").append(pkgPath).append("/README.md)\n");

            // Generate package directory and files
            generatePackageMarkdown(pkg, entry.getValue(), docTrees);
        }

        // Write index
        Files.write(outputDir.resolve("README.md"), indexMd.toString().getBytes("UTF-8"));
    }

    private void generatePackageMarkdown(PackageElement pkg, List<TypeElement> types, DocTrees docTrees) throws Exception {
        String pkgName = pkg.getQualifiedName().toString();
        Path pkgDir = outputDir.resolve(pkgName.replace('.', '/'));
        Files.createDirectories(pkgDir);

        // Create package README.md
        StringBuilder pkgIndex = new StringBuilder();
        pkgIndex.append("# Package: `").append(pkgName).append("`\n\n");
        pkgIndex.append("## Classes and Interfaces\n\n");

        // Process each type in the package
        for (TypeElement type : types) {
            String typeName = type.getSimpleName().toString();

            // Add to package index
            pkgIndex.append("- [").append(typeName).append("](").append(typeName).append(".md)\n");

            // Generate class file
            generateClassMarkdown(type, pkgDir, pkgName, docTrees);
        }

        // Write package README
        Files.write(pkgDir.resolve("README.md"), pkgIndex.toString().getBytes("UTF-8"));
    }

    private void generateClassMarkdown(TypeElement type, Path pkgDir, String pkgName, DocTrees docTrees) throws Exception {
        StringBuilder md = new StringBuilder();
        String typeName = type.getSimpleName().toString();
        String qualifiedName = type.getQualifiedName().toString();
        String kind = type.getKind().name().toLowerCase(Locale.ROOT);

        // Header
        md.append("# ").append(kind.substring(0, 1).toUpperCase()).append(kind.substring(1))
                .append(": `").append(typeName).append("`\n\n");

        md.append("**Package:** [`").append(pkgName).append("`](README.md)\n\n");
        md.append("**Fully Qualified Name:** `").append(qualifiedName).append("`\n\n");

        // Inheritance hierarchy
        appendInheritanceMarkdown(md, type, pkgName);

        // Type parameters
        if (!type.getTypeParameters().isEmpty()) {
            md.append("## Type Parameters\n\n");
            for (TypeParameterElement tp : type.getTypeParameters()) {
                md.append("- `").append(tp.getSimpleName()).append("`");
                if (!tp.getBounds().isEmpty()) {
                    md.append(" extends ");
                    for (int i = 0; i < tp.getBounds().size(); i++) {
                        if (i > 0) md.append(", ");
                        md.append("`").append(tp.getBounds().get(i).toString()).append("`");
                    }
                }
                md.append("\n");
            }
            md.append("\n");
        }

        // Description
        DocCommentTree doc = docTrees.getDocCommentTree(type);
        if (doc != null) {
            md.append("## Description\n\n");
            SemanticDocumentation semanticDoc = SemanticDocTreeVisitor.parse(doc, docTrees, type);
            if (semanticDoc != null && !semanticDoc.getBodyText().isEmpty()) {
                String description = semanticDoc.getBodyText();
                md.append(convertLinksInText(description, pkgName)).append("\n\n");
            }
        }

        // Fields
        List<VariableElement> fields = new ArrayList<>();
        for (Element m : type.getEnclosedElements()) {
            if (m.getKind() == ElementKind.FIELD) {
                fields.add((VariableElement) m);
            }
        }
        if (!fields.isEmpty()) {
            md.append("## Fields\n\n");
            for (VariableElement f : fields) {
                appendFieldMarkdownDetailed(md, f, pkgName, docTrees);
            }
        }

        // Constructors
        List<ExecutableElement> constructors = new ArrayList<>();
        for (Element m : type.getEnclosedElements()) {
            if (m.getKind() == ElementKind.CONSTRUCTOR) {
                constructors.add((ExecutableElement) m);
            }
        }
        if (!constructors.isEmpty()) {
            md.append("## Constructors\n\n");
            for (ExecutableElement c : constructors) {
                appendConstructorMarkdownDetailed(md, c, pkgName, docTrees);
            }
        }

        // Methods
        List<ExecutableElement> methods = new ArrayList<>();
        for (Element m : type.getEnclosedElements()) {
            if (m.getKind() == ElementKind.METHOD) {
                methods.add((ExecutableElement) m);
            }
        }
        if (!methods.isEmpty()) {
            md.append("## Methods\n\n");
            for (ExecutableElement method : methods) {
                appendMethodMarkdownDetailed(md, method, pkgName, docTrees);
            }
        }

        // Write class file
        Files.write(pkgDir.resolve(typeName + ".md"), md.toString().getBytes("UTF-8"));
    }

    private void appendInheritanceMarkdown(StringBuilder md, TypeElement type, String currentPkg) {
        // Superclass
        if (type.getKind() == ElementKind.CLASS) {
            javax.lang.model.type.TypeMirror superclass = type.getSuperclass();
            if (superclass.getKind() == javax.lang.model.type.TypeKind.DECLARED) {
                String superclassName = superclass.toString();
                if (!"java.lang.Object".equals(superclassName)) {
                    md.append("**Extends:** ").append(formatTypeLink(superclassName, currentPkg)).append("\n\n");
                }
            }
        }

        // Interfaces
        List<? extends javax.lang.model.type.TypeMirror> interfaces = type.getInterfaces();
        if (!interfaces.isEmpty()) {
            boolean isInterface = type.getKind() == ElementKind.INTERFACE;
            md.append("**").append(isInterface ? "Extends" : "Implements").append(":** ");
            for (int i = 0; i < interfaces.size(); i++) {
                if (i > 0) md.append(", ");
                md.append(formatTypeLink(interfaces.get(i).toString(), currentPkg));
            }
            md.append("\n\n");
        }
    }

    private void appendFieldMarkdownDetailed(StringBuilder md, VariableElement f, String currentPkg, DocTrees docTrees) {
        md.append("### `").append(f.getSimpleName()).append("`\n\n");
        md.append("**Type:** ").append(formatTypeLink(f.asType().toString(), currentPkg)).append("\n\n");

        DocCommentTree doc = docTrees.getDocCommentTree(f);
        if (doc != null) {
            SemanticDocumentation semanticDoc = SemanticDocTreeVisitor.parse(doc, docTrees, f);
            if (semanticDoc != null && !semanticDoc.getBodyText().isEmpty()) {
                String description = semanticDoc.getBodyText();
                md.append(convertLinksInText(description, currentPkg)).append("\n\n");
            }
        }
    }

    private void appendConstructorMarkdownDetailed(StringBuilder md, ExecutableElement c, String currentPkg, DocTrees docTrees) {
        md.append("### `").append(c.getSimpleName()).append("(");
        appendParametersSignature(md, c);
        md.append(")`\n\n");

        SemanticDocumentation semanticDoc = parseSemanticDocumentation(docTrees, c);
        if (semanticDoc != null && !semanticDoc.getBodyText().isEmpty()) {
            String description = semanticDoc.getBodyText();
            md.append(convertLinksInText(description, currentPkg)).append("\n\n");
        }

        appendParameterDocumentation(md, c, semanticDoc, currentPkg);
    }

    private void appendMethodMarkdownDetailed(StringBuilder md, ExecutableElement m, String currentPkg, DocTrees docTrees) {
        md.append("### `").append(m.getSimpleName()).append("(");
        appendParametersSignature(md, m);
        md.append(")`\n\n");

        md.append("**Returns:** ").append(formatTypeLink(m.getReturnType().toString(), currentPkg)).append("\n\n");

        SemanticDocumentation semanticDoc = parseSemanticDocumentation(docTrees, m);
        if (semanticDoc != null && !semanticDoc.getBodyText().isEmpty()) {
            String description = semanticDoc.getBodyText();
            md.append(convertLinksInText(description, currentPkg)).append("\n\n");
        }

        appendParameterDocumentation(md, m, semanticDoc, currentPkg);
    }

    private SemanticDocumentation parseSemanticDocumentation(DocTrees docTrees, Element element) {
        DocCommentTree doc = docTrees.getDocCommentTree(element);
        if (doc == null) {
            return null;
        }
        return SemanticDocTreeVisitor.parse(doc, docTrees, element);
    }

    private void appendParametersSignature(StringBuilder md, ExecutableElement e) {
        List<? extends VariableElement> params = e.getParameters();
        for (int i = 0; i < params.size(); i++) {
            VariableElement p = params.get(i);
            md.append(p.asType().toString()).append(" ").append(p.getSimpleName());
            if (i < params.size() - 1) {
                md.append(", ");
            }
        }
    }

    private void appendParameterDocumentation(StringBuilder md, ExecutableElement e,
                                              SemanticDocumentation semanticDoc, String currentPkg) {
        List<? extends VariableElement> params = e.getParameters();
        if (params.isEmpty()) {
            return;
        }

        Map<String, String> paramDescriptions = new HashMap<>();
        if (semanticDoc != null) {
            for (SemanticDocumentation.ParamDoc param : semanticDoc.getParams()) {
                paramDescriptions.put(param.getName(), param.getDescription());
            }
        }

        md.append("**Parameters:**\n");
        for (VariableElement p : params) {
            String paramName = p.getSimpleName().toString();
            String paramType = formatTypeLink(p.asType().toString(), currentPkg);
            md.append("- `").append(paramName).append("` (").append(paramType).append(")");

            String description = paramDescriptions.get(paramName);
            if (description != null && !description.isBlank()) {
                md.append(": ").append(convertLinksInText(description, currentPkg));
            }
            md.append("\n");
        }
        md.append("\n");
    }

    private String formatTypeLink(String typeName, String currentPkg) {
        String baseType = extractBaseType(typeName);

        // Skip primitive types
        if (isPrimitive(baseType)) {
            return "`" + typeName + "`";
        }

        // Wildcards and unknown tokens are rendered as plain code.
        if (baseType.isEmpty() || baseType.startsWith("?")) {
            return "`" + typeName + "`";
        }

        // Skip single letter type parameters (generic type variables)
        if (baseType.length() == 1 && Character.isUpperCase(baseType.charAt(0))) {
            return "`" + typeName + "`";
        }

        // Skip all JRE types (java.*, javax.*, jdk.*)
        if (baseType.startsWith("java.") || baseType.startsWith("javax.") || baseType.startsWith("jdk.")) {
            return "`" + typeName + "`";
        }

        String qualifiedType = baseType.contains(".") ? baseType : currentPkg + "." + baseType;

        // Only emit links for types that are actually generated as markdown files.
        if (!markdownTypeQNames.contains(qualifiedType)) {
            return "`" + typeName + "`";
        }

        String pkgName = qualifiedType.substring(0, qualifiedType.lastIndexOf('.'));
        String className = qualifiedType.substring(qualifiedType.lastIndexOf('.') + 1);
        String relativePath = getRelativePath(currentPkg, pkgName);
        return "[`" + typeName + "`](" + relativePath + "/" + className + ".md)";
    }

    private String extractBaseType(String typeName) {
        if (typeName == null) {
            return "";
        }

        String baseType = typeName.trim();
        if (baseType.isEmpty()) {
            return "";
        }

        if (baseType.endsWith("...")) {
            baseType = baseType.substring(0, baseType.length() - 3).trim();
        }

        int genericStart = baseType.indexOf('<');
        if (genericStart >= 0) {
            baseType = baseType.substring(0, genericStart).trim();
        }

        while (baseType.endsWith("[]")) {
            baseType = baseType.substring(0, baseType.length() - 2).trim();
        }

        if (baseType.startsWith("? extends ")) {
            baseType = baseType.substring("? extends ".length()).trim();
        } else if (baseType.startsWith("? super ")) {
            baseType = baseType.substring("? super ".length()).trim();
        }

        return baseType;
    }

    private boolean shouldDocumentType(TypeElement type) {
        String typeName = type.getSimpleName().toString();
        if (typeName.isEmpty()) {
            return false;
        }
        return !typeName.matches("[a-z]{1,3}");
    }

    private String convertLinksInText(String text, String currentPkg) {
        if (text == null) {
            return "";
        }

        String result = text;

        // Convert {@code ...} to `...`
        result = result.replaceAll("\\{@code\\s+([^}]+)\\}", "`$1`");

        // Convert {@literal ...} to plain text (remove the tag)
        result = result.replaceAll("\\{@literal\\s+([^}]+)\\}", "$1");

        // Convert {@value} or {@value CONSTANT} to `CONSTANT` or empty
        result = result.replaceAll("\\{@value\\s+([^}]+)\\}", "`$1`");
        result = result.replaceAll("\\{@value\\}", "");

        // Convert {@link ClassName} or {@link package.ClassName} to `ClassName`
        // Also handles {@link #method()} and {@link Class#method()}
        result = result.replaceAll("\\{@link\\s+#([^}]+)\\}", "`$1`");  // {@link #method()}
        result = result.replaceAll("\\{@link\\s+([^}\\s]+)#([^}]+)\\}", "`$1.$2`");  // {@link Class#method()}
        result = result.replaceAll("\\{@link\\s+([^}\\s]+)\\s+([^}]+)\\}", "`$1`");  // {@link Class description} - use just class
        result = result.replaceAll("\\{@link\\s+([^}]+)\\}", "`$1`");  // {@link Class}

        // Convert {@linkplain ...} similar to {@link} but extract description if present
        result = result.replaceAll("\\{@linkplain\\s+#([^}\\s]+)\\s+([^}]+)\\}", "$2");  // Use description
        result = result.replaceAll("\\{@linkplain\\s+([^}\\s]+)\\s+([^}]+)\\}", "$2");  // Use description
        result = result.replaceAll("\\{@linkplain\\s+([^}]+)\\}", "$1");  // Plain reference

        // Convert standalone @tags at line start to markdown
        result = result.replaceAll("(?m)^@since\\s+(.*)$", "**Since:** $1");
        result = result.replaceAll("(?m)^@author\\s+(.*)$", "**Author:** $1");
        result = result.replaceAll("(?m)^@deprecated\\s*(.*)$", "**Deprecated:**$1");  // Allow empty deprecated
        result = result.replaceAll("(?m)^@see\\s+(.*)$", "**See:** $1");

        return result;
    }

    private String getRelativePath(String fromPkg, String toPkg) {
        String[] fromParts = fromPkg.split("\\.");
        String[] toParts = toPkg.split("\\.");

        // Find common prefix
        int commonPrefix = 0;
        while (commonPrefix < fromParts.length && commonPrefix < toParts.length &&
               fromParts[commonPrefix].equals(toParts[commonPrefix])) {
            commonPrefix++;
        }

        // Build relative path
        StringBuilder path = new StringBuilder();

        // Go up from current package
        for (int i = commonPrefix; i < fromParts.length; i++) {
            if (path.length() > 0) path.append("/");
            path.append("..");
        }

        // Go down to target package
        for (int i = commonPrefix; i < toParts.length; i++) {
            if (path.length() > 0) path.append("/");
            path.append(toParts[i]);
        }

        return path.length() > 0 ? path.toString() : ".";
    }

    private boolean isPrimitive(String typeName) {
        return typeName.equals("boolean") || typeName.equals("byte") ||
               typeName.equals("char") || typeName.equals("short") ||
               typeName.equals("int") || typeName.equals("long") ||
               typeName.equals("float") || typeName.equals("double") ||
               typeName.equals("void");
    }

    private void writeModule(XMLStreamWriter x, ModuleElement module, DocTrees docTrees) throws Exception {
        x.writeStartElement("module");
        x.writeAttribute("name", module.getQualifiedName().toString());

        // Write module documentation
        writeDoc(x, docTrees, module);

        // Write module directives
        for (ModuleElement.Directive directive : module.getDirectives()) {
            switch (directive.getKind()) {
                case EXPORTS -> {
                    ModuleElement.ExportsDirective exports = (ModuleElement.ExportsDirective) directive;
                    x.writeStartElement("exports");
                    x.writeAttribute("package", exports.getPackage().getQualifiedName().toString());

                    // If qualified export (exports to specific modules)
                    if (exports.getTargetModules() != null && !exports.getTargetModules().isEmpty()) {
                        StringBuilder targets = new StringBuilder();
                        for (ModuleElement targetModule : exports.getTargetModules()) {
                            if (!targets.isEmpty()) targets.append(", ");
                            targets.append(targetModule.getQualifiedName().toString());
                        }
                        x.writeAttribute("to", targets.toString());
                    }

                    x.writeCharacters(exports.getPackage().getQualifiedName().toString());
                    x.writeEndElement();
                }
                case OPENS -> {
                    ModuleElement.OpensDirective opens = (ModuleElement.OpensDirective) directive;
                    x.writeStartElement("opens");
                    x.writeAttribute("package", opens.getPackage().getQualifiedName().toString());

                    // If qualified opens (opens to specific modules)
                    if (opens.getTargetModules() != null && !opens.getTargetModules().isEmpty()) {
                        StringBuilder targets = new StringBuilder();
                        for (ModuleElement targetModule : opens.getTargetModules()) {
                            if (!targets.isEmpty()) targets.append(", ");
                            targets.append(targetModule.getQualifiedName().toString());
                        }
                        x.writeAttribute("to", targets.toString());
                    }

                    x.writeCharacters(opens.getPackage().getQualifiedName().toString());
                    x.writeEndElement();
                }
                case REQUIRES -> {
                    ModuleElement.RequiresDirective requires = (ModuleElement.RequiresDirective) directive;
                    x.writeStartElement("requires");
                    x.writeAttribute("module", requires.getDependency().getQualifiedName().toString());

                    // Write modifiers (transitive, static)
                    if (requires.isTransitive()) {
                        x.writeAttribute("transitive", "true");
                    }
                    if (requires.isStatic()) {
                        x.writeAttribute("static", "true");
                    }

                    x.writeCharacters(requires.getDependency().getQualifiedName().toString());
                    x.writeEndElement();
                }
                case PROVIDES -> {
                    ModuleElement.ProvidesDirective provides = (ModuleElement.ProvidesDirective) directive;
                    x.writeStartElement("provides");
                    x.writeAttribute("service", provides.getService().getQualifiedName().toString());

                    // Write implementations
                    if (!provides.getImplementations().isEmpty()) {
                        StringBuilder impls = new StringBuilder();
                        for (TypeElement impl : provides.getImplementations()) {
                            if (!impls.isEmpty()) impls.append(", ");
                            impls.append(impl.getQualifiedName().toString());
                        }
                        x.writeAttribute("with", impls.toString());
                    }

                    x.writeCharacters(provides.getService().getQualifiedName().toString());
                    x.writeEndElement();
                }
                case USES -> {
                    ModuleElement.UsesDirective uses = (ModuleElement.UsesDirective) directive;
                    x.writeStartElement("uses");
                    x.writeAttribute("service", uses.getService().getQualifiedName().toString());
                    x.writeCharacters(uses.getService().getQualifiedName().toString());
                    x.writeEndElement();
                }
            }
        }

        x.writeEndElement();
    }

    private void writePackage(XMLStreamWriter x, PackageElement pkg, DocTrees docTrees, Elements elements) throws Exception {
        x.writeStartElement("package");
        x.writeAttribute("name", pkg.getQualifiedName().toString());

        for (Element enclosed : pkg.getEnclosedElements()) {
            if (enclosed.getKind().isClass() || enclosed.getKind().isInterface()) {
                writeType(x, (TypeElement) enclosed, docTrees, elements);
            }
        }

        x.writeEndElement();
    }


    private void writeType(XMLStreamWriter x, TypeElement t, DocTrees docTrees, Elements elements) throws Exception {
        x.writeStartElement("type");
        x.writeAttribute("name", t.getQualifiedName().toString());
        x.writeAttribute("kind", t.getKind().name().toLowerCase(Locale.ROOT));

        // Write annotations
        writeAnnotations(x, t);

        // Write type parameters
        if (!t.getTypeParameters().isEmpty()) {
            x.writeStartElement("typeParameters");
            for (TypeParameterElement tp : t.getTypeParameters()) {
                x.writeStartElement("typeParameter");
                x.writeAttribute("name", tp.getSimpleName().toString());

                // Write bounds if any
                if (!tp.getBounds().isEmpty()) {
                    x.writeStartElement("bounds");
                    for (int i = 0; i < tp.getBounds().size(); i++) {
                        if (i > 0) x.writeCharacters(", ");
                        x.writeCharacters(tp.getBounds().get(i).toString());
                    }
                    x.writeEndElement();
                }
                x.writeEndElement();
            }
            x.writeEndElement();
        }

        // Write inheritance hierarchy
        writeInheritance(x, t);

        writeDoc(x, docTrees, t);

        x.writeStartElement("members");
        for (Element m : t.getEnclosedElements()) {
            switch (m.getKind()) {
                case FIELD -> writeField(x, (VariableElement) m, docTrees);
                case METHOD -> writeMethod(x, (ExecutableElement) m, t, docTrees, elements);
                case CONSTRUCTOR -> writeConstructor(x, (ExecutableElement) m, docTrees);
                default -> { /* ignore */ }
            }
        }
        x.writeEndElement();

        x.writeEndElement();
    }

    private void writeInheritance(XMLStreamWriter x, TypeElement t) throws Exception {
        // Write superclass (extends) for classes
        if (t.getKind() == ElementKind.CLASS) {
            javax.lang.model.type.TypeMirror superclass = t.getSuperclass();
            // Only write if it's not Object (or NoType for Object itself)
            if (superclass.getKind() == javax.lang.model.type.TypeKind.DECLARED) {
                String superclassName = superclass.toString();
                // Skip java.lang.Object as it's implicit
                if (!"java.lang.Object".equals(superclassName)) {
                    x.writeStartElement("extends");
                    x.writeAttribute("type", superclassName);
                    x.writeCharacters(superclassName);
                    x.writeEndElement();
                }
            }
        }

        // Write interfaces
        // For classes: these are implemented interfaces (implements)
        // For interfaces: these are extended interfaces (extends)
        List<? extends javax.lang.model.type.TypeMirror> interfaces = t.getInterfaces();
        if (!interfaces.isEmpty()) {
            boolean isInterface = t.getKind() == ElementKind.INTERFACE;
            String elementName = isInterface ? "extends" : "implements";

            for (javax.lang.model.type.TypeMirror iface : interfaces) {
                x.writeStartElement(elementName);
                x.writeAttribute("type", iface.toString());
                x.writeCharacters(iface.toString());
                x.writeEndElement();
            }
        }
    }

    private void writeMethodOverride(XMLStreamWriter x, ExecutableElement method,
                                     TypeElement containingClass, Elements elements) throws Exception {
        // Find overridden method in superclass or interfaces
        ExecutableElement overriddenMethod = findOverriddenMethod(method, containingClass, elements);

        if (overriddenMethod != null) {
            Element overriddenClass = overriddenMethod.getEnclosingElement();
            String overriddenClassName = "";
            if (overriddenClass instanceof TypeElement) {
                overriddenClassName = ((TypeElement) overriddenClass).getQualifiedName().toString();
            }

            x.writeStartElement("overrides");
            x.writeAttribute("class", overriddenClassName);
            x.writeAttribute("method", overriddenMethod.getSimpleName().toString());

            // Write signature for disambiguation
            StringBuilder sig = new StringBuilder("(");
            List<? extends VariableElement> params = overriddenMethod.getParameters();
            for (int i = 0; i < params.size(); i++) {
                if (i > 0) sig.append(", ");
                sig.append(params.get(i).asType().toString());
            }
            sig.append(")");
            x.writeAttribute("signature", sig.toString());

            x.writeCharacters(overriddenClassName + "." + overriddenMethod.getSimpleName());
            x.writeEndElement();
        }
    }

    private ExecutableElement findOverriddenMethod(ExecutableElement method,
                                                   TypeElement containingClass,
                                                   Elements elements) {
        // Check superclass
        if (containingClass.getKind() == ElementKind.CLASS) {
            javax.lang.model.type.TypeMirror superclass = containingClass.getSuperclass();
            if (superclass.getKind() == javax.lang.model.type.TypeKind.DECLARED) {
                Element superElement = ((javax.lang.model.type.DeclaredType) superclass).asElement();
                if (superElement instanceof TypeElement) {
                    TypeElement superType = (TypeElement) superElement;
                    ExecutableElement overridden = findOverriddenInType(method, containingClass, superType, elements);
                    if (overridden != null) {
                        return overridden;
                    }
                }
            }
        }

        // Check interfaces
        for (javax.lang.model.type.TypeMirror iface : containingClass.getInterfaces()) {
            if (iface.getKind() == javax.lang.model.type.TypeKind.DECLARED) {
                Element ifaceElement = ((javax.lang.model.type.DeclaredType) iface).asElement();
                if (ifaceElement instanceof TypeElement) {
                    TypeElement ifaceType = (TypeElement) ifaceElement;
                    ExecutableElement overridden = findOverriddenInType(method, containingClass, ifaceType, elements);
                    if (overridden != null) {
                        return overridden;
                    }
                }
            }
        }

        return null;
    }

    private ExecutableElement findOverriddenInType(ExecutableElement method,
                                                   TypeElement containingClass,
                                                   TypeElement ancestorType,
                                                   Elements elements) {
        for (Element enclosed : ancestorType.getEnclosedElements()) {
            if (enclosed.getKind() == ElementKind.METHOD) {
                ExecutableElement ancestorMethod = (ExecutableElement) enclosed;
                if (elements.overrides(method, ancestorMethod, containingClass)) {
                    return ancestorMethod;
                }
            }
        }
        return null;
    }


    private void writeField(XMLStreamWriter x, VariableElement f, DocTrees docTrees) throws Exception {
        x.writeStartElement("field");
        x.writeAttribute("name", f.getSimpleName().toString());
        x.writeAttribute("type", f.asType().toString());
        writeAnnotations(x, f);
        writeDoc(x, docTrees, f);
        x.writeEndElement();
    }


    private void writeConstructor(XMLStreamWriter x, ExecutableElement c, DocTrees docTrees) throws Exception {
        x.writeStartElement("constructor");
        x.writeAttribute("name", c.getSimpleName().toString());
        writeExecutableSignature(x, c);
        writeDoc(x, docTrees, c);
        x.writeEndElement();
    }


    private void writeMethod(XMLStreamWriter x, ExecutableElement m, TypeElement containingClass,
                             DocTrees docTrees, Elements elements) throws Exception {
        x.writeStartElement("method");
        x.writeAttribute("name", m.getSimpleName().toString());
        x.writeAttribute("returns", m.getReturnType().toString());

        // Write annotations
        writeAnnotations(x, m);

        // Write type parameters for generic methods
        if (!m.getTypeParameters().isEmpty()) {
            x.writeStartElement("typeParameters");
            for (TypeParameterElement tp : m.getTypeParameters()) {
                x.writeStartElement("typeParameter");
                x.writeAttribute("name", tp.getSimpleName().toString());

                // Write bounds if any
                if (!tp.getBounds().isEmpty()) {
                    x.writeStartElement("bounds");
                    for (int i = 0; i < tp.getBounds().size(); i++) {
                        if (i > 0) x.writeCharacters(", ");
                        x.writeCharacters(tp.getBounds().get(i).toString());
                    }
                    x.writeEndElement();
                }
                x.writeEndElement();
            }
            x.writeEndElement();
        }

        writeExecutableSignature(x, m);

        // Write method override information
        writeMethodOverride(x, m, containingClass, elements);

        writeDoc(x, docTrees, m);
        x.writeEndElement();
    }


    private void writeExecutableSignature(XMLStreamWriter x, ExecutableElement e) throws Exception {
        x.writeStartElement("params");
        for (VariableElement p : e.getParameters()) {
            x.writeStartElement("param");
            x.writeAttribute("name", p.getSimpleName().toString());
            x.writeAttribute("type", p.asType().toString());
            writeAnnotations(x, p);
            x.writeEndElement();
        }
        x.writeEndElement();
    }

    private void writeDoc(XMLStreamWriter x, DocTrees docTrees, Element el) throws Exception {
        DocCommentTree doc = docTrees.getDocCommentTree(el);
        if (doc == null) return;

        // Parse documentation into semantic structure
        SemanticDocumentation semanticDoc = SemanticDocTreeVisitor.parse(doc, docTrees, el);
        if (semanticDoc == null) return;

        x.writeStartElement("doc");

        // Write description/body
        if (!semanticDoc.getBodyText().isEmpty()) {
            x.writeStartElement("description");
            x.writeCharacters(semanticDoc.getBodyText());
            x.writeEndElement();
        }

        // Write type parameter documentation (@param <T>)
        for (SemanticDocumentation.ParamDoc typeParam : semanticDoc.getTypeParams()) {
            x.writeStartElement("typeParam");
            x.writeAttribute("name", typeParam.getName());
            x.writeStartElement("description");
            x.writeCharacters(typeParam.getDescription());
            x.writeEndElement();
            x.writeEndElement();
        }

        // Write @param tags semantically
        for (SemanticDocumentation.ParamDoc param : semanticDoc.getParams()) {
            x.writeStartElement("param");
            x.writeAttribute("name", param.getName());
            x.writeStartElement("description");
            x.writeCharacters(param.getDescription());
            x.writeEndElement();
            x.writeEndElement();
        }

        // Write @return tag semantically
        if (semanticDoc.getReturnDoc() != null) {
            x.writeStartElement("return");
            x.writeCharacters(semanticDoc.getReturnDoc().getDescription());
            x.writeEndElement();
        }

        // Write @throws tags semantically
        for (SemanticDocumentation.ThrowsDoc throwsDoc : semanticDoc.getThrowsList()) {
            x.writeStartElement("throws");
            x.writeAttribute("exception", throwsDoc.getExceptionType());
            x.writeCharacters(throwsDoc.getDescription());
            x.writeEndElement();
        }

        // Write @author tags semantically
        for (String author : semanticDoc.getAuthors()) {
            x.writeStartElement("author");
            x.writeCharacters(author);
            x.writeEndElement();
        }

        // Write @version tag semantically
        if (semanticDoc.getVersion() != null) {
            x.writeStartElement("version");
            x.writeCharacters(semanticDoc.getVersion());
            x.writeEndElement();
        }

        // Write @since tag semantically
        if (semanticDoc.getSince() != null) {
            x.writeStartElement("since");
            x.writeCharacters(semanticDoc.getSince());
            x.writeEndElement();
        }

        // Write @deprecated tag semantically
        if (semanticDoc.getDeprecated() != null) {
            x.writeStartElement("deprecated");
            x.writeCharacters(semanticDoc.getDeprecated().getReason());
            x.writeEndElement();
        }

        // Write @see tags semantically with resolution info
        for (SemanticDocumentation.SeeDoc see : semanticDoc.getSees()) {
            x.writeStartElement("see");
            x.writeAttribute("ref", see.getReference());

            if (see.isResolved()) {
                x.writeAttribute("target", see.getQualifiedName());
                x.writeAttribute("kind", see.getElementKind());
                if (see.getSignature() != null) {
                    x.writeAttribute("signature", see.getSignature());
                }
            }

            x.writeCharacters(see.getReference());
            x.writeEndElement();
        }

        // Write inline {@link} tags semantically
        for (SemanticDocumentation.LinkDoc link : semanticDoc.getLinks()) {
            x.writeStartElement("link");
            x.writeAttribute("ref", link.getReference());

            if (link.isResolved()) {
                x.writeAttribute("target", link.getQualifiedName());
                x.writeAttribute("kind", link.getElementKind());
                if (link.getSignature() != null) {
                    x.writeAttribute("signature", link.getSignature());
                }
            }

            if (link.getLabel() != null && !link.getLabel().equals(link.getReference())) {
                x.writeCharacters(link.getLabel());
            } else {
                x.writeCharacters(link.getReference());
            }

            x.writeEndElement();
        }

        x.writeEndElement();
    }

    /**
     * Writes annotations for an element to XML.
     *
     * Captures annotations on classes, methods, fields, and parameters
     * including annotation values and parameters.
     */
    private void writeAnnotations(XMLStreamWriter x, Element element) throws Exception {
        List<? extends AnnotationMirror> annotations = element.getAnnotationMirrors();

        if (annotations.isEmpty()) {
            return;
        }

        for (AnnotationMirror annotation : annotations) {
            x.writeStartElement("annotation");

            // Get annotation type name
            Element annotationElement = annotation.getAnnotationType().asElement();
            String annotationName = annotationElement.getSimpleName().toString();
            String qualifiedName = "";
            if (annotationElement instanceof TypeElement) {
                qualifiedName = ((TypeElement) annotationElement).getQualifiedName().toString();
            }

            x.writeAttribute("type", qualifiedName);

            // Write annotation values/parameters
            Map<? extends ExecutableElement, ? extends AnnotationValue> elementValues =
                annotation.getElementValues();

            if (!elementValues.isEmpty()) {
                x.writeStartElement("values");
                for (Map.Entry<? extends ExecutableElement, ? extends AnnotationValue> entry :
                     elementValues.entrySet()) {
                    x.writeStartElement("value");
                    x.writeAttribute("name", entry.getKey().getSimpleName().toString());
                    x.writeCharacters(entry.getValue().toString());
                    x.writeEndElement();
                }
                x.writeEndElement();
            }

            x.writeCharacters(annotationName);
            x.writeEndElement();
        }
    }
}
