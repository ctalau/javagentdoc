# Class: `SettableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SettableFuture`

**Extends:** `com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V>`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

It can also, like any
 other Future, be cancelled.

 
SettableFuture is the recommended ListenableFuture implementation when your
 task cannot be implemented with ListeningExecutorService, the various Futures
 utility methods, or ListenableFutureTask. Those APIs have less opportunity for developer
 error. If your needs are more complex than SettableFuture supports, use AbstractFuture, which offers an extensible version of the API.

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.SettableFuture<V>`](./SettableFuture.md)

### `set(V value)`

**Parameters:**
- `value` (`V`)

**Returns:** `boolean`

### `setException(Throwable throwable)`

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `boolean`

### `setFuture(ListenableFuture<? extends V> future)`

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md))

**Returns:** `boolean`

