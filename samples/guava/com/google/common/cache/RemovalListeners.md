# Class: `RemovalListeners`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.RemovalListeners`

## Description

A collection of common removal listeners.
@author Charles Fry
@since 10.0

## Constructors

### `<init>()`

## Methods

### `asynchronous([`com.google.common.cache.RemovalListener<K,V>`](./RemovalListener.md) listener, [`java.util.concurrent.Executor`](../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.cache.RemovalListener<K,V>`](./RemovalListener.md)

Returns a {@code RemovalListener} which processes all eviction notifications using {@code
 executor}.
@param listener the backing listener
@param executor the executor with which removal notifications are asynchronously executed

