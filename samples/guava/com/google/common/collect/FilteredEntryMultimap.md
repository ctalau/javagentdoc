# Class: `FilteredEntryMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.FilteredEntryMultimap`

**Extends:** [`com.google.common.collect.AbstractMultimap<K,V>`](./AbstractMultimap.md)

**Implements:** [`com.google.common.collect.FilteredMultimap<K,V>`](./FilteredMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `unfiltered`

**Type:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `predicate`

**Type:** [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md)

## Constructors

### `<init>(com.google.common.collect.Multimap<K,V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> predicate)`

**Parameters:**
- `unfiltered` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `predicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

## Methods

### `unfiltered()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `entryPredicate()`

**Returns:** [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md)

### `size()`

**Returns:** `int`

### `satisfies(K key, V value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `filterCollection(java.util.Collection<E> collection, com.google.common.base.Predicate<? super E> predicate)`

**Returns:** `java.util.Collection<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

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

### `get(K key)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)

### `createEntries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `entryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `removeEntriesIf(com.google.common.base.Predicate<? super java.util.Map.Entry<K,java.util.Collection<V>>> predicate)`

**Returns:** `boolean`

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,java.util.Collection<V>>>`](../base/Predicate.md))

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

