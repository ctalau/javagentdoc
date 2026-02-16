# Class: `RemovalNotification`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.RemovalNotification`

**Extends:** `java.util.AbstractMap.SimpleImmutableEntry<@org.checkerframework.checker.nullness.qual.Nullable K,@org.checkerframework.checker.nullness.qual.Nullable V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A notification of the removal of a single entry. The key and/or value may be null if they were
 already garbage collected.

 <p>Like other `Entry` instances associated with `CacheBuilder`, this class holds
 strong references to the key and value, regardless of the type of references the cache may be
 using.
**Author:** Charles Fry
**Since:** 10.0

## Fields

### `cause`

**Type:** [`com.google.common.cache.RemovalCause`](./RemovalCause.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`K` key, `V` value, [`com.google.common.cache.RemovalCause`](./RemovalCause.md) cause)`

## Methods

### `create(`K` key, `V` value, [`com.google.common.cache.RemovalCause`](./RemovalCause.md) cause)`

**Returns:** [`com.google.common.cache.RemovalNotification<K,V>`](./RemovalNotification.md)

Creates a new `RemovalNotification` for the given `key`/`value` pair, with
 the given `cause` for the removal. The `key` and/or `value` may be `null` if they were already garbage collected.
**Since:** 19.0

### `getCause()`

**Returns:** [`com.google.common.cache.RemovalCause`](./RemovalCause.md)

Returns the cause for which the entry was removed.

### `wasEvicted()`

**Returns:** `boolean`

Returns `true` if there was an automatic removal due to eviction (the cause is neither
 `RemovalCause.EXPLICIT` nor `RemovalCause.REPLACED`).

