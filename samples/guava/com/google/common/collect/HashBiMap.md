# Class: `HashBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashBiMap`

**Extends:** `com.google.common.collect.Maps.IteratorBasedAbstractMap<K,V>`

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md), `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This implementation allows null keys and values. A
 HashBiMap and its inverse are both serializable.

 
This implementation guarantees insertion-based iteration order of its keys.

 
See the Guava User Guide article on [BiMap ](https://github.com/google/guava/wiki/NewCollectionTypesExplained#bimap).

## Fields

### `LOAD_FACTOR`

**Type:** `double`

### `hashTableKToV`

**Type:** `com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`

### `hashTableVToK`

**Type:** `com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`

### `firstInKeyInsertionOrder`

**Type:** `com.google.common.collect.HashBiMap.BiEntry<K,V>`

### `lastInKeyInsertionOrder`

**Type:** `com.google.common.collect.HashBiMap.BiEntry<K,V>`

### `size`

**Type:** `int`

### `mask`

**Type:** `int`

### `modCount`

**Type:** `int`

### `inverse`

**Type:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

### `create(int expectedSize)`

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

**Parameters:**
- `expectedSize` (`int`): the expected number of entries

### `create(java.util.Map<? extends K,? extends V> map)`

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

The bimap is created with an
 initial capacity sufficient to hold the mappings in the specified map.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `init(int expectedSize)`

**Returns:** `void`

**Parameters:**
- `expectedSize` (`int`)

### `delete(com.google.common.collect.HashBiMap.BiEntry<K,V> entry)`

**Returns:** `void`

**Parameters:**
- `entry` (`com.google.common.collect.HashBiMap.BiEntry<K,V>`)

### `insert(com.google.common.collect.HashBiMap.BiEntry<K,V> entry, com.google.common.collect.HashBiMap.BiEntry<K,V> oldEntryForKey)`

**Returns:** `void`

**Parameters:**
- `entry` (`com.google.common.collect.HashBiMap.BiEntry<K,V>`)
- `oldEntryForKey` (`com.google.common.collect.HashBiMap.BiEntry<K,V>`)

### `seekByKey(java.lang.Object key, int keyHash)`

**Returns:** `com.google.common.collect.HashBiMap.BiEntry<K,V>`

**Parameters:**
- `key` (`java.lang.Object`)
- `keyHash` (`int`)

### `seekByValue(java.lang.Object value, int valueHash)`

**Returns:** `com.google.common.collect.HashBiMap.BiEntry<K,V>`

**Parameters:**
- `value` (`java.lang.Object`)
- `valueHash` (`int`)

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

Due to the property that values in a BiMap are unique, this will tend to execute in
 faster-than-linear time.

**Parameters:**
- `value` (`java.lang.Object`): the object to search for in the values of this BiMap

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `put(K key, V value, boolean force)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `force` (`boolean`)

### `forcePut(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putInverse(V value, K key, boolean force)`

**Returns:** `K`

**Parameters:**
- `value` (`V`)
- `key` (`K`)
- `force` (`boolean`)

### `rehashIfNecessary()`

**Returns:** `void`

### `createTable(int length)`

**Returns:** `com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`

**Parameters:**
- `length` (`int`)

### `remove(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `clear()`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Set<V>`

### `entryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `replaceAll(java.util.function.BiFunction<? super K,? super V,? extends V> function)`

**Returns:** `void`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

### `inverse()`

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

