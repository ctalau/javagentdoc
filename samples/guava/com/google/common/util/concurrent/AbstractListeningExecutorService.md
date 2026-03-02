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

### `newTaskFor(Runnable runnable, T value)`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `value` (`T`)

**Returns:** `java.util.concurrent.RunnableFuture<T>`

### `newTaskFor(Callable<T> callable)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)

**Returns:** `java.util.concurrent.RunnableFuture<T>`

### `submit(Runnable task)`

**Parameters:**
- `task` (`java.lang.Runnable`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `submit(Runnable task, T result)`

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submit(Callable<T> task)`

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

