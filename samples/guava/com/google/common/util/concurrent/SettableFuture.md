# Class: `SettableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SettableFuture`

**Extends:** [`com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V>`](AbstractFuture/TrustedFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `ListenableFuture` whose result can be set by a `set(Object)`, `setException(Throwable)` or `setFuture(ListenableFuture)` call. It can also, like any
 other `Future`, be cancelled.

 <p>`SettableFuture` is the recommended `ListenableFuture` implementation when your
 task cannot be implemented with `ListeningExecutorService`, the various `Futures`
 utility methods, or `ListenableFutureTask`. Those APIs have less opportunity for developer
 error. If your needs are more complex than `SettableFuture` supports, use `AbstractFuture`, which offers an extensible version of the API.
**Author:** Sven Mawson
**Since:** 9.0 (in 1.0 as `ValueFuture`)

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.SettableFuture<V>`](./SettableFuture.md)

Creates a new `SettableFuture` that can be completed or cancelled by a later method call.

### `set(`V` value)`

**Returns:** `boolean`

### `setException(`java.lang.Throwable` throwable)`

**Returns:** `boolean`

### `setFuture([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) future)`

**Returns:** `boolean`

