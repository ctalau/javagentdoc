# Class: `AbstractTransformFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractTransformFuture`

**Extends:** [`com.google.common.util.concurrent.FluentFuture.TrustedFuture<O>`](FluentFuture/TrustedFuture.md)

**Implements:** `java.lang.Runnable`

## Type Parameters

- `I` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `O` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `F` extends `java.lang.Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementations of {@code Futures.transform*}.

## Fields

### `inputFuture`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<? extends I>`](./ListenableFuture.md)

### `function`

**Type:** [`F`](F.md)

## Constructors

### `<init>([`com.google.common.util.concurrent.ListenableFuture<? extends I>`](./ListenableFuture.md) inputFuture, [`F`](F.md) function)`

## Methods

### `create([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md) input, [`com.google.common.util.concurrent.AsyncFunction<? super I,? extends O>`](./AsyncFunction.md) function, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

### `create([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md) input, [`com.google.common.base.Function<? super I,? extends O>`](../../base/Function.md) function, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

### `run()`

**Returns:** `void`

### `doTransform([`F`](F.md) function, [`I`](I.md) result)`

**Returns:** [`T`](T.md)

Template method for subtypes to actually run the transform.

### `setResult([`T`](T.md) result)`

**Returns:** `void`

Template method for subtypes to actually set the result.

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

