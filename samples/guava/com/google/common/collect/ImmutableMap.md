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

### `toImmutableMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

Entries appear in the result ImmutableMap in encounter order.

 
If the mapped keys contain duplicates (according to Object#equals(Object), an 
 IllegalArgumentException is thrown when the collection operation is performed. (This differs
 from the Collector returned by Collectors#toMap(Function, Function), which
 throws an IllegalStateException.)

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `toImmutableMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction)`

If the mapped keys contain duplicates (according to Object#equals(Object)), the
 values are merged using the specified merging function. If the merging function returns 
 null, then the collector removes the value that has been computed for the key thus far (though
 future occurrences of the key would reinsert it).

 
Entries will appear in the encounter order of the first occurrence of the key.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `of()`

This map behaves and performs comparably to Collections#emptyMap, and is preferable mainly for consistency and maintainability of your
 code.

 
**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `of(K k1, V v1)`

This map behaves and performs comparably to
 Collections#singletonMap but will not accept a null key or value. It is preferable
 mainly for consistency and maintainability of your code.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `of(K k1, V v1, K k2, V v2)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `ofEntries(Map.Entry<? extends K,? extends V>[] entries)`

**Parameters:**
- `entries` (`java.util.Map.Entry<? extends K,? extends V>[]`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `entryOf(K key, V value)`

A call to Entry#setValue on the returned entry will always throw UnsupportedOperationException.

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `java.util.Map.Entry<K,V>`

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableMap.Builder<K,V>`

### `builderWithExpectedSize(int expectedSize)`

If expectedSize is exactly the number of entries added to the builder before Builder#build is called, the builder is likely to perform better than an unsized #builder() would have.

 
It is not specified if any performance benefits apply if expectedSize is close to,
 but not exactly, the number of entries added to the builder.

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `com.google.common.collect.ImmutableMap.Builder<K,V>`

### `checkNoConflict(boolean safe, String conflictDescription, Object entry1, Object entry2)`

**Parameters:**
- `safe` (`boolean`)
- `conflictDescription` (`java.lang.String`)
- `entry1` (`java.lang.Object`)
- `entry2` (`java.lang.Object`)

**Returns:** `void`

### `conflictException(String conflictDescription, Object entry1, Object entry2)`

**Parameters:**
- `conflictDescription` (`java.lang.String`)
- `entry1` (`java.lang.Object`)
- `entry2` (`java.lang.Object`)

**Returns:** `java.lang.IllegalArgumentException`

### `copyOf(Map<? extends K,? extends V> map)`

The returned map iterates
 over entries in the same order as the entrySet of the original map. If map
 somehow contains entries with duplicate keys (for example, if it is a SortedMap whose
 comparator is not *consistent with equals*), the results of this method are undefined.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `copyOf(Iterable<? extends Map.Entry<? extends K,? extends V>> entries)`

The returned map iterates over
 entries in the same order as the original iterable.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `copyOfEnumMap(EnumMap<?,? extends V> original)`

**Parameters:**
- `original` (`java.util.EnumMap<?,? extends V>`)

**Returns:** [`com.google.common.collect.ImmutableMap<K,? extends V>`](./ImmutableMap.md)

### `put(K k, V v)`

**Parameters:**
- `k` (`K`)
- `v` (`V`)

**Returns:** `V`

### `putIfAbsent(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `replace(K key, V oldValue, V newValue)`

**Parameters:**
- `key` (`K`)
- `oldValue` (`V`)
- `newValue` (`V`)

**Returns:** `boolean`

### `replace(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)`

**Parameters:**
- `key` (`K`)
- `mappingFunction` (`java.util.function.Function<? super K,? extends V>`)

**Returns:** `V`

### `computeIfPresent(K key, BiFunction<? super K,? super V,? extends @Nullable V> remappingFunction)`

**Parameters:**
- `key` (`K`)
- `remappingFunction` (`java.util.function.BiFunction<? super K,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `V`

### `compute(K key, BiFunction<? super K,? super @Nullable V,? extends @Nullable V> remappingFunction)`

**Parameters:**
- `key` (`K`)
- `remappingFunction` (`java.util.function.BiFunction<? super K,? super @org.checkerframework.checker.nullness.qual.Nullable V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `V`

### `merge(K key, V value, BiFunction<? super V,? super V,? extends @Nullable V> function)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `function` (`java.util.function.BiFunction<? super V,? super V,? extends @org.checkerframework.checker.nullness.qual.Nullable V>`)

**Returns:** `V`

### `putAll(Map<? extends K,? extends V> map)`

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `replaceAll(BiFunction<? super K,? super V,? extends V> function)`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

**Returns:** `void`

### `remove(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `V`

### `remove(Object key, Object value)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `getOrDefault(Object key, V defaultValue)`

**Parameters:**
- `key` (`java.lang.Object`)
- `defaultValue` (`V`)

**Returns:** `V`

### `entrySet()`

The iteration order is specified by the
 method used to create this map. Typically, this is insertion order.

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

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

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `isHashCodeFast()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

Non-public subclasses should not override this
 method. Publicly-accessible subclasses must override this method and should return a subclass
 of SerializedForm whose readResolve() method returns objects of the subclass type.

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

