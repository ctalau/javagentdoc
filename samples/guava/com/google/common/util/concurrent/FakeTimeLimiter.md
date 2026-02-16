# Class: `FakeTimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FakeTimeLimiter`

**Implements:** [`com.google.common.util.concurrent.TimeLimiter`](./TimeLimiter.md)

## Description

A TimeLimiter implementation which actually does not attempt to limit time at all. This may be
 desirable to use in some unit tests. More importantly, attempting to debug a call which is
 time-limited would be extremely annoying, so this gives you a time-limiter you can easily swap in
 for your real time-limiter while you're debugging.
**Author:** Kevin Bourrillion
**Author:** Jens Nyman
**Since:** 1.0

## Constructors

### `<init>()`

## Methods

### `newProxy(`T` target, `java.lang.Class<T>` interfaceType, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `T`

### `callWithTimeout(`java.util.concurrent.Callable<T>` callable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `T`

### `callUninterruptiblyWithTimeout(`java.util.concurrent.Callable<T>` callable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `T`

### `runWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `void`

### `runUninterruptiblyWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, `java.util.concurrent.TimeUnit` timeoutUnit)`

**Returns:** `void`

