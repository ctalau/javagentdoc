# Class: `AbstractListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractListeningExecutorService`

**Extends:** [`java.util.concurrent.AbstractExecutorService`](../../../../../java/util/concurrent/AbstractExecutorService.md)

**Implements:** [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

Abstract {@link ListeningExecutorService} implementation that creates {@link ListenableFuture}
 instances for each {@link Runnable} and {@link Callable} submitted to it. These tasks are run
 with the abstract {@link #execute execute(Runnable)} method.

 <p>In addition to {@link #execute}, subclasses must implement all methods related to shutdown and
 termination.
@author Chris Povirk
@since 14.0

## Constructors

### `<init>()`

## Methods

### `newTaskFor(`java.lang.Runnable` runnable, [`T`](T.md) value)`

**Returns:** [`java.util.concurrent.RunnableFuture<T>`](../../../../../java/util/concurrent/RunnableFuture.md)

@since 19.0 (present with return type {@code ListenableFutureTask} since 14.0)

### `newTaskFor([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable)`

**Returns:** [`java.util.concurrent.RunnableFuture<T>`](../../../../../java/util/concurrent/RunnableFuture.md)

@since 19.0 (present with return type {@code ListenableFutureTask} since 14.0)

### `submit(`java.lang.Runnable` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `submit(`java.lang.Runnable` task, [`T`](T.md) result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submit([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

