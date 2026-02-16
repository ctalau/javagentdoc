# Class: `FilteredKeyListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredKeyListMultimap`

**Extends:** [`com.google.common.collect.FilteredKeyMultimap<K,V>`](./FilteredKeyMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of {@link Multimaps#filterKeys(ListMultimap, Predicate)}.
@author Louis Wasserman

## Constructors

### `<init>([`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

