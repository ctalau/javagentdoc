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

### `<init>(Map<K,Collection<V>> map)`

**Parameters:**
- `map` (`java.util.Map<K,java.util.Collection<V>>`): place to store the mapping from each key to its corresponding values

## Methods

### `createCollection()`

**Returns:** `java.util.List<V>`

### `createUnmodifiableEmptyCollection()`

**Returns:** `java.util.List<V>`

### `unmodifiableCollectionSubclass(Collection<E> collection)`

**Parameters:**
- `collection` (`java.util.Collection<E>`)

**Returns:** `java.util.Collection<E>`

### `wrapCollection(K key, Collection<V> collection)`

**Parameters:**
- `key` (`K`)
- `collection` (`java.util.Collection<V>`)

**Returns:** `java.util.Collection<V>`

### `get(K key)`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.List<V>`

### `removeAll(Object key)`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.List<V>`

### `replaceValues(K key, Iterable<? extends V> values)`

Because the values for a given key may have duplicates and follow the insertion ordering,
 this method returns a List, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `java.util.List<V>`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`): key to store in the multimap
- `value` (`V`): value to store in the multimap

**Returns:** `boolean`

### `asMap()`

Though the method signature doesn't say so explicitly, the returned map has List
 values.

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `equals(Object object)`

Two ListMultimap instances are equal if, for each key, they contain the same values
 in the same order. If the value orderings disagree, the multimaps will not be considered equal.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

