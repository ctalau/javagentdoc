# Class: `RegularImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Implementation of {@link ImmutableMultiset} with zero or more elements.
@author Jared Levy
@author Louis Wasserman

## Fields

### `EMPTY_ARRAY`

**Type:** [`com.google.common.collect.Multisets.ImmutableEntry<?>[]`](Multisets/ImmutableEntry.md)

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableMultiset<java.lang.Object>`](./ImmutableMultiset.md)

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

**Type:** [`com.google.common.collect.Multisets.ImmutableEntry<E>[]`](Multisets/ImmutableEntry.md)

### `hashTable`

**Type:** [`com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[]`](Multisets/@org/checkerframework/checker/nullness/qual/Nullable ImmutableEntry.md)

### `size`

**Type:** `int`

### `hashCode`

**Type:** `int`

### `elementSet`

**Type:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Constructors

### `<init>([`com.google.common.collect.Multisets.ImmutableEntry<E>[]`](Multisets/ImmutableEntry.md) entries, [`com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[]`](Multisets/@org/checkerframework/checker/nullness/qual/Nullable ImmutableEntry.md) hashTable, `int` size, `int` hashCode, [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md) elementSet)`

## Methods

### `create([`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`](../../../../java/util/Collection>.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `hashFloodingDetected([`com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[]`](Multisets/@org/checkerframework/checker/nullness/qual/Nullable ImmutableEntry.md) hashTable)`

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `getEntry(`int` index)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

