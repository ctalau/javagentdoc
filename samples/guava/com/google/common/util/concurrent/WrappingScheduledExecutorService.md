# Class: `WrappingScheduledExecutorService`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.WrappingScheduledExecutorService`

**Extends:** [`com.google.common.util.concurrent.WrappingExecutorService`](./WrappingExecutorService.md)

**Implements:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

## Description

An abstract {@code ScheduledExecutorService} that allows subclasses to {@linkplain #wrapTask(Callable) wrap} tasks before they are submitted to the underlying executor.

 <p>Note that task wrapping may occur even if the task is never executed.
@author Luke Sandberg

## Fields

### `delegate`

**Type:** [`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md)

## Constructors

### `<init>([`java.util.concurrent.ScheduledExecutorService`](../../../../../java/util/concurrent/ScheduledExecutorService.md) delegate)`

## Methods

### `schedule(`java.lang.Runnable` command, `long` delay, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.concurrent.ScheduledFuture<?>`](../../../../../java/util/concurrent/ScheduledFuture.md)

### `schedule([`java.util.concurrent.Callable<V>`](../../../../../java/util/concurrent/Callable.md) task, `long` delay, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.concurrent.ScheduledFuture<V>`](../../../../../java/util/concurrent/ScheduledFuture.md)

### `scheduleAtFixedRate(`java.lang.Runnable` command, `long` initialDelay, `long` period, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.concurrent.ScheduledFuture<?>`](../../../../../java/util/concurrent/ScheduledFuture.md)

### `scheduleWithFixedDelay(`java.lang.Runnable` command, `long` initialDelay, `long` delay, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`java.util.concurrent.ScheduledFuture<?>`](../../../../../java/util/concurrent/ScheduledFuture.md)

