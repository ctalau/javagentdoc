# Class: `AbstractSortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSortedSetMultimap`

**Extends:** [`com.google.common.collect.AbstractSetMultimap<K,V>`](./AbstractSetMultimap.md)

**Implements:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

It's a wrapper around AbstractMapBasedMultimap that converts the returned collections into sorted sets. The #createCollection method must return a SortedSet.

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.Map<K,java.util.Collection<V>> map)`

**Parameters:**
- `map` (`java.util.Map<K,java.util.Collection<V>>`): place to store the mapping from each key to its corresponding values

## Methods

### `createCollection()`

**Returns:** `java.util.SortedSet<V>`

### `createUnmodifiableEmptyCollection()`

**Returns:** `java.util.SortedSet<V>`

### `unmodifiableCollectionSubclass(java.util.Collection<E> collection)`

**Returns:** `java.util.SortedSet<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)

### `wrapCollection(K key, java.util.Collection<V> collection)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)
- `collection` (`java.util.Collection<V>`)

### `get(K key)`

**Returns:** `java.util.SortedSet<V>`

If no mappings in the multimap
 have the provided key, an empty collection is returned.

 
Changes to the returned collection will update the underlying multimap, and vice versa.

 
Because a SortedSetMultimap has unique sorted values for a given key, this method
 returns a SortedSet, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`K`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.SortedSet<V>`

The returned collection is immutable.

 
Because a SortedSetMultimap has unique sorted values for a given key, this method
 returns a SortedSet, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.SortedSet<V>`

The returned collection is immutable.

 
Because a SortedSetMultimap has unique sorted values for a given key, this method
 returns a SortedSet, instead of the Collection specified in the Multimap interface.

 
Any duplicates in values will be stored in the multimap once.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

Changes to the returned map, such as element removal, will update the underlying multimap. The
 map does not support setValue on its entries, put, or putAll.

 
When passed a key that is present in the map, asMap().get(Object) has the same
 behavior as #get, returning a live collection. When passed a key that is not present,
 however, asMap().get(Object) returns null instead of an empty collection.

 
Though the method signature doesn't say so explicitly, the returned map has SortedSet values.

### `values()`

**Returns:** `java.util.Collection<V>`

Consequently, the values do not follow their natural ordering or the ordering of the value
 comparator.

