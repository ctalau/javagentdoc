# Class: `ForwardingFluentFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingFluentFuture`

**Extends:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

{@link FluentFuture} that forwards all calls to a delegate.

 <h3>Extension</h3>

 If you want a class like {@code FluentFuture} but with extra methods, we recommend declaring your
 own subclass of {@link ListenableFuture}, complete with a method like {@link #from} to adapt an
 existing {@code ListenableFuture}, implemented atop a {@link ForwardingListenableFuture} that
 forwards to that future and adds the desired methods.

## Fields

### `delegate`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Constructors

### `<init>([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) delegate)`

## Methods

### `addListener(`java.lang.Runnable` listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

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

### `toString()`

**Returns:** `java.lang.String`

