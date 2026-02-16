# Class: `ForwardingConcurrentMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingConcurrentMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** [`java.util.concurrent.ConcurrentMap<K,V>`](../../../../java/util/concurrent/ConcurrentMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A concurrent map which forwards all its method calls to another concurrent map. Subclasses should
 override one or more methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>{@code default} method warning:</b> This class forwards calls to <i>only some</i> {@code
 default} methods. Specifically, it forwards calls only for methods that existed <a href="https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ConcurrentMap.html">before
 {@code default} methods were introduced</a>. For newer methods, like {@code forEach}, it inherits
 their default implementations. When those implementations invoke methods, they invoke methods on
 the {@code ForwardingConcurrentMap}.
@author Charles Fry
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.concurrent.ConcurrentMap<K,V>`](../../../../java/util/concurrent/ConcurrentMap.md)

### `putIfAbsent([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `replace([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `replace([`K`](K.md) key, [`V`](V.md) oldValue, [`V`](V.md) newValue)`

**Returns:** `boolean`

