# Class: `ImmutableSortedMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSortedMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Implements:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A {@link NavigableMap} whose contents will never change, with many other important properties
 detailed at {@link ImmutableCollection}.

 <p><b>Warning:</b> as with any sorted collection, you are strongly advised not to use a {@link Comparator} or {@link Comparable} type whose comparison behavior is <i>inconsistent with
 equals</i>. That is, {@code a.compareTo(b)} or {@code comparator.compare(a, b)} should equal zero
 <i>if and only if</i> {@code a.equals(b)}. If this advice is not followed, the resulting map will
 not correctly obey its specification.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
@author Jared Levy
@author Louis Wasserman
@since 2.0 (implements {@code NavigableMap} since 12.0)

## Fields

### `NATURAL_ORDER`

**Type:** [`java.util.Comparator<java.lang.Comparable>`](../../../../java/util/Comparator.md)

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

### `toImmutableSortedMap([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, [`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@link Collector} that accumulates elements into an {@code ImmutableSortedMap} whose
 keys and values are the result of applying the provided mapping functions to the input
 elements. The generated map is sorted by the specified comparator.

 <p>If the mapped keys contain duplicates (according to the specified comparator), an {@code
 IllegalArgumentException} is thrown when the collection operation is performed. (This differs
 from the {@code Collector} returned by {@link Collectors#toMap(Function, Function)}, which
 throws an {@code IllegalStateException}.)
@since 21.0

### `toImmutableSortedMap([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, [`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@link Collector} that accumulates elements into an {@code ImmutableSortedMap} whose
 keys and values are the result of applying the provided mapping functions to the input
 elements.

 <p>If the mapped keys contain duplicates (according to the comparator), the values are merged
 using the specified merging function. Entries will appear in the encounter order of the first
 occurrence of the key.
@since 21.0

### `emptyMap([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns the empty sorted map.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`K`](K.md) k1, [`V`](V.md) v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing a single entry.

### `of([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, [`K`](K.md) k1, [`V`](V.md) v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing a single entry.

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if the two keys are equal according to their natural ordering

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8, [`K`](K.md) k9, [`V`](V.md) v9)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
@since 31.0

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8, [`K`](K.md) k9, [`V`](V.md) v9, [`K`](K.md) k10, [`V`](V.md) v10)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable sorted map containing the given entries, sorted by the natural ordering of
 their keys.
@throws IllegalArgumentException if any two keys are equal according to their natural ordering
@since 31.0

### `copyOf([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the same entries as {@code map}, sorted by the natural
 ordering of the keys.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

 <p>This method is not type-safe, as it may be called on a map with keys that are not mutually
 comparable.
@throws ClassCastException if the keys in {@code map} are not mutually comparable
@throws NullPointerException if any key or value in {@code map} is null
@throws IllegalArgumentException if any two keys are equal according to their natural ordering

### `copyOf([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map, [`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the same entries as {@code map}, with keys sorted by the
 provided comparator.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in {@code map} is null
@throws IllegalArgumentException if any two keys are equal according to the comparator

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the given entries, with keys sorted by their natural
 ordering.

 <p>This method is not type-safe, as it may be called on a map with keys that are not mutually
 comparable.
