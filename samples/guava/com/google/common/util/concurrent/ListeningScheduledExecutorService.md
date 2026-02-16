# Interface: `ListeningScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningScheduledExecutorService`

**Extends:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md), [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

A {@link ScheduledExecutorService} that returns {@link ListenableFuture} instances from its
 {@code ExecutorService} methods. To create an instance from an existing {@link ScheduledExecutorService}, call {@link MoreExecutors#listeningDecorator(ScheduledExecutorService)}.
@author Chris Povirk
@since 10.0

## Methods

### `schedule(`java.lang.Runnable` command, `long` delay, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

@since 15.0 (previously returned ScheduledFuture)

### `schedule(`java.lang.Runnable` command, [`java.time.Duration`](../../../../../java/time/Duration.md) delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

Duration-based overload of {@link #schedule(Runnable, long, TimeUnit)}.
@since 29.0

### `schedule([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) callable, `long` delay, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

@since 15.0 (previously returned ScheduledFuture)

### `schedule([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) callable, [`java.time.Duration`](../../../../../java/time/Duration.md) delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

Duration-based overload of {@link #schedule(Callable, long, TimeUnit)}.
@since 29.0

### `scheduleAtFixedRate(`java.lang.Runnable` command, `long` initialDelay, `long` period, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

@since 15.0 (previously returned ScheduledFuture)

### `scheduleAtFixedRate(`java.lang.Runnable` command, [`java.time.Duration`](../../../../../java/time/Duration.md) initialDelay, [`java.time.Duration`](../../../../../java/time/Duration.md) period)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

Duration-based overload of {@link #scheduleAtFixedRate(Runnable, long, long, TimeUnit)}.
@since 29.0

### `scheduleWithFixedDelay(`java.lang.Runnable` command, `long` initialDelay, `long` delay, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

@since 15.0 (previously returned ScheduledFuture)

### `scheduleWithFixedDelay(`java.lang.Runnable` command, [`java.time.Duration`](../../../../../java/time/Duration.md) initialDelay, [`java.time.Duration`](../../../../../java/time/Duration.md) delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

Duration-based overload of {@link #scheduleWithFixedDelay(Runnable, long, long, TimeUnit)}.
@since 29.0

