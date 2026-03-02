# Class: `CollectionFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.CollectionFuture`

**Extends:** [`com.google.common.util.concurrent.AggregateFuture<V,C>`](./AggregateFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `C` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `values`

**Type:** `java.util.List<com.google.common.util.concurrent.CollectionFuture.@org.checkerframework.checker.nullness.qual.Nullable Present<V>>`

## Constructors

### `<init>(ImmutableCollection<? extends ListenableFuture<? extends V>> futures, boolean allMustSucceed)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)

## Methods

### `collectOneValue(int index, V returnValue)`

**Parameters:**
- `index` (`int`)
- `returnValue` (`V`)

**Returns:** `void`

### `handleAllCompleted()`

**Returns:** `void`

### `releaseResources(AggregateFuture.ReleaseResourcesReason reason)`

**Parameters:**
- `reason` (`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`)

**Returns:** `void`

### `combine(List<CollectionFuture@Nullable Present<V>> values)`

**Parameters:**
- `values` (`java.util.List<com.google.common.util.concurrent.CollectionFuture.@org.checkerframework.checker.nullness.qual.Nullable Present<V>>`)

**Returns:** `C`

