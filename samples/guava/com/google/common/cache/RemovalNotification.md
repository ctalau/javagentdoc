# Class: `RemovalNotification`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.RemovalNotification`

**Extends:** `java.util.AbstractMap.SimpleImmutableEntry<@org.checkerframework.checker.nullness.qual.Nullable K,@org.checkerframework.checker.nullness.qual.Nullable V>`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

The key and/or value may be null if they were
 already garbage collected.

 
Like other Entry instances associated with CacheBuilder, this class holds
 strong references to the key and value, regardless of the type of references the cache may be
 using.

## Fields

### `cause`

**Type:** [`com.google.common.cache.RemovalCause`](./RemovalCause.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(K key, V value, com.google.common.cache.RemovalCause cause)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `cause` ([`com.google.common.cache.RemovalCause`](./RemovalCause.md))

## Methods

### `create(K key, V value, com.google.common.cache.RemovalCause cause)`

**Returns:** [`com.google.common.cache.RemovalNotification<K,V>`](./RemovalNotification.md)

The key and/or value may be 
 null if they were already garbage collected.

**Parameters:**
- `key` (`K`)
- `value` (`V`)
- `cause` ([`com.google.common.cache.RemovalCause`](./RemovalCause.md))

### `getCause()`

**Returns:** [`com.google.common.cache.RemovalCause`](./RemovalCause.md)

### `wasEvicted()`

**Returns:** `boolean`

