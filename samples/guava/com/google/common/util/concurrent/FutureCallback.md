# Interface: `FutureCallback`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FutureCallback`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

To attach to a ListenableFuture use Futures#addCallback.

## Methods

### `onSuccess(V result)`

**Returns:** `void`

**Parameters:**
- `result` (`V`)

### `onFailure(java.lang.Throwable t)`

**Returns:** `void`

If the future's get method throws an ExecutionException, then
 the cause is passed to this method. Any other thrown object is passed unaltered.

**Parameters:**
- `t` (`java.lang.Throwable`)

