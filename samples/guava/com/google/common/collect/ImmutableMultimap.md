# Class: `ImmutableMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMultimap`

**Extends:** [`com.google.common.collect.BaseImmutableMultimap<K,V>`](./BaseImmutableMultimap.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

**Warning:** avoid *direct* usage of ImmutableMultimap as a type (as with
 Multimap itself). Prefer subtypes such as ImmutableSetMultimap or ImmutableListMultimap, which have well-defined #equals semantics, thus avoiding a common
 source of bugs and confusion.

 
**Note:** every ImmutableMultimap offers an #inverse view, so there is no
 need for a distinct ImmutableBiMultimap type.

 
[]

 
**Key-grouped iteration.** All view collections follow the same iteration order. In all
 current implementations, the iteration order always keeps multiple entries with the same key
 together. Any creation method that would customarily respect insertion order (such as #copyOf(Multimap)) instead preserves key-grouped order by inserting entries for an existing key
 immediately after the last entry having that key.

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `map`

**Type:** [`com.google.common.collect.ImmutableMap<K,? extends com.google.common.collect.ImmutableCollection<V>>`](./ImmutableMap.md)

### `size`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.ImmutableMap<K,? extends com.google.common.collect.ImmutableCollection<V>> map, int size)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,? extends com.google.common.collect.ImmutableCollection<V>>`](./ImmutableMap.md))
- `size` (`int`)

## Methods

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Performance note:** the instance returned is a singleton.

### `of(K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

### `of(K k1, V v1, K k2, V v2)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)
- `k4` (`K`)
- `v4` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)
- `k4` (`K`)
- `v4` (`V`)
- `k5` (`K`)
- `v5` (`V`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableMultimap.Builder<K,V>`

The generated builder is equivalent to the builder created by the Builder constructor.

### `copyOf(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

### `copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries)`

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

### `removeAll(java.lang.Object key)`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `clear()`

**Returns:** `void`

### `get(K key)`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

If no mappings in the multimap
 have the provided key, an empty immutable collection is returned. The values are in the same
 order as the parameters used to build this multimap.

**Parameters:**
- `key` (`K`)

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableMultimap<V,K>`](./ImmutableMultimap.md)

For every key-value mapping in
 the original, the result will have a mapping with key and value reversed.

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

### `remove(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `isPartialView()`

**Returns:** `boolean`

This is generally used
 to determine whether copyOf implementations should make an explicit copy to avoid
 memory leaks.

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `size()`

**Returns:** `int`

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `asMap()`

**Returns:** [`com.google.common.collect.ImmutableMap<K,java.util.Collection<V>>`](./ImmutableMap.md)

Keys and values appear in the same order as in this multimap.

### `createAsMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `entries()`

**Returns:** [`com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K,V>>`](./ImmutableCollection.md)

### `createEntries()`

**Returns:** [`com.google.common.collect.ImmutableCollection<java.util.Map.Entry<K,V>>`](./ImmutableCollection.md)

### `entryIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator.md)

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `keys()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<K>`](./ImmutableMultiset.md)

### `createKeys()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<K>`](./ImmutableMultiset.md)

### `values()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Its iterator traverses the
 values for the first key, the values for the second key, and so on.

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `valueIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<V>`](./UnmodifiableIterator.md)

