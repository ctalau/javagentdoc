# Interface: `SortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedSetMultimap`

**Extends:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

It cannot hold duplicate key-value pairs; adding a key-value pair that's
 already in the multimap has no effect. This interface does not specify the ordering of the
 multimap's keys. See the Multimap documentation for information common to all multimaps.

 
The #get, #removeAll, and #replaceValues methods each return a SortedSet of values, while Multimap#entries() returns a Set of map entries.
 Though the method signature doesn't say so explicitly, the map returned by #asMap has
 SortedSet values.

 
**Warning:** As in all SetMultimaps, do not modify either a key *or a value*
 of a SortedSetMultimap in a way that affects its Object#equals behavior (or its
 position in the order of the values). Undefined behavior and bugs will result.

 
See the Guava User Guide article on [Multimap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap).

## Methods

### `get(K key)`

**Returns:** `java.util.SortedSet<V>`

If no mappings in the multimap
 have the provided key, an empty collection is returned.

 
Changes to the returned collection will update the underlying multimap, and vice versa.

 
Because a SortedSetMultimap has unique sorted values for a given key, this method
 returns a SortedSet, instead of the java.util.Collection specified in the
 Multimap interface.

**Parameters:**
- `key` (`K`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.SortedSet<V>`

Because a SortedSetMultimap has unique sorted values for a given key, this method
 returns a SortedSet, instead of the java.util.Collection specified in the
 Multimap interface.

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.SortedSet<V>`

Because a SortedSetMultimap has unique sorted values for a given key, this method
 returns a SortedSet, instead of the java.util.Collection specified in the
 Multimap interface.

 
Any duplicates in values will be stored in the multimap once.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

Changes to the returned map, such as element removal, will update the underlying multimap. The
 map does not support setValue() on its entries, put, or putAll.

 
When passed a key that is present in the map, asMap().get(Object) has the same
 behavior as #get, returning a live collection. When passed a key that is not present,
 however, asMap().get(Object) returns null instead of an empty collection.

 
**Note:** The returned map's values are guaranteed to be of type SortedSet. To
 obtain this map with the more specific generic type Map<K, SortedSet<V>>, call Multimaps#asMap(SortedSetMultimap) instead. **However**, the returned map *itself* is
 not necessarily a SortedMap: A SortedSetMultimap must expose the *values*
 for a given key in sorted order, but it need not expose the *keys* in sorted order.
 Individual SortedSetMultimap implementations, like those built with MultimapBuilder#treeKeys(), may make additional guarantees.

### `valueComparator()`

**Returns:** `java.util.Comparator<? super V>`

