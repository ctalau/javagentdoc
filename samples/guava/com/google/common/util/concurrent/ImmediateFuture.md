# Class: `ImmediateFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ImmediateFuture`

**Implements:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `NULL`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `value`

**Type:** `V`

## Constructors

### `<init>(V value)`

**Parameters:**
- `value` (`V`)

## Methods

### `addListener(Runnable listener, Executor executor)`

**Parameters:**
- `listener` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

### `cancel(boolean mayInterruptIfRunning)`

**Parameters:**
- `mayInterruptIfRunning` (`boolean`)

**Returns:** `boolean`

### `get()`

**Returns:** `V`

### `get(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `V`

### `isCancelled()`

**Returns:** `boolean`

### `isDone()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

