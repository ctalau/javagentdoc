# Class: `FilteredKeySetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredKeySetMultimap`

**Extends:** [`com.google.common.collect.FilteredKeyMultimap<K,V>`](./FilteredKeyMultimap.md)

**Implements:** [`com.google.common.collect.FilteredSetMultimap<K,V>`](./FilteredSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Constructors

### `<init>(SetMultimap<K,V> unfiltered, Predicate<? super K> keyPredicate)`

**Parameters:**
- `unfiltered` ([`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md))
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Set<V>`

### `removeAll(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.Set<V>`

### `replaceValues(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `java.util.Set<V>`

### `entries()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `createEntries()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

