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

### `newArrayType(Type componentType)`

**Parameters:**
- `componentType` (`java.lang.reflect.Type`)

**Returns:** `java.lang.reflect.Type`

### `newParameterizedTypeWithOwner(Type ownerType, Class<?> rawType, Type[] arguments)`

**Parameters:**
- `ownerType` (`java.lang.reflect.Type`)
- `rawType` (`java.lang.Class<?>`)
- `arguments` (`java.lang.reflect.Type[]`)

**Returns:** `java.lang.reflect.ParameterizedType`

### `newParameterizedType(Class<?> rawType, Type[] arguments)`

**Parameters:**
- `rawType` (`java.lang.Class<?>`)
- `arguments` (`java.lang.reflect.Type[]`)

**Returns:** `java.lang.reflect.ParameterizedType`

### `newArtificialTypeVariable(D declaration, String name, Type[] bounds)`

**Parameters:**
- `declaration` (`D`)
- `name` (`java.lang.String`)
- `bounds` (`java.lang.reflect.Type[]`)

**Returns:** `java.lang.reflect.TypeVariable<D>`

### `subtypeOf(Type upperBound)`

**Parameters:**
- `upperBound` (`java.lang.reflect.Type`)

**Returns:** `java.lang.reflect.WildcardType`

### `supertypeOf(Type lowerBound)`

**Parameters:**
- `lowerBound` (`java.lang.reflect.Type`)

**Returns:** `java.lang.reflect.WildcardType`

### `toString(Type type)`

The format is subject to change.

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** `java.lang.String`

### `getComponentType(Type type)`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

**Returns:** `java.lang.reflect.Type`

### `subtypeOfComponentType(Type[] bounds)`

**Parameters:**
- `bounds` (`java.lang.reflect.Type[]`)

**Returns:** `java.lang.reflect.Type`

### `newTypeVariableImpl(D genericDeclaration, String name, Type[] bounds)`

**Parameters:**
- `genericDeclaration` (`D`)
- `name` (`java.lang.String`)
- `bounds` (`java.lang.reflect.Type[]`)

**Returns:** `java.lang.reflect.TypeVariable<D>`

### `toArray(Collection<Type> types)`

**Parameters:**
- `types` (`java.util.Collection<java.lang.reflect.Type>`)

**Returns:** `java.lang.reflect.Type[]`

### `filterUpperBounds(Iterable<Type> bounds)`

**Parameters:**
- `bounds` (`java.lang.Iterable<java.lang.reflect.Type>`)

**Returns:** `java.lang.Iterable<java.lang.reflect.Type>`

### `disallowPrimitiveType(Type[] types, String usedAs)`

**Parameters:**
- `types` (`java.lang.reflect.Type[]`)
- `usedAs` (`java.lang.String`)

**Returns:** `void`

### `getArrayClass(Class<?> componentType)`

**Parameters:**
- `componentType` (`java.lang.Class<?>`)

**Returns:** `java.lang.Class<?>`

