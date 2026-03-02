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

### `<init>(ImmutableCollection<? extends ListenableFuture<?>> futures, boolean allMustSucceed, Executor listenerExecutor, AsyncCallable<V> callable)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)
- `listenerExecutor` (`java.util.concurrent.Executor`)
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md))

### `<init>(ImmutableCollection<? extends ListenableFuture<?>> futures, boolean allMustSucceed, Executor listenerExecutor, Callable<V> callable)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)
- `listenerExecutor` (`java.util.concurrent.Executor`)
- `callable` (`java.util.concurrent.Callable<V>`)

## Methods

### `collectOneValue(int index, Object returnValue)`

**Parameters:**
- `index` (`int`)
- `returnValue` (`java.lang.Object`)

**Returns:** `void`

### `handleAllCompleted()`

**Returns:** `void`

### `releaseResources(AggregateFuture.ReleaseResourcesReason reason)`

**Parameters:**
- `reason` (`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`)

**Returns:** `void`

### `interruptTask()`

**Returns:** `void`

