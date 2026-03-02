# Class: `AbstractCatchingFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractCatchingFuture`

**Extends:** `com.google.common.util.concurrent.FluentFuture.TrustedFuture<V>`

**Implements:** `java.lang.Runnable`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `X` extends `java.lang.Throwable`
- `F` extends `java.lang.Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `inputFuture`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)

### `exceptionType`

**Type:** `java.lang.Class<X>`

### `fallback`

**Type:** `F`

## Constructors

### `<init>(com.google.common.util.concurrent.ListenableFuture<? extends V> inputFuture, java.lang.Class<X> exceptionType, F fallback)`

**Parameters:**
- `inputFuture` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` (`F`)

## Methods

### `create(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.base.Function<? super X,? extends V> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` ([`com.google.common.base.Function<? super X,? extends V>`](../../base/Function.md))
- `executor` (`java.util.concurrent.Executor`)

### `create(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.util.concurrent.AsyncFunction<? super X,? extends V> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` ([`com.google.common.util.concurrent.AsyncFunction<? super X,? extends V>`](./AsyncFunction.md))
- `executor` (`java.util.concurrent.Executor`)

### `run()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

### `doFallback(F fallback, X throwable)`

**Returns:** `T`

**Parameters:**
- `fallback` (`F`)
- `throwable` (`X`)

### `setResult(T result)`

**Returns:** `void`

**Parameters:**
- `result` (`T`)

### `afterDone()`

**Returns:** `void`

