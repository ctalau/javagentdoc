# Class: `ForwardingListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingListMultimap`

**Extends:** [`com.google.common.collect.ForwardingMultimap<K,V>`](./ForwardingMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing multimap as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingListMultimap.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

### `get(K key)`

**Returns:** `java.util.List<V>`

**Parameters:**
- `key` (`K`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.List<V>`

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.List<V>`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

