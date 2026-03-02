# Class: `RegularImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.RegularImmutableBiMap<java.lang.Object,java.lang.Object>`](./RegularImmutableBiMap.md)

### `MAX_LOAD_FACTOR`

**Type:** `double`

### `keyTable`

**Type:** `com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`

### `valueTable`

**Type:** `com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`

### `entries`

**Type:** `java.util.Map.Entry<K,V>[]`

### `mask`

**Type:** `int`

### `hashCode`

**Type:** `int`

### `inverse`

**Type:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

## Constructors

### `<init>(com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[] keyTable, com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[] valueTable, java.util.Map.Entry<K,V>[] entries, int mask, int hashCode)`

**Parameters:**
- `keyTable` (`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`)
- `valueTable` (`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`)
- `entries` (`java.util.Map.Entry<K,V>[]`)
- `mask` (`int`)
- `hashCode` (`int`)

## Methods

### `fromEntries(java.util.Map.Entry<K,V>[] entries)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

**Parameters:**
- `entries` (`java.util.Map.Entry<K,V>[]`)

### `fromEntryArray(int n, java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[] entryArray)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

**Parameters:**
- `n` (`int`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)

### `checkNoConflictInValueBucket(java.lang.Object value, java.util.Map.Entry<?,?> entry, com.google.common.collect.ImmutableMapEntry<?,?> valueBucketHead)`

**Returns:** `void`

**Parameters:**
- `value` (`java.lang.Object`)
- `entry` (`java.util.Map.Entry<?,?>`)
- `valueBucketHead` ([`com.google.common.collect.ImmutableMapEntry<?,?>`](./ImmutableMapEntry.md))

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `isHashCodeFast()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

