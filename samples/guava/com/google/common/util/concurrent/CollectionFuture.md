# Class: `CollectionFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.CollectionFuture`

**Extends:** [`com.google.common.util.concurrent.AggregateFuture<V,C>`](./AggregateFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Aggregate future that collects (stores) results of each future.

## Fields

### `values`

**Type:** [`java.util.List<com.google.common.util.concurrent.CollectionFuture.@org.checkerframework.checker.nullness.qual.Nullable Present<V>>`](../../../../../java/util/List>.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`](../../collect/ImmutableCollection>.md) futures, `boolean` allMustSucceed)`

## Methods

### `collectOneValue(`int` index, [`V`](V.md) returnValue)`

**Returns:** `void`

### `handleAllCompleted()`

**Returns:** `void`

### `releaseResources([`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`](AggregateFuture/ReleaseResourcesReason.md) reason)`

**Returns:** `void`

### `combine([`java.util.List<com.google.common.util.concurrent.CollectionFuture.@org.checkerframework.checker.nullness.qual.Nullable Present<V>>`](../../../../../java/util/List>.md) values)`

**Returns:** [`C`](C.md)

