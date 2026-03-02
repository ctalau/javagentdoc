# Class: `ImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Implements:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableBiMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

Entries appear in the result ImmutableBiMap in encounter order.

 
If the mapped keys or values contain duplicates (according to Object#equals(Object)), an IllegalArgumentException is thrown when the collection
 operation is performed. (This differs from the Collector returned by Collectors#toMap(Function, Function), which throws an IllegalStateException.)

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableBiMap<K,V>>`

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6)`

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
- `k6` (`K`)
- `v6` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7)`

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
- `k6` (`K`)
- `v6` (`V`)
- `k7` (`K`)
- `v7` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8)`

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
- `k6` (`K`)
- `v6` (`V`)
- `k7` (`K`)
- `v7` (`V`)
- `k8` (`K`)
- `v8` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9)`

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
- `k6` (`K`)
- `v6` (`V`)
- `k7` (`K`)
- `v7` (`V`)
- `k8` (`K`)
- `v8` (`V`)
- `k9` (`K`)
- `v9` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10)`

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
- `k6` (`K`)
- `v6` (`V`)
- `k7` (`K`)
- `v7` (`V`)
- `k8` (`K`)
- `v8` (`V`)
- `k9` (`K`)
- `v9` (`V`)
- `k10` (`K`)
- `v10` (`V`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `ofEntries(Map.Entry<? extends K,? extends V>[] entries)`

**Parameters:**
- `entries` (`java.util.Map.Entry<? extends K,? extends V>[]`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableBiMap.Builder<K,V>`

### `builderWithExpectedSize(int expectedSize)`

If expectedSize is exactly the number of entries added to the builder before Builder#build is called, the builder is likely to perform better than an unsized #builder() would have.

 
It is not specified if any performance benefits apply if expectedSize is close to,
 but not exactly, the number of entries added to the builder.

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `com.google.common.collect.ImmutableBiMap.Builder<K,V>`

### `copyOf(Map<? extends K,? extends V> map)`

If map somehow
 contains entries with duplicate keys (for example, if it is a SortedMap whose
 comparator is not *consistent with equals*), the results of this method are undefined.

 
The returned BiMap iterates over entries in the same order as the entrySet
 of the original map.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `copyOf(Iterable<? extends Map.Entry<? extends K,? extends V>> entries)`

The returned bimap iterates over
 entries in the same order as the original iterable.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `inverse()`

The inverse of an ImmutableBiMap is another ImmutableBiMap.

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `values()`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

### `forcePut(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `toImmutableMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

Use #toImmutableBiMap instead. This method exists only to hide ImmutableMap#toImmutableMap(Function, Function) from consumers of ImmutableBiMap.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `toImmutableMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction)`

This method does not make sense for BiMap. This method exists only to
 hide ImmutableMap#toImmutableMap(Function, Function, BinaryOperator) from consumers of
 ImmutableBiMap.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

