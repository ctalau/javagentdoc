# Class: `AbstractNavigableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractNavigableMap`

**Extends:** `com.google.common.collect.Maps.IteratorBasedAbstractMap<K,V>`

**Implements:** `java.util.NavigableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Constructors

### `<init>()`

## Methods

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `firstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `lastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `pollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `pollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `firstKey()`

**Returns:** `K`

### `lastKey()`

**Returns:** `K`

### `lowerEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `floorEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `ceilingEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `higherEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `lowerKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `floorKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `ceilingKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `higherKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `descendingEntryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `subMap(K fromKey, K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

### `headMap(K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `toKey` (`K`)

### `tailMap(K fromKey)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `fromKey` (`K`)

### `navigableKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `descendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `descendingMap()`

**Returns:** `java.util.NavigableMap<K,V>`

