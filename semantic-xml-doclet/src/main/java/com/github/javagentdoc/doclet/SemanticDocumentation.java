package com.github.javagentdoc.doclet;

import java.util.*;

/**
 * Represents semantically parsed Javadoc documentation.
 *
 * Instead of storing tags as raw text strings, this class preserves
 * the semantic structure of documentation elements.
 */
public final class SemanticDocumentation {

    private final String bodyText;
    private final List<ParamDoc> params;
    private final List<ParamDoc> typeParams;
    private final ReturnDoc returnDoc;
    private final List<ThrowsDoc> throwsList;
    private final List<String> authors;
    private final String version;
    private final String since;
    private final DeprecatedDoc deprecated;
    private final List<SeeDoc> sees;
    private final List<LinkDoc> links;

    public SemanticDocumentation(
            String bodyText,
            List<ParamDoc> params,
            List<ParamDoc> typeParams,
            ReturnDoc returnDoc,
            List<ThrowsDoc> throwsList,
            List<String> authors,
            String version,
            String since,
            DeprecatedDoc deprecated,
            List<SeeDoc> sees,
            List<LinkDoc> links) {
        this.bodyText = bodyText != null ? bodyText : "";
        this.params = params != null ? List.copyOf(params) : List.of();
        this.typeParams = typeParams != null ? List.copyOf(typeParams) : List.of();
        this.returnDoc = returnDoc;
        this.throwsList = throwsList != null ? List.copyOf(throwsList) : List.of();
        this.authors = authors != null ? List.copyOf(authors) : List.of();
        this.version = version;
        this.since = since;
        this.deprecated = deprecated;
        this.sees = sees != null ? List.copyOf(sees) : List.of();
        this.links = links != null ? List.copyOf(links) : List.of();
    }

    public String getBodyText() { return bodyText; }
    public List<ParamDoc> getParams() { return params; }
    public List<ParamDoc> getTypeParams() { return typeParams; }
    public ReturnDoc getReturnDoc() { return returnDoc; }
    public List<ThrowsDoc> getThrowsList() { return throwsList; }
    public List<String> getAuthors() { return authors; }
    public String getVersion() { return version; }
    public String getSince() { return since; }
    public DeprecatedDoc getDeprecated() { return deprecated; }
    public List<SeeDoc> getSees() { return sees; }
    public List<LinkDoc> getLinks() { return links; }

    /**
     * A parameter documentation entry.
     */
    public static final class ParamDoc {
        private final String name;
        private final String description;

        public ParamDoc(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() { return name; }
        public String getDescription() { return description; }
    }

    /**
     * Return value documentation.
     */
    public static final class ReturnDoc {
        private final String description;

        public ReturnDoc(String description) {
            this.description = description;
        }

        public String getDescription() { return description; }
    }

    /**
     * Exception/throws documentation.
     */
    public static final class ThrowsDoc {
        private final String exceptionType;
        private final String description;

        public ThrowsDoc(String exceptionType, String description) {
            this.exceptionType = exceptionType;
            this.description = description;
        }

        public String getExceptionType() { return exceptionType; }
        public String getDescription() { return description; }
    }

    /**
     * Deprecated annotation documentation.
     */
    public static final class DeprecatedDoc {
        private final String reason;

        public DeprecatedDoc(String reason) {
            this.reason = reason;
        }

        public String getReason() { return reason; }
    }

    /**
     * See/reference documentation with type information.
     */
    public static final class SeeDoc {
        private final String reference;
        private final String qualifiedName;
        private final String elementKind; // "class", "method", "field", etc.
        private final String signature; // For methods: "(int, String)" or null

        public SeeDoc(String reference) {
            this(reference, null, null, null);
        }

        public SeeDoc(String reference, String qualifiedName, String elementKind, String signature) {
            this.reference = reference;
            this.qualifiedName = qualifiedName;
            this.elementKind = elementKind;
            this.signature = signature;
        }

        public String getReference() { return reference; }
        public String getQualifiedName() { return qualifiedName; }
        public String getElementKind() { return elementKind; }
        public String getSignature() { return signature; }
        public boolean isResolved() { return qualifiedName != null; }
    }

    /**
     * Inline link documentation ({@link}, {@linkplain}).
     */
    public static final class LinkDoc {
        private final String reference;
        private final String label;
        private final String qualifiedName;
        private final String elementKind; // "class", "method", "field", etc.
        private final String signature; // For methods: "(int, String)" or null

        public LinkDoc(String reference, String label) {
            this(reference, label, null, null, null);
        }

        public LinkDoc(String reference, String label, String qualifiedName, String elementKind, String signature) {
            this.reference = reference;
            this.label = label;
            this.qualifiedName = qualifiedName;
            this.elementKind = elementKind;
            this.signature = signature;
        }

        public String getReference() { return reference; }
        public String getLabel() { return label; }
        public String getQualifiedName() { return qualifiedName; }
        public String getElementKind() { return elementKind; }
        public String getSignature() { return signature; }
        public boolean isResolved() { return qualifiedName != null; }
    }
}
