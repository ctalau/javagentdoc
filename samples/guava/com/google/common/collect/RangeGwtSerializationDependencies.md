# Class: `RangeGwtSerializationDependencies`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RangeGwtSerializationDependencies`

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `C` extends `java.lang.Comparable`

## Description

A dummy superclass to support GWT serialization of the element type of a {@link Range}. The GWT
 supersource for this class contains a field of type {@code C}.

 <p>For details about this hack, see {@code GwtSerializationDependencies}, which takes the same
 approach but with a subclass rather than a superclass.

 <p>TODO(cpovirk): Consider applying this subclass approach to our other types.

## Constructors

### `<init>()`

