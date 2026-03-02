# Interface: `SetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SetMultimap`

**Extends:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Adding a key-value pair that's
 already in the multimap has no effect. See the Multimap documentation for information
 common to all multimaps.

 
The #get, #removeAll, and #replaceValues methods each return a Set of values, while #entries returns a Set of map entries. Though the method
 signature doesn't say so explicitly, the map returned by #asMap has Set values.

 
If the values corresponding to a single key should be ordered according to a java.util.Comparator (or the natural order), see the SortedSetMultimap subinterface.

 
Since the value collections are sets, the behavior of a SetMultimap is not specified
 if key *or value* objects already present in the multimap change in a manner that affects
 equals comparisons. Use caution if mutable objects are used as keys or values in a 
 SetMultimap.

 
**Warning:** Do not modify either a key *or a value* of a SetMultimap in a way
 that affects its Object#equals behavior. Undefined behavior and bugs will result.

 
See the Guava User Guide article on [Multimap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multimap).

## Methods

### `get(K key)`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the java.util.Collection specified in the Multimap
 interface.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Set<V>`

### `removeAll(Object key)`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the java.util.Collection specified in the Multimap
 interface.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.Set<V>`

### `replaceValues(K key, Iterable<? extends V> values)`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the java.util.Collection specified in the Multimap
 interface.

 
Any duplicates in values will be stored in the multimap once.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `java.util.Set<V>`

### `entries()`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the java.util.Collection specified in the Multimap
 interface.

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `asMap()`

**Note:** The returned map's values are guaranteed to be of type Set. To obtain
 this map with the more specific generic type Map<K, Set<V>>, call Multimaps#asMap(SetMultimap) instead.

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `equals(Object obj)`

Two SetMultimap instances are equal if, for each key, they contain the same values.
 Equality does not depend on the ordering of keys or values.

 
An empty SetMultimap is equal to any other empty Multimap, including an
 empty ListMultimap.

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

