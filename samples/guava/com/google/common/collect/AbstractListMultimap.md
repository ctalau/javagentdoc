# Class: `AbstractListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractListMultimap`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultimap<K,V>`](./AbstractMapBasedMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

It's a wrapper around AbstractMapBasedMultimap that converts the returned collections into Lists. The #createCollection method must return a List.

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.Map<K,java.util.Collection<V>> map)`

**Parameters:**
- `map` (`java.util.Map<K,java.util.Collection<V>>`): place to store the mapping from each key to its corresponding values

## Methods

### `createCollection()`

**Returns:** `java.util.List<V>`

### `createUnmodifiableEmptyCollection()`

**Returns:** `java.util.List<V>`

### `unmodifiableCollectionSubclass(java.util.Collection<E> collection)`

**Returns:** `java.util.Collection<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)

### `wrapCollection(K key, java.util.Collection<V> collection)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)
- `collection` (`java.util.Collection<V>`)

### `get(K key)`

**Returns:** `java.util.List<V>`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`K`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.List<V>`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.List<V>`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `put(K key, V value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`): key to store in the multimap
- `value` (`V`): value to store in the multimap

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

Though the method signature doesn't say so explicitly, the returned map has List
 values.

### `equals(java.lang.Object object)`

**Returns:** `boolean`

Two ListMultimap instances are equal if, for each key, they contain the same values
 in the same order. If the value orderings disagree, the multimaps will not be considered equal.

**Parameters:**
- `object` (`java.lang.Object`)

