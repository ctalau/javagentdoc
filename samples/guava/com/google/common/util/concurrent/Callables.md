# Class: `Callables`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Callables`

## Description

## Constructors

### `<init>()`

## Methods

### `returning(T value)`

**Returns:** `java.util.concurrent.Callable<T>`

**Parameters:**
- `value` (`T`)

### `asAsyncCallable(java.util.concurrent.Callable<T> callable, com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService)`

**Returns:** [`com.google.common.util.concurrent.AsyncCallable<T>`](./AsyncCallable.md)

The AsyncCallable returns the ListenableFuture resulting from ListeningExecutorService#submit(Callable).

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `listeningExecutorService` ([`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md))

### `threadRenaming(java.util.concurrent.Callable<T> callable, com.google.common.base.Supplier<java.lang.String> nameSupplier)`

**Returns:** `java.util.concurrent.Callable<T>`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`): The callable to wrap
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The supplier of thread names, get will be called once
     for each invocation of the wrapped callable.

### `threadRenaming(java.lang.Runnable task, com.google.common.base.Supplier<java.lang.String> nameSupplier)`

**Returns:** `java.lang.Runnable`

**Parameters:**
- `task` (`java.lang.Runnable`): The Runnable to wrap
- `nameSupplier` ([`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md)): The supplier of thread names, get will be called once
     for each invocation of the wrapped callable.

### `trySetName(java.lang.String threadName, java.lang.Thread currentThread)`

**Returns:** `boolean`

**Parameters:**
- `threadName` (`java.lang.String`)
- `currentThread` (`java.lang.Thread`)

