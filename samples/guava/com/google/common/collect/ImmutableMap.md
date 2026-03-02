# Class: `ImmutableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMap`

**Implements:** `java.util.Map<K,V>`, `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `EMPTY_ENTRY_ARRAY`

**Type:** `java.util.Map.Entry<?,?>[]`

### `entrySet`

**Type:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `keySet`

**Type:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `values`

**Type:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `multimapView`

**Type:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Entries appear in the result ImmutableMap in encounter order.

 
If the mapped keys contain duplicates (according to Object#equals(Object), an 
 IllegalArgumentException is thrown when the collection operation is performed. (This differs
 from the Collector returned by Collectors#toMap(Function, Function), which
 throws an IllegalStateException.)

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

If the mapped keys contain duplicates (according to Object#equals(Object)), the
 values are merged using the specified merging function. If the merging function returns 
 null, then the collector removes the value that has been computed for the key thus far (though
 future occurrences of the key would reinsert it).

 
Entries will appear in the encounter order of the first occurrence of the key.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

This map behaves and performs comparably to Collections#emptyMap, and is preferable mainly for consistency and maintainability of your
 code.

 
**Performance note:** the instance returned is a singleton.

### `of(K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

This map behaves and performs comparably to
 Collections#singletonMap but will not accept a null key or value. It is preferable
 mainly for consistency and maintainability of your code.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

### `of(K k1, V v1, K k2, V v2)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

### `ofEntries(java.util.Map.Entry<? extends K,? extends V>[] entries)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `entries` (`java.util.Map.Entry<? extends K,? extends V>[]`)

### `entryOf(K key, V value)`

**Returns:** `java.util.Map.Entry<K,V>`

A call to Entry#setValue on the returned entry will always throw UnsupportedOperationException.

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableMap.Builder<K,V>`

The generated builder is equivalent to the builder created by the Builder constructor.

### `builderWithExpectedSize(int expectedSize)`

**Returns:** `com.google.common.collect.ImmutableMap.Builder<K,V>`

If expectedSize is exactly the number of entries added to the builder before Builder#build is called, the builder is likely to perform better than an unsized #builder() would have.

 
It is not specified if any performance benefits apply if expectedSize is close to,
 but not exactly, the number of entries added to the builder.

**Parameters:**
- `expectedSize` (`int`)

### `checkNoConflict(boolean safe, java.lang.String conflictDescription, java.lang.Object entry1, java.lang.Object entry2)`

**Returns:** `void`

**Parameters:**
- `safe` (`boolean`)
- `conflictDescription` (`java.lang.String`)
- `entry1` (`java.lang.Object`)
- `entry2` (`java.lang.Object`)

### `conflictException(java.lang.String conflictDescription, java.lang.Object entry1, java.lang.Object entry2)`

**Returns:** `java.lang.IllegalArgumentException`

**Parameters:**
- `conflictDescription` (`java.lang.String`)
- `entry1` (`java.lang.Object`)
- `entry2` (`java.lang.Object`)

### `copyOf(java.util.Map<? extends K,? extends V> map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

The returned map iterates
 over entries in the same order as the entrySet of the original map. If map
 somehow contains entries with duplicate keys (for example, if it is a SortedMap whose
 comparator is not *consistent with equals*), the results of this method are undefined.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

The returned map iterates over
 entries in the same order as the original iterable.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

### `copyOfEnumMap(java.util.EnumMap<?,? extends V> original)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,? extends V>`](./ImmutableMap.md)

**Parameters:**
- `original` (`java.util.EnumMap<?,? extends V>`)

### `put(K k, V v)`

**Returns:** `V`

**Parameters:**
- `k` (`K`)
- `v` (`V`)

### `putIfAbsent(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `replace(K key, V oldValue, V newValue)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `oldValue` (`V`)
- `newValue` (`V`)

### `replace(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `computeIfAbsent(K key, java.util.function.Function<? super K,? extends V> mappingFunction)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `mappingFunction` (`java.util.function.Function<? super K,? extends V>`)

### `computeIfPresent(K key, java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> remappingFunction)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `remappingFunction` (`java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `compute(K key, java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> remappingFunction)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `remappingFunction` (`java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `merge(K key, V value, java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V> function)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `function` (`java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

### `putAll(java.util.Map<? extends K,? extends V> map)`

**Returns:** `void`

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `replaceAll(java.util.function.BiFunction<? super K,? super V,? extends V> function)`

**Returns:** `void`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

### `remove(java.lang.Object o)`

**Returns:** `V`

**Parameters:**
- `o` (`java.lang.Object`)

### `remove(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `clear()`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `getOrDefault(java.lang.Object key, V defaultValue)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)
- `defaultValue` (`V`)

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

The iteration order is specified by the
 method used to create this map. Typically, this is insertion order.

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `keyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `keySpliterator()`

**Returns:** `java.util.Spliterator<K>`

### `values()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `asMultimap()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `isPartialView()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `isHashCodeFast()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

Non-public subclasses should not override this
 method. Publicly-accessible subclasses must override this method and should return a subclass
 of SerializedForm whose readResolve() method returns objects of the subclass type.

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

