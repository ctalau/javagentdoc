# Class: `EnumHashBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumHashBiMap`

**Extends:** [`com.google.common.collect.AbstractBiMap<K,V>`](./AbstractBiMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `BiMap` backed by an `EnumMap` instance for keys-to-values, and a `HashMap`
 instance for values-to-keys. Null keys are not permitted, but null values are. An `EnumHashBiMap` and its inverse are both serializable.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">`BiMap`</a>.
**Author:** Mike Bostock
**Since:** 2.0

## Fields

### `keyTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<K>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Class<K>` keyType)`

## Methods

### `create(`java.lang.Class<K>` keyType)`

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

Returns a new, empty `EnumHashBiMap` using the specified key type.
@param keyType the key type

### `create(`java.util.Map<K,? extends V>` map)`

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

Constructs a new bimap with the same mappings as the specified map. If the specified map is an
 `EnumHashBiMap` or an `EnumBiMap`, the new bimap has the same key type as the input
 bimap. Otherwise, the specified map must contain at least one mapping, in order to determine
 the key type.
@param map the map whose mappings are to be placed in this map
@throws IllegalArgumentException if map is not an `EnumBiMap` or an `EnumHashBiMap`
     instance and contains no mappings

### `checkKey(`K` key)`

**Returns:** `K`

### `put(`K` key, `V` value)`

**Returns:** `V`

### `forcePut(`K` key, `V` value)`

**Returns:** `V`

### `keyType()`

**Returns:** `java.lang.Class<K>`

Returns the associated key type.

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData the key class, number of entries, first key, first value, second key, second value,
     and so on.

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

