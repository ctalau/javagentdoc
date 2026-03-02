# Class: `ForwardingConcurrentMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingConcurrentMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** `java.util.concurrent.ConcurrentMap<K,V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing map as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class forwards calls to *only some* 
 default methods. Specifically, it forwards calls only for methods that existed [before
 default methods were introduced](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ConcurrentMap.html). For newer methods, like forEach, it inherits
 their default implementations. When those implementations invoke methods, they invoke methods on
 the ForwardingConcurrentMap.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

### `putIfAbsent(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `remove(Object key, Object value)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `replace(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `replace(K key, V oldValue, V newValue)`

**Parameters:**
- `key` (`K`)
- `oldValue` (`V`)
- `newValue` (`V`)

**Returns:** `boolean`

