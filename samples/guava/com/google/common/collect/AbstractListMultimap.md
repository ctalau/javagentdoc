# Class: `AbstractListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractListMultimap`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultimap<K,V>`](./AbstractMapBasedMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Basic implementation of the {@link ListMultimap} interface. It's a wrapper around {@link AbstractMapBasedMultimap} that converts the returned collections into {@code Lists}. The {@link #createCollection} method must return a {@code List}.
@author Jared Levy
@since 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md) map)`

Creates a new multimap that uses the provided map.
@param map place to store the mapping from each key to its corresponding values

## Methods

### `createCollection()`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `createUnmodifiableEmptyCollection()`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `unmodifiableCollectionSubclass([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `wrapCollection([`K`](K.md) key, [`java.util.Collection<V>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a {@link List}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a {@link List}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a {@link List}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** `boolean`

Stores a key-value pair in the multimap.
@param key key to store in the multimap
@param value value to store in the multimap
@return {@code true} always

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

{@inheritDoc}

 <p>Though the method signature doesn't say so explicitly, the returned map has {@link List}
 values.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Compares the specified object to this multimap for equality.

 <p>Two {@code ListMultimap} instances are equal if, for each key, they contain the same values
 in the same order. If the value orderings disagree, the multimaps will not be considered equal.

