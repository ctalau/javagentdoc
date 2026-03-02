# Class: `TrustedListenableFutureTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.TrustedListenableFutureTask`

**Extends:** `com.google.common.util.concurrent.FluentFuture.TrustedFuture<V>`

**Implements:** `java.util.concurrent.RunnableFuture<V>`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This should be used in preference to ListenableFutureTask when possible for
 performance reasons.

## Fields

### `task`

**Type:** [`com.google.common.util.concurrent.InterruptibleTask<?>`](./InterruptibleTask.md)

## Constructors

### `<init>(Callable<V> callable)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)

### `<init>(AsyncCallable<V> callable)`

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md))

## Methods

### `create(AsyncCallable<V> callable)`

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md))

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

### `create(Callable<V> callable)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

### `create(Runnable runnable, V result)`

**Parameters:**
- `runnable` (`java.lang.Runnable`): the runnable task
- `result` (`V`): the result to return on successful completion. If you don't need a particular
       result, consider using constructions of the form: ListenableFuture<?> f =
       ListenableFutureTask.create(runnable, null)

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

### `run()`

**Returns:** `void`

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

