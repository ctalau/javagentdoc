# Interface: `AsyncFunction`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AsyncFunction`

## Type Parameters

- `I` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `O` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

For an example usage and more information, see
 Futures#transformAsync(ListenableFuture, AsyncFunction, Executor).

## Methods

### `apply(I input)`

The output 
 Future need not be done, making AsyncFunction suitable for
 asynchronous derivations.

 
Throwing an exception from this method is equivalent to returning a failing Future.

**Parameters:**
- `input` (`I`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

