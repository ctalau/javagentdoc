package com.github.javagentdoc.doclet;

import com.sun.source.doctree.*;
import com.sun.source.util.SimpleDocTreeVisitor;

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
     */
    public static SemanticDocumentation parse(DocCommentTree docTree) {
        if (docTree == null) {
            return null;
        }

        // Extract body text
        StringBuilder bodyText = new StringBuilder();
        for (DocTree tree : docTree.getBody()) {
            bodyText.append(extractText(tree));
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
                    String paramDesc = extractText(paramTree.getDescription());

                    // Distinguish between type parameters (@param <T>) and regular parameters (@param name)
                    if (paramTree.isTypeParameter()) {
                        typeParams.add(new SemanticDocumentation.ParamDoc(paramName, paramDesc));
                    } else {
                        params.add(new SemanticDocumentation.ParamDoc(paramName, paramDesc));
                    }
                }
                case RETURN -> {
                    ReturnTree returnTree = (ReturnTree) tag;
                    String returnDesc = extractText(returnTree.getDescription());
                    returnDoc = new SemanticDocumentation.ReturnDoc(returnDesc);
                }
                case THROWS -> {
                    ThrowsTree throwsTree = (ThrowsTree) tag;
                    String exceptionName = throwsTree.getExceptionName().toString();
                    String throwsDesc = extractText(throwsTree.getDescription());
                    throwsList.add(new SemanticDocumentation.ThrowsDoc(exceptionName, throwsDesc));
                }
                case AUTHOR -> {
                    AuthorTree authorTree = (AuthorTree) tag;
                    String authorName = extractText(authorTree.getName());
                    authors.add(authorName);
                }
                case VERSION -> {
                    VersionTree versionTree = (VersionTree) tag;
                    version = extractText(versionTree.getBody());
                }
                case SINCE -> {
                    SinceTree sinceTree = (SinceTree) tag;
                    since = extractText(sinceTree.getBody());
                }
                case DEPRECATED -> {
                    DeprecatedTree deprecatedTree = (DeprecatedTree) tag;
                    String reason = extractText(deprecatedTree.getBody());
                    deprecated = new SemanticDocumentation.DeprecatedDoc(reason);
                }
                case SEE -> {
                    SeeTree seeTree = (SeeTree) tag;
                    String reference = extractText(seeTree.getReference());
                    sees.add(new SemanticDocumentation.SeeDoc(reference));
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
                sees
        );
    }

    /**
     * Extracts text content from a DocTree node or list of nodes.
     * Handles inline tags like {@code}, {@link}, {@literal}.
     */
    private static String extractText(Object tree) {
        if (tree == null) {
            return "";
        }

        if (tree instanceof List<?>) {
            StringBuilder sb = new StringBuilder();
            for (Object item : (List<?>) tree) {
                if (item instanceof DocTree) {
                    sb.append(extractText((DocTree) item));
                }
            }
            return sb.toString();
        }

        if (tree instanceof DocTree docTree) {
            return docTree.accept(new TextExtractor(), null);
        }

        return tree.toString();
    }

    /**
     * Visitor that extracts plain text from DocTree nodes,
     * including handling of inline tags.
     */
    private static class TextExtractor extends SimpleDocTreeVisitor<String, Void> {

        @Override
        public String visitText(TextTree node, Void unused) {
            return node.getBody();
        }

        @Override
        public String visitLink(LinkTree node, Void unused) {
            // Extract link reference for semantic representation
            String reference = node.getReference().toString();
            List<? extends DocTree> label = node.getLabel();
            if (!label.isEmpty()) {
                return extractText(label);
            }
            return reference;
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
        protected String defaultAction(DocTree node, Void unused) {
            // For any other node type, return its string representation
            return node.toString();
        }
    }
}
