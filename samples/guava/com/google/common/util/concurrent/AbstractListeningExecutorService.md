# Class: `AbstractListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractListeningExecutorService`

**Extends:** `java.util.concurrent.AbstractExecutorService`

**Implements:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

These tasks are run
 with the abstract execute(Runnable) method.

 
In addition to #execute, subclasses must implement all methods related to shutdown and
 termination.

## Constructors

### `<init>()`

## Methods

### `newTaskFor(java.lang.Runnable runnable, T value)`

**Returns:** `java.util.concurrent.RunnableFuture<T>`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `value` (`T`)

### `newTaskFor(java.util.concurrent.Callable<T> callable)`

**Returns:** `java.util.concurrent.RunnableFuture<T>`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)

### `submit(java.lang.Runnable task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

**Parameters:**
- `task` (`java.lang.Runnable`)

### `submit(java.lang.Runnable task, T result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

### `submit(java.util.concurrent.Callable<T> task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

