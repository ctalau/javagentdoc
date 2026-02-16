# Class: `ImmutableSortedMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Implements:** `java.util.NavigableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `NavigableMap` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.

 <p><b>Warning:</b> as with any sorted collection, you are strongly advised not to use a `Comparator` or `Comparable` type whose comparison behavior is <i>inconsistent with
 equals</i>. That is, `a.compareTo(b)` or `comparator.compare(a, b)` should equal zero
 <i>if and only if</i> `a.equals(b)`. If this advice is not followed, the resulting map will
 not correctly obey its specification.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Jared Levy
**Author:** Louis Wasserman
**Since:** 2.0 (implements `NavigableMap` since 12.0)

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

### `<init>([`com.google.common.collect.RegularImmutableSortedSet<K>`](./RegularImmutableSortedSet.md) keySet, [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md) valueList)`

### `<init>([`com.google.common.collect.RegularImmutableSortedSet<K>`](./RegularImmutableSortedSet.md) keySet, [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md) valueList, [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md) descendingMap)`

## Methods

### `toImmutableSortedMap(`java.util.Comparator<? super K>` comparator, `java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableSortedMap` whose
 keys and values are the result of applying the provided mapping functions to the input
 elements. The generated map is sorted by the specified comparator.

 <p>If the mapped keys contain duplicates (according to the specified comparator), an `IllegalArgumentException` is thrown when the collection operation is performed. (This differs
 from the `Collector` returned by `Collectors.toMap(Function, Function)`, which
 throws an `IllegalStateException`.)
**Since:** 21.0

### `toImmutableSortedMap(`java.util.Comparator<? super K>` comparator, `java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableSortedMap` whose
 keys and values are the result of applying the provided mapping functions to the input
 elements.

 <p>If the mapped keys contain duplicates (according to the comparator), the values are merged
 using the specified merging function. Entries will appear in the encounter order of the first
 occurrence of the key.
**Since:** 21.0

### `emptyMap(`java.util.Comparator<? super K>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns the empty sorted map.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing a single entry.

### `of(`java.util.Comparator<? super K>` comparator, `K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing a single entry.

### `of(`K` k1, `V` v1, `K` k2, `V` v2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if the two keys are equal according to their natural ordering

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
**Since:** 31.0

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9, `K` k10, `V` v10)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
**Since:** 31.0

### `copyOf(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the same entries as `map`, sorted by the natural
 ordering of the keys.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is not type-safe, as it may be called on a map with keys that are not mutually
 comparable.
@throws ClassCastException if the keys in `map` are not mutually comparable
@throws NullPointerException if any key or value in `map` is null
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `copyOf(`java.util.Map<? extends K,? extends V>` map, `java.util.Comparator<? super K>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the same entries as `map`, with keys sorted by the
 provided comparator.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in `map` is null
@throws IllegalArgumentException if any two keys are equal according to the comparator

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the given entries, with keys sorted by their natural
 ordering.

 <p>This method is not type-safe, as it may be called on a map with keys that are not mutually
 comparable.
@throws NullPointerException if any key or value in `map` is null
@throws IllegalArgumentException if any two keys are equal according to the comparator
**Since:** 19.0

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries, `java.util.Comparator<? super K>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the given entries, with keys sorted by the provided
 comparator.
@throws NullPointerException if any key or value in `map` is null
@throws IllegalArgumentException if any two keys are equal according to the comparator
**Since:** 19.0

### `copyOfSorted(`java.util.SortedMap<K,? extends V>` map)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the same entries as the provided sorted map, with the same
 ordering.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in `map` is null

### `copyOfInternal(`java.util.Map<? extends K,? extends V>` map, `java.util.Comparator<? super K>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `fromEntries(`java.util.Map.Entry<K,V>[]` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `fromEntries(`java.util.Comparator<? super K>` comparator, `boolean` sameComparator, `java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Accepts a collection of possibly-null entries. If `sameComparator`, then it is assumed
 that they do not need to be sorted or checked for dupes.

### `fromEntries(`java.util.Comparator<? super K>` comparator, `boolean` sameComparator, `java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]` entryArray, `int` size)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `naturalOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Returns a builder that creates immutable sorted maps whose keys are ordered by their natural
 ordering. The sorted maps use `Ordering.natural()` as the comparator.

### `orderedBy(`java.util.Comparator<K>` comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Returns a builder that creates immutable sorted maps with an explicit comparator. If the
 comparator has a more general type than the map's keys, such as creating a `SortedMap<Integer, String>` with a `Comparator<Number>`, use the `Builder`
 constructor instead.
@throws NullPointerException if `comparator` is null

### `reverseOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Returns a builder that creates immutable sorted maps whose keys are ordered by the reverse of
 their natural ordering.

### `size()`

**Returns:** `int`

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `isPartialView()`

**Returns:** `boolean`

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

Returns an immutable set of the mappings in this map, sorted by the key ordering.

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `keySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

Returns an immutable sorted set of the keys in this map.

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `values()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

Returns an immutable collection of the values in this map, sorted by the ordering of the
 corresponding keys.

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `comparator()`

**Returns:** `java.util.Comparator<? super K>`

Returns the comparator that orders the keys, which is `Ordering.natural()` when the
 natural ordering of the keys is used. Note that its behavior is not consistent with `TreeMap.comparator()`, which returns `null` to indicate natural ordering.

