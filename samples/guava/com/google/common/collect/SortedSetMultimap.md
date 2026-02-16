# Interface: `SortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedSetMultimap`

**Extends:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `SetMultimap` whose set of values for a given key are kept sorted; that is, they comprise
 a `SortedSet`. It cannot hold duplicate key-value pairs; adding a key-value pair that's
 already in the multimap has no effect. This interface does not specify the ordering of the
 multimap's keys. See the `Multimap` documentation for information common to all multimaps.

 <p>The `get`, `removeAll`, and `replaceValues` methods each return a `SortedSet` of values, while `Multimap.entries()` returns a `Set` of map entries.
 Though the method signature doesn't say so explicitly, the map returned by `asMap` has
 `SortedSet` values.

 <p><b>Warning:</b> As in all `SetMultimap`s, do not modify either a key <i>or a value</i>
 of a `SortedSetMultimap` in a way that affects its `Object.equals` behavior (or its
 position in the order of the values). Undefined behavior and bugs will result.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">`Multimap`</a>.
**Author:** Jared Levy
**Since:** 2.0

## Methods

### `get(`K` key)`

**Returns:** `java.util.SortedSet<V>`

Returns a collection view of all values associated with a key. If no mappings in the multimap
 have the provided key, an empty collection is returned.

 <p>Changes to the returned collection will update the underlying multimap, and vice versa.

 <p>Because a `SortedSetMultimap` has unique sorted values for a given key, this method
 returns a `SortedSet`, instead of the `java.util.Collection` specified in the
 `Multimap` interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.SortedSet<V>`

Removes all values associated with a given key.

 <p>Because a `SortedSetMultimap` has unique sorted values for a given key, this method
 returns a `SortedSet`, instead of the `java.util.Collection` specified in the
 `Multimap` interface.

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `java.util.SortedSet<V>`

Stores a collection of values with the same key, replacing any existing values for that key.

 <p>Because a `SortedSetMultimap` has unique sorted values for a given key, this method
 returns a `SortedSet`, instead of the `java.util.Collection` specified in the
 `Multimap` interface.

 <p>Any duplicates in `values` will be stored in the multimap once.

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

Returns a map view that associates each key with the corresponding values in the multimap.
 Changes to the returned map, such as element removal, will update the underlying multimap. The
 map does not support `setValue()` on its entries, `put`, or `putAll`.

 <p>When passed a key that is present in the map, `asMap().get(Object)` has the same
 behavior as `get`, returning a live collection. When passed a key that is not present,
 however, `asMap().get(Object)` returns `null` instead of an empty collection.

 <p><b>Note:</b> The returned map's values are guaranteed to be of type `SortedSet`. To
 obtain this map with the more specific generic type `Map<K, SortedSet<V>>`, call `Multimaps.asMap(SortedSetMultimap)` instead. <b>However</b>, the returned map <i>itself</i> is
 not necessarily a `SortedMap`: A `SortedSetMultimap` must expose the <i>values</i>
 for a given key in sorted order, but it need not expose the <i>keys</i> in sorted order.
 Individual `SortedSetMultimap` implementations, like those built with `MultimapBuilder.treeKeys()`, may make additional guarantees.

### `valueComparator()`

**Returns:** `java.util.Comparator<? super V>`

Returns the comparator that orders the multimap values, with `null` indicating that
 natural ordering is used.

