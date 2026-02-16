# Annotation_type: `GwtIncompatible`

**Package:** [`com.google.common.annotations`](README.md)

**Fully Qualified Name:** `com.google.common.annotations.GwtIncompatible`

**Implements:** `java.lang.annotation.Annotation`

## Description

The presence of this annotation on an API indicates that the method may <em>not</em> be used with
 the <a href="http://www.gwtproject.org/">Google Web Toolkit</a> (GWT).

 <p>This annotation behaves identically to <a href="http://www.gwtproject.org/javadoc/latest/com/google/gwt/core/shared/GwtIncompatible.html">the
 `@GwtIncompatible` annotation in GWT itself</a>.
**Author:** Charles Fry

## Methods

### `value()`

**Returns:** `java.lang.String`

Describes why the annotated element is incompatible with GWT. Since this is generally due to a
 dependence on a type/method which GWT doesn't support, it is sufficient to simply reference the
 unsupported type/method. E.g. "Class.isInstance".

 <p>As of Guava 20.0, this value is optional. We encourage authors who wish to describe why an
 API is `@GwtIncompatible` to instead leave an implementation comment.

