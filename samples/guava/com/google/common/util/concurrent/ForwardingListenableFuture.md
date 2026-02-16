# Class: `ForwardingListenableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingListenableFuture`

**Extends:** [`com.google.common.util.concurrent.ForwardingFuture<V>`](./ForwardingFuture.md)

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `ListenableFuture` which forwards all its method calls to another future. Subclasses
 should override one or more methods to modify the behavior of the backing future as desired per
 the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p>Most subclasses can just use `SimpleForwardingListenableFuture`.
**Author:** Shardul Deo
**Since:** 4.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)

### `addListener(`java.lang.Runnable` listener, `java.util.concurrent.Executor` exec)`

**Returns:** `void`

