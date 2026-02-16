# Interface: `FutureCallback`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FutureCallback`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A callback for accepting the results of a {@link java.util.concurrent.Future} computation
 asynchronously.

 <p>To attach to a {@link ListenableFuture} use {@link Futures#addCallback}.
@author Anthony Zana
@since 10.0

## Methods

### `onSuccess([`V`](V.md) result)`

**Returns:** `void`

Invoked with the result of the {@code Future} computation when it is successful.

### `onFailure(`java.lang.Throwable` t)`

**Returns:** `void`

Invoked when a {@code Future} computation fails or is canceled.

 <p>If the future's {@link Future#get() get} method throws an {@link ExecutionException}, then
 the cause is passed to this method. Any other thrown object is passed unaltered.

