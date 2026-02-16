# Class: `AbstractNavigableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractNavigableMap`

**Extends:** [`com.google.common.collect.Maps.IteratorBasedAbstractMap<K,V>`](Maps/IteratorBasedAbstractMap.md)

**Implements:** `java.util.NavigableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Skeletal implementation of `NavigableMap`.
**Author:** Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `get(`java.lang.Object` key)`

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

### `lowerEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `floorEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `ceilingEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `higherEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `lowerKey(`K` key)`

**Returns:** `K`

### `floorKey(`K` key)`

**Returns:** `K`

### `ceilingKey(`K` key)`

**Returns:** `K`

### `higherKey(`K` key)`

**Returns:** `K`

### `descendingEntryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `subMap(`K` fromKey, `K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

### `headMap(`K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

### `tailMap(`K` fromKey)`

**Returns:** `java.util.SortedMap<K,V>`

### `navigableKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `descendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `descendingMap()`

**Returns:** `java.util.NavigableMap<K,V>`

