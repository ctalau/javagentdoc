# Class: `Callables`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Callables`

## Description

Static utility methods pertaining to the `Callable` interface.
**Author:** Isaac Shum
**Since:** 1.0

## Constructors

### `<init>()`

## Methods

### `returning(`T` value)`

**Returns:** `java.util.concurrent.Callable<T>`

Creates a `Callable` which immediately returns a preset value each time it is called.

### `asAsyncCallable(`java.util.concurrent.Callable<T>` callable, [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) listeningExecutorService)`

**Returns:** [`com.google.common.util.concurrent.AsyncCallable<T>`](./AsyncCallable.md)

Creates an `AsyncCallable` from a `Callable`.

 <p>The `AsyncCallable` returns the `ListenableFuture` resulting from `ListeningExecutorService.submit(Callable)`.
**Since:** 20.0

### `threadRenaming(`java.util.concurrent.Callable<T>` callable, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** `java.util.concurrent.Callable<T>`

Wraps the given callable such that for the duration of `Callable.call` the thread that is
 running will have the given name.
@param callable The callable to wrap
@param nameSupplier The supplier of thread names, `Supplier.get get` will be called once
     for each invocation of the wrapped callable.

### `threadRenaming(`java.lang.Runnable` task, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** `java.lang.Runnable`

Wraps the given runnable such that for the duration of `Runnable.run` the thread that is
 running with have the given name.
@param task The Runnable to wrap
@param nameSupplier The supplier of thread names, `Supplier.get get` will be called once
     for each invocation of the wrapped callable.

### `trySetName(`java.lang.String` threadName, `java.lang.Thread` currentThread)`

**Returns:** `boolean`

Tries to set name of the given `Thread`, returns true if successful.

