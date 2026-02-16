# Interface: `TimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.TimeLimiter`

## Description

Imposes a time limit on method calls.
**Author:** Kevin Bourrillion
**Author:** Jens Nyman
**Since:** 1.0

## Methods

### `newProxy(`T` target, `java.lang.Class<T>` interfaceType, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `T`

Returns an instance of `interfaceType` that delegates all method calls to the `target` object, enforcing the specified time limit on each call. This time-limited delegation
 is also performed for calls to `Object.equals`, `Object.hashCode`, and `Object.toString`.

 <p>If the target method call finishes before the limit is reached, the return value or
 exception is propagated to the caller exactly as-is. If, on the other hand, the time limit is
 reached, the proxy will attempt to abort the call to the target, and will throw an `UncheckedTimeoutException` to the caller.

 <p>It is important to note that the primary purpose of the proxy object is to return control to
 the caller when the timeout elapses; aborting the target method call is of secondary concern.
 The particular nature and strength of the guarantees made by the proxy is
 implementation-dependent. However, it is important that each of the methods on the target
 object behaves appropriately when its thread is interrupted.

 <p>For example, to return the value of `target.someMethod()`, but substitute `DEFAULT_VALUE` if this method call takes over 50 ms, you can use this code:

 <pre>
   TimeLimiter limiter = . . .;
   TargetType proxy = limiter.newProxy(
       target, TargetType.class, 50, TimeUnit.MILLISECONDS);
   try {
     return proxy.someMethod();
   } catch (UncheckedTimeoutException e) {
     return DEFAULT_VALUE;
   }
 </pre>
@param target the object to proxy
@param interfaceType the interface you wish the returned proxy to implement
@param timeoutDuration with timeoutUnit, the maximum length of time that callers are willing to
     wait on each method call to the proxy
@param timeoutUnit with timeoutDuration, the maximum length of time that callers are willing to
     wait on each method call to the proxy
@return a time-limiting proxy
@throws IllegalArgumentException if `interfaceType` is a regular class, enum, or
     annotation type, rather than an interface

### `newProxy(`T` target, `java.lang.Class<T>` interfaceType, `java.time.Duration` timeout)`

**Returns:** `T`

Returns an instance of `interfaceType` that delegates all method calls to the `target` object, enforcing the specified time limit on each call. This time-limited delegation
 is also performed for calls to `Object.equals`, `Object.hashCode`, and `Object.toString`.

 <p>If the target method call finishes before the limit is reached, the return value or
 exception is propagated to the caller exactly as-is. If, on the other hand, the time limit is
 reached, the proxy will attempt to abort the call to the target, and will throw an `UncheckedTimeoutException` to the caller.

 <p>It is important to note that the primary purpose of the proxy object is to return control to
 the caller when the timeout elapses; aborting the target method call is of secondary concern.
 The particular nature and strength of the guarantees made by the proxy is
 implementation-dependent. However, it is important that each of the methods on the target
 object behaves appropriately when its thread is interrupted.

 <p>For example, to return the value of `target.someMethod()`, but substitute `DEFAULT_VALUE` if this method call takes over 50 ms, you can use this code:

 <pre>
   TimeLimiter limiter = . . .;
   TargetType proxy = limiter.newProxy(target, TargetType.class, Duration.ofMillis(50));
   try {
     return proxy.someMethod();
   } catch (UncheckedTimeoutException e) {
     return DEFAULT_VALUE;
   }
 </pre>
@param target the object to proxy
@param interfaceType the interface you wish the returned proxy to implement
@param timeout the maximum length of time that callers are willing to wait on each method call
     to the proxy
@return a time-limiting proxy
@throws IllegalArgumentException if `interfaceType` is a regular class, enum, or
     annotation type, rather than an interface
**Since:** 28.0

### `callWithTimeout(`java.util.concurrent.Callable<T>` callable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `T`

Invokes a specified Callable, timing out after the specified time limit. If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a `TimeoutException` to the caller.
@param callable the Callable to execute
@param timeoutDuration with timeoutUnit, the maximum length of time to wait
@param timeoutUnit with timeoutDuration, the maximum length of time to wait
@return the result returned by the Callable
@throws TimeoutException if the time limit is reached
@throws InterruptedException if the current thread was interrupted during execution
@throws ExecutionException if `callable` throws a checked exception
@throws UncheckedExecutionException if `callable` throws a `RuntimeException`
@throws ExecutionError if `callable` throws an `Error`
**Since:** 22.0

### `callWithTimeout(`java.util.concurrent.Callable<T>` callable, `java.time.Duration` timeout)`

