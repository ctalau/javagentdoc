# Interface: `AsyncFunction`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AsyncFunction`

## Type Parameters

- `I` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `O` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Transforms a value, possibly asynchronously. For an example usage and more information, see
 `Futures.transformAsync(ListenableFuture, AsyncFunction, Executor)`.
**Author:** Chris Povirk
**Since:** 11.0

## Methods

### `apply(`I` input)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Returns an output `Future` to use in place of the given `input`. The output `Future` need not be done, making `AsyncFunction` suitable for
 asynchronous derivations.

 <p>Throwing an exception from this method is equivalent to returning a failing `Future`.

