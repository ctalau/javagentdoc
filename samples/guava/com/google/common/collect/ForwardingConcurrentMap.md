# Class: `ForwardingConcurrentMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingConcurrentMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** `java.util.concurrent.ConcurrentMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A concurrent map which forwards all its method calls to another concurrent map. Subclasses should
 override one or more methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>`default` method warning:</b> This class forwards calls to <i>only some</i> `default` methods. Specifically, it forwards calls only for methods that existed <a href="https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ConcurrentMap.html">before
 `default` methods were introduced</a>. For newer methods, like `forEach`, it inherits
 their default implementations. When those implementations invoke methods, they invoke methods on
 the `ForwardingConcurrentMap`.
**Author:** Charles Fry
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

### `putIfAbsent(`K` key, `V` value)`

**Returns:** `V`

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `replace(`K` key, `V` value)`

**Returns:** `V`

### `replace(`K` key, `V` oldValue, `V` newValue)`

**Returns:** `boolean`

