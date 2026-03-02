# Annotation_type: `VisibleForTesting`

**Package:** [`com.google.common.annotations`](README.md)

**Fully Qualified Name:** `com.google.common.annotations.VisibleForTesting`

**Implements:** `java.lang.annotation.Annotation`

## Description

**Do not use this interface** for public or protected declarations: it is a fig leaf for
 bad design, and it does not prevent anyone from using the declaration---and experience has shown
 that they will. If the method breaks the encapsulation of its class, then its internal
 representation will be hard to change. Instead, use [RestrictedApiChecker](http://errorprone.info/bugpattern/RestrictedApi), which enforces
 fine-grained visibility policies.

