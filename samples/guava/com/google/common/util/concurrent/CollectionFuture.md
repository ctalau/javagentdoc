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

### `<init>(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures, boolean allMustSucceed)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)

## Methods

### `collectOneValue(int index, V returnValue)`

**Returns:** `void`

**Parameters:**
- `index` (`int`)
- `returnValue` (`V`)

### `handleAllCompleted()`

**Returns:** `void`

### `releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason reason)`

**Returns:** `void`

**Parameters:**
- `reason` (`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`)

### `combine(java.util.List<com.google.common.util.concurrent.CollectionFuture.@org.checkerframework.checker.nullness.qual.Nullable Present<V>> values)`

**Returns:** `C`

**Parameters:**
- `values` (`java.util.List<com.google.common.util.concurrent.CollectionFuture.@org.checkerframework.checker.nullness.qual.Nullable Present<V>>`)

