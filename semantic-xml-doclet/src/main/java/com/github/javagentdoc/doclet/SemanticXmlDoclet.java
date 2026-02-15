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
                if (e.getKind() == ElementKind.PACKAGE) {
                    writePackage(x, (PackageElement) e, docTrees, elements);
                }
            }

            x.writeEndElement();
            x.writeEndDocument();
            x.flush();
        }
    }

    private void generateMarkdown(DocletEnvironment env, DocTrees docTrees) throws Exception {
        StringBuilder md = new StringBuilder();
        md.append("# API Documentation\n\n");

        for (Element e : env.getIncludedElements()) {
            if (e.getKind() == ElementKind.PACKAGE) {
                appendPackageMarkdown(md, (PackageElement) e, docTrees);
            }
        }

        Files.write(outFile, md.toString().getBytes("UTF-8"));
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

    private void appendPackageMarkdown(StringBuilder md, PackageElement pkg, DocTrees docTrees) {
        String pkgName = pkg.getQualifiedName().toString();
        md.append("## Package: ").append(pkgName).append("\n\n");

        for (Element enclosed : pkg.getEnclosedElements()) {
            if (enclosed.getKind().isClass() || enclosed.getKind().isInterface()) {
                appendTypeMarkdown(md, (TypeElement) enclosed, docTrees);
            }
        }
    }

    private void writeType(XMLStreamWriter x, TypeElement t, DocTrees docTrees, Elements elements) throws Exception {
        x.writeStartElement("type");
        x.writeAttribute("name", t.getQualifiedName().toString());
        x.writeAttribute("kind", t.getKind().name().toLowerCase(Locale.ROOT));

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

    private void appendTypeMarkdown(StringBuilder md, TypeElement t, DocTrees docTrees) {
        String kind = t.getKind().name().toLowerCase(Locale.ROOT);
        md.append("### ").append(kind.substring(0, 1).toUpperCase()).append(kind.substring(1))
                .append(": `").append(t.getSimpleName()).append("`\n\n");

        DocCommentTree doc = docTrees.getDocCommentTree(t);
        if (doc != null) {
            md.append("**Description:** ").append(doc.toString()).append("\n\n");
        }

        md.append("#### Members\n\n");
        for (Element m : t.getEnclosedElements()) {
            switch (m.getKind()) {
                case FIELD:
                    appendFieldMarkdown(md, (VariableElement) m, docTrees);
                    break;
                case METHOD:
                    appendMethodMarkdown(md, (ExecutableElement) m, docTrees);
                    break;
                case CONSTRUCTOR:
                    appendConstructorMarkdown(md, (ExecutableElement) m, docTrees);
                    break;
                default:
                    break;
            }
        }
        md.append("\n");
    }

    private void writeField(XMLStreamWriter x, VariableElement f, DocTrees docTrees) throws Exception {
        x.writeStartElement("field");
        x.writeAttribute("name", f.getSimpleName().toString());
        x.writeAttribute("type", f.asType().toString());
        writeDoc(x, docTrees, f);
        x.writeEndElement();
    }

    private void appendFieldMarkdown(StringBuilder md, VariableElement f, DocTrees docTrees) {
        md.append("- **Field:** `").append(f.asType()).append(" ")
                .append(f.getSimpleName()).append("`\n");
        DocCommentTree doc = docTrees.getDocCommentTree(f);
        if (doc != null) {
            md.append("  - ").append(doc.toString()).append("\n");
        }
        md.append("\n");
    }

    private void writeConstructor(XMLStreamWriter x, ExecutableElement c, DocTrees docTrees) throws Exception {
        x.writeStartElement("constructor");
        x.writeAttribute("name", c.getSimpleName().toString());
        writeExecutableSignature(x, c);
        writeDoc(x, docTrees, c);
        x.writeEndElement();
    }

    private void appendConstructorMarkdown(StringBuilder md, ExecutableElement c, DocTrees docTrees) {
        md.append("- **Constructor:** `").append(c.getSimpleName()).append("(");
        appendParameters(md, c);
        md.append(")`\n");
        DocCommentTree doc = docTrees.getDocCommentTree(c);
        if (doc != null) {
            md.append("  - ").append(doc.toString()).append("\n");
        }
        md.append("\n");
    }

    private void writeMethod(XMLStreamWriter x, ExecutableElement m, TypeElement containingClass,
                             DocTrees docTrees, Elements elements) throws Exception {
        x.writeStartElement("method");
        x.writeAttribute("name", m.getSimpleName().toString());
        x.writeAttribute("returns", m.getReturnType().toString());

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

    private void appendMethodMarkdown(StringBuilder md, ExecutableElement m, DocTrees docTrees) {
        md.append("- **Method:** `").append(m.getReturnType()).append(" ")
                .append(m.getSimpleName()).append("(");
        appendParameters(md, m);
        md.append(")`\n");
        DocCommentTree doc = docTrees.getDocCommentTree(m);
        if (doc != null) {
            md.append("  - ").append(doc.toString()).append("\n");
        }
        md.append("\n");
    }

    private void appendParameters(StringBuilder md, ExecutableElement e) {
        List<? extends VariableElement> params = e.getParameters();
        for (int i = 0; i < params.size(); i++) {
            VariableElement p = params.get(i);
            md.append(p.asType()).append(" ").append(p.getSimpleName());
            if (i < params.size() - 1) {
                md.append(", ");
            }
        }
    }

    private void writeExecutableSignature(XMLStreamWriter x, ExecutableElement e) throws Exception {
        x.writeStartElement("params");
        for (VariableElement p : e.getParameters()) {
            x.writeEmptyElement("param");
            x.writeAttribute("name", p.getSimpleName().toString());
            x.writeAttribute("type", p.asType().toString());
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
}
