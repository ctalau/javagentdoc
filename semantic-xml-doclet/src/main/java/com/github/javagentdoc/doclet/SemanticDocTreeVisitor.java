package com.github.javagentdoc.doclet;

import com.sun.source.doctree.*;
import com.sun.source.util.SimpleDocTreeVisitor;
import com.sun.source.util.DocTrees;
import com.sun.source.util.DocTreePath;

import javax.lang.model.element.*;
import javax.lang.model.type.*;

import java.util.*;

/**
 * Visitor that extracts semantic information from DocTree elements.
 *
 * This visitor traverses the Javadoc comment tree and extracts structured
 * information from block tags (@param, @return, @throws, etc.) and inline
 * tags ({@link}, {@code}, etc.), converting them from raw text into
 * semantic elements suitable for AI processing.
 */
public final class SemanticDocTreeVisitor {

    /**
     * Parses a DocCommentTree into structured semantic documentation.
     *
     * @param docTree the documentation comment tree
     * @param docTrees the DocTrees utility for reference resolution
     * @param element the element being documented (for context in resolution)
     * @return parsed semantic documentation
     */
    public static SemanticDocumentation parse(DocCommentTree docTree, DocTrees docTrees, Element element) {
        if (docTree == null) {
            return null;
        }

        // Get the TreePath for this element (needed for reference resolution)
        DocTreePath docTreePath = null;
        if (docTrees != null && element != null) {
            try {
                var treePath = docTrees.getPath(element);
                if (treePath != null) {
                    docTreePath = new DocTreePath(treePath, docTree);
                }
            } catch (Exception ignored) {
                // Couldn't get path - references won't be resolved
            }
        }

        // Extract body text and collect inline links
        List<SemanticDocumentation.LinkDoc> links = new ArrayList<>();
        TextExtractor textExtractor = new TextExtractor(links, docTrees, docTreePath);
        StringBuilder bodyText = new StringBuilder();
        for (DocTree tree : docTree.getBody()) {
            bodyText.append(extractText(tree, links, docTrees, docTreePath, textExtractor));
        }

        // Parse block tags
        List<SemanticDocumentation.ParamDoc> params = new ArrayList<>();
        List<SemanticDocumentation.ParamDoc> typeParams = new ArrayList<>();
        SemanticDocumentation.ReturnDoc returnDoc = null;
        List<SemanticDocumentation.ThrowsDoc> throwsList = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        String version = null;
        String since = null;
        SemanticDocumentation.DeprecatedDoc deprecated = null;
        List<SemanticDocumentation.SeeDoc> sees = new ArrayList<>();

        for (DocTree tag : docTree.getBlockTags()) {
            switch (tag.getKind()) {
                case PARAM -> {
                    ParamTree paramTree = (ParamTree) tag;
                    String paramName = paramTree.getName().getName().toString();
                    String paramDesc = extractText(paramTree.getDescription(), null, null, docTreePath);

                    // Distinguish between type parameters (@param <T>) and regular parameters (@param name)
                    if (paramTree.isTypeParameter()) {
                        typeParams.add(new SemanticDocumentation.ParamDoc(paramName, paramDesc));
                    } else {
                        params.add(new SemanticDocumentation.ParamDoc(paramName, paramDesc));
                    }
                }
                case RETURN -> {
                    ReturnTree returnTree = (ReturnTree) tag;
                    String returnDesc = extractText(returnTree.getDescription(), null, null, docTreePath);
                    returnDoc = new SemanticDocumentation.ReturnDoc(returnDesc);
                }
                case THROWS -> {
                    ThrowsTree throwsTree = (ThrowsTree) tag;
                    String exceptionName = throwsTree.getExceptionName().toString();
                    String throwsDesc = extractText(throwsTree.getDescription(), null, null, docTreePath);
                    throwsList.add(new SemanticDocumentation.ThrowsDoc(exceptionName, throwsDesc));
                }
                case AUTHOR -> {
                    AuthorTree authorTree = (AuthorTree) tag;
                    String authorName = extractText(authorTree.getName(), null, null, docTreePath);
                    authors.add(authorName);
                }
                case VERSION -> {
                    VersionTree versionTree = (VersionTree) tag;
                    version = extractText(versionTree.getBody(), null, null, docTreePath);
                }
                case SINCE -> {
                    SinceTree sinceTree = (SinceTree) tag;
                    since = extractText(sinceTree.getBody(), null, null, docTreePath);
                }
                case DEPRECATED -> {
                    DeprecatedTree deprecatedTree = (DeprecatedTree) tag;
                    String reason = extractText(deprecatedTree.getBody(), null, null, docTreePath);
                    deprecated = new SemanticDocumentation.DeprecatedDoc(reason);
                }
                case SEE -> {
                    SeeTree seeTree = (SeeTree) tag;
                    List<? extends DocTree> refList = seeTree.getReference();
                    if (!refList.isEmpty() && refList.get(0) instanceof ReferenceTree) {
                        ReferenceTree refTree = (ReferenceTree) refList.get(0);
                        String reference = refTree.getSignature();

                        // Try to resolve the reference
                        Element refElement = null;
                        if (docTrees != null && docTreePath != null) {
                            try {
                                DocTreePath refPath = new DocTreePath(docTreePath, refTree);
                                refElement = docTrees.getElement(refPath);
                            } catch (Exception ignored) {
                                // Reference couldn't be resolved
                            }
                        }

                        if (refElement != null) {
                            String qualifiedName = getQualifiedName(refElement);
                            String elementKind = refElement.getKind().name().toLowerCase();
                            String signature = getSignature(refElement);
                            sees.add(new SemanticDocumentation.SeeDoc(reference, qualifiedName, elementKind, signature));
                        } else {
                            sees.add(new SemanticDocumentation.SeeDoc(reference));
                        }
                    } else {
                        String reference = extractText(refList, null, null, docTreePath);
                        sees.add(new SemanticDocumentation.SeeDoc(reference));
                    }
                }
                default -> {
                    // Ignore unknown tags for now
                }
            }
        }

        return new SemanticDocumentation(
                bodyText.toString().trim(),
                params,
                typeParams,
                returnDoc,
                throwsList,
                authors,
                version,
                since,
                deprecated,
                sees,
                links
        );
    }

