# Interface: `SortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedSetMultimap`

**Extends:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@code SetMultimap} whose set of values for a given key are kept sorted; that is, they comprise
 a {@link SortedSet}. It cannot hold duplicate key-value pairs; adding a key-value pair that's
 already in the multimap has no effect. This interface does not specify the ordering of the
 multimap's keys. See the {@link Multimap} documentation for information common to all multimaps.

 <p>The {@link #get}, {@link #removeAll}, and {@link #replaceValues} methods each return a {@link SortedSet} of values, while {@link Multimap#entries()} returns a {@link Set} of map entries.
 Though the method signature doesn't say so explicitly, the map returned by {@link #asMap} has
 {@code SortedSet} values.

 <p><b>Warning:</b> As in all {@link SetMultimap}s, do not modify either a key <i>or a value</i>
 of a {@code SortedSetMultimap} in a way that affects its {@link Object#equals} behavior (or its
 position in the order of the values). Undefined behavior and bugs will result.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap">{@code Multimap}</a>.
@author Jared Levy
@since 2.0

## Methods

### `get([`K`](K.md) key)`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

Returns a collection view of all values associated with a key. If no mappings in the multimap
 have the provided key, an empty collection is returned.

 <p>Changes to the returned collection will update the underlying multimap, and vice versa.

 <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
 returns a {@link SortedSet}, instead of the {@link java.util.Collection} specified in the
 {@link Multimap} interface.

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

Removes all values associated with a given key.

 <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
 returns a {@link SortedSet}, instead of the {@link java.util.Collection} specified in the
 {@link Multimap} interface.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.SortedSet<V>`](../../../../java/util/SortedSet.md)

Stores a collection of values with the same key, replacing any existing values for that key.

 <p>Because a {@code SortedSetMultimap} has unique sorted values for a given key, this method
 returns a {@link SortedSet}, instead of the {@link java.util.Collection} specified in the
 {@link Multimap} interface.

 <p>Any duplicates in {@code values} will be stored in the multimap once.

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

Returns a map view that associates each key with the corresponding values in the multimap.
 Changes to the returned map, such as element removal, will update the underlying multimap. The
 map does not support {@code setValue()} on its entries, {@code put}, or {@code putAll}.

 <p>When passed a key that is present in the map, {@code asMap().get(Object)} has the same
 behavior as {@link #get}, returning a live collection. When passed a key that is not present,
 however, {@code asMap().get(Object)} returns {@code null} instead of an empty collection.

 <p><b>Note:</b> The returned map's values are guaranteed to be of type {@link SortedSet}. To
 obtain this map with the more specific generic type {@code Map<K, SortedSet<V>>}, call {@link Multimaps#asMap(SortedSetMultimap)} instead. <b>However</b>, the returned map <i>itself</i> is
 not necessarily a {@link SortedMap}: A {@code SortedSetMultimap} must expose the <i>values</i>
 for a given key in sorted order, but it need not expose the <i>keys</i> in sorted order.
 Individual {@code SortedSetMultimap} implementations, like those built with {@link MultimapBuilder#treeKeys()}, may make additional guarantees.

### `valueComparator()`

**Returns:** [`java.util.Comparator<? super V>`](../../../../java/util/Comparator.md)

Returns the comparator that orders the multimap values, with {@code null} indicating that
 natural ordering is used.

