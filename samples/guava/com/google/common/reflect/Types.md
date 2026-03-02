# Class: `Types`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Types`

## Description

## Fields

### `COMMA_JOINER`

**Type:** [`com.google.common.base.Joiner`](../base/Joiner.md)

## Constructors

### `<init>()`

## Methods

### `newArrayType(java.lang.reflect.Type componentType)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `componentType` (`java.lang.reflect.Type`)

### `newParameterizedTypeWithOwner(java.lang.reflect.Type ownerType, java.lang.Class<?> rawType, java.lang.reflect.Type[] arguments)`

**Returns:** `java.lang.reflect.ParameterizedType`

**Parameters:**
- `ownerType` (`java.lang.reflect.Type`)
- `rawType` (`java.lang.Class<?>`)
- `arguments` (`java.lang.reflect.Type[]`)

### `newParameterizedType(java.lang.Class<?> rawType, java.lang.reflect.Type[] arguments)`

**Returns:** `java.lang.reflect.ParameterizedType`

**Parameters:**
- `rawType` (`java.lang.Class<?>`)
- `arguments` (`java.lang.reflect.Type[]`)

### `newArtificialTypeVariable(D declaration, java.lang.String name, java.lang.reflect.Type[] bounds)`

**Returns:** `java.lang.reflect.TypeVariable<D>`

**Parameters:**
- `declaration` (`D`)
- `name` (`java.lang.String`)
- `bounds` (`java.lang.reflect.Type[]`)

### `subtypeOf(java.lang.reflect.Type upperBound)`

**Returns:** `java.lang.reflect.WildcardType`

**Parameters:**
- `upperBound` (`java.lang.reflect.Type`)

### `supertypeOf(java.lang.reflect.Type lowerBound)`

**Returns:** `java.lang.reflect.WildcardType`

**Parameters:**
- `lowerBound` (`java.lang.reflect.Type`)

### `toString(java.lang.reflect.Type type)`

**Returns:** `java.lang.String`

The format is subject to change.

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `getComponentType(java.lang.reflect.Type type)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `subtypeOfComponentType(java.lang.reflect.Type[] bounds)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

### `newTypeVariableImpl(D genericDeclaration, java.lang.String name, java.lang.reflect.Type[] bounds)`

**Returns:** `java.lang.reflect.TypeVariable<D>`

**Parameters:**
- `genericDeclaration` (`D`)
- `name` (`java.lang.String`)
- `bounds` (`java.lang.reflect.Type[]`)

### `toArray(java.util.Collection<java.lang.reflect.Type> types)`

**Returns:** `java.lang.reflect.Type[]`

**Parameters:**
- `types` (`java.util.Collection<java.lang.reflect.Type>`)

### `filterUpperBounds(java.lang.Iterable<java.lang.reflect.Type> bounds)`

**Returns:** `java.lang.Iterable<java.lang.reflect.Type>`

**Parameters:**
- `bounds` (`java.lang.Iterable<java.lang.reflect.Type>`)

### `disallowPrimitiveType(java.lang.reflect.Type[] types, java.lang.String usedAs)`

**Returns:** `void`

**Parameters:**
- `types` (`java.lang.reflect.Type[]`)
- `usedAs` (`java.lang.String`)

### `getArrayClass(java.lang.Class<?> componentType)`

**Returns:** `java.lang.Class<?>`

**Parameters:**
- `componentType` (`java.lang.Class<?>`)

