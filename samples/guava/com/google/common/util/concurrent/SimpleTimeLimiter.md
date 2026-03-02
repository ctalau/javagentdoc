# Class: `SimpleTimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SimpleTimeLimiter`

**Implements:** [`com.google.common.util.concurrent.TimeLimiter`](./TimeLimiter.md)

## Description

If the
 time limit expires for a given method call, the thread running the call will be interrupted.

## Fields

### `executor`

**Type:** `java.util.concurrent.ExecutorService`

## Constructors

### `<init>(java.util.concurrent.ExecutorService executor)`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)

## Methods

### `create(java.util.concurrent.ExecutorService executor)`

**Returns:** [`com.google.common.util.concurrent.SimpleTimeLimiter`](./SimpleTimeLimiter.md)

**Warning:** using a bounded executor may be counterproductive! If the thread pool fills
 up, any time callers spend waiting for a thread may count toward their time limit, and in this
 case the call may even time out before the target method is ever invoked.

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`): the ExecutorService that will execute the method calls on the target objects;
     for example, a Executors#newCachedThreadPool().

### `newProxy(T target, java.lang.Class<T> interfaceType, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit)`

**Returns:** `T`

**Parameters:**
- `target` (`T`)
- `interfaceType` (`java.lang.Class<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

### `newProxy(java.lang.Class<T> interfaceType, java.lang.reflect.InvocationHandler handler)`

**Returns:** `T`

**Parameters:**
- `interfaceType` (`java.lang.Class<T>`)
- `handler` (`java.lang.reflect.InvocationHandler`)

### `callWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit, boolean amInterruptible)`

**Returns:** `T`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)
- `amInterruptible` (`boolean`)

### `callWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit)`

**Returns:** `T`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

### `callUninterruptiblyWithTimeout(java.util.concurrent.Callable<T> callable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit)`

**Returns:** `T`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

### `runWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit)`

**Returns:** `void`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

### `runUninterruptiblyWithTimeout(java.lang.Runnable runnable, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit)`

**Returns:** `void`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

### `throwCause(java.lang.Exception e, boolean combineStackTraces)`

**Returns:** `java.lang.Exception`

**Parameters:**
- `e` (`java.lang.Exception`)
- `combineStackTraces` (`boolean`)

### `findInterruptibleMethods(java.lang.Class<?> interfaceType)`

**Returns:** `java.util.Set<java.lang.reflect.Method>`

**Parameters:**
- `interfaceType` (`java.lang.Class<?>`)

### `declaresInterruptedEx(java.lang.reflect.Method method)`

**Returns:** `boolean`

**Parameters:**
- `method` (`java.lang.reflect.Method`)

### `wrapAndThrowExecutionExceptionOrError(java.lang.Throwable cause)`

**Returns:** `void`

**Parameters:**
- `cause` (`java.lang.Throwable`)

### `wrapAndThrowRuntimeExecutionExceptionOrError(java.lang.Throwable cause)`

**Returns:** `void`

**Parameters:**
- `cause` (`java.lang.Throwable`)

### `checkPositiveTimeout(long timeoutDuration)`

**Returns:** `void`

**Parameters:**
- `timeoutDuration` (`long`)

