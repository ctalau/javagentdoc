# Interface: `TimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.TimeLimiter`

## Description

## Methods

### `newProxy(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit)`

This time-limited delegation
 is also performed for calls to Object#equals, Object#hashCode, and Object#toString.

 
If the target method call finishes before the limit is reached, the return value or
 exception is propagated to the caller exactly as-is. If, on the other hand, the time limit is
 reached, the proxy will attempt to abort the call to the target, and will throw an UncheckedTimeoutException to the caller.

 
It is important to note that the primary purpose of the proxy object is to return control to
 the caller when the timeout elapses; aborting the target method call is of secondary concern.
 The particular nature and strength of the guarantees made by the proxy is
 implementation-dependent. However, it is important that each of the methods on the target
 object behaves appropriately when its thread is interrupted.

 
For example, to return the value of target.someMethod(), but substitute 
 DEFAULT_VALUE if this method call takes over 50 ms, you can use this code:

 

```

   TimeLimiter limiter = . . .;
   TargetType proxy = limiter.newProxy(
       target, TargetType.class, 50, TimeUnit.MILLISECONDS);
   try {
     return proxy.someMethod();
   } catch (UncheckedTimeoutException e) {
     return DEFAULT_VALUE;
   }
 
```

**Parameters:**
- `target` (`T`): the object to proxy
- `interfaceType` (`java.lang.Class<T>`): the interface you wish the returned proxy to implement
- `timeoutDuration` (`long`): with timeoutUnit, the maximum length of time that callers are willing to
       wait on each method call to the proxy
- `timeoutUnit` (`java.util.concurrent.TimeUnit`): with timeoutDuration, the maximum length of time that callers are willing to
       wait on each method call to the proxy

**Returns:** `T`

### `newProxy(T target, Class<T> interfaceType, Duration timeout)`

This time-limited delegation
 is also performed for calls to Object#equals, Object#hashCode, and Object#toString.

 
If the target method call finishes before the limit is reached, the return value or
 exception is propagated to the caller exactly as-is. If, on the other hand, the time limit is
 reached, the proxy will attempt to abort the call to the target, and will throw an UncheckedTimeoutException to the caller.

 
It is important to note that the primary purpose of the proxy object is to return control to
 the caller when the timeout elapses; aborting the target method call is of secondary concern.
 The particular nature and strength of the guarantees made by the proxy is
 implementation-dependent. However, it is important that each of the methods on the target
 object behaves appropriately when its thread is interrupted.

 
For example, to return the value of target.someMethod(), but substitute 
 DEFAULT_VALUE if this method call takes over 50 ms, you can use this code:

 

```

   TimeLimiter limiter = . . .;
   TargetType proxy = limiter.newProxy(target, TargetType.class, Duration.ofMillis(50));
   try {
     return proxy.someMethod();
   } catch (UncheckedTimeoutException e) {
     return DEFAULT_VALUE;
   }
 
```

**Parameters:**
- `target` (`T`): the object to proxy
- `interfaceType` (`java.lang.Class<T>`): the interface you wish the returned proxy to implement
- `timeout` (`java.time.Duration`): the maximum length of time that callers are willing to wait on each method call
       to the proxy

**Returns:** `T`

### `callWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit)`

If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a TimeoutException to the caller.

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`): the Callable to execute
- `timeoutDuration` (`long`): with timeoutUnit, the maximum length of time to wait
- `timeoutUnit` (`java.util.concurrent.TimeUnit`): with timeoutDuration, the maximum length of time to wait

**Returns:** `T`

### `callWithTimeout(Callable<T> callable, Duration timeout)`

If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a TimeoutException to the caller.

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`): the Callable to execute
- `timeout` (`java.time.Duration`): the maximum length of time to wait

**Returns:** `T`

### `callUninterruptiblyWithTimeout(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit)`

If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a TimeoutException to the caller.

 
The difference with #callWithTimeout(Callable, long, TimeUnit) is that this method
 will ignore interrupts on the current thread.

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`): the Callable to execute
- `timeoutDuration` (`long`): with timeoutUnit, the maximum length of time to wait
- `timeoutUnit` (`java.util.concurrent.TimeUnit`): with timeoutDuration, the maximum length of time to wait

**Returns:** `T`

### `callUninterruptiblyWithTimeout(Callable<T> callable, Duration timeout)`

If the target method
 call finishes before the limit is reached, the return value or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the call to
 the target, and throw a TimeoutException to the caller.

 
The difference with #callWithTimeout(Callable, Duration) is that this method will
 ignore interrupts on the current thread.

**Parameters:**
- `callable` (`java.util.concurrent.Callable<T>`): the Callable to execute
- `timeout` (`java.time.Duration`): the maximum length of time to wait

**Returns:** `T`

### `runWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit)`

If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a TimeoutException to the caller.

**Parameters:**
- `runnable` (`java.lang.Runnable`): the Runnable to execute
- `timeoutDuration` (`long`): with timeoutUnit, the maximum length of time to wait
- `timeoutUnit` (`java.util.concurrent.TimeUnit`): with timeoutDuration, the maximum length of time to wait

**Returns:** `void`

### `runWithTimeout(Runnable runnable, Duration timeout)`

If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a TimeoutException to the caller.

**Parameters:**
- `runnable` (`java.lang.Runnable`): the Runnable to execute
- `timeout` (`java.time.Duration`): the maximum length of time to wait

**Returns:** `void`

### `runUninterruptiblyWithTimeout(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit)`

If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a TimeoutException to the caller.

 
The difference with #runWithTimeout(Runnable, long, TimeUnit) is that this method
 will ignore interrupts on the current thread.

**Parameters:**
- `runnable` (`java.lang.Runnable`): the Runnable to execute
- `timeoutDuration` (`long`): with timeoutUnit, the maximum length of time to wait
- `timeoutUnit` (`java.util.concurrent.TimeUnit`): with timeoutDuration, the maximum length of time to wait

**Returns:** `void`

### `runUninterruptiblyWithTimeout(Runnable runnable, Duration timeout)`

If the target method
 run finishes before the limit is reached, this method returns or a wrapped exception is
 propagated. If, on the other hand, the time limit is reached, we attempt to abort the run, and
 throw a TimeoutException to the caller.

 
The difference with #runWithTimeout(Runnable, Duration) is that this method will
 ignore interrupts on the current thread.

**Parameters:**
- `runnable` (`java.lang.Runnable`): the Runnable to execute
- `timeout` (`java.time.Duration`): the maximum length of time to wait

**Returns:** `void`

