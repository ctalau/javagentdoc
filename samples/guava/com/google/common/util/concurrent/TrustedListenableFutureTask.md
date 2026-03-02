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

### `<init>(java.util.concurrent.Callable<V> callable)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)

### `<init>(com.google.common.util.concurrent.AsyncCallable<V> callable)`

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md))

## Methods

### `create(com.google.common.util.concurrent.AsyncCallable<V> callable)`

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md))

### `create(java.util.concurrent.Callable<V> callable)`

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)

### `create(java.lang.Runnable runnable, V result)`

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

**Parameters:**
- `runnable` (`java.lang.Runnable`): the runnable task
- `result` (`V`): the result to return on successful completion. If you don't need a particular
     result, consider using constructions of the form: ListenableFuture<?> f =
     ListenableFutureTask.create(runnable, null)

### `run()`

**Returns:** `void`

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

