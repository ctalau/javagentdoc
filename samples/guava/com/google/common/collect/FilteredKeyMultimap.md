# Class: `FilteredKeyMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredKeyMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** [`com.google.common.collect.FilteredMultimap<K,V>`](./FilteredMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `unfiltered`

**Type:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `keyPredicate`

**Type:** [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md)

## Constructors

### `<init>(com.google.common.collect.Multimap<K,V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate)`

**Parameters:**
- `unfiltered` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `entryPredicate()`

**Returns:** [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md)

### `size()`

**Returns:** `int`

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`java.lang.Object`)

### `unmodifiableEmptyCollection()`

**Returns:** `java.util.Collection<V>`

### `clear()`

**Returns:** `void`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `get(K key)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)

### `entryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `createEntries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

