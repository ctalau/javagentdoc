# Class: `ForwardingSortedSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedSetMultimap`

**Extends:** [`com.google.common.collect.ForwardingSetMultimap<K,V>`](./ForwardingSetMultimap.md)

**Implements:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override one or more methods to modify the behavior of the backing multimap as
 desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingSortedSetMultimap.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.SortedSet<V>`

### `removeAll(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.SortedSet<V>`

### `replaceValues(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `java.util.SortedSet<V>`

### `valueComparator()`

**Returns:** `java.util.Comparator<? super V>`