### `firstKey()`

**Returns:** `K`

### `lastKey()`

**Returns:** `K`

### `getSubMap(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `headMap(`K` toKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a `ImmutableSortedMap`, consisting of the entries whose keys are less
 than `toKey`.

 <p>The `SortedMap.headMap` documentation states that a submap of a submap throws an
 `IllegalArgumentException` if passed a `toKey` greater than an earlier `toKey`. However, this method doesn't throw an exception in that situation, but instead keeps
 the original `toKey`.

### `headMap(`K` toKey, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a `ImmutableSortedMap`, consisting of the entries whose keys are less
 than (or equal to, if `inclusive`) `toKey`.

 <p>The `SortedMap.headMap` documentation states that a submap of a submap throws an
 `IllegalArgumentException` if passed a `toKey` greater than an earlier `toKey`. However, this method doesn't throw an exception in that situation, but instead keeps
 the original `toKey`.
**Since:** 12.0

### `subMap(`K` fromKey, `K` toKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a `ImmutableSortedMap`, consisting of the entries whose keys ranges
 from `fromKey`, inclusive, to `toKey`, exclusive.

 <p>The `SortedMap.subMap` documentation states that a submap of a submap throws an `IllegalArgumentException` if passed a `fromKey` less than an earlier `fromKey`.
 However, this method doesn't throw an exception in that situation, but instead keeps the
 original `fromKey`. Similarly, this method keeps the original `toKey`, instead of
 throwing an exception, if passed a `toKey` greater than an earlier `toKey`.

### `subMap(`K` fromKey, `boolean` fromInclusive, `K` toKey, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a `ImmutableSortedMap`, consisting of the entries whose keys ranges
 from `fromKey` to `toKey`, inclusive or exclusive as indicated by the boolean
 flags.

 <p>The `SortedMap.subMap` documentation states that a submap of a submap throws an `IllegalArgumentException` if passed a `fromKey` less than an earlier `fromKey`.
 However, this method doesn't throw an exception in that situation, but instead keeps the
 original `fromKey`. Similarly, this method keeps the original `toKey`, instead of
 throwing an exception, if passed a `toKey` greater than an earlier `toKey`.
**Since:** 12.0

### `tailMap(`K` fromKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a `ImmutableSortedMap`, consisting of the entries whose keys are
 greater than or equals to `fromKey`.

 <p>The `SortedMap.tailMap` documentation states that a submap of a submap throws an
 `IllegalArgumentException` if passed a `fromKey` less than an earlier `fromKey`. However, this method doesn't throw an exception in that situation, but instead keeps
 the original `fromKey`.

### `tailMap(`K` fromKey, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a `ImmutableSortedMap`, consisting of the entries whose keys are
 greater than (or equal to, if `inclusive`) `fromKey`.

 <p>The `SortedMap.tailMap` documentation states that a submap of a submap throws an
 `IllegalArgumentException` if passed a `fromKey` less than an earlier `fromKey`. However, this method doesn't throw an exception in that situation, but instead keeps
 the original `fromKey`.
**Since:** 12.0

### `lowerEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `lowerKey(`K` key)`

**Returns:** `K`

### `floorEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `floorKey(`K` key)`

**Returns:** `K`

### `ceilingEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `ceilingKey(`K` key)`

**Returns:** `K`

### `higherEntry(`K` key)`

**Returns:** `java.util.Map.Entry<K,V>`

### `higherKey(`K` key)`

**Returns:** `K`

### `firstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `lastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `pollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `pollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `descendingMap()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `navigableKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `descendingKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `toImmutableMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Not supported. Use `toImmutableSortedMap`, which offers better type-safety, instead.
 This method exists only to hide `ImmutableMap.toImmutableMap` from consumers of `ImmutableSortedMap`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableSortedMap.toImmutableSortedMap`.

### `toImmutableMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Not supported. Use `toImmutableSortedMap`, which offers better type-safety, instead.
 This method exists only to hide `ImmutableMap.toImmutableMap` from consumers of `ImmutableSortedMap`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableSortedMap.toImmutableSortedMap`.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Not supported. Use `naturalOrder`, which offers better type-safety, instead. This method
 exists only to hide `ImmutableMap.builder` from consumers of `ImmutableSortedMap`.
@throws UnsupportedOperationException always
**Deprecated:**Use `ImmutableSortedMap.naturalOrder`, which offers better type-safety.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Not supported for ImmutableSortedMap.
@throws UnsupportedOperationException always
**Deprecated:**Not supported for ImmutableSortedMap.

### `of(`K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain a non-`Comparable`
 key.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this dummy
 version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass a key of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls to will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)`.</b>

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5, `K` k6, `V` v6, `K` k7, `V` v7, `K` k8, `V` v8, `K` k9, `V` v9, `K` k10, `V` v10)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-`Comparable`
 keys.</b> Proper calls will resolve to the version in `ImmutableSortedMap`, not this
 dummy version.
@throws UnsupportedOperationException always
**Deprecated:**<b>Pass keys of type `Comparable` to use `ImmutableSortedMap.of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)`.</b>

### `ofEntries(`java.util.Map.Entry<? extends K,? extends V>[]` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. Use `ImmutableSortedMap.copyOf(ImmutableMap.ofEntries(...))`.
**Deprecated:**Use `ImmutableSortedMap.copyOf(ImmutableMap.ofEntries(...))`.

