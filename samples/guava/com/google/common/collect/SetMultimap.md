# Interface: `SetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SetMultimap`

**Extends:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `Multimap` that cannot hold duplicate key-value pairs. Adding a key-value pair that's
 already in the multimap has no effect. See the `Multimap` documentation for information
 common to all multimaps.

 <p>The `get`, `removeAll`, and `replaceValues` methods each return a `Set` of values, while `entries` returns a `Set` of map entries. Though the method
 signature doesn't say so explicitly, the map returned by `asMap` has `Set` values.

 <p>If the values corresponding to a single key should be ordered according to a `java.util.Comparator` (or the natural order), see the `SortedSetMultimap` subinterface.

 <p>Since the value collections are sets, the behavior of a `SetMultimap` is not specified
 if key <em>or value</em> objects already present in the multimap change in a manner that affects
 `equals` comparisons. Use caution if mutable objects are used as keys or values in a `SetMultimap`.

 <p><b>Warning:</b> Do not modify either a key <i>or a value</i> of a `SetMultimap` in a way
 that affects its `Object.equals` behavior. Undefined behavior and bugs will result.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">`Multimap`</a>.
**Author:** Jared Levy
**Since:** 2.0

## Methods

### `get(`K` key)`

**Returns:** `java.util.Set<V>`

{@inheritDoc}

 <p>Because a `SetMultimap` has unique values for a given key, this method returns a
 `Set`, instead of the `java.util.Collection` specified in the `Multimap`
 interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.Set<V>`

{@inheritDoc}

 <p>Because a `SetMultimap` has unique values for a given key, this method returns a
 `Set`, instead of the `java.util.Collection` specified in the `Multimap`
 interface.

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `java.util.Set<V>`

{@inheritDoc}

 <p>Because a `SetMultimap` has unique values for a given key, this method returns a
 `Set`, instead of the `java.util.Collection` specified in the `Multimap`
 interface.

 <p>Any duplicates in `values` will be stored in the multimap once.

### `entries()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

{@inheritDoc}

 <p>Because a `SetMultimap` has unique values for a given key, this method returns a
 `Set`, instead of the `java.util.Collection` specified in the `Multimap`
 interface.

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

{@inheritDoc}

 <p><b>Note:</b> The returned map's values are guaranteed to be of type `Set`. To obtain
 this map with the more specific generic type `Map<K, Set<V>>`, call `Multimaps.asMap(SetMultimap)` instead.

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

Compares the specified object to this multimap for equality.

 <p>Two `SetMultimap` instances are equal if, for each key, they contain the same values.
 Equality does not depend on the ordering of keys or values.

 <p>An empty `SetMultimap` is equal to any other empty `Multimap`, including an
 empty `ListMultimap`.

