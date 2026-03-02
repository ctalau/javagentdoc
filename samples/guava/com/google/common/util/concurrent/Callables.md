# Class: `Callables`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Callables`

## Description

## Constructors

### `<init>()`

## Methods

### `returning(T value)`

**Parameters:**
- `value` (`T`)

**Returns:** `java.util.concurrent.Callable<T>`

### `asAsyncCallable(Callable<T> callable, ListeningExecutorService listeningExecutorService)`

The AsyncCallable returns the ListenableFuture resulting from ListeningExecutorService#submit(Callable).

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `listeningExecutorService` ([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md))

**Returns:** [`com.google.common.util.concurrent.AsyncCallable<T>`](./AsyncCallable.md)

### `threadRenaming(Callable<T> callable, Supplier<String> nameSupplier)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`): The callable to wrap
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The supplier of thread names, get will be called once
       for each invocation of the wrapped callable.

**Returns:** `java.util.concurrent.Callable<T>`

### `threadRenaming(Runnable task, Supplier<String> nameSupplier)`

**Parameters:**
- `task` (`java.lang.Runnable`): The Runnable to wrap
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The supplier of thread names, get will be called once
       for each invocation of the wrapped callable.

**Returns:** `java.lang.Runnable`

### `trySetName(String threadName, Thread currentThread)`

**Parameters:**
- `threadName` (`java.lang.String`)
- `currentThread` (`java.lang.Thread`)

**Returns:** `boolean`

