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

### `<init>(ExecutorService executor)`

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`)

## Methods

### `create(ExecutorService executor)`

**Warning:** using a bounded executor may be counterproductive! If the thread pool fills
 up, any time callers spend waiting for a thread may count toward their time limit, and in this
 case the call may even time out before the target method is ever invoked.

**Parameters:**
- `executor` (`java.util.concurrent.ExecutorService`): the ExecutorService that will execute the method calls on the target objects;
       for example, a Executors#newCachedThreadPool().

**Returns:** [`com.google.common.util.concurrent.SimpleTimeLimiter`](./SimpleTimeLimiter.md)

### `newProxy(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit)`

**Parameters:**
- `target` (`T`)
- `interfaceType` (`java.lang.Class<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

**Returns:** `T`

### `newProxy(Class<T> interfaceType, InvocationHandler handler)`

**Parameters:**
- `interfaceType` (`java.lang.Class<T>`)
- `handler` (`java.lang.reflect.InvocationHandler`)

**Returns:** `T`

### `callWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit, boolean amInterruptible)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)
- `amInterruptible` (`boolean`)

**Returns:** `T`

### `callWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

**Returns:** `T`

### `callUninterruptiblyWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

**Returns:** `T`

### `runWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit)`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

**Returns:** `void`

### `runUninterruptiblyWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit)`

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

**Returns:** `void`

### `throwCause(Exception e, boolean combineStackTraces)`

**Parameters:**
- `e` (`java.lang.Exception`)
- `combineStackTraces` (`boolean`)

**Returns:** `java.lang.Exception`

### `findInterruptibleMethods(Class<?> interfaceType)`

**Parameters:**
- `interfaceType` (`java.lang.Class<?>`)

**Returns:** `java.util.Set<java.lang.reflect.Method>`

### `declaresInterruptedEx(Method method)`

**Parameters:**
- `method` (`java.lang.reflect.Method`)

**Returns:** `boolean`

### `wrapAndThrowExecutionExceptionOrError(Throwable cause)`

**Parameters:**
- `cause` (`java.lang.Throwable`)

**Returns:** `void`

### `wrapAndThrowRuntimeExecutionExceptionOrError(Throwable cause)`

**Parameters:**
- `cause` (`java.lang.Throwable`)

**Returns:** `void`

### `checkPositiveTimeout(long timeoutDuration)`

**Parameters:**
- `timeoutDuration` (`long`)

**Returns:** `void`

