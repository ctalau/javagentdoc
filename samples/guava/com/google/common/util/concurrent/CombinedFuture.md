# Class: `CombinedFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.CombinedFuture`

**Extends:** [`com.google.common.util.concurrent.AggregateFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object,V>`](./AggregateFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `task`

**Type:** [`com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?>`](./CombinedFuture.md)

## Constructors

### `<init>(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> futures, boolean allMustSucceed, java.util.concurrent.Executor listenerExecutor, com.google.common.util.concurrent.AsyncCallable<V> callable)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)
- `listenerExecutor` (`java.util.concurrent.Executor`)
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md))

### `<init>(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>> futures, boolean allMustSucceed, java.util.concurrent.Executor listenerExecutor, java.util.concurrent.Callable<V> callable)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)
- `listenerExecutor` (`java.util.concurrent.Executor`)
- `callable` (`java.util.concurrent.Callable<V>`)

## Methods

### `collectOneValue(int index, java.lang.Object returnValue)`

**Returns:** `void`

**Parameters:**
- `index` (`int`)
- `returnValue` (`java.lang.Object`)

### `handleAllCompleted()`

**Returns:** `void`

### `releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason reason)`

**Returns:** `void`

**Parameters:**
- `reason` (`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`)

### `interruptTask()`

**Returns:** `void`

