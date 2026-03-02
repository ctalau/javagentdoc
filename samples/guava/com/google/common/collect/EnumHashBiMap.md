# Class: `EnumHashBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumHashBiMap`

**Extends:** [`com.google.common.collect.AbstractBiMap<K,V>`](./AbstractBiMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Null keys are not permitted, but null values are. An 
 EnumHashBiMap and its inverse are both serializable.

 
See the Guava User Guide article on [BiMap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap).

## Fields

### `keyTypeOrObjectUnderJ2cl`

**Type:** `java.lang.Class<K>`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.lang.Class<K> keyType)`

**Parameters:**
- `keyType` (`java.lang.Class<K>`)

## Methods

### `create(java.lang.Class<K> keyType)`

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

**Parameters:**
- `keyType` (`java.lang.Class<K>`): the key type

### `create(java.util.Map<K,? extends V> map)`

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

If the specified map is an
 EnumHashBiMap or an EnumBiMap, the new bimap has the same key type as the input
 bimap. Otherwise, the specified map must contain at least one mapping, in order to determine
 the key type.

**Parameters:**
- `map` (`java.util.Map<K,? extends V>`): the map whose mappings are to be placed in this map

### `checkKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `put(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `forcePut(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `keyType()`

**Returns:** `java.lang.Class<K>`

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

