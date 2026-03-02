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

### `<init>(ImmutableMap<K,? extends ImmutableCollection<V>> map, int size)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,? extends com.google.common.collect.ImmutableCollection<V>>`](./ImmutableMap.md))
- `size` (`int`)

## Methods

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `of(K k1, V v1)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `of(K k1, V v1, K k2, V v2)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)
- `k4` (`K`)
- `v4` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5)`

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

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableMultimap.Builder<K,V>`

### `copyOf(Multimap<? extends K,? extends V> multimap)`

Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `copyOf(Iterable<? extends Map.Entry<? extends K,? extends V>> entries)`

The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

**Returns:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

### `removeAll(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `replaceValues(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `clear()`

**Returns:** `void`

### `get(K key)`

If no mappings in the multimap
 have the provided key, an empty immutable collection is returned. The values are in the same
 order as the parameters used to build this multimap.

**Parameters:**
- `key` (`K`)

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `inverse()`

For every key-value mapping in
 the original, the result will have a mapping with key and value reversed.

**Returns:** [`com.google.common.collect.ImmutableMultimap<V,K>`](./ImmutableMultimap.md)

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `boolean`

### `putAll(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `boolean`

### `putAll(Multimap<? extends K,? extends V> multimap)`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

**Returns:** `boolean`

### `remove(Object key, Object value)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `isPartialView()`

This is generally used
 to determine whether copyOf implementations should make an explicit copy to avoid
 memory leaks.

**Returns:** `boolean`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `asMap()`

Keys and values appear in the same order as in this multimap.

**Returns:** [`com.google.common.collect.ImmutableMap<K,java.util.Collection<V>>`](./ImmutableMap.md)

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

### `forEach(BiConsumer<? super K,? super V> action)`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

**Returns:** `void`

### `keys()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<K>`](./ImmutableMultiset.md)

### `createKeys()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<K>`](./ImmutableMultiset.md)

### `values()`

Its iterator traverses the
 values for the first key, the values for the second key, and so on.

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `valueIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<V>`](./UnmodifiableIterator.md)

