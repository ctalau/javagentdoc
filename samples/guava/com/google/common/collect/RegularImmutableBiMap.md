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

### `<init>(collect@Nullable ImmutableMapEntry<K,V>[] keyTable, collect@Nullable ImmutableMapEntry<K,V>[] valueTable, Map.Entry<K,V>[] entries, int mask, int hashCode)`

**Parameters:**
- `keyTable` (`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`)
- `valueTable` (`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`)
- `entries` (`java.util.Map.Entry<K,V>[]`)
- `mask` (`int`)
- `hashCode` (`int`)

## Methods

### `fromEntries(Map.Entry<K,V>[] entries)`

**Parameters:**
- `entries` (`java.util.Map.Entry<K,V>[]`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `fromEntryArray(int n, Map@Nullable Entry<K,V>[] entryArray)`

**Parameters:**
- `n` (`int`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `checkNoConflictInValueBucket(Object value, Map.Entry<?,?> entry, ImmutableMapEntry<?,?> valueBucketHead)`

**Parameters:**
- `value` (`java.lang.Object`)
- `entry` (`java.util.Map.Entry<?,?>`)
- `valueBucketHead` ([`com.google.common.collect.ImmutableMapEntry<?,?>`](./ImmutableMapEntry.md))

**Returns:** `void`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `forEach(BiConsumer<? super K,? super V> action)`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

**Returns:** `void`

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

