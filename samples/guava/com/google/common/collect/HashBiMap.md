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

**Parameters:**
- `expectedSize` (`int`): the expected number of entries

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

### `create(Map<? extends K,? extends V> map)`

The bimap is created with an
 initial capacity sufficient to hold the mappings in the specified map.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** [`com.google.common.collect.HashBiMap<K,V>`](./HashBiMap.md)

### `init(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `void`

### `delete(HashBiMap.BiEntry<K,V> entry)`

**Parameters:**
- `entry` (`com.google.common.collect.HashBiMap.BiEntry<K,V>`)

**Returns:** `void`

### `insert(HashBiMap.BiEntry<K,V> entry, HashBiMap.BiEntry<K,V> oldEntryForKey)`

**Parameters:**
- `entry` (`com.google.common.collect.HashBiMap.BiEntry<K,V>`)
- `oldEntryForKey` (`com.google.common.collect.HashBiMap.BiEntry<K,V>`)

**Returns:** `void`

### `seekByKey(Object key, int keyHash)`

**Parameters:**
- `key` (`java.lang.Object`)
- `keyHash` (`int`)

**Returns:** `com.google.common.collect.HashBiMap.BiEntry<K,V>`

### `seekByValue(Object value, int valueHash)`

**Parameters:**
- `value` (`java.lang.Object`)
- `valueHash` (`int`)

**Returns:** `com.google.common.collect.HashBiMap.BiEntry<K,V>`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

Due to the property that values in a BiMap are unique, this will tend to execute in
 faster-than-linear time.

**Parameters:**
- `value` (`java.lang.Object`): the object to search for in the values of this BiMap

**Returns:** `boolean`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `put(K key, V value, boolean force)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `force` (`boolean`)

**Returns:** `V`

### `forcePut(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `putInverse(V value, K key, boolean force)`

**Parameters:**
- `value` (`V`)
- `key` (`K`)
- `force` (`boolean`)

**Returns:** `K`

### `rehashIfNecessary()`

**Returns:** `void`

### `createTable(int length)`

**Parameters:**
- `length` (`int`)

**Returns:** `com.google.common.collect.HashBiMap.@org.checkerframework.checker.nullness.qual.Nullable BiEntry<K,V>[]`

### `remove(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

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

### `forEach(BiConsumer<? super K,? super V> action)`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

**Returns:** `void`

### `replaceAll(BiFunction<? super K,? super V,? extends V> function)`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

**Returns:** `void`

### `inverse()`

**Returns:** [`com.google.common.collect.BiMap<V,K>`](./BiMap.md)

### `writeObject(ObjectOutputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

