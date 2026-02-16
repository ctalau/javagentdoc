# Class: `ForwardingFluentFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingFluentFuture`

**Extends:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

`FluentFuture` that forwards all calls to a delegate.

 <h3>Extension</h3>

 If you want a class like `FluentFuture` but with extra methods, we recommend declaring your
 own subclass of `ListenableFuture`, complete with a method like `from` to adapt an
 existing `ListenableFuture`, implemented atop a `ForwardingListenableFuture` that
 forwards to that future and adds the desired methods.

## Fields

### `delegate`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Constructors

### `<init>([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) delegate)`

## Methods

### `addListener(`java.lang.Runnable` listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

### `cancel(`boolean` mayInterruptIfRunning)`

**Returns:** `boolean`

### `isCancelled()`

**Returns:** `boolean`

### `isDone()`

**Returns:** `boolean`

### `get()`

**Returns:** `V`

### `get(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `V`

### `toString()`

**Returns:** `java.lang.String`

