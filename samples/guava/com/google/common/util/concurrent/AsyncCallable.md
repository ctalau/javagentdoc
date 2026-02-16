# Interface: `AsyncCallable`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AsyncCallable`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Computes a value, possibly asynchronously. For an example usage and more information, see {@link Futures.FutureCombiner#callAsync(AsyncCallable, java.util.concurrent.Executor)}.

 <p>Much like {@link java.util.concurrent.Callable}, but returning a {@link ListenableFuture}
 result.
@since 20.0

## Methods

### `call()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Computes a result {@code Future}. The output {@code Future} need not be {@linkplain Future#isDone done}, making {@code AsyncCallable} suitable for asynchronous derivations.

 <p>Throwing an exception from this method is equivalent to returning a failing {@link ListenableFuture}.

