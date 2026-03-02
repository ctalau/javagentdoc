# Class: `TypeResolver`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeResolver`

## Description

Mappings are established
 with #where and types are resolved using #resolveType.

 
Note that usually type mappings are already implied by the static type hierarchy (for example,
 the E type variable declared by class List naturally maps to String in
 the context of class MyStringList implements List<String>). In such case, prefer to use
 TypeToken#resolveType since it's simpler and more type safe. This class should only be
 used when the type mapping isn't implied by the static type hierarchy, but provided through other
 means such as an annotation or external configuration file.

## Fields

### `typeTable`

**Type:** `com.google.common.reflect.TypeResolver.TypeTable`

## Constructors

### `<init>()`

### `<init>(com.google.common.reflect.TypeResolver.TypeTable typeTable)`

**Parameters:**
- `typeTable` (`com.google.common.reflect.TypeResolver.TypeTable`)

## Methods

### `covariantly(java.lang.reflect.Type contextType)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

For example, when resolving List<T> in the context of ArrayList<?>, 
 <T> is covariantly resolved to <?> such that return type of List::get is
 <?>.

**Parameters:**
- `contextType` (`java.lang.reflect.Type`)

### `invariantly(java.lang.reflect.Type contextType)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

For example, when resolving List<T> in the context of ArrayList<?>, 
 <T> cannot be invariantly resolved to <?> because otherwise the parameter type of
 List::set will be <?> and it'll falsely say any object can be passed into
 ArrayList<?>::set.

 
Instead, <?> will be resolved to a capture in the form of a type variable 
 <capture-of-? extends Object>, effectively preventing set from accepting any type.

**Parameters:**
- `contextType` (`java.lang.reflect.Type`)

### `where(java.lang.reflect.Type formal, java.lang.reflect.Type actual)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

For example, if formal is a TypeVariable T, and actual is 
 String.class, then new TypeResolver().where(formal, actual) will resolve ParameterizedType List<T> to List<String>, and resolve
 Map<T, Something> to Map<String, Something> etc. Similarly, formal and
 actual can be Map<K, V> and Map<String, Integer> respectively, or they
 can be E[] and String[] respectively, or even any arbitrary combination
 thereof.

**Parameters:**
- `formal` (`java.lang.reflect.Type`): The type whose type variables or itself is mapped to other type(s). It's almost
     always a bug if formal isn't a type variable and contains no type variable. Make
     sure you are passing the two parameters in the right order.
- `actual` (`java.lang.reflect.Type`): The type that the formal type variable(s) are mapped to. It can be or contain yet
     other type variables, in which case these type variables will be further resolved if
     corresponding mappings exist in the current TypeResolver instance.

### `where(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey,? extends java.lang.reflect.Type> mappings)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

**Parameters:**
- `mappings` (`java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey,? extends java.lang.reflect.Type>`)

### `populateTypeMappings(java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey,java.lang.reflect.Type> mappings, java.lang.reflect.Type from, java.lang.reflect.Type to)`

**Returns:** `void`

**Parameters:**
- `mappings` (`java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey,java.lang.reflect.Type>`)
- `from` (`java.lang.reflect.Type`)
- `to` (`java.lang.reflect.Type`)

### `resolveType(java.lang.reflect.Type type)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `type` (`java.lang.reflect.Type`)

### `resolveTypesInPlace(java.lang.reflect.Type[] types)`

**Returns:** `java.lang.reflect.Type[]`

**Parameters:**
- `types` (`java.lang.reflect.Type[]`)

### `resolveTypes(java.lang.reflect.Type[] types)`

**Returns:** `java.lang.reflect.Type[]`

**Parameters:**
- `types` (`java.lang.reflect.Type[]`)

### `resolveWildcardType(java.lang.reflect.WildcardType type)`

**Returns:** `java.lang.reflect.WildcardType`

**Parameters:**
- `type` (`java.lang.reflect.WildcardType`)

### `resolveGenericArrayType(java.lang.reflect.GenericArrayType type)`

**Returns:** `java.lang.reflect.Type`

**Parameters:**
- `type` (`java.lang.reflect.GenericArrayType`)

### `resolveParameterizedType(java.lang.reflect.ParameterizedType type)`

**Returns:** `java.lang.reflect.ParameterizedType`

**Parameters:**
- `type` (`java.lang.reflect.ParameterizedType`)

### `expectArgument(java.lang.Class<T> type, java.lang.Object arg)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `arg` (`java.lang.Object`)

