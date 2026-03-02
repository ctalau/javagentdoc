# Class: `AbstractSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSetMultimap`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultimap<K,V>`](./AbstractMapBasedMultimap.md)

**Implements:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

It's a wrapper around AbstractMapBasedMultimap that converts the returned collections into Sets. The #createCollection method must return a Set.

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(Map<K,Collection<V>> map)`

**Parameters:**
- `map` (`java.util.Map<K,java.util.Collection<V>>`): place to store the mapping from each key to its corresponding values

## Methods

### `createCollection()`

**Returns:** `java.util.Set<V>`

### `createUnmodifiableEmptyCollection()`

**Returns:** `java.util.Set<V>`

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

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Set<V>`

### `entries()`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the Collection specified in the Multimap interface.

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `removeAll(Object key)`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the Collection specified in the Multimap interface.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.Set<V>`

### `replaceValues(K key, Iterable<? extends V> values)`

Because a SetMultimap has unique values for a given key, this method returns a
 Set, instead of the Collection specified in the Multimap interface.

 
Any duplicates in values will be stored in the multimap once.

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `java.util.Set<V>`

### `asMap()`

Though the method signature doesn't say so explicitly, the returned map has Set
 values.

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`): key to store in the multimap
- `value` (`V`): value to store in the multimap

**Returns:** `boolean`

### `equals(Object object)`

Two SetMultimap instances are equal if, for each key, they contain the same values.
 Equality does not depend on the ordering of keys or values.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

