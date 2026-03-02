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

### `<init>(ScheduledExecutorService delegate)`

**Parameters:**
- `delegate` (`java.util.concurrent.ScheduledExecutorService`)

## Methods

### `schedule(Runnable command, long delay, TimeUnit unit)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

### `schedule(Callable<V> task, long delay, TimeUnit unit)`

**Parameters:**
- `task` (`java.util.concurrent.Callable<V>`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `java.util.concurrent.ScheduledFuture<V>`

### `scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `period` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

### `scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)`

**Parameters:**
- `command` (`java.lang.Runnable`)
- `initialDelay` (`long`)
- `delay` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

