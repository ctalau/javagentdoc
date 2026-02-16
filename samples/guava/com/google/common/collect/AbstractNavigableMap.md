# Class: `AbstractNavigableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractNavigableMap`

**Extends:** [`com.google.common.collect.Maps.IteratorBasedAbstractMap<K,V>`](Maps/IteratorBasedAbstractMap.md)

**Implements:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Skeletal implementation of {@link NavigableMap}.
@author Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `firstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `lastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `pollFirstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `pollLastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `firstKey()`

**Returns:** [`K`](K.md)

### `lastKey()`

**Returns:** [`K`](K.md)

### `lowerEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `floorEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `ceilingEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `higherEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `lowerKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `floorKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `ceilingKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `higherKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `descendingEntryIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

### `subMap([`K`](K.md) fromKey, [`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `headMap([`K`](K.md) toKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `tailMap([`K`](K.md) fromKey)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `navigableKeySet()`

**Returns:** [`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md)

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `descendingKeySet()`

**Returns:** [`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md)

### `descendingMap()`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

