# Class: `EnumBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumBiMap`

**Extends:** [`com.google.common.collect.AbstractBiMap<K,V>`](./AbstractBiMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.Enum<V>`

## Description

A `BiMap` backed by two `EnumMap` instances. Null keys and values are not permitted.
 An `EnumBiMap` and its inverse are both serializable.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap">`BiMap`</a>.
**Author:** Mike Bostock
**Since:** 2.0

## Fields

### `keyTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<K>`

### `valueTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<V>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.Class<K>` keyTypeOrObjectUnderJ2cl, `java.lang.Class<V>` valueTypeOrObjectUnderJ2cl)`

## Methods

### `create(`java.lang.Class<K>` keyType, `java.lang.Class<V>` valueType)`

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

Returns a new, empty `EnumBiMap` using the specified key and value types.
@param keyType the key type
@param valueType the value type

### `create(`java.util.Map<K,V>` map)`

**Returns:** [`com.google.common.collect.EnumBiMap<K,V>`](./EnumBiMap.md)

Returns a new bimap with the same mappings as the specified map. If the specified map is an
 `EnumBiMap`, the new bimap has the same types as the provided map. Otherwise, the
 specified map must contain at least one mapping, in order to determine the key and value types.
@param map the map whose mappings are to be placed in this map
@throws IllegalArgumentException if map is not an `EnumBiMap` instance and contains no
     mappings

### `inferKeyTypeOrObjectUnderJ2cl(`java.util.Map<K,?>` map)`

**Returns:** `java.lang.Class<K>`

### `inferValueTypeOrObjectUnderJ2cl(`java.util.Map<?,V>` map)`

**Returns:** `java.lang.Class<V>`

### `keyType()`

**Returns:** `java.lang.Class<K>`

Returns the associated key type.

### `valueType()`

**Returns:** `java.lang.Class<V>`

Returns the associated value type.

### `checkKey(`K` key)`

**Returns:** `K`

### `checkValue(`V` value)`

**Returns:** `V`

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData the key class, value class, number of entries, first key, first value, second key,
     second value, and so on.

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

