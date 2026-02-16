# Annotation_type: `ElementTypesAreNonnullByDefault`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.ElementTypesAreNonnullByDefault`

**Implements:** `java.lang.annotation.Annotation`

## Description

Marks all "top-level" types as non-null in a way that is recognized by Kotlin. Note that this
 unfortunately includes type-variable usages, so we also provide {@link ParametricNullness} to
 "undo" it as best we can.

