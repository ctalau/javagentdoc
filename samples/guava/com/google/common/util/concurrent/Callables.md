# Class: `Callables`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Callables`

## Description

Static utility methods pertaining to the {@link Callable} interface.
@author Isaac Shum
@since 1.0

## Constructors

### `<init>()`

## Methods

### `returning([`T`](T.md) value)`

**Returns:** [`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md)

Creates a {@code Callable} which immediately returns a preset value each time it is called.

### `asAsyncCallable([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md) listeningExecutorService)`

**Returns:** [`com.google.common.util.concurrent.AsyncCallable<T>`](./AsyncCallable.md)

Creates an {@link AsyncCallable} from a {@link Callable}.

 <p>The {@link AsyncCallable} returns the {@link ListenableFuture} resulting from {@link ListeningExecutorService#submit(Callable)}.
@since 20.0

### `threadRenaming([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** [`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md)

Wraps the given callable such that for the duration of {@link Callable#call} the thread that is
 running will have the given name.
@param callable The callable to wrap
@param nameSupplier The supplier of thread names, {@link Supplier#get get} will be called once
     for each invocation of the wrapped callable.

### `threadRenaming(`java.lang.Runnable` task, [`com.google.common.base.Supplier<java.lang.String>`](../../base/Supplier.md) nameSupplier)`

**Returns:** `java.lang.Runnable`

Wraps the given runnable such that for the duration of {@link Runnable#run} the thread that is
 running with have the given name.
@param task The Runnable to wrap
@param nameSupplier The supplier of thread names, {@link Supplier#get get} will be called once
     for each invocation of the wrapped callable.

### `trySetName(`java.lang.String` threadName, `java.lang.Thread` currentThread)`

**Returns:** `boolean`

Tries to set name of the given {@link Thread}, returns true if successful.

