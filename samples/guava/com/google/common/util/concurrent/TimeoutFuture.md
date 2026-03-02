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

### `<init>(com.google.common.util.concurrent.ListenableFuture<V> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

## Methods

### `create(com.google.common.util.concurrent.ListenableFuture<V> delegate, long time, java.util.concurrent.TimeUnit unit, java.util.concurrent.ScheduledExecutorService scheduledExecutor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))
- `time` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)
- `scheduledExecutor` (`java.util.concurrent.ScheduledExecutorService`)

### `pendingToString()`

**Returns:** `java.lang.String`

### `afterDone()`

**Returns:** `void`

