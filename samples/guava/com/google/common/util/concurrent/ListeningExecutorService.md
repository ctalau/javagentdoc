# Interface: `ListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningExecutorService`

**Extends:** `java.util.concurrent.ExecutorService`

## Description

An `ExecutorService` that returns `ListenableFuture` instances. To create an instance
 from an existing `ExecutorService`, call `MoreExecutors.listeningDecorator(ExecutorService)`.
**Author:** Chris Povirk
**Since:** 10.0

## Methods

### `submit(`java.util.concurrent.Callable<T>` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

@return a `ListenableFuture` representing pending completion of the task
@throws RejectedExecutionException {@inheritDoc}

### `submit(`java.lang.Runnable` task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

@return a `ListenableFuture` representing pending completion of the task
@throws RejectedExecutionException {@inheritDoc}

### `submit(`java.lang.Runnable` task, `T` result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

@return a `ListenableFuture` representing pending completion of the task
@throws RejectedExecutionException {@inheritDoc}

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

{@inheritDoc}

 <p>All elements in the returned list must be `ListenableFuture` instances. The easiest
 way to obtain a `List<ListenableFuture<T>>` from this method is an unchecked (but safe)
 cast:

 <pre>
   `@SuppressWarnings("unchecked") // guaranteed by invokeAll contract`
   `List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks);`
 </pre>
@return A list of `ListenableFuture` instances representing the tasks, in the same
     sequential order as produced by the iterator for the given task list, each of which has
     completed.
@throws RejectedExecutionException {@inheritDoc}
@throws NullPointerException if any task is null

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

{@inheritDoc}

 <p>All elements in the returned list must be `ListenableFuture` instances. The easiest
 way to obtain a `List<ListenableFuture<T>>` from this method is an unchecked (but safe)
 cast:

 <pre>
   `@SuppressWarnings("unchecked") // guaranteed by invokeAll contract`
   `List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks, timeout, unit);`
 </pre>
@return a list of `ListenableFuture` instances representing the tasks, in the same
     sequential order as produced by the iterator for the given task list. If the operation did
     not time out, each task will have completed. If it did time out, some of these tasks will
     not have completed.
@throws RejectedExecutionException {@inheritDoc}
@throws NullPointerException if any task is null

### `invokeAll(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `java.time.Duration` timeout)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

Duration-based overload of `invokeAll(Collection, long, TimeUnit)`.
**Since:** 32.1.0

### `invokeAny(`java.util.Collection<? extends java.util.concurrent.Callable<T>>` tasks, `java.time.Duration` timeout)`

**Returns:** `T`

Duration-based overload of `invokeAny(Collection, long, TimeUnit)`.
**Since:** 32.1.0

### `awaitTermination(`java.time.Duration` timeout)`

**Returns:** `boolean`

Duration-based overload of `awaitTermination(long, TimeUnit)`.
**Since:** 32.1.0

