# Class: `AbstractSortedKeySortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSortedKeySortedSetMultimap`

**Extends:** [`com.google.common.collect.AbstractSortedSetMultimap<K,V>`](./AbstractSortedSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Basic implementation of a {@link SortedSetMultimap} with a sorted key set.

 <p>This superclass allows {@code TreeMultimap} to override methods to return navigable set and
 map types in non-GWT only, while GWT code will inherit the SortedMap/SortedSet overrides.
@author Louis Wasserman

## Constructors

### `<init>([`java.util.SortedMap<K,java.util.Collection<V>>`](../../../../java/util/SortedMap>.md) map)`

## Methods

### `asMap()`

**Returns:** [`java.util.SortedMap<K,java.util.Collection<V>>`](../../../../java/util/SortedMap>.md)

### `backingMap()`

**Returns:** [`java.util.SortedMap<K,java.util.Collection<V>>`](../../../../java/util/SortedMap>.md)

### `keySet()`

**Returns:** [`java.util.SortedSet<K>`](../../../../java/util/SortedSet.md)

### `createKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

