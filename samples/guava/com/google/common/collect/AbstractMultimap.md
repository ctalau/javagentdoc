# Class: `AbstractMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMultimap`

**Implements:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `entries`

**Type:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `keySet`

**Type:** `java.util.Set<K>`

### `keys`

**Type:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `values`

**Type:** `java.util.Collection<V>`

### `asMap`

**Type:** `java.util.Map<K,java.util.Collection<V>>`

## Constructors

### `<init>()`

## Methods

### `isEmpty()`

**Returns:** `boolean`

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `containsEntry(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `remove(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putAll(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `putAll(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** `boolean`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `createEntries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `entryIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `createKeys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `values()`

**Returns:** `java.util.Collection<V>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `valueIterator()`

**Returns:** `java.util.Iterator<V>`

### `valueSpliterator()`

**Returns:** `java.util.Spliterator<V>`

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

The hash code of a multimap is defined as the hash code of the map view, as returned by
 Multimap#asMap.

### `toString()`

**Returns:** `java.lang.String`

