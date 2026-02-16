# Enum: `RemovalCause`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.RemovalCause`

## Description

The reason why a cached entry was removed.
@author Charles Fry
@since 10.0

## Constructors

### `<init>()`

## Methods

### `values()`

**Returns:** [`com.google.common.cache.RemovalCause[]`](./RemovalCause.md)

### `valueOf(`java.lang.String` name)`

**Returns:** [`com.google.common.cache.RemovalCause`](./RemovalCause.md)

### `wasEvicted()`

**Returns:** `boolean`

Returns {@code true} if there was an automatic removal due to eviction (the cause is neither
 {@link #EXPLICIT} nor {@link #REPLACED}).

