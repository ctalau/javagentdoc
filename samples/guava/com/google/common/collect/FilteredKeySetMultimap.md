# Class: `FilteredKeySetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredKeySetMultimap`

**Extends:** [`com.google.common.collect.FilteredKeyMultimap<K,V>`](./FilteredKeyMultimap.md)

**Implements:** [`com.google.common.collect.FilteredSetMultimap<K,V>`](./FilteredSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of {@link Multimaps#filterKeys(SetMultimap, Predicate)}.
@author Louis Wasserman

## Constructors

### `<init>([`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `entries()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `createEntries()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

