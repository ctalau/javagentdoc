# Class: `ForwardingFluentFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingFluentFuture`

**Extends:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Extension

 If you want a class like FluentFuture but with extra methods, we recommend declaring your
 own subclass of ListenableFuture, complete with a method like #from to adapt an
 existing ListenableFuture, implemented atop a ForwardingListenableFuture that
 forwards to that future and adds the desired methods.

## Fields

### `delegate`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Constructors

### `<init>(ListenableFuture<V> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

## Methods

### `addListener(Runnable listener, Executor executor)`

**Parameters:**
- `listener` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

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

### `toString()`

**Returns:** `java.lang.String`

