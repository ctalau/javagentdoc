# Class: `Types`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Types`

## Description

Utilities for working with `Type`.
**Author:** Ben Yu

## Fields

### `COMMA_JOINER`

**Type:** [`com.google.common.base.Joiner`](../base/Joiner.md)

Class#toString without the "class " and "interface " prefixes

## Constructors

### `<init>()`

## Methods

### `newArrayType(`java.lang.reflect.Type` componentType)`

**Returns:** `java.lang.reflect.Type`

Returns the array type of `componentType`.

### `newParameterizedTypeWithOwner(`java.lang.reflect.Type` ownerType, `java.lang.Class<?>` rawType, `java.lang.reflect.Type[]` arguments)`

**Returns:** `java.lang.reflect.ParameterizedType`

Returns a type where `rawType` is parameterized by `arguments` and is owned by
 `ownerType`.

### `newParameterizedType(`java.lang.Class<?>` rawType, `java.lang.reflect.Type[]` arguments)`

**Returns:** `java.lang.reflect.ParameterizedType`

Returns a type where `rawType` is parameterized by `arguments`.

### `newArtificialTypeVariable(`D` declaration, `java.lang.String` name, `java.lang.reflect.Type[]` bounds)`

**Returns:** `java.lang.reflect.TypeVariable<D>`

Returns a new `TypeVariable` that belongs to `declaration` with `name` and
 `bounds`.

### `subtypeOf(`java.lang.reflect.Type` upperBound)`

**Returns:** `java.lang.reflect.WildcardType`

Returns a new `WildcardType` with `upperBound`.

### `supertypeOf(`java.lang.reflect.Type` lowerBound)`

**Returns:** `java.lang.reflect.WildcardType`

Returns a new `WildcardType` with `lowerBound`.

### `toString(`java.lang.reflect.Type` type)`

**Returns:** `java.lang.String`

Returns a human-readable string representation of `type`.

 <p>The format is subject to change.

### `getComponentType(`java.lang.reflect.Type` type)`

**Returns:** `java.lang.reflect.Type`

### `subtypeOfComponentType(`java.lang.reflect.Type[]` bounds)`

**Returns:** `java.lang.reflect.Type`

Returns `? extends X` if any of `bounds` is a subtype of `X[]`; or null
 otherwise.

### `newTypeVariableImpl(`D` genericDeclaration, `java.lang.String` name, `java.lang.reflect.Type[]` bounds)`

**Returns:** `java.lang.reflect.TypeVariable<D>`

### `toArray(`java.util.Collection<java.lang.reflect.Type>` types)`

**Returns:** `java.lang.reflect.Type[]`

### `filterUpperBounds(`java.lang.Iterable<java.lang.reflect.Type>` bounds)`

**Returns:** `java.lang.Iterable<java.lang.reflect.Type>`

### `disallowPrimitiveType(`java.lang.reflect.Type[]` types, `java.lang.String` usedAs)`

**Returns:** `void`

### `getArrayClass(`java.lang.Class<?>` componentType)`

**Returns:** `java.lang.Class<?>`

Returns the `Class` object of arrays with `componentType`.

