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

### `addListener(java.lang.Runnable listener, java.util.concurrent.Executor executor)`

**Returns:** `void`

**Parameters:**
- `listener` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

### `cancel(boolean mayInterruptIfRunning)`

**Returns:** `boolean`

**Parameters:**
- `mayInterruptIfRunning` (`boolean`)

### `get()`

**Returns:** `V`

### `get(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `V`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `isCancelled()`

**Returns:** `boolean`

### `isDone()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

