# Class: `TimeoutFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.TimeoutFuture`

**Extends:** `com.google.common.util.concurrent.FluentFuture.TrustedFuture<V>`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Future that delegates to another but will finish early (via a TimeoutException wrapped
 in an ExecutionException) if the specified duration expires. The delegate future is
 interrupted and cancelled if it times out.

## Fields

### `delegateRef`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `timer`

**Type:** `java.util.concurrent.ScheduledFuture<?>`

## Constructors

### `<init>(ListenableFuture<V> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

## Methods

### `create(ListenableFuture<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor)`

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)
- `scheduledExecutor` (`java.util.concurrent.ScheduledExecutorService`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `pendingToString()`

**Returns:** `java.lang.String`

### `afterDone()`

**Returns:** `void`

