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

### `newProxy(T target, java.lang.Class<T> interfaceType, long timeoutDuration, java.util.concurrent.TimeUnit timeoutUnit)`

**Returns:** `T`

**Parameters:**
- `target` (`T`)
- `interfaceType` (`java.lang.Class<T>`)
- `timeoutDuration` (`long`)
- `timeoutUnit` (`java.util.concurrent.TimeUnit`)

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

