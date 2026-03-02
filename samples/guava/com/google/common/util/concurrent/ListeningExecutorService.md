# Interface: `ListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningExecutorService`

**Extends:** `java.util.concurrent.ExecutorService`

## Description

To create an instance
 from an existing ExecutorService, call MoreExecutors#listeningDecorator(ExecutorService).

## Methods

### `submit(java.util.concurrent.Callable<T> task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

### `submit(java.lang.Runnable task)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

**Parameters:**
- `task` (`java.lang.Runnable`)

### `submit(java.lang.Runnable task, T result)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

### `invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

All elements in the returned list must be ListenableFuture instances. The easiest
 way to obtain a List<ListenableFuture<T>> from this method is an unchecked (but safe)
 cast:

 

```

   @SuppressWarnings("unchecked") // guaranteed by invokeAll contract
   List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks);
 
```

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

### `invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

All elements in the returned list must be ListenableFuture instances. The easiest
 way to obtain a List<ListenableFuture<T>> from this method is an unchecked (but safe)
 cast:

 

```

   @SuppressWarnings("unchecked") // guaranteed by invokeAll contract
   List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks, timeout, unit);
 
```

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, java.time.Duration timeout)`

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`java.time.Duration`)

### `invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, java.time.Duration timeout)`

**Returns:** `T`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`java.time.Duration`)

### `awaitTermination(java.time.Duration timeout)`

**Returns:** `boolean`

**Parameters:**
- `timeout` (`java.time.Duration`)

