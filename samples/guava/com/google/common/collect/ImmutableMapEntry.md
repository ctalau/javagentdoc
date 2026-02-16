# Class: `ImmutableMapEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMapEntry`

**Extends:** [`com.google.common.collect.ImmutableEntry<K,V>`](./ImmutableEntry.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of {@code Entry} for {@link ImmutableMap} that adds extra methods to traverse hash
 buckets for the key and the value. This allows reuse in {@link RegularImmutableMap} and {@link RegularImmutableBiMap}, which don't have to recopy the entries created by their {@code Builder}
 implementations.

 <p>This base implementation has no key or value pointers, so instances of ImmutableMapEntry (but
 not its subclasses) can be reused when copied from one ImmutableMap to another.
@author Louis Wasserman

## Constructors

### `<init>([`K`](K.md) key, [`V`](V.md) value)`

### `<init>([`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md) contents)`

## Methods

### `createEntryArray(`int` size)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>[]`](./ImmutableMapEntry.md)

Creates an {@code ImmutableMapEntry} array to hold parameterized entries. The result must never
 be upcast back to ImmutableMapEntry[] (or Object[], etc.), or allowed to escape the class.

 <p>The returned array has all its elements set to their initial null values. However, we don't
 declare it as {@code @Nullable ImmutableMapEntry[]} because our checker doesn't require newly
 created arrays to have a {@code @Nullable} element type even when they're created directly with
 {@code new ImmutableMapEntry[...]}, so it seems silly to insist on that only here.

### `getNextInKeyBucket()`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

### `getNextInValueBucket()`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

### `isReusable()`

**Returns:** `boolean`

Returns true if this entry has no bucket links and can safely be reused as a terminal entry in
 a bucket in another map.

