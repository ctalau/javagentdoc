# Class: `AbstractTransformFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AbstractTransformFuture`

**Extends:** `com.google.common.util.concurrent.FluentFuture.TrustedFuture<O>`

**Implements:** `java.lang.Runnable`

## Type Parameters

- `I` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `O` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `F` extends `java.lang.Object`
- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `inputFuture`

**Type:** [`com.google.common.util.concurrent.ListenableFuture<? extends I>`](./ListenableFuture.md)

### `function`

**Type:** `F`

## Constructors

### `<init>(com.google.common.util.concurrent.ListenableFuture<? extends I> inputFuture, F function)`

**Parameters:**
- `inputFuture` ([`com.google.common.util.concurrent.ListenableFuture<? extends I>`](./ListenableFuture.md))
- `function` (`F`)

## Methods

### `create(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.util.concurrent.AsyncFunction<? super I,? extends O> function, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md))
- `function` ([`com.google.common.util.concurrent.AsyncFunction<? super I,? extends O>`](./AsyncFunction.md))
- `executor` (`java.util.concurrent.Executor`)

### `create(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.base.Function<? super I,? extends O> function, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md))
- `function` ([`com.google.common.base.Function<? super I,? extends O>`](../../base/Function.md))
- `executor` (`java.util.concurrent.Executor`)

### `run()`

**Returns:** `void`

### `doTransform(F function, I result)`

**Returns:** `T`

**Parameters:**
- `function` (`F`)
- `result` (`I`)

### `setResult(T result)`

**Returns:** `void`

**Parameters:**
- `result` (`T`)

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

