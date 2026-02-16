# Class: `AggregateFutureState`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AggregateFutureState`

**Extends:** [`com.google.common.util.concurrent.AbstractFuture.TrustedFuture<OutputT>`](AbstractFuture/TrustedFuture.md)

## Type Parameters

- `OutputT` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A helper which does some thread-safe operations for aggregate futures, which must be implemented
 differently in GWT. Namely:

 <ul>
   <li>Lazily initializes a set of seen exceptions
   <li>Decrements a counter atomically
 </ul>

## Fields

### `seenExceptions`

**Type:** `java.util.Set<java.lang.Throwable>`

### `remaining`

**Type:** `int`

### `ATOMIC_HELPER`

**Type:** [`com.google.common.util.concurrent.AggregateFutureState.AtomicHelper`](AggregateFutureState/AtomicHelper.md)

### `log`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

## Constructors

### `<init>(`int` remainingFutures)`

## Methods

### `getOrInitSeenExceptions()`

**Returns:** `java.util.Set<java.lang.Throwable>`

### `addInitialException(`java.util.Set<java.lang.Throwable>` seen)`

**Returns:** `void`

Populates `seen` with the exception that was passed to `setException`.

### `decrementRemainingAndGet()`

**Returns:** `int`

### `clearSeenExceptions()`

**Returns:** `void`

