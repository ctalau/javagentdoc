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

### `<init>(Class<K> keyType)`

**Parameters:**
- `keyType` (`java.lang.Class<K>`)

## Methods

### `create(Class<K> keyType)`

**Parameters:**
- `keyType` (`java.lang.Class<K>`): the key type

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

### `create(Map<K,? extends V> map)`

If the specified map is an
 EnumHashBiMap or an EnumBiMap, the new bimap has the same key type as the input
 bimap. Otherwise, the specified map must contain at least one mapping, in order to determine
 the key type.

**Parameters:**
- `map` (`java.util.Map<K,? extends V>`): the map whose mappings are to be placed in this map

**Returns:** [`com.google.common.collect.EnumHashBiMap<K,V>`](./EnumHashBiMap.md)

### `checkKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `forcePut(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `keyType()`

**Returns:** `java.lang.Class<K>`

### `writeObject(ObjectOutputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

