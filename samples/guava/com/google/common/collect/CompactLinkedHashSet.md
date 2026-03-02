# Class: `CompactLinkedHashSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactLinkedHashSet`

**Extends:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

All optional operations (adding and removing) are supported. All
 elements, including null, are permitted.

 
contains(x), add(x) and remove(x), are all (expected and amortized)
 constant time operations. Expected in the hashtable sense (depends on the hash function doing a
 good job of distributing the elements to the buckets to a distribution not far from uniform), and
 amortized since some operations can trigger a hash table resize.

 
This implementation consumes significantly less memory than java.util.LinkedHashSet or
 even java.util.HashSet, and places considerably less load on the garbage collector. Like
 java.util.LinkedHashSet, it offers insertion-order iteration, with identical behavior.

 
This class should not be assumed to be universally superior to 
 java.util.LinkedHashSet. Generally speaking, this class reduces object allocation and memory
 consumption at the price of moderately increased constant factors of CPU. Only use this class
 when there is a specific reason to prioritize memory over CPU.

## Fields

### `ENDPOINT`

**Type:** `int`

### `predecessor`

**Type:** `int[]`

ENDPOINT indicates a node is the
 first node in insertion order; all values at indices ≥ #size() are UNSET.

### `successor`

**Type:** `int[]`

ENDPOINT indicates a node is the last
 node in insertion order; all values at indices ≥ #size() are UNSET.

### `firstEntry`

**Type:** `int`

### `lastEntry`

**Type:** `int`

## Constructors

### `<init>()`

### `<init>(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

### `create(Collection<? extends E> collection)`

**Parameters:**
- `collection` (`java.util.Collection<? extends E>`): the elements that the set should contain

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

### `create(E[] elements)`

**Parameters:**
- `elements` (`E[]`): the elements that the set should contain

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

### `createWithExpectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`): the number of elements you expect to add to the returned set

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

### `init(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `void`

### `allocArrays()`

**Returns:** `int`

### `convertToHashFloodingResistantImplementation()`

**Returns:** `java.util.Set<E>`

### `getPredecessor(int entry)`

**Parameters:**
- `entry` (`int`)

**Returns:** `int`

### `getSuccessor(int entry)`

**Parameters:**
- `entry` (`int`)

**Returns:** `int`

### `setSuccessor(int entry, int succ)`

**Parameters:**
- `entry` (`int`)
- `succ` (`int`)

**Returns:** `void`

### `setPredecessor(int entry, int pred)`

**Parameters:**
- `entry` (`int`)
- `pred` (`int`)

**Returns:** `void`

### `setSucceeds(int pred, int succ)`

**Parameters:**
- `pred` (`int`)
- `succ` (`int`)

**Returns:** `void`

### `insertEntry(int entryIndex, E object, int hash, int mask)`

**Parameters:**
- `entryIndex` (`int`)
- `object` (`E`)
- `hash` (`int`)
- `mask` (`int`)

**Returns:** `void`

### `moveLastEntry(int dstIndex, int mask)`

**Parameters:**
- `dstIndex` (`int`)
- `mask` (`int`)

**Returns:** `void`

### `resizeEntries(int newCapacity)`

**Parameters:**
- `newCapacity` (`int`)

**Returns:** `void`

### `firstEntryIndex()`

**Returns:** `int`

### `adjustAfterRemove(int indexBeforeRemove, int indexRemoved)`

**Parameters:**
- `indexBeforeRemove` (`int`)
- `indexRemoved` (`int`)

**Returns:** `int`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray(T[] a)`

**Parameters:**
- `a` (`T[]`)

**Returns:** `T[]`

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `clear()`

**Returns:** `void`

### `requirePredecessors()`

**Returns:** `int[]`

### `requireSuccessors()`

**Returns:** `int[]`

