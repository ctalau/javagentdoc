# Class: `ImmediateFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ImmediateFuture`

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementation of {@link Futures#immediateFuture}.

## Fields

### `NULL`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `value`

**Type:** [`V`](V.md)

## Constructors

### `<init>([`V`](V.md) value)`

## Methods

### `addListener(`java.lang.Runnable` listener, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

### `cancel(`boolean` mayInterruptIfRunning)`

**Returns:** `boolean`

### `get()`

**Returns:** [`V`](V.md)

### `get(`long` timeout, [`java.util.concurrent.TimeUnit`](../../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`V`](V.md)

### `isCancelled()`

**Returns:** `boolean`

### `isDone()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

