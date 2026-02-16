# Class: `Types`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Types`

## Description

Utilities for working with {@link Type}.
@author Ben Yu

## Fields

### `COMMA_JOINER`

**Type:** [`com.google.common.base.Joiner`](../base/Joiner.md)

Class#toString without the "class " and "interface " prefixes

## Constructors

### `<init>()`

## Methods

### `newArrayType(`java.lang.reflect.Type` componentType)`

**Returns:** `java.lang.reflect.Type`

Returns the array type of {@code componentType}.

### `newParameterizedTypeWithOwner(`java.lang.reflect.Type` ownerType, `java.lang.Class<?>` rawType, `java.lang.reflect.Type[]` arguments)`

**Returns:** `java.lang.reflect.ParameterizedType`

Returns a type where {@code rawType} is parameterized by {@code arguments} and is owned by
 {@code ownerType}.

### `newParameterizedType(`java.lang.Class<?>` rawType, `java.lang.reflect.Type[]` arguments)`

**Returns:** `java.lang.reflect.ParameterizedType`

Returns a type where {@code rawType} is parameterized by {@code arguments}.

### `newArtificialTypeVariable([`D`](D.md) declaration, `java.lang.String` name, `java.lang.reflect.Type[]` bounds)`

**Returns:** `java.lang.reflect.TypeVariable<D>`

Returns a new {@link TypeVariable} that belongs to {@code declaration} with {@code name} and
 {@code bounds}.

### `subtypeOf(`java.lang.reflect.Type` upperBound)`

**Returns:** `java.lang.reflect.WildcardType`

Returns a new {@link WildcardType} with {@code upperBound}.

### `supertypeOf(`java.lang.reflect.Type` lowerBound)`

**Returns:** `java.lang.reflect.WildcardType`

Returns a new {@link WildcardType} with {@code lowerBound}.

### `toString(`java.lang.reflect.Type` type)`

**Returns:** `java.lang.String`

Returns a human-readable string representation of {@code type}.

 <p>The format is subject to change.

### `getComponentType(`java.lang.reflect.Type` type)`

**Returns:** `java.lang.reflect.Type`

### `subtypeOfComponentType(`java.lang.reflect.Type[]` bounds)`

**Returns:** `java.lang.reflect.Type`

Returns {@code ? extends X} if any of {@code bounds} is a subtype of {@code X[]}; or null
 otherwise.

### `newTypeVariableImpl([`D`](D.md) genericDeclaration, `java.lang.String` name, `java.lang.reflect.Type[]` bounds)`

**Returns:** `java.lang.reflect.TypeVariable<D>`

### `toArray([`java.util.Collection<java.lang.reflect.Type>`](../../../../java/util/Collection.md) types)`

**Returns:** `java.lang.reflect.Type[]`

### `filterUpperBounds(`java.lang.Iterable<java.lang.reflect.Type>` bounds)`

**Returns:** `java.lang.Iterable<java.lang.reflect.Type>`

### `disallowPrimitiveType(`java.lang.reflect.Type[]` types, `java.lang.String` usedAs)`

**Returns:** `void`

### `getArrayClass(`java.lang.Class<?>` componentType)`

**Returns:** `java.lang.Class<?>`

Returns the {@code Class} object of arrays with {@code componentType}.

