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

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

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

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `floorEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `ceilingEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `higherEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `lowerKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `floorKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `ceilingKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `higherKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `descendingEntryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `subMap(K fromKey, K toKey)`

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

**Returns:** `java.util.SortedMap<K,V>`

### `headMap(K toKey)`

**Parameters:**
- `toKey` (`K`)

**Returns:** `java.util.SortedMap<K,V>`

### `tailMap(K fromKey)`

**Parameters:**
- `fromKey` (`K`)

**Returns:** `java.util.SortedMap<K,V>`

### `navigableKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `descendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `descendingMap()`

**Returns:** `java.util.NavigableMap<K,V>`

