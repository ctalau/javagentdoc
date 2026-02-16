# Class: `AbstractListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractListeningExecutorService`

**Extends:** `java.util.concurrent.AbstractExecutorService`

**Implements:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

Abstract `ListeningExecutorService` implementation that creates `ListenableFuture`
 instances for each `Runnable` and `Callable` submitted to it. These tasks are run
 with the abstract `execute execute(Runnable)` method.

 <p>In addition to `execute`, subclasses must implement all methods related to shutdown and
 termination.
**Author:** Chris Povirk
**Since:** 14.0

## Constructors

### `<init>()`

## Methods

### `newTaskFor(`java.lang.Runnable` runnable, `T` value)`

**Returns:** `java.util.concurrent.RunnableFuture<T>`

**Since:** 19.0 (present with return type `ListenableFutureTask` since 14.0)

### `newTaskFor(`java.util.concurrent.Callable<T>` callable)`

**Returns:** `java.util.concurrent.RunnableFuture<T>`

**Since:** 19.0 (present with return type `ListenableFutureTask` since 14.0)

### `submit(`java.lang.Runnable` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `submit(`java.lang.Runnable` task, `T` result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submit(`java.util.concurrent.Callable<T>` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

