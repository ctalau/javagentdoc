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

### `<init>(ListenableFuture<? extends V> inputFuture, Class<X> exceptionType, F fallback)`

**Parameters:**
- `inputFuture` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` (`F`)

## Methods

### `create(ListenableFuture<? extends V> input, Class<X> exceptionType, Function<? super X,? extends V> fallback, Executor executor)`

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` ([`com.google.common.base.Function<? super X,? extends V>`](../../base/Function.md))
- `executor` (`java.util.concurrent.Executor`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `create(ListenableFuture<? extends V> input, Class<X> exceptionType, AsyncFunction<? super X,? extends V> fallback, Executor executor)`

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` ([`com.google.common.util.concurrent.AsyncFunction<? super X,? extends V>`](./AsyncFunction.md))
- `executor` (`java.util.concurrent.Executor`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `run()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

### `doFallback(F fallback, X throwable)`

**Parameters:**
- `fallback` (`F`)
- `throwable` (`X`)

**Returns:** `T`

### `setResult(T result)`

**Parameters:**
- `result` (`T`)

**Returns:** `void`

### `afterDone()`

**Returns:** `void`

