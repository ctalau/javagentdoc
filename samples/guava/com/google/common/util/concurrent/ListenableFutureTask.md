# Class: `ListenableFutureTask`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenableFutureTask`

**Extends:** `java.util.concurrent.FutureTask<V>`

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Unlike 
 FutureTask, ListenableFutureTask does not provide an overrideable done() method. For similar functionality, call #addListener.

 
Few users should use this class. It is intended primarily for those who are implementing an
 ExecutorService. Most users should call ListeningExecutorService.submit on a service obtained from MoreExecutors#listeningDecorator.

## Fields

### `executionList`

**Type:** [`com.google.common.util.concurrent.ExecutionList`](./ExecutionList.md)

## Constructors

### `<init>(java.util.concurrent.Callable<V> callable)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)

### `<init>(java.lang.Runnable runnable, V result)`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `result` (`V`)

## Methods

### `create(java.util.concurrent.Callable<V> callable)`

**Returns:** [`com.google.common.util.concurrent.ListenableFutureTask<V>`](./ListenableFutureTask.md)

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`): the callable task

### `create(java.lang.Runnable runnable, V result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFutureTask<V>`](./ListenableFutureTask.md)

**Parameters:**
- `runnable` (`java.lang.Runnable`): the runnable task
- `result` (`V`): the result to return on successful completion. If you don't need a particular
     result, consider using constructions of the form: ListenableFuture<?> f =
     ListenableFutureTask.create(runnable, null)

### `addListener(java.lang.Runnable listener, java.util.concurrent.Executor exec)`

**Returns:** `void`

**Parameters:**
- `listener` (`java.lang.Runnable`)
- `exec` (`java.util.concurrent.Executor`)

### `get(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `V`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `done()`

**Returns:** `void`

