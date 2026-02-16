# Class: `RegularImmutableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableMap`

**Extends:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of `ImmutableMap` with two or more entries.
**Author:** Jesse Wilson
**Author:** Kevin Bourrillion
**Author:** Gregory Kick

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.Object,java.lang.Object>`](./ImmutableMap.md)

### `MAX_LOAD_FACTOR`

**Type:** `double`

Closed addressing tends to perform well even with high load factors. Being conservative here
 ensures that the table is still likely to be relatively sparse (hence it misses fast) while
 saving space.

### `HASH_FLOODING_FPP`

**Type:** `double`

Maximum allowed false positive probability of detecting a hash flooding attack given random
 input.

### `MAX_HASH_BUCKET_LENGTH`

**Type:** `int`

Maximum allowed length of a hash table bucket before falling back to a j.u.HashMap based
 implementation. Experimentally determined.

### `entries`

**Type:** `java.util.Map.Entry<K,V>[]`

### `table`

**Type:** [`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md)

### `mask`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.Map.Entry<K,V>[]` entries, [`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<K,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md) table, `int` mask)`

## Methods

### `fromEntries(`java.util.Map.Entry<K,V>[]` entries)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `fromEntryArray(`int` n, `java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]` entryArray, `boolean` throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Creates an ImmutableMap from the first n entries in entryArray. This implementation may replace
 the entries in entryArray with its own entry objects (though they will have the same key/value
 contents), and may take ownership of entryArray.

### `fromEntryArrayCheckingBucketOverflow(`int` n, `java.util.Map.@org.checkerframework.checker.nullness.qual.Nullable Entry<K,V>[]` entryArray, `boolean` throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `removeDuplicates(`java.util.Map.Entry<K,V>[]` entries, `int` n, `int` newN, `java.util.IdentityHashMap<java.util.Map.Entry<K,V>,java.lang.Boolean>` duplicates)`

**Returns:** `java.util.Map.Entry<K,V>[]`

Constructs a new entry array where each duplicated key from the original appears only once, at
 its first position but with its final value. The `duplicates` map is modified.
@param entries the original array of entries including duplicates
@param n the number of valid entries in `entries`
@param newN the expected number of entries once duplicates are removed
@param duplicates a map of canonical `Entry` objects for each duplicate key. This map
     will be updated by the method, setting each value to false as soon as the `Entry` has
     been included in the new entry array.
@return an array of `newN` entries where no key appears more than once.

### `makeImmutable(`java.util.Map.Entry<K,V>` entry, `K` key, `V` value)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

Makes an entry usable internally by a new ImmutableMap without rereading its contents.

### `makeImmutable(`java.util.Map.Entry<K,V>` entry)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

Makes an entry usable internally by a new ImmutableMap.

### `checkNoConflictInKeyBucket(`java.lang.Object` key, `java.lang.Object` newValue, [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md) keyBucketHead, `boolean` throwIfDuplicateKeys)`

**Returns:** [`com.google.common.collect.ImmutableMapEntry<K,V>`](./ImmutableMapEntry.md)

Checks if the given key already appears in the hash chain starting at `keyBucketHead`. If
 it does not, then null is returned. If it does, then if `throwIfDuplicateKeys` is true an
 `IllegalArgumentException` is thrown, and otherwise the existing `Entry` is
 returned.
@throws IllegalArgumentException if another entry in the bucket has the same key and `throwIfDuplicateKeys` is true
@throws BucketOverflowException if this bucket has too many entries, which may indicate a hash
     flooding attack

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `get(`java.lang.Object` key, [`com.google.common.collect.@org.checkerframework.checker.nullness.qual.Nullable ImmutableMapEntry<?,V>[]`](@org/checkerframework/checker/nullness/qual/Nullable ImmutableMapEntry.md) keyTable, `int` mask)`

**Returns:** `V`

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `isPartialView()`

**Returns:** `boolean`

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `createKeySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<K>`](./ImmutableSet.md)

### `createValues()`

**Returns:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

