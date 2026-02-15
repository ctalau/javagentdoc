package com.github.javagentdoc.doclet;

import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;

import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
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
                    generateXml(env, docTrees);
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

    private void generateXml(DocletEnvironment env, DocTrees docTrees) throws Exception {
        try (OutputStream os = Files.newOutputStream(outFile)) {
            XMLOutputFactory f = XMLOutputFactory.newFactory();
            XMLStreamWriter x = f.createXMLStreamWriter(os, "UTF-8");

            x.writeStartDocument("UTF-8", "1.0");
            x.writeStartElement("api");
            x.writeAttribute("version", "1.0");

            for (Element e : env.getIncludedElements()) {
                if (e.getKind() == ElementKind.PACKAGE) {
                    writePackage(x, (PackageElement) e, docTrees);
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

    private void writePackage(XMLStreamWriter x, PackageElement pkg, DocTrees docTrees) throws Exception {
        x.writeStartElement("package");
        x.writeAttribute("name", pkg.getQualifiedName().toString());

        for (Element enclosed : pkg.getEnclosedElements()) {
            if (enclosed.getKind().isClass() || enclosed.getKind().isInterface()) {
                writeType(x, (TypeElement) enclosed, docTrees);
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

    private void writeType(XMLStreamWriter x, TypeElement t, DocTrees docTrees) throws Exception {
        x.writeStartElement("type");
        x.writeAttribute("name", t.getQualifiedName().toString());
        x.writeAttribute("kind", t.getKind().name().toLowerCase(Locale.ROOT));

        writeDoc(x, docTrees, t);

        x.writeStartElement("members");
        for (Element m : t.getEnclosedElements()) {
            switch (m.getKind()) {
                case FIELD -> writeField(x, (VariableElement) m, docTrees);
                case METHOD -> writeMethod(x, (ExecutableElement) m, docTrees);
                case CONSTRUCTOR -> writeConstructor(x, (ExecutableElement) m, docTrees);
                default -> { /* ignore */ }
            }
        }
        x.writeEndElement();

        x.writeEndElement();
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

    private void writeMethod(XMLStreamWriter x, ExecutableElement m, DocTrees docTrees) throws Exception {
        x.writeStartElement("method");
        x.writeAttribute("name", m.getSimpleName().toString());
        x.writeAttribute("returns", m.getReturnType().toString());
        writeExecutableSignature(x, m);
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

        x.writeStartElement("doc");

        x.writeStartElement("body");
        for (DocTree dt : doc.getBody()) {
            x.writeStartElement("node");
            x.writeAttribute("kind", dt.getKind().name());
            x.writeCharacters(dt.toString());
            x.writeEndElement();
        }
        x.writeEndElement();

        x.writeStartElement("blockTags");
        for (DocTree tag : doc.getBlockTags()) {
            x.writeStartElement("tag");
            x.writeAttribute("kind", tag.getKind().name());
            x.writeCharacters(tag.toString());
            x.writeEndElement();
        }
        x.writeEndElement();

        x.writeEndElement();
    }
}
