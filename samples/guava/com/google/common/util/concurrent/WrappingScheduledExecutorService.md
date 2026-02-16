# Class: `WrappingScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.WrappingScheduledExecutorService`

**Extends:** [`com.google.common.util.concurrent.WrappingExecutorService`](./WrappingExecutorService.md)

**Implements:** `java.util.concurrent.ScheduledExecutorService`

## Description

An abstract `ScheduledExecutorService` that allows subclasses to wrap tasks before they are submitted to the underlying executor.

 <p>Note that task wrapping may occur even if the task is never executed.
**Author:** Luke Sandberg

## Fields

### `delegate`

**Type:** `java.util.concurrent.ScheduledExecutorService`

## Constructors

### `<init>(`java.util.concurrent.ScheduledExecutorService` delegate)`

## Methods

### `schedule(`java.lang.Runnable` command, `long` delay, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

### `schedule(`java.util.concurrent.Callable<V>` task, `long` delay, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<V>`

### `scheduleAtFixedRate(`java.lang.Runnable` command, `long` initialDelay, `long` period, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

### `scheduleWithFixedDelay(`java.lang.Runnable` command, `long` initialDelay, `long` delay, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.util.concurrent.ScheduledFuture<?>`

