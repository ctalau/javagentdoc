# Class: `CompactLinkedHashSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactLinkedHashSet`

**Extends:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

CompactLinkedHashSet is an implementation of a Set, which a predictable iteration order that
 matches the insertion order. All optional operations (adding and removing) are supported. All
 elements, including `null`, are permitted.

 <p>`contains(x)`, `add(x)` and `remove(x)`, are all (expected and amortized)
 constant time operations. Expected in the hashtable sense (depends on the hash function doing a
 good job of distributing the elements to the buckets to a distribution not far from uniform), and
 amortized since some operations can trigger a hash table resize.

 <p>This implementation consumes significantly less memory than `java.util.LinkedHashSet` or
 even `java.util.HashSet`, and places considerably less load on the garbage collector. Like
 `java.util.LinkedHashSet`, it offers insertion-order iteration, with identical behavior.

 <p>This class should not be assumed to be universally superior to `java.util.LinkedHashSet`. Generally speaking, this class reduces object allocation and memory
 consumption at the price of moderately increased constant factors of CPU. Only use this class
 when there is a specific reason to prioritize memory over CPU.
**Author:** Louis Wasserman

## Fields

### `ENDPOINT`

**Type:** `int`

### `predecessor`

**Type:** `int[]`

Pointer to the predecessor of an entry in insertion order. ENDPOINT indicates a node is the
 first node in insertion order; all values at indices \u2265 `size()` are UNSET.

### `successor`

**Type:** `int[]`

Pointer to the successor of an entry in insertion order. ENDPOINT indicates a node is the last
 node in insertion order; all values at indices \u2265 `size()` are UNSET.

### `firstEntry`

**Type:** `int`

Pointer to the first node in the linked list, or `ENDPOINT` if there are no entries.

### `lastEntry`

**Type:** `int`

Pointer to the last node in the linked list, or `ENDPOINT` if there are no entries.

## Constructors

### `<init>()`

### `<init>(`int` expectedSize)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

Creates an empty `CompactLinkedHashSet` instance.

### `create(`java.util.Collection<? extends E>` collection)`

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

Creates a <i>mutable</i> `CompactLinkedHashSet` instance containing the elements of the
 given collection in the order returned by the collection's iterator.
@param collection the elements that the set should contain
@return a new `CompactLinkedHashSet` containing those elements (minus duplicates)

### `create(`E[]` elements)`

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

Creates a `CompactLinkedHashSet` instance containing the given elements in unspecified
 order.
@param elements the elements that the set should contain
@return a new `CompactLinkedHashSet` containing those elements (minus duplicates)

### `createWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.CompactLinkedHashSet<E>`](./CompactLinkedHashSet.md)

Creates a `CompactLinkedHashSet` instance, with a high enough "initial capacity" that it
 <i>should</i> hold `expectedSize` elements without rebuilding internal data structures.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty `CompactLinkedHashSet` with enough capacity to hold `expectedSize` elements without resizing
@throws IllegalArgumentException if `expectedSize` is negative

### `init(`int` expectedSize)`

**Returns:** `void`

### `allocArrays()`

**Returns:** `int`

### `convertToHashFloodingResistantImplementation()`

**Returns:** `java.util.Set<E>`

### `getPredecessor(`int` entry)`

**Returns:** `int`

### `getSuccessor(`int` entry)`

**Returns:** `int`

### `setSuccessor(`int` entry, `int` succ)`

**Returns:** `void`

### `setPredecessor(`int` entry, `int` pred)`

**Returns:** `void`

### `setSucceeds(`int` pred, `int` succ)`

**Returns:** `void`

### `insertEntry(`int` entryIndex, `E` object, `int` hash, `int` mask)`

**Returns:** `void`

### `moveLastEntry(`int` dstIndex, `int` mask)`

**Returns:** `void`

### `resizeEntries(`int` newCapacity)`

**Returns:** `void`

### `firstEntryIndex()`

**Returns:** `int`

### `adjustAfterRemove(`int` indexBeforeRemove, `int` indexRemoved)`

**Returns:** `int`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray(`T[]` a)`

**Returns:** `T[]`

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `clear()`

**Returns:** `void`

### `requirePredecessors()`

**Returns:** `int[]`

### `requireSuccessors()`

**Returns:** `int[]`

