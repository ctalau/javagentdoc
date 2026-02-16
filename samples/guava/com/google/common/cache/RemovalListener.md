# Interface: `RemovalListener`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.RemovalListener`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An object that can receive a notification when an entry is removed from a cache. The removal
 resulting in notification could have occurred to an entry being manually removed or replaced, or
 due to eviction resulting from timed expiration, exceeding a maximum size, or garbage collection.

 <p>An instance may be called concurrently by multiple threads to process different entries.
 Implementations of this interface should avoid performing blocking calls or synchronizing on
 shared resources.
@param <K> the most general type of keys this listener can listen for; for example `Object`
     if any key is acceptable
@param <V> the most general type of values this listener can listen for; for example `Object` if any key is acceptable
**Author:** Charles Fry
**Since:** 10.0

## Methods

### `onRemoval([`com.google.common.cache.RemovalNotification<K,V>`](./RemovalNotification.md) notification)`

**Returns:** `void`

Notifies the listener that a removal occurred at some point in the past.

 <p>This does not always signify that the key is now absent from the cache, as it may have
 already been re-added.

