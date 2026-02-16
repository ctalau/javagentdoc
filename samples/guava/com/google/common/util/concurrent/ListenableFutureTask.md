# Class: `ListenableFutureTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenableFutureTask`

**Extends:** [`java.util.concurrent.FutureTask<V>`](../../../../../java/util/concurrent/FutureTask.md)

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@link FutureTask} that also implements the {@link ListenableFuture} interface. Unlike {@code
 FutureTask}, {@code ListenableFutureTask} does not provide an overrideable {@link FutureTask#done() done()} method. For similar functionality, call {@link #addListener}.

 <p>Few users should use this class. It is intended primarily for those who are implementing an
 {@code ExecutorService}. Most users should call {@link ListeningExecutorService#submit(Callable) ListeningExecutorService.submit} on a service obtained from {@link MoreExecutors#listeningDecorator}.
@author Sven Mawson
@since 1.0

## Fields

### `executionList`

**Type:** [`com.google.common.util.concurrent.ExecutionList`](./ExecutionList.md)

## Constructors

### `<init>([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) callable)`

### `<init>(`java.lang.Runnable` runnable, [`V`](V.md) result)`

## Methods

### `create([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) callable)`

**Returns:** [`com.google.common.util.concurrent.ListenableFutureTask<V>`](./ListenableFutureTask.md)

Creates a {@code ListenableFutureTask} that will upon running, execute the given {@code
 Callable}.
@param callable the callable task
@since 10.0

### `create(`java.lang.Runnable` runnable, [`V`](V.md) result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFutureTask<V>`](./ListenableFutureTask.md)

Creates a {@code ListenableFutureTask} that will upon running, execute the given {@code
 Runnable}, and arrange that {@code get} will return the given result on successful completion.
@param runnable the runnable task
@param result the result to return on successful completion. If you don't need a particular
     result, consider using constructions of the form: {@code ListenableFuture<?> f =
     ListenableFutureTask.create(runnable, null)}
@since 10.0

### `addListener(`java.lang.Runnable` listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) exec)`

**Returns:** `void`

### `get(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`V`](V.md)

### `done()`

**Returns:** `void`

Internal implementation detail used to invoke the listeners.

