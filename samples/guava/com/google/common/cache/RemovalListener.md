# Interface: `RemovalListener`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.RemovalListener`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

The removal
 resulting in notification could have occurred to an entry being manually removed or replaced, or
 due to eviction resulting from timed expiration, exceeding a maximum size, or garbage collection.

 
An instance may be called concurrently by multiple threads to process different entries.
 Implementations of this interface should avoid performing blocking calls or synchronizing on
 shared resources.

## Methods

### `onRemoval(RemovalNotification<K,V> notification)`

This does not always signify that the key is now absent from the cache, as it may have
 already been re-added.

**Parameters:**
- `notification` ([`com.google.common.cache.RemovalNotification<K,V>`](./RemovalNotification.md))

**Returns:** `void`

