# Class: `RegularImmutableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.Object,java.lang.Object>`](./ImmutableMap.md)

### `MAX_LOAD_FACTOR`

**Type:** `double`

Being conservative here
 ensures that the table is still likely to be relatively sparse (hence it misses fast) while
 saving space.

### `HASH_FLOODING_FPP`

**Type:** `double`

### `MAX_HASH_BUCKET_LENGTH`

**Type:** `int`

Experimentally determined.

### `entries`

**Type:** `java.util.Map.Entry<K,V>[]`

### `table`

**Type:** `com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`

### `mask`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.Map.Entry<K,V>[] entries, com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[] table, int mask)`

**Parameters:**
- `entries` (`java.util.Map.Entry<K,V>[]`)
- `table` (`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`)
- `mask` (`int`)

## Methods

### `fromEntries(java.util.Map.Entry<K,V>[] entries)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `entries` (`java.util.Map.Entry<K,V>[]`)

### `fromEntryArray(int n, java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[] entryArray, boolean throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

This implementation may replace
 the entries in entryArray with its own entry objects (though they will have the same key/value
 contents), and may take ownership of entryArray.

**Parameters:**
- `n` (`int`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)
- `throwIfDuplicateKeys` (`boolean`)

### `fromEntryArrayCheckingBucketOverflow(int n, java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[] entryArray, boolean throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `n` (`int`)
- `entryArray` (`java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]`)
- `throwIfDuplicateKeys` (`boolean`)

### `removeDuplicates(java.util.Map.Entry<K,V>[] entries, int n, int newN, java.util.IdentityHashMap<java.util.Map.Entry<K,V>,java.lang.Boolean> duplicates)`

**Returns:** `java.util.Map.Entry<K,V>[]`

The duplicates map is modified.

**Parameters:**
- `entries` (`java.util.Map.Entry<K,V>[]`): the original array of entries including duplicates
- `n` (`int`): the number of valid entries in entries
- `newN` (`int`): the expected number of entries once duplicates are removed
- `duplicates` (`java.util.IdentityHashMap<java.util.Map.Entry<K,V>,java.lang.Boolean>`): a map of canonical Entry objects for each duplicate key. This map
     will be updated by the method, setting each value to false as soon as the Entry has
     been included in the new entry array.

### `makeImmutable(java.util.Map.Entry<K,V> entry, K key, V value)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

**Parameters:**
- `entry` (`java.util.Map.Entry<K,V>`)
- `key` (`K`)
- `value` (`V`)

### `makeImmutable(java.util.Map.Entry<K,V> entry)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

**Parameters:**
- `entry` (`java.util.Map.Entry<K,V>`)

### `checkNoConflictInKeyBucket(java.lang.Object key, java.lang.Object newValue, com.google.common.collect.ImmutableMapEntry<K,V> keyBucketHead, boolean throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

If
 it does not, then null is returned. If it does, then if throwIfDuplicateKeys is true an
 IllegalArgumentException is thrown, and otherwise the existing Entry is
 returned.

**Parameters:**
- `key` (`java.lang.Object`)
- `newValue` (`java.lang.Object`)
- `keyBucketHead` ([`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md))
- `throwIfDuplicateKeys` (`boolean`)

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `get(java.lang.Object key, com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<?,V>[] keyTable, int mask)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)
- `keyTable` (`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<?,V>[]`)
- `mask` (`int`)

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

### `size()`

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

