# Class: `Primitives`

**Package:** [`com.google.common.primitives`](README.md)

**Fully Qualified Name:** `com.google.common.primitives.Primitives`

## Description

Contains static utility methods pertaining to primitive types and their corresponding wrapper
 types.
@author Kevin Bourrillion
@since 1.0

## Fields

### `PRIMITIVE_TO_WRAPPER_TYPE`

**Type:** [`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`](../../../../java/util/Map,java/lang/Class>.md)

A map from primitive types to their corresponding wrapper types.

### `WRAPPER_TO_PRIMITIVE_TYPE`

**Type:** [`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`](../../../../java/util/Map,java/lang/Class>.md)

A map from wrapper types to their corresponding primitive types.

## Constructors

### `<init>()`

## Methods

### `add([`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`](../../../../java/util/Map,java/lang/Class>.md) forward, [`java.util.Map<java.lang.Class<?>,java.lang.Class<?>>`](../../../../java/util/Map,java/lang/Class>.md) backward, `java.lang.Class<?>` key, `java.lang.Class<?>` value)`

**Returns:** `void`

### `allPrimitiveTypes()`

**Returns:** [`java.util.Set<java.lang.Class<?>>`](../../../../java/util/Set>.md)

Returns an immutable set of all nine primitive types (including {@code void}). Note that a
 simpler way to test whether a {@code Class} instance is a member of this set is to call {@link Class#isPrimitive}.
@since 3.0

### `allWrapperTypes()`

**Returns:** [`java.util.Set<java.lang.Class<?>>`](../../../../java/util/Set>.md)

Returns an immutable set of all nine primitive-wrapper types (including {@link Void}).
@since 3.0

### `isWrapperType(`java.lang.Class<?>` type)`

**Returns:** `boolean`

Returns {@code true} if {@code type} is one of the nine primitive-wrapper types, such as {@link Integer}.
@see Class#isPrimitive

### `wrap(`java.lang.Class<T>` type)`

**Returns:** `java.lang.Class<T>`

Returns the corresponding wrapper type of {@code type} if it is a primitive type; otherwise
 returns {@code type} itself. Idempotent.

 <pre>
     wrap(int.class) == Integer.class
     wrap(Integer.class) == Integer.class
     wrap(String.class) == String.class
 </pre>

### `unwrap(`java.lang.Class<T>` type)`

**Returns:** `java.lang.Class<T>`

Returns the corresponding primitive type of {@code type} if it is a wrapper type; otherwise
 returns {@code type} itself. Idempotent.

 <pre>
     unwrap(Integer.class) == int.class
     unwrap(int.class) == int.class
     unwrap(String.class) == String.class
 </pre>