**Returns:** `T`

Invokes a specified Callable, timing out after the specified time limit. If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a `TimeoutException` to the caller.
@param callable the Callable to execute
@param timeout the maximum length of time to wait
@return the result returned by the Callable
@throws TimeoutException if the time limit is reached
@throws InterruptedException if the current thread was interrupted during execution
@throws ExecutionException if `callable` throws a checked exception
@throws UncheckedExecutionException if `callable` throws a `RuntimeException`
@throws ExecutionError if `callable` throws an `Error`
**Since:** 28.0

### `callUninterruptiblyWithTimeout(`java.util.concurrent.Callable<T>` callable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `T`

Invokes a specified Callable, timing out after the specified time limit. If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a `TimeoutException` to the caller.

 <p>The difference with `callWithTimeout(Callable, long, TimeUnit)` is that this method
 will ignore interrupts on the current thread.
@param callable the Callable to execute
@param timeoutDuration with timeoutUnit, the maximum length of time to wait
@param timeoutUnit with timeoutDuration, the maximum length of time to wait
@return the result returned by the Callable
@throws TimeoutException if the time limit is reached
@throws ExecutionException if `callable` throws a checked exception
@throws UncheckedExecutionException if `callable` throws a `RuntimeException`
@throws ExecutionError if `callable` throws an `Error`
**Since:** 22.0

### `callUninterruptiblyWithTimeout(`java.util.concurrent.Callable<T>` callable, `java.time.Duration` timeout)`

**Returns:** `T`

Invokes a specified Callable, timing out after the specified time limit. If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a `TimeoutException` to the caller.

 <p>The difference with `callWithTimeout(Callable, Duration)` is that this method will
 ignore interrupts on the current thread.
@param callable the Callable to execute
@param timeout the maximum length of time to wait
@return the result returned by the Callable
@throws TimeoutException if the time limit is reached
@throws ExecutionException if `callable` throws a checked exception
@throws UncheckedExecutionException if `callable` throws a `RuntimeException`
@throws ExecutionError if `callable` throws an `Error`
**Since:** 28.0

### `runWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `void`

Invokes a specified Runnable, timing out after the specified time limit. If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a `TimeoutException` to the caller.
@param runnable the Runnable to execute
@param timeoutDuration with timeoutUnit, the maximum length of time to wait
@param timeoutUnit with timeoutDuration, the maximum length of time to wait
@throws TimeoutException if the time limit is reached
@throws InterruptedException if the current thread was interrupted during execution
@throws UncheckedExecutionException if `runnable` throws a `RuntimeException`
@throws ExecutionError if `runnable` throws an `Error`
**Since:** 22.0

### `runWithTimeout(`java.lang.Runnable` runnable, `java.time.Duration` timeout)`

**Returns:** `void`

Invokes a specified Runnable, timing out after the specified time limit. If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a `TimeoutException` to the caller.
@param runnable the Runnable to execute
@param timeout the maximum length of time to wait
@throws TimeoutException if the time limit is reached
@throws InterruptedException if the current thread was interrupted during execution
@throws UncheckedExecutionException if `runnable` throws a `RuntimeException`
@throws ExecutionError if `runnable` throws an `Error`
**Since:** 28.0

### `runUninterruptiblyWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `void`

Invokes a specified Runnable, timing out after the specified time limit. If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a `TimeoutException` to the caller.

 <p>The difference with `runWithTimeout(Runnable, long, TimeUnit)` is that this method
 will ignore interrupts on the current thread.
@param runnable the Runnable to execute
@param timeoutDuration with timeoutUnit, the maximum length of time to wait
@param timeoutUnit with timeoutDuration, the maximum length of time to wait
@throws TimeoutException if the time limit is reached
@throws UncheckedExecutionException if `runnable` throws a `RuntimeException`
@throws ExecutionError if `runnable` throws an `Error`
**Since:** 22.0

### `runUninterruptiblyWithTimeout(`java.lang.Runnable` runnable, `java.time.Duration` timeout)`

**Returns:** `void`

Invokes a specified Runnable, timing out after the specified time limit. If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a `TimeoutException` to the caller.

 <p>The difference with `runWithTimeout(Runnable, Duration)` is that this method will
 ignore interrupts on the current thread.
@param runnable the Runnable to execute
@param timeout the maximum length of time to wait
@throws TimeoutException if the time limit is reached
@throws UncheckedExecutionException if `runnable` throws a `RuntimeException`
@throws ExecutionError if `runnable` throws an `Error`
**Since:** 28.0

