# Interface: `ListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ListMultimap`

**Extends:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `Multimap` that can hold duplicate key-value pairs and that maintains the insertion
 ordering of values for a given key. See the `Multimap` documentation for information common
 to all multimaps.

 <p>The `get`, `removeAll`, and `replaceValues` methods each return a `List` of values. Though the method signature doesn't say so explicitly, the map returned by
 `asMap` has `List` values.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">`Multimap`</a>.
**Author:** Jared Levy
**Since:** 2.0

## Methods

### `get(`K` key)`

**Returns:** `java.util.List<V>`

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a `List`, instead of the `java.util.Collection` specified in
 the `Multimap` interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.List<V>`

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a `List`, instead of the `java.util.Collection` specified in
 the `Multimap` interface.

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `java.util.List<V>`

{@inheritDoc}

 <p>Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a `List`, instead of the `java.util.Collection` specified in
 the `Multimap` interface.

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

{@inheritDoc}

 <p><b>Note:</b> The returned map's values are guaranteed to be of type `List`. To obtain
 this map with the more specific generic type `Map<K, List<V>>`, call `Multimaps.asMap(ListMultimap)` instead.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Compares the specified object to this multimap for equality.

 <p>Two `ListMultimap` instances are equal if, for each key, they contain the same values
 in the same order. If the value orderings disagree, the multimaps will not be considered equal.

 <p>An empty `ListMultimap` is equal to any other empty `Multimap`, including an
 empty `SetMultimap`.

