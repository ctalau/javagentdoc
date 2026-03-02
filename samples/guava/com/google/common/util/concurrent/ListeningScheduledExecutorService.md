# Interface: `ListeningScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListeningScheduledExecutorService`

**Extends:** `java.util.concurrent.ScheduledExecutorService`, [`com.google.common.util.concurrent.ListeningExecutorService`](./ListeningExecutorService.md)

## Description

To create an instance from an existing ScheduledExecutorService, call MoreExecutors#listeningDecorator(ScheduledExecutorService).

## Methods

### `schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Parameters:**
- `command` (`java.lang.Runnable`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `schedule(java.lang.Runnable command, java.time.Duration delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Parameters:**
- `command` (`java.lang.Runnable`)
- `delay` (`java.time.Duration`)

### `schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `schedule(java.util.concurrent.Callable<V> callable, java.time.Duration delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<V>`](./ListenableScheduledFuture.md)

**Parameters:**
- `callable` (`java.util.concurrent.Callable<V>`)
- `delay` (`java.time.Duration`)

### `scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `period` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `scheduleAtFixedRate(java.lang.Runnable command, java.time.Duration initialDelay, java.time.Duration period)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`java.time.Duration`)
- `period` (`java.time.Duration`)

### `scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `scheduleWithFixedDelay(java.lang.Runnable command, java.time.Duration initialDelay, java.time.Duration delay)`

**Returns:** [`com.google.common.util.concurrent.ListenableScheduledFuture<?>`](./ListenableScheduledFuture.md)

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`java.time.Duration`)
- `delay` (`java.time.Duration`)

