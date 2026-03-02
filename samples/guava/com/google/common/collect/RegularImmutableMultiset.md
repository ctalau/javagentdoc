# Class: `RegularImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `EMPTY_ARRAY`

**Type:** `com.google.common.collect.Multisets.ImmutableEntry<?>[]`

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableMultiset<java.lang.Object>`](./ImmutableMultiset.md)

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

**Type:** `com.google.common.collect.Multisets.ImmutableEntry<E>[]`

### `hashTable`

**Type:** `com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[]`

### `size`

**Type:** `int`

### `hashCode`

**Type:** `int`

### `elementSet`

**Type:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Constructors

### `<init>(com.google.common.collect.Multisets.ImmutableEntry<E>[] entries, com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[] hashTable, int size, int hashCode, com.google.common.collect.ImmutableSet<E> elementSet)`

**Parameters:**
- `entries` (`com.google.common.collect.Multisets.ImmutableEntry<E>[]`)
- `hashTable` (`com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[]`)
- `size` (`int`)
- `hashCode` (`int`)
- `elementSet` ([`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md))

## Methods

### `create(java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>> entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `entries` (`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`)

### `hashFloodingDetected(com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[] hashTable)`

**Returns:** `boolean`

**Parameters:**
- `hashTable` (`com.google.common.collect.Multisets.@org.checkerframework.checker.nullness.qual.Nullable ImmutableEntry<?>[]`)

### `isPartialView()`

**Returns:** `boolean`

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `size()`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `getEntry(int index)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

**Parameters:**
- `index` (`int`)

### `hashCode()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

