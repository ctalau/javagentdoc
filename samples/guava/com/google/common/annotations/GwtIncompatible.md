# Annotation_type: `GwtIncompatible`

**Package:** [`com.google.common.annotations`](README.md)

**Fully Qualified Name:** `com.google.common.annotations.GwtIncompatible`

**Implements:** `java.lang.annotation.Annotation`

## Description

This annotation behaves identically to [the
 @GwtIncompatible annotation in GWT itself](http://www.gwtproject.org/javadoc/latest/com/google/gwt/core/shared/GwtIncompatible.html).

## Methods

### `value()`

**Returns:** `java.lang.String`

Since this is generally due to a
 dependence on a type/method which GWT doesn't support, it is sufficient to simply reference the
 unsupported type/method. E.g. "Class.isInstance".

 
As of Guava 20.0, this value is optional. We encourage authors who wish to describe why an
 API is @GwtIncompatible to instead leave an implementation comment.

