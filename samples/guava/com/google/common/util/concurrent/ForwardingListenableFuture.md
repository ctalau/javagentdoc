# Class: `ForwardingListenableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingListenableFuture`

**Extends:** [`com.google.common.util.concurrent.ForwardingFuture<V>`](./ForwardingFuture.md)

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses
 should override one or more methods to modify the behavior of the backing future as desired per
 the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
Most subclasses can just use SimpleForwardingListenableFuture.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)

### `addListener(Runnable listener, Executor exec)`

**Parameters:**
- `listener` (`java.lang.Runnable`)
- `exec` (`java.util.concurrent.Executor`)

**Returns:** `void`

