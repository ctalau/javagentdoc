# Class: `CompactHashSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashSet`

**Extends:** `java.util.AbstractSet<E>`

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

All optional operations (adding and removing) are
 supported. The elements can be any objects.

 
contains(x), add(x) and remove(x), are all (expected and amortized)
 constant time operations. Expected in the hashtable sense (depends on the hash function doing a
 good job of distributing the elements to the buckets to a distribution not far from uniform), and
 amortized since some operations can trigger a hash table resize.

 
Unlike java.util.HashSet, iteration is only proportional to the actual size(),
 which is optimal, and *not* the size of the internal hashtable, which could be much larger
 than size(). Furthermore, this structure only depends on a fixed number of arrays; 
 add(x) operations *do not* create objects for the garbage collector to deal with, and for
 every element added, the garbage collector will have to traverse 1.5 references on
 average, in the marking phase, not 5.0 as in java.util.HashSet.

 
If there are no removals, then iteration order is the same as insertion
 order. Any removal invalidates any ordering guarantees.

 
This class should not be assumed to be universally superior to java.util.HashSet.
 Generally speaking, this class reduces object allocation and memory consumption at the price of
 moderately increased constant factors of CPU. Only use this class when there is a specific reason
 to prioritize memory over CPU.

## Fields

### `HASH_FLOODING_FPP`

**Type:** `double`

### `MAX_HASH_BUCKET_LENGTH`

**Type:** `int`

Experimentally determined.

### `table`

**Type:** `java.lang.Object`

This can be either:

 

   - a byte[], short[], or int[], with size a power of two, created by
       CompactHashing.createTable, whose values are either
       

         - UNSET, meaning "null pointer"
         - one plus an index into the entries and elements array
       

   - another java.util.Set delegate implementation. In most modern JDKs, normal java.util hash
       collections intelligently fall back to a binary search tree if hash table collisions are
       detected. Rather than going to all the trouble of reimplementing this ourselves, we
       simply switch over to use the JDK implementation wholesale if probable hash flooding is
       detected, sacrificing the compactness guarantee in very rare cases in exchange for much
       more reliable worst-case behavior.
   - null, if no entries have yet been added to the map

### `entries`

**Type:** `int[]`

The high bits of each int are the
 part of the smeared hash of the element not covered by the hashtable mask, whereas the low bits
 are the "next" pointer (pointing to the next entry in the bucket chain), which will always be
 less than or equal to the hashtable mask.

 

```

 hash  = aaaaaaaa
 mask  = 00000fff
 next  = 00000bbb
 entry = aaaaabbb
 
```


 
The pointers in [size(), entries.length) are all "null" (UNSET).

### `elements`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The elements in [size(),
 elements.length) are all null.

### `metadata`

**Type:** `int`

Note
 that we choose not to make this volatile, so we do less of a "best effort" to track such
 errors, for better performance.

### `size`

**Type:** `int`

## Constructors

### `<init>()`

### `<init>(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`): the initial capacity of this CompactHashSet.

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

### `create(java.util.Collection<? extends E> collection)`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

**Parameters:**
- `collection` (`java.util.Collection<? extends E>`): the elements that the set should contain

### `create(E[] elements)`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

**Parameters:**
- `elements` (`E[]`): the elements that the set should contain

### `createWithExpectedSize(int expectedSize)`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

**Parameters:**
- `expectedSize` (`int`): the number of elements you expect to add to the returned set

### `init(int expectedSize)`

**Returns:** `void`

**Parameters:**
- `expectedSize` (`int`)

### `needsAllocArrays()`

**Returns:** `boolean`

### `allocArrays()`

**Returns:** `int`

### `delegateOrNull()`

**Returns:** `java.util.Set<E>`

### `createHashFloodingResistantDelegate(int tableSize)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `tableSize` (`int`)

### `convertToHashFloodingResistantImplementation()`

**Returns:** `java.util.Set<E>`

### `isUsingHashFloodingResistance()`

**Returns:** `boolean`

### `setHashTableMask(int mask)`

**Returns:** `void`

**Parameters:**
- `mask` (`int`)

### `hashTableMask()`

**Returns:** `int`

### `incrementModCount()`

**Returns:** `void`

### `add(E object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`E`)

### `insertEntry(int entryIndex, E object, int hash, int mask)`

**Returns:** `void`

**Parameters:**
- `entryIndex` (`int`)
- `object` (`E`)
- `hash` (`int`)
- `mask` (`int`)

### `resizeMeMaybe(int newSize)`

**Returns:** `void`

**Parameters:**
- `newSize` (`int`)

### `resizeEntries(int newCapacity)`

**Returns:** `void`

**Parameters:**
- `newCapacity` (`int`)

### `resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex)`

**Returns:** `int`

**Parameters:**
- `oldMask` (`int`)
- `newCapacity` (`int`)
- `targetHash` (`int`)
- `targetEntryIndex` (`int`)

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `remove(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `moveLastEntry(int dstIndex, int mask)`

**Returns:** `void`

**Parameters:**
- `dstIndex` (`int`)
- `mask` (`int`)

### `firstEntryIndex()`

**Returns:** `int`

### `getSuccessor(int entryIndex)`

**Returns:** `int`

**Parameters:**
- `entryIndex` (`int`)

### `adjustAfterRemove(int indexBeforeRemove, int indexRemoved)`

**Returns:** `int`

**Parameters:**
- `indexBeforeRemove` (`int`)
- `indexRemoved` (`int`)

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `forEach(java.util.function.Consumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray(T[] a)`

**Returns:** `T[]`

**Parameters:**
- `a` (`T[]`)

### `trimToSize()`

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `requireTable()`

**Returns:** `java.lang.Object`

### `requireEntries()`

**Returns:** `int[]`

### `requireElements()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `element(int i)`

**Returns:** `E`

**Parameters:**
- `i` (`int`)

### `entry(int i)`

**Returns:** `int`

**Parameters:**
- `i` (`int`)

### `setElement(int i, E value)`

**Returns:** `void`

**Parameters:**
- `i` (`int`)
- `value` (`E`)

### `setEntry(int i, int value)`

**Returns:** `void`

**Parameters:**
- `i` (`int`)
- `value` (`int`)

