# Class: `ForwardingListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingListMultimap`

**Extends:** [`com.google.common.collect.ForwardingMultimap<K,V>`](./ForwardingMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A list multimap which forwards all its method calls to another list multimap. Subclasses should
 override one or more methods to modify the behavior of the backing multimap as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingListMultimap}.
@author Kurt Alfred Kluever
@since 3.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.List<V>`](../../../../java/util/List.md)

