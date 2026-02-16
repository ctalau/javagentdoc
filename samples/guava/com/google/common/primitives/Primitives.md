# Class: `Primitives`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Primitives`

## Description

Contains static utility methods pertaining to primitive types and their corresponding wrapper
 types.
**Author:** Kevin Bourrillion
**Since:** 1.0

## Fields

### `PRIMITIVE_TO_WRAPPER_TYPE`

**Type:** `java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`

A map from primitive types to their corresponding wrapper types.

### `WRAPPER_TO_PRIMITIVE_TYPE`

**Type:** `java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`

A map from wrapper types to their corresponding primitive types.

## Constructors

### `<init>()`

## Methods

### `add(`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>` forward, `java.util.Map<java.lang.Class<?>,java.lang.Class<?>>` backward, `java.lang.Class<?>` key, `java.lang.Class<?>` value)`

**Returns:** `void`

### `allPrimitiveTypes()`

**Returns:** `java.util.Set<java.lang.Class<?>>`

Returns an immutable set of all nine primitive types (including `void`). Note that a
 simpler way to test whether a `Class` instance is a member of this set is to call `Class.isPrimitive`.
**Since:** 3.0

### `allWrapperTypes()`

**Returns:** `java.util.Set<java.lang.Class<?>>`

Returns an immutable set of all nine primitive-wrapper types (including `Void`).
**Since:** 3.0

### `isWrapperType(`java.lang.Class<?>` type)`

**Returns:** `boolean`

Returns `true` if `type` is one of the nine primitive-wrapper types, such as `Integer`.
**See:** Class#isPrimitive

### `wrap(`java.lang.Class<T>` type)`

**Returns:** `java.lang.Class<T>`

Returns the corresponding wrapper type of `type` if it is a primitive type; otherwise
 returns `type` itself. Idempotent.

 <pre>
     wrap(int.class) == Integer.class
     wrap(Integer.class) == Integer.class
     wrap(String.class) == String.class
 </pre>

### `unwrap(`java.lang.Class<T>` type)`

**Returns:** `java.lang.Class<T>`

Returns the corresponding primitive type of `type` if it is a wrapper type; otherwise
 returns `type` itself. Idempotent.

 <pre>
     unwrap(Integer.class) == int.class
     unwrap(int.class) == int.class
     unwrap(String.class) == String.class
 </pre>

