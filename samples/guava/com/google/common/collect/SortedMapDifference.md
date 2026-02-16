# Interface: `SortedMapDifference`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedMapDifference`

**Extends:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An object representing the differences between two sorted maps.
@author Louis Wasserman
@since 8.0

## Methods

### `entriesOnlyOnLeft()`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `entriesOnlyOnRight()`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `entriesInCommon()`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `entriesDiffering()`

**Returns:** [`java.util.SortedMap<K,com.google.common.collect.MapDifference.ValueDifference<V>>`](../../../../java/util/SortedMap>.md)

