# Class: `CompactHashMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashMap`

**Extends:** `java.util.AbstractMap<K,V>`

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

CompactHashMap is an implementation of a Map. All optional operations (put and remove) are
 supported. Null keys and values are supported.

 <p>`containsKey(k)`, `put(k, v)` and `remove(k)` are all (expected and
 amortized) constant time operations. Expected in the hashtable sense (depends on the hash
 function doing a good job of distributing the elements to the buckets to a distribution not far
 from uniform), and amortized since some operations can trigger a hash table resize.

 <p>Unlike `java.util.HashMap`, iteration is only proportional to the actual `size()`,
 which is optimal, and <i>not</i> the size of the internal hashtable, which could be much larger
 than `size()`. Furthermore, this structure places significantly reduced load on the garbage
 collector by only using a constant number of internal objects.

 <p>If there are no removals, then iteration order for the `entrySet`, `keySet`, and
 `values` views is the same as insertion order. Any removal invalidates any ordering
 guarantees.

 <p>This class should not be assumed to be universally superior to `java.util.HashMap`.
 Generally speaking, this class reduces object allocation and memory consumption at the price of
 moderately increased constant factors of CPU. Only use this class when there is a specific reason
 to prioritize memory over CPU.
**Author:** Louis Wasserman
**Author:** Jon Noack

## Fields

### `NOT_FOUND`

**Type:** `java.lang.Object`

### `HASH_FLOODING_FPP`

**Type:** `double`

Maximum allowed false positive probability of detecting a hash flooding attack given random
 input.

### `MAX_HASH_BUCKET_LENGTH`

**Type:** `int`

Maximum allowed length of a hash table bucket before falling back to a j.u.LinkedHashMap-based
 implementation. Experimentally determined.

### `table`

**Type:** `java.lang.Object`

The hashtable object. This can be either:

 <ul>
   <li>a byte[], short[], or int[], with size a power of two, created by
       CompactHashing.createTable, whose values are either
       <ul>
         <li>UNSET, meaning "null pointer"
         <li>one plus an index into the keys, values, and entries arrays
       </ul>
   <li>another java.util.Map delegate implementation. In most modern JDKs, normal java.util hash
       collections intelligently fall back to a binary search tree if hash table collisions are
       detected. Rather than going to all the trouble of reimplementing this ourselves, we
       simply switch over to use the JDK implementation wholesale if probable hash flooding is
       detected, sacrificing the compactness guarantee in very rare cases in exchange for much
       more reliable worst-case behavior.
   <li>null, if no entries have yet been added to the map
 </ul>

### `entries`

**Type:** `int[]`

Contains the logical entries, in the range of [0, size()). The high bits of each int are the
 part of the smeared hash of the key not covered by the hashtable mask, whereas the low bits are
 the "next" pointer (pointing to the next entry in the bucket chain), which will always be less
 than or equal to the hashtable mask.

 <pre>
 hash  = aaaaaaaa
 mask  = 00000fff
 next  = 00000bbb
 entry = aaaaabbb
 </pre>

 <p>The pointers in [size(), entries.length) are all "null" (UNSET).

### `keys`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The keys of the entries in the map, in the range of [0, size()). The keys in [size(),
 keys.length) are all `null`.

### `values`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The values of the entries in the map, in the range of [0, size()). The values in [size(),
 values.length) are all `null`.

### `metadata`

**Type:** `int`

Keeps track of metadata like the number of hash table bits and modifications of this data
 structure (to make it possible to throw ConcurrentModificationException in the iterator). Note
 that we choose not to make this volatile, so we do less of a "best effort" to track such
 errors, for better performance.

 <p>For a new instance, where the arrays above have not yet been allocated, the value of `metadata` is the size that the arrays should be allocated with. Once the arrays have been
 allocated, the value of `metadata` combines the number of bits in the "short hash", in
 its bottom `CompactHashing#HASH_TABLE_BITS_MAX_BITS` bits, with a modification count in
 the remaining bits that is used to detect concurrent modification during iteration.

### `size`

**Type:** `int`

The number of elements contained in the set.

### `keySetView`

**Type:** `java.util.Set<K>`

### `entrySetView`

**Type:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `valuesView`

**Type:** `java.util.Collection<V>`

## Constructors

