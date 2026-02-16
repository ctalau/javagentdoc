# Class: `AbstractSortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSortedSetMultimap`

**Extends:** [`com.google.common.collect.AbstractSetMultimap<K,V>`](./AbstractSetMultimap.md)

**Implements:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Basic implementation of the {@link SortedSetMultimap} interface. It's a wrapper around {@link AbstractMapBasedMultimap} that converts the returned collections into sorted sets. The {@link #createCollection} method must return a {@code SortedSet}.
@author Jared Levy

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md) map)`

Creates a new multimap that uses the provided map.
@param map place to store the mapping from each key to its corresponding values

## Methods

### `createCollection()`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

### `createUnmodifiableEmptyCollection()`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

### `unmodifiableCollectionSubclass([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `wrapCollection([`K`](K.md) key, [`java.util.Collection<V>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

Returns a collection view of all values associated with a key. If no mappings in the multimap
 have the provided key, an empty collection is returned.

 <p>Changes to the returned collection will update the underlying multimap, and vice versa.

 <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
 returns a {@link SortedSet}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

Removes all values associated with a given key. The returned collection is immutable.

 <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
 returns a {@link SortedSet}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

Stores a collection of values with the same key, replacing any existing values for that key.
 The returned collection is immutable.

 <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
 returns a {@link SortedSet}, instead of the {@link Collection} specified in the {@link Multimap} interface.

 <p>Any duplicates in {@code values} will be stored in the multimap once.

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

Returns a map view that associates each key with the corresponding values in the multimap.
 Changes to the returned map, such as element removal, will update the underlying multimap. The
 map does not support {@code setValue} on its entries, {@code put}, or {@code putAll}.

 <p>When passed a key that is present in the map, {@code asMap().get(Object)} has the same
 behavior as {@link #get}, returning a live collection. When passed a key that is not present,
 however, {@code asMap().get(Object)} returns {@code null} instead of an empty collection.

 <p>Though the method signature doesn't say so explicitly, the returned map has {@link SortedSet} values.

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

{@inheritDoc}

 <p>Consequently, the values do not follow their natural ordering or the ordering of the value
 comparator.

