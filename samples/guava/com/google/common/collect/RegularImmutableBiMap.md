# Class: `RegularImmutableBiMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableBiMap`

**Extends:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Bimap with zero or more mappings.
**Author:** Louis Wasserman

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.RegularImmutableBiMap<java.lang.Object,java.lang.Object>`](./RegularImmutableBiMap.md)

### `MAX_LOAD_FACTOR`

**Type:** `double`

### `keyTable`

**Type:** [`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md)

### `valueTable`

**Type:** [`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md)

### `entries`

**Type:** `java.util.Map.Entry<K,V>[]`

### `mask`

**Type:** `int`

### `hashCode`

**Type:** `int`

### `inverse`

**Type:** [`com.google.common.collect.ImmutableBiMap<V,K>`](./ImmutableBiMap.md)

## Constructors

### `<init>([`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md) keyTable, [`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md) valueTable, `java.util.Map.Entry<K,V>[]` entries, `int` mask, `int` hashCode)`

## Methods

### `fromEntries(`java.util.Map.Entry<K,V>[]` entries)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `fromEntryArray(`int` n, `java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]` entryArray)`

**Returns:** [`com.google.common.collect.ImmutableBiMap<K,V>`](./ImmutableBiMap.md)

### `checkNoConflictInValueBucket(`java.lang.Object` value, `java.util.Map.Entry<?,?>` entry, [`com.google.common.collect.ImmutableMapEntry<?,?>`](./ImmutableMapEntry.md) valueBucketHead)`

**Returns:** `void`

@throws IllegalArgumentException if another entry in the bucket has the same key
@throws BucketOverflowException if this bucket has too many entries, which may indicate a hash
     flooding attack

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

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

