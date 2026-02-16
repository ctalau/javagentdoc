# Interface: `AsyncFunction`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AsyncFunction`

## Type Parameters

- `I` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `O` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Transforms a value, possibly asynchronously. For an example usage and more information, see
 {@link Futures#transformAsync(ListenableFuture, AsyncFunction, Executor)}.
@author Chris Povirk
@since 11.0

## Methods

### `apply([`I`](I.md) input)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Returns an output {@code Future} to use in place of the given {@code input}. The output {@code
 Future} need not be {@linkplain Future#isDone done}, making {@code AsyncFunction} suitable for
 asynchronous derivations.

 <p>Throwing an exception from this method is equivalent to returning a failing {@code Future}.

