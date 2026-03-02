# Interface: `ListeningScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningScheduledExecutorService`

**Extends:** `java.util.concurrent.ScheduledExecutorService`, [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

To create an instance from an existing ScheduledExecutorService, call MoreExecutors#listeningDecorator(ScheduledExecutorService).

## Methods

### `schedule(Runnable command, long delay, TimeUnit unit)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

### `schedule(Runnable command, Duration delay)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `delay` (`java.time.Duration`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

### `schedule(Callable<V> callable, long delay, TimeUnit unit)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

### `schedule(Callable<V> callable, Duration delay)`

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)
- `delay` (`java.time.Duration`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

### `scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `period` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

### `scheduleAtFixedRate(Runnable command, Duration initialDelay, Duration period)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`java.time.Duration`)
- `period` (`java.time.Duration`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

### `scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

### `scheduleWithFixedDelay(Runnable command, Duration initialDelay, Duration delay)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`java.time.Duration`)
- `delay` (`java.time.Duration`)

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

