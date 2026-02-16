# Annotation_type: `ElementTypesAreNonnullByDefault`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ElementTypesAreNonnullByDefault`

**Implements:** `java.lang.annotation.Annotation`

## Description

Marks all "top-level" types as non-null in a way that is recognized by Kotlin. Note that this
 unfortunately includes type-variable usages, so we also provide `ParametricNullness` to
 "undo" it as best we can.

