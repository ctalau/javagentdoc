# Class: `AbstractCatchingFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractCatchingFuture`

**Extends:** [`com.google.common.util.concurrent.FluentFuture.TrustedFuture<V>`](FluentFuture/TrustedFuture.md)

**Implements:** `java.lang.Runnable`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `X` extends `java.lang.Throwable`
- `F` extends `java.lang.Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementations of {@code Futures.catching*}.

## Fields

### `inputFuture`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)

### `exceptionType`

**Type:** `java.lang.Class<X>`

### `fallback`

**Type:** [`F`](F.md)

## Constructors

### `<init>([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) inputFuture, `java.lang.Class<X>` exceptionType, [`F`](F.md) fallback)`

## Methods

### `create([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) input, `java.lang.Class<X>` exceptionType, [`com.google.common.base.Function<? super X,? extends V>`](../../base/Function.md) fallback, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `create([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) input, `java.lang.Class<X>` exceptionType, [`com.google.common.util.concurrent.AsyncFunction<? super X,? extends V>`](./AsyncFunction.md) fallback, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `run()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

### `doFallback([`F`](F.md) fallback, [`X`](X.md) throwable)`

**Returns:** [`T`](T.md)

Template method for subtypes to actually run the fallback.

### `setResult([`T`](T.md) result)`

**Returns:** `void`

Template method for subtypes to actually set the result.

### `afterDone()`

**Returns:** `void`

