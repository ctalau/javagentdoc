# Interface: `ListeningScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningScheduledExecutorService`

**Extends:** `java.util.concurrent.ScheduledExecutorService`, [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

A `ScheduledExecutorService` that returns `ListenableFuture` instances from its
 `ExecutorService` methods. To create an instance from an existing `ScheduledExecutorService`, call `MoreExecutors.listeningDecorator(ScheduledExecutorService)`.
**Author:** Chris Povirk
**Since:** 10.0

## Methods

### `schedule(`java.lang.Runnable` command, `long` delay, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Since:** 15.0 (previously returned ScheduledFuture)

### `schedule(`java.lang.Runnable` command, `java.time.Duration` delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

Duration-based overload of `schedule(Runnable, long, TimeUnit)`.
**Since:** 29.0

### `schedule(`java.util.concurrent.Callable<V>` callable, `long` delay, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

**Since:** 15.0 (previously returned ScheduledFuture)

### `schedule(`java.util.concurrent.Callable<V>` callable, `java.time.Duration` delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

Duration-based overload of `schedule(Callable, long, TimeUnit)`.
**Since:** 29.0

### `scheduleAtFixedRate(`java.lang.Runnable` command, `long` initialDelay, `long` period, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Since:** 15.0 (previously returned ScheduledFuture)

### `scheduleAtFixedRate(`java.lang.Runnable` command, `java.time.Duration` initialDelay, `java.time.Duration` period)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

Duration-based overload of `scheduleAtFixedRate(Runnable, long, long, TimeUnit)`.
**Since:** 29.0

### `scheduleWithFixedDelay(`java.lang.Runnable` command, `long` initialDelay, `long` delay, `java.util.concurrent.TimeUnit` unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Since:** 15.0 (previously returned ScheduledFuture)

### `scheduleWithFixedDelay(`java.lang.Runnable` command, `java.time.Duration` initialDelay, `java.time.Duration` delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

Duration-based overload of `scheduleWithFixedDelay(Runnable, long, long, TimeUnit)`.
**Since:** 29.0

