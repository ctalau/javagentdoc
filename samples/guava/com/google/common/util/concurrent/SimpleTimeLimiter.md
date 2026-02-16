# Class: `SimpleTimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SimpleTimeLimiter`

**Implements:** [`com.google.common.util.concurrent.TimeLimiter`](./TimeLimiter.md)

## Description

A TimeLimiter that runs method calls in the background using an {@link ExecutorService}. If the
 time limit expires for a given method call, the thread running the call will be interrupted.
@author Kevin Bourrillion
@author Jens Nyman
@since 1.0

## Fields

### `executor`

**Type:** [`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md)

## Constructors

### `<init>([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) executor)`

## Methods

### `create([`java.util.concurrent.ExecutorService`](../../../../../java/util/concurrent/ExecutorService.md) executor)`

**Returns:** [`com.google.common.util.concurrent.SimpleTimeLimiter`](./SimpleTimeLimiter.md)

Creates a TimeLimiter instance using the given executor service to execute method calls.

 <p><b>Warning:</b> using a bounded executor may be counterproductive! If the thread pool fills
 up, any time callers spend waiting for a thread may count toward their time limit, and in this
 case the call may even time out before the target method is ever invoked.
@param executor the ExecutorService that will execute the method calls on the target objects;
     for example, a {@link Executors#newCachedThreadPool()}.
@since 22.0

### `newProxy([`T`](T.md) target, `java.lang.Class<T>` interfaceType, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** [`T`](T.md)

### `newProxy(`java.lang.Class<T>` interfaceType, `java.lang.reflect.InvocationHandler` handler)`

**Returns:** [`T`](T.md)

### `callWithTimeout([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit, `boolean` amInterruptible)`

**Returns:** [`T`](T.md)

### `callWithTimeout([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** [`T`](T.md)

### `callUninterruptiblyWithTimeout([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** [`T`](T.md)

### `runWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** `void`

### `runUninterruptiblyWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** `void`

### `throwCause(`java.lang.Exception` e, `boolean` combineStackTraces)`

**Returns:** `java.lang.Exception`

### `findInterruptibleMethods(`java.lang.Class<?>` interfaceType)`

**Returns:** [`java.util.Set<java.lang.reflect.Method>`](../../../../../java/util/Set.md)

### `declaresInterruptedEx(`java.lang.reflect.Method` method)`

**Returns:** `boolean`

### `wrapAndThrowExecutionExceptionOrError(`java.lang.Throwable` cause)`

**Returns:** `void`

### `wrapAndThrowRuntimeExecutionExceptionOrError(`java.lang.Throwable` cause)`

**Returns:** `void`

### `checkPositiveTimeout(`long` timeoutDuration)`

**Returns:** `void`

