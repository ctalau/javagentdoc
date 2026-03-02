# Class: `WrappingScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.WrappingScheduledExecutorService`

**Extends:** [`com.google.common.util.concurrent.WrappingExecutorService`](./WrappingExecutorService.md)

**Implements:** `java.util.concurrent.ScheduledExecutorService`

## Description

Note that task wrapping may occur even if the task is never executed.

## Fields

### `delegate`

**Type:** `java.util.concurrent.ScheduledExecutorService`

## Constructors

### `<init>(java.util.concurrent.ScheduledExecutorService delegate)`

**Parameters:**
- `delegate` (`java.util.concurrent.ScheduledExecutorService`)

## Methods

### `schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `schedule(java.util.concurrent.Callable<V> task, long delay, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<V>`

**Parameters:**
- `task` (`java.util.concurrent.Callable<V>`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `period` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

