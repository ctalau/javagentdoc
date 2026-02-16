# Class: `LinkedHashMultimapGwtSerializationDependencies`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies`

**Extends:** [`com.google.common.collect.AbstractSetMultimap<K,V>`](./AbstractSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A dummy superclass to support GWT serialization of the element types of a `LinkedHashMultimap`. The GWT supersource for this class contains a field for each type.

 <p>For details about this hack, see `GwtSerializationDependencies`, which takes the same
 approach but with a subclass rather than a superclass.

 <p>TODO(cpovirk): Consider applying this subclass approach to our other types.

## Constructors

### `<init>(`java.util.Map<K,java.util.Collection<V>>` map)`