@throws NullPointerException if any key or value in {@code map} is null
@throws IllegalArgumentException if any two keys are equal according to the comparator
@since 19.0

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries, [`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the given entries, with keys sorted by the provided
 comparator.
@throws NullPointerException if any key or value in {@code map} is null
@throws IllegalArgumentException if any two keys are equal according to the comparator
@since 19.0

### `copyOfSorted([`java.util.SortedMap<K,? extends V>`](../../../../java/util/SortedMap.md) map)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Returns an immutable map containing the same entries as the provided sorted map, with the same
 ordering.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in {@code map} is null

### `copyOfInternal([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map, [`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `fromEntries([`java.util.Map.Entry<K,V>[]`](../../../../java/util/Map/Entry.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `fromEntries([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, `boolean` sameComparator, `java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Accepts a collection of possibly-null entries. If {@code sameComparator}, then it is assumed
 that they do not need to be sorted or checked for dupes.

### `fromEntries([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, `boolean` sameComparator, [`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`](../../../../java/util/Map/@org/checkerframework/checker/nullness/qual/Nullable Entry.md) entryArray, `int` size)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `naturalOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Returns a builder that creates immutable sorted maps whose keys are ordered by their natural
 ordering. The sorted maps use {@link Ordering#natural()} as the comparator.

### `orderedBy([`java.util.Comparator<K>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Returns a builder that creates immutable sorted maps with an explicit comparator. If the
 comparator has a more general type than the map's keys, such as creating a {@code
 SortedMap<Integer, String>} with a {@code Comparator<Number>}, use the {@link Builder}
 constructor instead.
@throws NullPointerException if {@code comparator} is null

### `reverseOrder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Returns a builder that creates immutable sorted maps whose keys are ordered by the reverse of
 their natural ordering.

### `size()`

**Returns:** `int`

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

**Returns:** `void`

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

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

**Returns:** [`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md)

Returns the comparator that orders the keys, which is {@link Ordering#natural()} when the
 natural ordering of the keys is used. Note that its behavior is not consistent with {@link TreeMap#comparator()}, which returns {@code null} to indicate natural ordering.

### `firstKey()`

**Returns:** [`K`](K.md)

### `lastKey()`

**Returns:** [`K`](K.md)

### `getSubMap(`int` fromIndex, `int` toIndex)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `headMap([`K`](K.md) toKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a {@code ImmutableSortedMap}, consisting of the entries whose keys are less
 than {@code toKey}.

 <p>The {@link SortedMap#headMap} documentation states that a submap of a submap throws an
 {@link IllegalArgumentException} if passed a {@code toKey} greater than an earlier {@code
 toKey}. However, this method doesn't throw an exception in that situation, but instead keeps
 the original {@code toKey}.

### `headMap([`K`](K.md) toKey, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a {@code ImmutableSortedMap}, consisting of the entries whose keys are less
 than (or equal to, if {@code inclusive}) {@code toKey}.

 <p>The {@link SortedMap#headMap} documentation states that a submap of a submap throws an
 {@link IllegalArgumentException} if passed a {@code toKey} greater than an earlier {@code
 toKey}. However, this method doesn't throw an exception in that situation, but instead keeps
 the original {@code toKey}.
@since 12.0

### `subMap([`K`](K.md) fromKey, [`K`](K.md) toKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a {@code ImmutableSortedMap}, consisting of the entries whose keys ranges
 from {@code fromKey}, inclusive, to {@code toKey}, exclusive.

 <p>The {@link SortedMap#subMap} documentation states that a submap of a submap throws an {@link IllegalArgumentException} if passed a {@code fromKey} less than an earlier {@code fromKey}.
 However, this method doesn't throw an exception in that situation, but instead keeps the
 original {@code fromKey}. Similarly, this method keeps the original {@code toKey}, instead of
 throwing an exception, if passed a {@code toKey} greater than an earlier {@code toKey}.

### `subMap([`K`](K.md) fromKey, `boolean` fromInclusive, [`K`](K.md) toKey, `boolean` toInclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a {@code ImmutableSortedMap}, consisting of the entries whose keys ranges
 from {@code fromKey} to {@code toKey}, inclusive or exclusive as indicated by the boolean
 flags.

 <p>The {@link SortedMap#subMap} documentation states that a submap of a submap throws an {@link IllegalArgumentException} if passed a {@code fromKey} less than an earlier {@code fromKey}.
 However, this method doesn't throw an exception in that situation, but instead keeps the
 original {@code fromKey}. Similarly, this method keeps the original {@code toKey}, instead of
 throwing an exception, if passed a {@code toKey} greater than an earlier {@code toKey}.
@since 12.0

### `tailMap([`K`](K.md) fromKey)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a {@code ImmutableSortedMap}, consisting of the entries whose keys are
 greater than or equals to {@code fromKey}.

 <p>The {@link SortedMap#tailMap} documentation states that a submap of a submap throws an
 {@link IllegalArgumentException} if passed a {@code fromKey} less than an earlier {@code
 fromKey}. However, this method doesn't throw an exception in that situation, but instead keeps
 the original {@code fromKey}.

### `tailMap([`K`](K.md) fromKey, `boolean` inclusive)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

This method returns a {@code ImmutableSortedMap}, consisting of the entries whose keys are
 greater than (or equal to, if {@code inclusive}) {@code fromKey}.

 <p>The {@link SortedMap#tailMap} documentation states that a submap of a submap throws an
 {@link IllegalArgumentException} if passed a {@code fromKey} less than an earlier {@code
 fromKey}. However, this method doesn't throw an exception in that situation, but instead keeps
 the original {@code fromKey}.
@since 12.0

### `lowerEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `lowerKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `floorEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `floorKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `ceilingEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `ceilingKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `higherEntry([`K`](K.md) key)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `higherKey([`K`](K.md) key)`

**Returns:** [`K`](K.md)

### `firstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `lastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `pollFirstEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `pollLastEntry()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `descendingMap()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

### `navigableKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `descendingKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSortedSet<K>`](./ImmutableSortedSet.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `toImmutableMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Not supported. Use {@link #toImmutableSortedMap}, which offers better type-safety, instead.
 This method exists only to hide {@link ImmutableMap#toImmutableMap} from consumers of {@code
 ImmutableSortedMap}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedMap#toImmutableSortedMap}.

### `toImmutableMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Not supported. Use {@link #toImmutableSortedMap}, which offers better type-safety, instead.
 This method exists only to hide {@link ImmutableMap#toImmutableMap} from consumers of {@code
 ImmutableSortedMap}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedMap#toImmutableSortedMap}.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Not supported. Use {@link #naturalOrder}, which offers better type-safety, instead. This method
 exists only to hide {@link ImmutableMap#builder} from consumers of {@code ImmutableSortedMap}.
@throws UnsupportedOperationException always
@deprecated Use {@link ImmutableSortedMap#naturalOrder}, which offers better type-safety.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap.Builder<K,V>`](ImmutableSortedMap/Builder.md)

Not supported for ImmutableSortedMap.
@throws UnsupportedOperationException always
@deprecated Not supported for ImmutableSortedMap.

### `of([`K`](K.md) k1, [`V`](V.md) v1)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain a non-{@code Comparable}
 key.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this dummy
 version.
@throws UnsupportedOperationException always
@deprecated <b>Pass a key of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls to will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8, [`K`](K.md) k9, [`V`](V.md) v9)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)}.</b>

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5, [`K`](K.md) k6, [`V`](V.md) v6, [`K`](K.md) k7, [`V`](V.md) v7, [`K`](K.md) k8, [`V`](V.md) v8, [`K`](K.md) k9, [`V`](V.md) v9, [`K`](K.md) k10, [`V`](V.md) v10)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. <b>You are attempting to create a map that may contain non-{@code Comparable}
 keys.</b> Proper calls will resolve to the version in {@code ImmutableSortedMap}, not this
 dummy version.
@throws UnsupportedOperationException always
@deprecated <b>Pass keys of type {@code Comparable} to use {@link ImmutableSortedMap#of(Comparable, Object, Comparable, Object, Comparable, Object,
     Comparable, Object, Comparable, Object)}.</b>

### `ofEntries([`java.util.Map.Entry<? extends K,? extends V>[]`](../../../../java/util/Map/Entry.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableSortedMap<K,V>`](./ImmutableSortedMap.md)

Not supported. Use {@code ImmutableSortedMap.copyOf(ImmutableMap.ofEntries(...))}.
@deprecated Use {@code ImmutableSortedMap.copyOf(ImmutableMap.ofEntries(...))}.

