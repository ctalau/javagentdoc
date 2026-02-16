# Interface: `FutureCallback`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FutureCallback`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A callback for accepting the results of a `java.util.concurrent.Future` computation
 asynchronously.

 <p>To attach to a `ListenableFuture` use `Futures.addCallback`.
**Author:** Anthony Zana
**Since:** 10.0

## Methods

### `onSuccess(`V` result)`

**Returns:** `void`

Invoked with the result of the `Future` computation when it is successful.

### `onFailure(`java.lang.Throwable` t)`

**Returns:** `void`

Invoked when a `Future` computation fails or is canceled.

 <p>If the future's `Future.get() get` method throws an `ExecutionException`, then
 the cause is passed to this method. Any other thrown object is passed unaltered.

