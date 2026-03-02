# Class: `AggregateFutureState`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AggregateFutureState`

**Extends:** `com.google.common.util.concurrent.AbstractFuture.TrustedFuture<OutputT>`

## Type Parameters

- `OutputT` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Namely:

 

   - Lazily initializes a set of seen exceptions
   - Decrements a counter atomically

## Fields

### `seenExceptions`

**Type:** `java.util.Set<java.lang.Throwable>`

### `remaining`

**Type:** `int`

### `ATOMIC_HELPER`

**Type:** `com.google.common.util.concurrent.AggregateFutureState.AtomicHelper`

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

## Constructors

### `<init>(int remainingFutures)`

**Parameters:**
- `remainingFutures` (`int`)

## Methods

### `getOrInitSeenExceptions()`

**Returns:** `java.util.Set<java.lang.Throwable>`

### `addInitialException(java.util.Set<java.lang.Throwable> seen)`

**Returns:** `void`

**Parameters:**
- `seen` (`java.util.Set<java.lang.Throwable>`)

### `decrementRemainingAndGet()`

**Returns:** `int`

### `clearSeenExceptions()`

**Returns:** `void`

