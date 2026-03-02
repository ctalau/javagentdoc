# Interface: `ListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ListMultimap`

**Extends:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

See the Multimap documentation for information common
 to all multimaps.

 
The #get, #removeAll, and #replaceValues methods each return a List of values. Though the method signature doesn't say so explicitly, the map returned by
 #asMap has List values.

 
See the Guava User Guide article on [Multimap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap).

## Methods

### `get(K key)`

**Returns:** `java.util.List<V>`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the java.util.Collection specified in
 the Multimap interface.

**Parameters:**
- `key` (`K`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.List<V>`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the java.util.Collection specified in
 the Multimap interface.

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.List<V>`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the java.util.Collection specified in
 the Multimap interface.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

**Note:** The returned map's values are guaranteed to be of type List. To obtain
 this map with the more specific generic type Map<K, List<V>>, call Multimaps#asMap(ListMultimap) instead.

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

Two ListMultimap instances are equal if, for each key, they contain the same values
 in the same order. If the value orderings disagree, the multimaps will not be considered equal.

 
An empty ListMultimap is equal to any other empty Multimap, including an
 empty SetMultimap.

**Parameters:**
- `obj` (`java.lang.Object`)