### `<init>()`

Constructs a new empty instance of `CompactHashMap`.

### `<init>(`int` expectedSize)`

Constructs a new instance of `CompactHashMap` with the specified capacity.
@param expectedSize the initial capacity of this `CompactHashMap`.

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

Creates an empty `CompactHashMap` instance.

### `createWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

Creates a `CompactHashMap` instance, with a high enough "initial capacity" that it
 <i>should</i> hold `expectedSize` elements without growth.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty `CompactHashMap` with enough capacity to hold `expectedSize`
     elements without resizing
@throws IllegalArgumentException if `expectedSize` is negative

### `init(`int` expectedSize)`

**Returns:** `void`

Pseudoconstructor for serialization support.

### `needsAllocArrays()`

**Returns:** `boolean`

Returns whether arrays need to be allocated.

### `allocArrays()`

**Returns:** `int`

Handle lazy allocation of arrays.

### `delegateOrNull()`

**Returns:** `java.util.Map<K,V>`

### `createHashFloodingResistantDelegate(`int` tableSize)`

**Returns:** `java.util.Map<K,V>`

### `convertToHashFloodingResistantImplementation()`

**Returns:** `java.util.Map<K,V>`

### `setHashTableMask(`int` mask)`

**Returns:** `void`

Stores the hash table mask as the number of bits needed to represent an index.

### `hashTableMask()`

**Returns:** `int`

Gets the hash table mask using the stored number of hash table bits.

### `incrementModCount()`

**Returns:** `void`

### `accessEntry(`int` index)`

**Returns:** `void`

Mark an access of the specified entry. Used only in `CompactLinkedHashMap` for LRU
 ordering.

### `put(`K` key, `V` value)`

**Returns:** `V`

### `insertEntry(`int` entryIndex, `K` key, `V` value, `int` hash, `int` mask)`

**Returns:** `void`

Creates a fresh entry with the specified object at the specified position in the entry arrays.

### `resizeMeMaybe(`int` newSize)`

**Returns:** `void`

Resizes the entries storage if necessary.

### `resizeEntries(`int` newCapacity)`

**Returns:** `void`

Resizes the internal entries array to the specified capacity, which may be greater or less than
 the current capacity.

### `resizeTable(`int` oldMask, `int` newCapacity, `int` targetHash, `int` targetEntryIndex)`

**Returns:** `int`

### `indexOf(`java.lang.Object` key)`

**Returns:** `int`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `remove(`java.lang.Object` key)`

**Returns:** `V`

### `removeHelper(`java.lang.Object` key)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

### `moveLastEntry(`int` dstIndex, `int` mask)`

**Returns:** `void`

Moves the last entry in the entry array into `dstIndex`, and nulls out its old position.

### `firstEntryIndex()`

**Returns:** `int`

### `getSuccessor(`int` entryIndex)`

**Returns:** `int`

### `adjustAfterRemove(`int` indexBeforeRemove, `int` indexRemoved)`

**Returns:** `int`

Updates the index an iterator is pointing to after a call to remove: returns the index of the
 entry that should be looked at after a removal on indexRemoved, with indexBeforeRemove as the
 index that *was* the next entry that would be looked at.

### `replaceAll(`java.util.function.BiFunction<? super K,? super V,? extends V>` function)`

**Returns:** `void`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `keySetIterator()`

**Returns:** `java.util.Iterator<K>`

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `createEntrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `entrySetIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `values()`

**Returns:** `java.util.Collection<V>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `valuesIterator()`

**Returns:** `java.util.Iterator<V>`

### `trimToSize()`

**Returns:** `void`

Ensures that this `CompactHashMap` has the smallest representation in memory, given its
 current size.

### `clear()`

**Returns:** `void`

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `requireTable()`

**Returns:** `java.lang.Object`

### `requireEntries()`

**Returns:** `int[]`

### `requireKeys()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `requireValues()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `key(`int` i)`

**Returns:** `K`

### `value(`int` i)`

**Returns:** `V`

### `entry(`int` i)`

**Returns:** `int`

### `setKey(`int` i, `K` key)`

**Returns:** `void`

### `setValue(`int` i, `V` value)`

**Returns:** `void`

### `setEntry(`int` i, `int` value)`

**Returns:** `void`

