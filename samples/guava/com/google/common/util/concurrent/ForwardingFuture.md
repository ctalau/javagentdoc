# Class: `ForwardingFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingFuture`

**Extends:** [`com.google.common.collect.ForwardingObject`](../../collect/ForwardingObject.md)

**Implements:** [`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@link Future} which forwards all its method calls to another future. Subclasses should
 override one or more methods to modify the behavior of the backing future as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p>Most subclasses can just use {@link SimpleForwardingFuture}.
@author Sven Mawson
@since 1.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.concurrent.Future<? extends V>`](../../../../../java/util/concurrent/Future.md)

### `cancel(`boolean` mayInterruptIfRunning)`

**Returns:** `boolean`

### `isCancelled()`

**Returns:** `boolean`

### `isDone()`

**Returns:** `boolean`

### `get()`

**Returns:** [`V`](V.md)

### `get(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`V`](V.md)