    /**
     * Extracts text content from a DocTree node or list of nodes.
     * Handles inline tags like {@code}, {@link}, {@literal}.
     *
     * @param tree the DocTree or List of DocTrees
     * @param links list to collect link information (null if not collecting)
     * @param docTrees DocTrees for reference resolution (null if not resolving)
     * @param docTreePath DocTreePath for reference resolution context (null if not resolving)
     */
    private static String extractText(Object tree, List<SemanticDocumentation.LinkDoc> links,
                                      DocTrees docTrees, DocTreePath docTreePath) {
        return extractText(tree, links, docTrees, docTreePath, null);
    }

    /**
     * Extracts text content from a DocTree node or list of nodes.
     * Handles inline tags like {@code}, {@link}, {@literal}.
     *
     * @param tree the DocTree or List of DocTrees
     * @param links list to collect link information (null if not collecting)
     * @param docTrees DocTrees for reference resolution (null if not resolving)
     * @param docTreePath DocTreePath for reference resolution context (null if not resolving)
     * @param extractor optional TextExtractor to reuse (null to create new)
     */
    private static String extractText(Object tree, List<SemanticDocumentation.LinkDoc> links,
                                      DocTrees docTrees, DocTreePath docTreePath, TextExtractor extractor) {
        if (tree == null) {
            return "";
        }

        if (tree instanceof List<?>) {
            StringBuilder sb = new StringBuilder();
            for (Object item : (List<?>) tree) {
                if (item instanceof DocTree) {
                    sb.append(extractText((DocTree) item, links, docTrees, docTreePath, extractor));
                }
            }
            return sb.toString();
        }

        if (tree instanceof DocTree docTree) {
            if (extractor == null) {
                extractor = new TextExtractor(links, docTrees, docTreePath);
            }
            return docTree.accept(extractor, null);
        }

        return tree.toString();
    }

    /**
     * Gets the qualified name of an element.
     */
    private static String getQualifiedName(Element element) {
        if (element instanceof TypeElement) {
            return ((TypeElement) element).getQualifiedName().toString();
        } else if (element instanceof ExecutableElement) {
            Element enclosing = element.getEnclosingElement();
            if (enclosing instanceof TypeElement) {
                return ((TypeElement) enclosing).getQualifiedName().toString() + "." + element.getSimpleName();
            }
        } else if (element instanceof VariableElement) {
            Element enclosing = element.getEnclosingElement();
            if (enclosing instanceof TypeElement) {
                return ((TypeElement) enclosing).getQualifiedName().toString() + "." + element.getSimpleName();
            }
        }
        return element.toString();
    }

    /**
     * Gets the signature for methods/constructors.
     */
    private static String getSignature(Element element) {
        if (element instanceof ExecutableElement) {
            ExecutableElement exec = (ExecutableElement) element;
            StringBuilder sig = new StringBuilder("(");
            List<? extends VariableElement> params = exec.getParameters();
            for (int i = 0; i < params.size(); i++) {
                if (i > 0) sig.append(", ");
                sig.append(params.get(i).asType().toString());
            }
            sig.append(")");
            return sig.toString();
        }
        return null;
    }

    /**
     * Visitor that extracts plain text from DocTree nodes,
     * including handling of inline tags.
     */
    private static class TextExtractor extends SimpleDocTreeVisitor<String, Void> {

