# Class: `ForwardingFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingFuture`

**Extends:** [`com.google.common.collect.ForwardingObject`](../../collect/ForwardingObject.md)

**Implements:** `java.util.concurrent.Future<V>`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing future as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
Most subclasses can just use SimpleForwardingFuture.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.Future<? extends V>`

### `cancel(boolean mayInterruptIfRunning)`

**Parameters:**
- `mayInterruptIfRunning` (`boolean`)

**Returns:** `boolean`

### `isCancelled()`

**Returns:** `boolean`

### `isDone()`

**Returns:** `boolean`

### `get()`

**Returns:** `V`

### `get(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `V`

