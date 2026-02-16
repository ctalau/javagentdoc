# Class: `TrustedListenableFutureTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.TrustedListenableFutureTask`

**Extends:** [`com.google.common.util.concurrent.FluentFuture.TrustedFuture<V>`](FluentFuture/TrustedFuture.md)

**Implements:** [`java.util.concurrent.RunnableFuture<V>`](../../../../../java/util/concurrent/RunnableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@link RunnableFuture} that also implements the {@link ListenableFuture} interface.

 <p>This should be used in preference to {@link ListenableFutureTask} when possible for
 performance reasons.

## Fields

### `task`

**Type:** [`com.google.common.util.concurrent.InterruptibleTask<?>`](./InterruptibleTask.md)

## Constructors

### `<init>([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) callable)`

### `<init>([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md) callable)`

## Methods

### `create([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md) callable)`

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

### `create([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) callable)`

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

### `create(`java.lang.Runnable` runnable, [`V`](V.md) result)`

**Returns:** [`com.google.common.util.concurrent.TrustedListenableFutureTask<V>`](./TrustedListenableFutureTask.md)

Creates a {@code ListenableFutureTask} that will upon running, execute the given {@code
 Runnable}, and arrange that {@code get} will return the given result on successful completion.
@param runnable the runnable task
@param result the result to return on successful completion. If you don't need a particular
     result, consider using constructions of the form: {@code ListenableFuture<?> f =
     ListenableFutureTask.create(runnable, null)}

### `run()`

**Returns:** `void`

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

