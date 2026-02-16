# Interface: `ListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningExecutorService`

**Extends:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

## Description

An {@link ExecutorService} that returns {@link ListenableFuture} instances. To create an instance
 from an existing {@link ExecutorService}, call {@link MoreExecutors#listeningDecorator(ExecutorService)}.
@author Chris Povirk
@since 10.0

## Methods

### `submit([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

@return a {@code ListenableFuture} representing pending completion of the task
@throws RejectedExecutionException {@inheritDoc}

### `submit(`java.lang.Runnable` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

@return a {@code ListenableFuture} representing pending completion of the task
@throws RejectedExecutionException {@inheritDoc}

### `submit(`java.lang.Runnable` task, [`T`](T.md) result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

@return a {@code ListenableFuture} representing pending completion of the task
@throws RejectedExecutionException {@inheritDoc}

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

{@inheritDoc}

 <p>All elements in the returned list must be {@link ListenableFuture} instances. The easiest
 way to obtain a {@code List<ListenableFuture<T>>} from this method is an unchecked (but safe)
 cast:

 <pre>
   {@code @SuppressWarnings("unchecked") // guaranteed by invokeAll contract}
   {@code List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks);}
 </pre>
@return A list of {@code ListenableFuture} instances representing the tasks, in the same
     sequential order as produced by the iterator for the given task list, each of which has
     completed.
@throws RejectedExecutionException {@inheritDoc}
@throws NullPointerException if any task is null

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, `long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

{@inheritDoc}

 <p>All elements in the returned list must be {@link ListenableFuture} instances. The easiest
 way to obtain a {@code List<ListenableFuture<T>>} from this method is an unchecked (but safe)
 cast:

 <pre>
   {@code @SuppressWarnings("unchecked") // guaranteed by invokeAll contract}
   {@code List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks, timeout, unit);}
 </pre>
@return a list of {@code ListenableFuture} instances representing the tasks, in the same
     sequential order as produced by the iterator for the given task list. If the operation did
     not time out, each task will have completed. If it did time out, some of these tasks will
     not have completed.
@throws RejectedExecutionException {@inheritDoc}
@throws NullPointerException if any task is null

### `invokeAll([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** [`java.util.List<java.util.concurrent.Future<T>>`](../../../../../java/util/List>.md)

Duration-based overload of {@link #invokeAll(Collection, long, TimeUnit)}.
@since 32.1.0

### `invokeAny([`java.util.Collection<? extends java.util.concurrent.Callable<T>>`](../../../../../java/util/Collection>.md) tasks, [`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** [`T`](T.md)

Duration-based overload of {@link #invokeAny(Collection, long, TimeUnit)}.
@since 32.1.0

### `awaitTermination([`java.time.Duration`](../../../../../java/time/Duration.md) timeout)`

**Returns:** `boolean`

Duration-based overload of {@link #awaitTermination(long, TimeUnit)}.
@since 32.1.0

