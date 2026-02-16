# Class: `CompactHashMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashMap`

**Extends:** [`java.util.AbstractMap<K,V>`](../../../../java/util/AbstractMap.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

CompactHashMap is an implementation of a Map. All optional operations (put and remove) are
 supported. Null keys and values are supported.

 <p>{@code containsKey(k)}, {@code put(k, v)} and {@code remove(k)} are all (expected and
 amortized) constant time operations. Expected in the hashtable sense (depends on the hash
 function doing a good job of distributing the elements to the buckets to a distribution not far
 from uniform), and amortized since some operations can trigger a hash table resize.

 <p>Unlike {@code java.util.HashMap}, iteration is only proportional to the actual {@code size()},
 which is optimal, and <i>not</i> the size of the internal hashtable, which could be much larger
 than {@code size()}. Furthermore, this structure places significantly reduced load on the garbage
 collector by only using a constant number of internal objects.

 <p>If there are no removals, then iteration order for the {@link #entrySet}, {@link #keySet}, and
 {@link #values} views is the same as insertion order. Any removal invalidates any ordering
 guarantees.

 <p>This class should not be assumed to be universally superior to {@code java.util.HashMap}.
 Generally speaking, this class reduces object allocation and memory consumption at the price of
 moderately increased constant factors of CPU. Only use this class when there is a specific reason
 to prioritize memory over CPU.
@author Louis Wasserman
@author Jon Noack

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
 keys.length) are all {@code null}.

### `values`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The values of the entries in the map, in the range of [0, size()). The values in [size(),
 values.length) are all {@code null}.

### `metadata`

**Type:** `int`

Keeps track of metadata like the number of hash table bits and modifications of this data
 structure (to make it possible to throw ConcurrentModificationException in the iterator). Note
 that we choose not to make this volatile, so we do less of a "best effort" to track such
 errors, for better performance.

 <p>For a new instance, where the arrays above have not yet been allocated, the value of {@code
 metadata} is the size that the arrays should be allocated with. Once the arrays have been
 allocated, the value of {@code metadata} combines the number of bits in the "short hash", in
 its bottom {@value CompactHashing#HASH_TABLE_BITS_MAX_BITS} bits, with a modification count in
 the remaining bits that is used to detect concurrent modification during iteration.

### `size`

**Type:** `int`

The number of elements contained in the set.

### `keySetView`

**Type:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `entrySetView`

**Type:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `valuesView`

**Type:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

## Constructors

### `<init>()`

Constructs a new empty instance of {@code CompactHashMap}.

### `<init>(`int` expectedSize)`

Constructs a new instance of {@code CompactHashMap} with the specified capacity.
@param expectedSize the initial capacity of this {@code CompactHashMap}.

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

Creates an empty {@code CompactHashMap} instance.

### `createWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

Creates a {@code CompactHashMap} instance, with a high enough "initial capacity" that it
 <i>should</i> hold {@code expectedSize} elements without growth.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty {@code CompactHashMap} with enough capacity to hold {@code expectedSize}
     elements without resizing
@throws IllegalArgumentException if {@code expectedSize} is negative

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

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `createHashFloodingResistantDelegate(`int` tableSize)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `convertToHashFloodingResistantImplementation()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

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

Mark an access of the specified entry. Used only in {@code CompactLinkedHashMap} for LRU
 ordering.

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `insertEntry(`int` entryIndex, [`K`](K.md) key, [`V`](V.md) value, `int` hash, `int` mask)`

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

**Returns:** [`V`](V.md)

### `remove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `removeHelper(`java.lang.Object` key)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

### `moveLastEntry(`int` dstIndex, `int` mask)`

**Returns:** `void`

Moves the last entry in the entry array into {@code dstIndex}, and nulls out its old position.

### `firstEntryIndex()`

**Returns:** `int`

### `getSuccessor(`int` entryIndex)`

**Returns:** `int`

### `adjustAfterRemove(`int` indexBeforeRemove, `int` indexRemoved)`

**Returns:** `int`

Updates the index an iterator is pointing to after a call to remove: returns the index of the
 entry that should be looked at after a removal on indexRemoved, with indexBeforeRemove as the
 index that *was* the next entry that would be looked at.

### `replaceAll([`java.util.function.BiFunction<? super K,? super V,? extends V>`](../../../../java/util/function/BiFunction.md) function)`

**Returns:** `void`

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `createKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `keySetIterator()`

**Returns:** [`java.util.Iterator<K>`](../../../../java/util/Iterator.md)

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

**Returns:** `void`

### `entrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `createEntrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `entrySetIterator()`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `createValues()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `valuesIterator()`

**Returns:** [`java.util.Iterator<V>`](../../../../java/util/Iterator.md)

### `trimToSize()`

**Returns:** `void`

Ensures that this {@code CompactHashMap} has the smallest representation in memory, given its
 current size.

### `clear()`

**Returns:** `void`

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

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

**Returns:** [`K`](K.md)

### `value(`int` i)`

**Returns:** [`V`](V.md)

### `entry(`int` i)`

**Returns:** `int`

### `setKey(`int` i, [`K`](K.md) key)`

**Returns:** `void`

### `setValue(`int` i, [`V`](V.md) value)`

**Returns:** `void`

### `setEntry(`int` i, `int` value)`

**Returns:** `void`

