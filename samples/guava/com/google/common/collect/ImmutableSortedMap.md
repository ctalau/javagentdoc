# Class: `ImmutableSortedMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Implements:** `java.util.NavigableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

**Warning:** as with any sorted collection, you are strongly advised not to use a Comparator or Comparable type whose comparison behavior is *inconsistent with
 equals*. That is, a.compareTo(b) or comparator.compare(a, b) should equal zero
 *if and only if* a.equals(b). If this advice is not followed, the resulting map will
 not correctly obey its specification.

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `NATURAL_ORDER`

**Type:** `java.util.Comparator<java.lang.Comparable>`

### `NATURAL_EMPTY_MAP`

**Type:** [`com.google.common.collect.ImmutableSortedMap<java.lang.Comparable,java.lang.Object>`](./ImmutableSortedMap.md)

### `keySet`

**Type:** [`com.google.common.collect.RegularImmutableSortedSet<K>`](./RegularImmutableSortedSet.md)

### `valueList`

**Type:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `descendingMap`

**Type:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.RegularImmutableSortedSet<K> keySet, com.google.common.collect.ImmutableList<V> valueList)`

**Parameters:**
- `keySet` ([`com.google.common.collect.RegularImmutableSortedSet<K>`](./RegularImmutableSortedSet.md))
- `valueList` ([`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md))

### `<init>(com.google.common.collect.RegularImmutableSortedSet<K> keySet, com.google.common.collect.ImmutableList<V> valueList, com.google.common.collect.ImmutableSortedMap<K,V> descendingMap)`

**Parameters:**
- `keySet` ([`com.google.common.collect.RegularImmutableSortedSet<K>`](./RegularImmutableSortedSet.md))
- `valueList` ([`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md))
- `descendingMap` ([`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md))

## Methods

### `toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

The generated map is sorted by the specified comparator.

 
If the mapped keys contain duplicates (according to the specified comparator), an 
 IllegalArgumentException is thrown when the collection operation is performed. (This differs
 from the Collector returned by Collectors#toMap(Function, Function), which
 throws an IllegalStateException.)

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

