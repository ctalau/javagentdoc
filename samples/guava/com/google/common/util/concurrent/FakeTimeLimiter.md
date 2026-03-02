# Class: `FakeTimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FakeTimeLimiter`

**Implements:** [`com.google.common.util.concurrent.TimeLimiter`](./TimeLimiter.md)

## Description

This may be
 desirable to use in some unit tests. More importantly, attempting to debug a call which is
 time-limited would be extremely annoying, so this gives you a time-limiter you can easily swap in
 for your real time-limiter while you're debugging.

## Constructors

### `<init>()`

## Methods

### `newProxy(T target, Class<T> interfaceType, long timeoutDuration, TimeUnit timeoutUnit)`

**Parameters:**
- `target` (`T`)
- `interfaceType` (`java.lang.Class<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

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

