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
    private final ReturnDoc returnDoc;
    private final List<ThrowsDoc> throwsList;
    private final List<String> authors;
    private final String version;
    private final String since;
    private final DeprecatedDoc deprecated;
    private final List<SeeDoc> sees;

    public SemanticDocumentation(
            String bodyText,
            List<ParamDoc> params,
            ReturnDoc returnDoc,
            List<ThrowsDoc> throwsList,
            List<String> authors,
            String version,
            String since,
            DeprecatedDoc deprecated,
            List<SeeDoc> sees) {
        this.bodyText = bodyText != null ? bodyText : "";
        this.params = params != null ? List.copyOf(params) : List.of();
        this.returnDoc = returnDoc;
        this.throwsList = throwsList != null ? List.copyOf(throwsList) : List.of();
        this.authors = authors != null ? List.copyOf(authors) : List.of();
        this.version = version;
        this.since = since;
        this.deprecated = deprecated;
        this.sees = sees != null ? List.copyOf(sees) : List.of();
    }

    public String getBodyText() { return bodyText; }
    public List<ParamDoc> getParams() { return params; }
    public ReturnDoc getReturnDoc() { return returnDoc; }
    public List<ThrowsDoc> getThrowsList() { return throwsList; }
    public List<String> getAuthors() { return authors; }
    public String getVersion() { return version; }
    public String getSince() { return since; }
    public DeprecatedDoc getDeprecated() { return deprecated; }
    public List<SeeDoc> getSees() { return sees; }

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
     * See/reference documentation.
     */
    public static final class SeeDoc {
        private final String reference;

        public SeeDoc(String reference) {
            this.reference = reference;
        }

        public String getReference() { return reference; }
    }
}
