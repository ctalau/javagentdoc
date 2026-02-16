# Class: `ForwardingSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSetMultimap`

**Extends:** [`com.google.common.collect.ForwardingMultimap<K,V>`](./ForwardingMultimap.md)

**Implements:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A set multimap which forwards all its method calls to another set multimap. Subclasses should
 override one or more methods to modify the behavior of the backing multimap as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingSetMultimap`.
**Author:** Kurt Alfred Kluever
**Since:** 3.0

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

### `entries()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `get(`K` key)`

**Returns:** `java.util.Set<V>`

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.Set<V>`

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `java.util.Set<V>`

