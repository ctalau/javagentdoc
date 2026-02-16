# Class: `AbstractSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSetMultimap`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultimap<K,V>`](./AbstractMapBasedMultimap.md)

**Implements:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Basic implementation of the {@link SetMultimap} interface. It's a wrapper around {@link AbstractMapBasedMultimap} that converts the returned collections into {@code Sets}. The {@link #createCollection} method must return a {@code Set}.
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

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `createUnmodifiableEmptyCollection()`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

### `unmodifiableCollectionSubclass([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `wrapCollection([`K`](K.md) key, [`java.util.Collection<V>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `entries()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link Collection} specified in the {@link Multimap} interface.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.Set<V>`](../../../../java/util/Set.md)

{@inheritDoc}

 <p>Because a {@code SetMultimap} has unique values for a given key, this method returns a
 {@link Set}, instead of the {@link Collection} specified in the {@link Multimap} interface.

 <p>Any duplicates in {@code values} will be stored in the multimap once.

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

{@inheritDoc}

 <p>Though the method signature doesn't say so explicitly, the returned map has {@link Set}
 values.

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** `boolean`

Stores a key-value pair in the multimap.
@param key key to store in the multimap
@param value value to store in the multimap
@return {@code true} if the method increased the size of the multimap, or {@code false} if the
     multimap already contained the key-value pair

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Compares the specified object to this multimap for equality.

 <p>Two {@code SetMultimap} instances are equal if, for each key, they contain the same values.
 Equality does not depend on the ordering of keys or values.