        private final List<SemanticDocumentation.LinkDoc> links;
        private final DocTrees docTrees;
        private final DocTreePath docTreePath;
        private final Deque<String> htmlTagStack = new ArrayDeque<>();
        private final Deque<Map<String, String>> attributeStack = new ArrayDeque<>();

        public TextExtractor(List<SemanticDocumentation.LinkDoc> links, DocTrees docTrees, DocTreePath docTreePath) {
            this.links = links;
            this.docTrees = docTrees;
            this.docTreePath = docTreePath;
        }

        @Override
        public String visitText(TextTree node, Void unused) {
            return node.getBody();
        }

        @Override
        public String visitLink(LinkTree node, Void unused) {
            // Extract link reference
            ReferenceTree refTree = node.getReference();
            String reference = refTree.getSignature();
            List<? extends DocTree> label = node.getLabel();
            String labelText = !label.isEmpty() ? extractText(label, null, null, docTreePath, this) : reference;

            // Try to resolve the reference
            Element refElement = null;
            if (docTrees != null && docTreePath != null) {
                try {
                    DocTreePath refPath = new DocTreePath(docTreePath, refTree);
                    refElement = docTrees.getElement(refPath);
                } catch (Exception ignored) {
                    // Reference couldn't be resolved
                }
            }

            // Store link information
            if (links != null) {
                if (refElement != null) {
                    String qualifiedName = getQualifiedName(refElement);
                    String elementKind = refElement.getKind().name().toLowerCase();
                    String signature = getSignature(refElement);
                    links.add(new SemanticDocumentation.LinkDoc(reference, labelText, qualifiedName, elementKind, signature));
                } else {
                    links.add(new SemanticDocumentation.LinkDoc(reference, labelText));
                }
            }

            return labelText;
        }

        @Override
        public String visitLiteral(LiteralTree node, Void unused) {
            return node.getBody().getBody();
        }

        @Override
        public String visitValue(ValueTree node, Void unused) {
            // For {@value}, we'd need the actual constant value
            // For now, just return the reference
            if (node.getReference() != null) {
                return node.getReference().toString();
            }
            return "";
        }

        @Override
        public String visitReference(ReferenceTree node, Void unused) {
            return node.getSignature();
        }

        @Override
        public String visitStartElement(StartElementTree node, Void unused) {
            String tagName = node.getName().toString().toLowerCase();
            htmlTagStack.push(tagName);

            // Extract attributes for this tag
            Map<String, String> attributes = new HashMap<>();
            for (DocTree attr : node.getAttributes()) {
                if (attr instanceof AttributeTree attrTree) {
                    String attrName = attrTree.getName().toString().toLowerCase();
                    List<? extends DocTree> valueList = attrTree.getValue();
                    StringBuilder attrValue = new StringBuilder();
                    for (DocTree val : valueList) {
                        attrValue.append(extractText(val, null, null, docTreePath, this));
                    }
                    // Remove surrounding quotes
                    String value = attrValue.toString().replaceAll("^\"|\"$", "").replaceAll("^'|'$", "");
                    attributes.put(attrName, value);
                }
            }
            attributeStack.push(attributes);

            return switch (tagName) {
                case "p" -> "\n";
                case "br" -> "\n";
                case "code" -> "`";
                case "b", "strong" -> "**";
                case "i", "em" -> "*";
                case "pre" -> "\n\n```\n";
                case "ul", "ol" -> "\n";
                case "li" -> "- ";
                case "a" -> "[";
                // Strip out other HTML tags but preserve their content
                default -> "";
            };
        }

        @Override
        public String visitEndElement(EndElementTree node, Void unused) {
            String tagName = node.getName().toString().toLowerCase();
            Map<String, String> attributes = attributeStack.isEmpty() ? new HashMap<>() : attributeStack.pop();

            if (!htmlTagStack.isEmpty() && htmlTagStack.peek().equals(tagName)) {
                htmlTagStack.pop();
            }

            return switch (tagName) {
                case "p" -> "";
                case "br" -> "";
                case "code" -> "`";
                case "b", "strong" -> "**";
                case "i", "em" -> "*";
                case "pre" -> "\n```\n";
                case "ul", "ol" -> "\n";
                case "li" -> "\n";
                case "a" -> {
                    String href = attributes.get("href");
                    yield href != null ? "](" + href + ")" : "]";
                }
                default -> "";
            };
        }

        @Override
        public String visitEntity(EntityTree node, Void unused) {
            String entityName = node.getName().toString().toLowerCase();
            return switch (entityName) {
                case "nbsp" -> " ";
                case "lt" -> "<";
                case "gt" -> ">";
                case "amp" -> "&";
                case "quot" -> "\"";
                case "apos" -> "'";
                default -> "&" + entityName + ";";
            };
        }

        @Override
        protected String defaultAction(DocTree node, Void unused) {
            // For any other node type, return its string representation
            return node.toString();
        }
    }
}
