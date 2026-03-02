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

### `<init>(Multimap<K,V> unfiltered, Predicate<? super Map.Entry<K,V>> predicate)`

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

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `boolean`

### `filterCollection(Collection<E> collection, Predicate<? super E> predicate)`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `predicate` ([`com.google.common.base.Predicate<? super E>`](../base/Predicate.md))

**Returns:** `java.util.Collection<E>`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `removeAll(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.Collection<V>`

### `unmodifiableEmptyCollection()`

**Returns:** `java.util.Collection<V>`

### `clear()`

**Returns:** `void`

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Collection<V>`

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

### `removeEntriesIf(Predicate<? super Map.Entry<K,Collection<V>>> predicate)`

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,java.util.Collection<V>>>`](../base/Predicate.md))

**Returns:** `boolean`

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

