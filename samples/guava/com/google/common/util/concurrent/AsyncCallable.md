# Interface: `AsyncCallable`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AsyncCallable`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Computes a value, possibly asynchronously. For an example usage and more information, see `Futures.FutureCombiner.callAsync(AsyncCallable, java.util.concurrent.Executor)`.

 <p>Much like `java.util.concurrent.Callable`, but returning a `ListenableFuture`
 result.
**Since:** 20.0

## Methods

### `call()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Computes a result `Future`. The output `Future` need not be done, making `AsyncCallable` suitable for asynchronous derivations.

 <p>Throwing an exception from this method is equivalent to returning a failing `ListenableFuture`.

