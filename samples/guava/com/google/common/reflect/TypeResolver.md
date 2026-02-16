# Class: `TypeResolver`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.TypeResolver`

## Description

An object of this class encapsulates type mappings from type variables. Mappings are established
 with {@link #where} and types are resolved using {@link #resolveType}.

 <p>Note that usually type mappings are already implied by the static type hierarchy (for example,
 the {@code E} type variable declared by class {@code List} naturally maps to {@code String} in
 the context of {@code class MyStringList implements List<String>}). In such case, prefer to use
 {@link TypeToken#resolveType} since it's simpler and more type safe. This class should only be
 used when the type mapping isn't implied by the static type hierarchy, but provided through other
 means such as an annotation or external configuration file.
@author Ben Yu
@since 15.0

## Fields

### `typeTable`

**Type:** [`com.google.common.reflect.TypeResolver.TypeTable`](TypeResolver/TypeTable.md)

## Constructors

### `<init>()`

### `<init>([`com.google.common.reflect.TypeResolver.TypeTable`](TypeResolver/TypeTable.md) typeTable)`

## Methods

### `covariantly(`java.lang.reflect.Type` contextType)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

Returns a resolver that resolves types "covariantly".

 <p>For example, when resolving {@code List<T>} in the context of {@code ArrayList<?>}, {@code
 <T>} is covariantly resolved to {@code <?>} such that return type of {@code List::get} is
 {@code <?>}.

### `invariantly(`java.lang.reflect.Type` contextType)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

Returns a resolver that resolves types "invariantly".

 <p>For example, when resolving {@code List<T>} in the context of {@code ArrayList<?>}, {@code
 <T>} cannot be invariantly resolved to {@code <?>} because otherwise the parameter type of
 {@code List::set} will be {@code <?>} and it'll falsely say any object can be passed into
 {@code ArrayList<?>::set}.

 <p>Instead, {@code <?>} will be resolved to a capture in the form of a type variable {@code
 <capture-of-? extends Object>}, effectively preventing {@code set} from accepting any type.

### `where(`java.lang.reflect.Type` formal, `java.lang.reflect.Type` actual)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

Returns a new {@code TypeResolver} with type variables in {@code formal} mapping to types in
 {@code actual}.

 <p>For example, if {@code formal} is a {@code TypeVariable T}, and {@code actual} is {@code
 String.class}, then {@code new TypeResolver().where(formal, actual)} will {@linkplain #resolveType resolve} {@code ParameterizedType List<T>} to {@code List<String>}, and resolve
 {@code Map<T, Something>} to {@code Map<String, Something>} etc. Similarly, {@code formal} and
 {@code actual} can be {@code Map<K, V>} and {@code Map<String, Integer>} respectively, or they
 can be {@code E[]} and {@code String[]} respectively, or even any arbitrary combination
 thereof.
@param formal The type whose type variables or itself is mapped to other type(s). It's almost
     always a bug if {@code formal} isn't a type variable and contains no type variable. Make
     sure you are passing the two parameters in the right order.
@param actual The type that the formal type variable(s) are mapped to. It can be or contain yet
     other type variables, in which case these type variables will be further resolved if
     corresponding mappings exist in the current {@code TypeResolver} instance.

### `where([`java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey,? extends java.lang.reflect.Type>`](../../../../java/util/Map.md) mappings)`

**Returns:** [`com.google.common.reflect.TypeResolver`](./TypeResolver.md)

Returns a new {@code TypeResolver} with {@code variable} mapping to {@code type}.

### `populateTypeMappings([`java.util.Map<com.google.common.reflect.TypeResolver.TypeVariableKey,java.lang.reflect.Type>`](../../../../java/util/Map.md) mappings, `java.lang.reflect.Type` from, `java.lang.reflect.Type` to)`

**Returns:** `void`

### `resolveType(`java.lang.reflect.Type` type)`

**Returns:** `java.lang.reflect.Type`

Resolves all type variables in {@code type} and all downstream types and returns a
 corresponding type with type variables resolved.

### `resolveTypesInPlace(`java.lang.reflect.Type[]` types)`

**Returns:** `java.lang.reflect.Type[]`

### `resolveTypes(`java.lang.reflect.Type[]` types)`

**Returns:** `java.lang.reflect.Type[]`

### `resolveWildcardType(`java.lang.reflect.WildcardType` type)`

**Returns:** `java.lang.reflect.WildcardType`

### `resolveGenericArrayType(`java.lang.reflect.GenericArrayType` type)`

**Returns:** `java.lang.reflect.Type`

### `resolveParameterizedType(`java.lang.reflect.ParameterizedType` type)`

**Returns:** `java.lang.reflect.ParameterizedType`

### `expectArgument(`java.lang.Class<T>` type, `java.lang.Object` arg)`

**Returns:** [`T`](T.md)

