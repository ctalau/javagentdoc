# Interface: `ListeningExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningExecutorService`

**Extends:** `java.util.concurrent.ExecutorService`

## Description

To create an instance
 from an existing ExecutorService, call MoreExecutors#listeningDecorator(ExecutorService).

## Methods

### `submit(Callable<T> task)`

**Parameters:**
- `task` (`java.util.concurrent.Callable<T>`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `submit(Runnable task)`

**Parameters:**
- `task` (`java.lang.Runnable`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `submit(Runnable task, T result)`

**Parameters:**
- `task` (`java.lang.Runnable`)
- `result` (`T`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<T>`](./ListenableFuture.md)

### `invokeAll(Collection<? extends Callable<T>> tasks)`

All elements in the returned list must be ListenableFuture instances. The easiest
 way to obtain a List<ListenableFuture<T>> from this method is an unchecked (but safe)
 cast:

 

```

   @SuppressWarnings("unchecked") // guaranteed by invokeAll contract
   List<ListenableFuture<T>> futures = (List) executor.invokeAll(tasks);
 
```

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)`

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

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAll(Collection<? extends Callable<T>> tasks, Duration timeout)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`java.time.Duration`)

**Returns:** `java.util.List<java.util.concurrent.Future<T>>`

### `invokeAny(Collection<? extends Callable<T>> tasks, Duration timeout)`

**Parameters:**
- `tasks` (`java.util.Collection<? extends java.util.concurrent.Callable<T>>`)
- `timeout` (`java.time.Duration`)

**Returns:** `T`

### `awaitTermination(Duration timeout)`

**Parameters:**
- `timeout` (`java.time.Duration`)

**Returns:** `boolean`

