# Class: `SettableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.SettableFuture`

**Extends:** [`com.google.common.util.concurrent.AbstractFuture.TrustedFuture<V>`](AbstractFuture/TrustedFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@link ListenableFuture} whose result can be set by a {@link #set(Object)}, {@link #setException(Throwable)} or {@link #setFuture(ListenableFuture)} call. It can also, like any
 other {@code Future}, be {@linkplain #cancel cancelled}.

 <p>{@code SettableFuture} is the recommended {@code ListenableFuture} implementation when your
 task cannot be implemented with {@link ListeningExecutorService}, the various {@link Futures}
 utility methods, or {@link ListenableFutureTask}. Those APIs have less opportunity for developer
 error. If your needs are more complex than {@code SettableFuture} supports, use {@link AbstractFuture}, which offers an extensible version of the API.
@author Sven Mawson
@since 9.0 (in 1.0 as {@code ValueFuture})

## Constructors

### `<init>()`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.SettableFuture<V>`](./SettableFuture.md)

Creates a new {@code SettableFuture} that can be completed or cancelled by a later method call.

### `set([`V`](V.md) value)`

**Returns:** `boolean`

### `setException(`java.lang.Throwable` throwable)`

**Returns:** `boolean`

### `setFuture([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) future)`

**Returns:** `boolean`

