# Class: `ImmutableMapEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMapEntry`

**Extends:** [`com.google.common.collect.ImmutableEntry<K,V>`](./ImmutableEntry.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

This allows reuse in RegularImmutableMap and RegularImmutableBiMap, which don't have to recopy the entries created by their Builder
 implementations.

 
This base implementation has no key or value pointers, so instances of ImmutableMapEntry (but
 not its subclasses) can be reused when copied from one ImmutableMap to another.

## Constructors

### `<init>(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `<init>(com.google.common.collect.ImmutableMapEntry<K,V> contents)`

**Parameters:**
- `contents` ([`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md))

## Methods

### `createEntryArray(int size)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>[]`](./ImmutableMapEntry.md)

The result must never
 be upcast back to ImmutableMapEntry[] (or Object[], etc.), or allowed to escape the class.

 
The returned array has all its elements set to their initial null values. However, we don't
 declare it as @Nullable ImmutableMapEntry[] because our checker doesn't require newly
 created arrays to have a @Nullable element type even when they're created directly with
 new ImmutableMapEntry[...], so it seems silly to insist on that only here.

**Parameters:**
- `size` (`int`)

### `getNextInKeyBucket()`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

### `getNextInValueBucket()`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

### `isReusable()`

**Returns:** `boolean`

