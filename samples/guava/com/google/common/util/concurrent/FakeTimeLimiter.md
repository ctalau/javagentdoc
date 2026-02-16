# Class: `FakeTimeLimiter`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FakeTimeLimiter`

**Implements:** [`com.google.common.util.concurrent.TimeLimiter`](./TimeLimiter.md)

## Description

A TimeLimiter implementation which actually does not attempt to limit time at all. This may be
 desirable to use in some unit tests. More importantly, attempting to debug a call which is
 time-limited would be extremely annoying, so this gives you a time-limiter you can easily swap in
 for your real time-limiter while you're debugging.
@author Kevin Bourrillion
@author Jens Nyman
@since 1.0

## Constructors

### `<init>()`

## Methods

### `newProxy([`T`](T.md) target, `java.lang.Class<T>` interfaceType, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** [`T`](T.md)

### `callWithTimeout([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** [`T`](T.md)

### `callUninterruptiblyWithTimeout([`java.util.concurrent.Callable<T>`](../../../../../java/util/concurrent/Callable.md) callable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** [`T`](T.md)

### `runWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** `void`

### `runUninterruptiblyWithTimeout(`java.lang.Runnable` runnable, `long` timeoutDuration, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) timeoutUnit)`

**Returns:** `void`

