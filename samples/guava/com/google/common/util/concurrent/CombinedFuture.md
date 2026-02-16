# Class: `CombinedFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.CombinedFuture`

**Extends:** [`com.google.common.util.concurrent.AggregateFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object,V>`](./AggregateFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Aggregate future that computes its value by calling a callable.

## Fields

### `task`

**Type:** [`com.google.common.util.concurrent.CombinedFuture<V>.CombinedFutureInterruptibleTask<?>`](CombinedFuture/CombinedFutureInterruptibleTask.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>>`](../../collect/ImmutableCollection>.md) futures, `boolean` allMustSucceed, `java.util.concurrent.Executor` listenerExecutor, [`com.google.common.util.concurrent.AsyncCallable<V>`](./AsyncCallable.md) callable)`

### `<init>([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<?>>`](../../collect/ImmutableCollection>.md) futures, `boolean` allMustSucceed, `java.util.concurrent.Executor` listenerExecutor, `java.util.concurrent.Callable<V>` callable)`

## Methods

### `collectOneValue(`int` index, `java.lang.Object` returnValue)`

**Returns:** `void`

### `handleAllCompleted()`

**Returns:** `void`

### `releaseResources([`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`](AggregateFuture/ReleaseResourcesReason.md) reason)`

**Returns:** `void`

### `interruptTask()`

**Returns:** `void`