If the mapped keys contain duplicates (according to the comparator), the values are merged
 using the specified merging function. Entries will appear in the encounter order of the first
 occurrence of the key.

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `emptyMap(java.util.Comparator<? super K> comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Performance note:** the instance returned is a singleton.

### `of(K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

### `of(java.util.Comparator<? super K> comparator, K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `k1` (`K`)
- `v1` (`V`)

### `of(K k1, V v1, K k2, V v2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

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

### `copyOf(java.util.Map<? extends K,? extends V> map)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 
This method is not type-safe, as it may be called on a map with keys that are not mutually
 comparable.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `copyOf(java.util.Map<? extends K,? extends V> map, java.util.Comparator<? super K> comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)
- `comparator` (`java.util.Comparator<? super K>`)

### `copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method is not type-safe, as it may be called on a map with keys that are not mutually
 comparable.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

### `copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries, java.util.Comparator<? super K> comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)
- `comparator` (`java.util.Comparator<? super K>`)

### `copyOfSorted(java.util.SortedMap<K,? extends V> map)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `map` (`java.util.SortedMap<K,? extends V>`)

### `copyOfInternal(java.util.Map<? extends K,? extends V> map, java.util.Comparator<? super K> comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)
- `comparator` (`java.util.Comparator<? super K>`)

### `fromEntries(java.util.Map.Entry<K,V>[] entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `entries` (`java.util.Map.Entry<K,V>[]`)

### `fromEntries(java.util.Comparator<? super K> comparator, boolean sameComparator, java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

If sameComparator, then it is assumed
 that they do not need to be sorted or checked for dupes.

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `sameComparator` (`boolean`)
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

### `fromEntries(java.util.Comparator<? super K> comparator, boolean sameComparator, java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[] entryArray, int size)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `sameComparator` (`boolean`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)
- `size` (`int`)

### `naturalOrder()`

**Returns:** `com.google.common.collect.ImmutableSortedMap.Builder<K,V>`

The sorted maps use Ordering#natural() as the comparator.

### `orderedBy(java.util.Comparator<K> comparator)`

**Returns:** `com.google.common.collect.ImmutableSortedMap.Builder<K,V>`

If the
 comparator has a more general type than the map's keys, such as creating a 
 SortedMap<Integer, String> with a Comparator<Number>, use the Builder
 constructor instead.

**Parameters:**
- `comparator` (`java.util.Comparator<K>`)

### `reverseOrder()`

**Returns:** `com.google.common.collect.ImmutableSortedMap.Builder<K,V>`

### `size()`

**Returns:** `int`

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `isPartialView()`

**Returns:** `boolean`

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `values()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super K>`

Note that its behavior is not consistent with TreeMap#comparator(), which returns null to indicate natural ordering.

### `firstKey()`

**Returns:** `K`

### `lastKey()`

**Returns:** `K`

### `getSubMap(int fromIndex, int toIndex)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**Parameters:**
- `fromIndex` (`int`)
- `toIndex` (`int`)

### `headMap(K toKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

The SortedMap#headMap documentation states that a submap of a submap throws an
 IllegalArgumentException if passed a toKey greater than an earlier 
 toKey. However, this method doesn't throw an exception in that situation, but instead keeps
 the original toKey.

**Parameters:**
- `toKey` (`K`)

### `headMap(K toKey, boolean inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

The SortedMap#headMap documentation states that a submap of a submap throws an
 IllegalArgumentException if passed a toKey greater than an earlier 
 toKey. However, this method doesn't throw an exception in that situation, but instead keeps
 the original toKey.

**Parameters:**
- `toKey` (`K`)
- `inclusive` (`boolean`)

### `subMap(K fromKey, K toKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

The SortedMap#subMap documentation states that a submap of a submap throws an IllegalArgumentException if passed a fromKey less than an earlier fromKey.
 However, this method doesn't throw an exception in that situation, but instead keeps the
 original fromKey. Similarly, this method keeps the original toKey, instead of
 throwing an exception, if passed a toKey greater than an earlier toKey.

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

### `subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

The SortedMap#subMap documentation states that a submap of a submap throws an IllegalArgumentException if passed a fromKey less than an earlier fromKey.
 However, this method doesn't throw an exception in that situation, but instead keeps the
 original fromKey. Similarly, this method keeps the original toKey, instead of
 throwing an exception, if passed a toKey greater than an earlier toKey.

**Parameters:**
- `fromKey` (`K`)
- `fromInclusive` (`boolean`)
- `toKey` (`K`)
- `toInclusive` (`boolean`)

### `tailMap(K fromKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

The SortedMap#tailMap documentation states that a submap of a submap throws an
 IllegalArgumentException if passed a fromKey less than an earlier 
 fromKey. However, this method doesn't throw an exception in that situation, but instead keeps
 the original fromKey.

**Parameters:**
- `fromKey` (`K`)

### `tailMap(K fromKey, boolean inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

The SortedMap#tailMap documentation states that a submap of a submap throws an
 IllegalArgumentException if passed a fromKey less than an earlier 
 fromKey. However, this method doesn't throw an exception in that situation, but instead keeps
 the original fromKey.

**Parameters:**
- `fromKey` (`K`)
- `inclusive` (`boolean`)

### `lowerEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `lowerKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `floorEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `floorKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `ceilingEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `ceilingKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `higherEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `higherKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `firstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `lastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `pollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `pollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `descendingMap()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `navigableKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `descendingKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `toImmutableMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Use #toImmutableSortedMap, which offers better type-safety, instead.
 This method exists only to hide ImmutableMap#toImmutableMap from consumers of 
 ImmutableSortedMap.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Use #toImmutableSortedMap, which offers better type-safety, instead.
 This method exists only to hide ImmutableMap#toImmutableMap from consumers of 
 ImmutableSortedMap.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableSortedMap.Builder<K,V>`

Use #naturalOrder, which offers better type-safety, instead. This method
 exists only to hide ImmutableMap#builder from consumers of ImmutableSortedMap.

### `builderWithExpectedSize(int expectedSize)`

**Returns:** `com.google.common.collect.ImmutableSortedMap.Builder<K,V>`

**Parameters:**
- `expectedSize` (`int`)

### `of(K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain a non-Comparable
 key.** Proper calls will resolve to the version in ImmutableSortedMap, not this dummy
 version.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

### `of(K k1, V v1, K k2, V v2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls to will resolve to the version in ImmutableSortedMap, not this
 dummy version.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

**You are attempting to create a map that may contain non-Comparable
 keys.** Proper calls will resolve to the version in ImmutableSortedMap, not this
 dummy version.

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

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Use ImmutableSortedMap.copyOf(ImmutableMap.ofEntries(...)).

**Parameters:**
- `entries` (`java.util.Map.Entry<? extends K,? extends V>[]`)

