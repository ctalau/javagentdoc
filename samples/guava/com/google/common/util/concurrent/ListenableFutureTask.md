# Class: `ListenableFutureTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenableFutureTask`

**Extends:** `java.util.concurrent.FutureTask<V>`

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `FutureTask` that also implements the `ListenableFuture` interface. Unlike `FutureTask`, `ListenableFutureTask` does not provide an overrideable `FutureTask.done() done()` method. For similar functionality, call `addListener`.

 <p>Few users should use this class. It is intended primarily for those who are implementing an
 `ExecutorService`. Most users should call `ListeningExecutorService.submit(Callable) ListeningExecutorService.submit` on a service obtained from `MoreExecutors.listeningDecorator`.
**Author:** Sven Mawson
**Since:** 1.0

## Fields

### `executionList`

**Type:** [`com.google.common.util.concurrent.ExecutionList`](./ExecutionList.md)

## Constructors

### `<init>(`java.util.concurrent.Callable<V>` callable)`

### `<init>(`java.lang.Runnable` runnable, `V` result)`

## Methods

### `create(`java.util.concurrent.Callable<V>` callable)`

**Returns:** [`com.google.common.util.concurrent.ListenableFutureTask<V>`](./ListenableFutureTask.md)

Creates a `ListenableFutureTask` that will upon running, execute the given `Callable`.
@param callable the callable task
**Since:** 10.0

### `create(`java.lang.Runnable` runnable, `V` result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFutureTask<V>`](./ListenableFutureTask.md)

Creates a `ListenableFutureTask` that will upon running, execute the given `Runnable`, and arrange that `get` will return the given result on successful completion.
@param runnable the runnable task
@param result the result to return on successful completion. If you don't need a particular
     result, consider using constructions of the form: `ListenableFuture<?> f =
     ListenableFutureTask.create(runnable, null)`
**Since:** 10.0

### `addListener(`java.lang.Runnable` listener, `java.util.concurrent.Executor` exec)`

**Returns:** `void`

### `get(`long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `V`

### `done()`

**Returns:** `void`

Internal implementation detail used to invoke the listeners.

