# Class: `CompactHashSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashSet`

**Extends:** [`java.util.AbstractSet<E>`](../../../../java/util/AbstractSet.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

CompactHashSet is an implementation of a Set. All optional operations (adding and removing) are
 supported. The elements can be any objects.

 <p>{@code contains(x)}, {@code add(x)} and {@code remove(x)}, are all (expected and amortized)
 constant time operations. Expected in the hashtable sense (depends on the hash function doing a
 good job of distributing the elements to the buckets to a distribution not far from uniform), and
 amortized since some operations can trigger a hash table resize.

 <p>Unlike {@code java.util.HashSet}, iteration is only proportional to the actual {@code size()},
 which is optimal, and <i>not</i> the size of the internal hashtable, which could be much larger
 than {@code size()}. Furthermore, this structure only depends on a fixed number of arrays; {@code
 add(x)} operations <i>do not</i> create objects for the garbage collector to deal with, and for
 every element added, the garbage collector will have to traverse {@code 1.5} references on
 average, in the marking phase, not {@code 5.0} as in {@code java.util.HashSet}.

 <p>If there are no removals, then {@link #iterator iteration} order is the same as insertion
 order. Any removal invalidates any ordering guarantees.

 <p>This class should not be assumed to be universally superior to {@code java.util.HashSet}.
 Generally speaking, this class reduces object allocation and memory consumption at the price of
 moderately increased constant factors of CPU. Only use this class when there is a specific reason
 to prioritize memory over CPU.
@author Dimitris Andreou
@author Jon Noack

## Fields

### `HASH_FLOODING_FPP`

**Type:** `double`

Maximum allowed false positive probability of detecting a hash flooding attack given random
 input.

### `MAX_HASH_BUCKET_LENGTH`

**Type:** `int`

Maximum allowed length of a hash table bucket before falling back to a j.u.LinkedHashSet based
 implementation. Experimentally determined.

### `table`

**Type:** `java.lang.Object`

The hashtable object. This can be either:

 <ul>
   <li>a byte[], short[], or int[], with size a power of two, created by
       CompactHashing.createTable, whose values are either
       <ul>
         <li>UNSET, meaning "null pointer"
         <li>one plus an index into the entries and elements array
       </ul>
   <li>another java.util.Set delegate implementation. In most modern JDKs, normal java.util hash
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
 part of the smeared hash of the element not covered by the hashtable mask, whereas the low bits
 are the "next" pointer (pointing to the next entry in the bucket chain), which will always be
 less than or equal to the hashtable mask.

 <pre>
 hash  = aaaaaaaa
 mask  = 00000fff
 next  = 00000bbb
 entry = aaaaabbb
 </pre>

 <p>The pointers in [size(), entries.length) are all "null" (UNSET).

### `elements`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The elements contained in the set, in the range of [0, size()). The elements in [size(),
 elements.length) are all {@code null}.

### `metadata`

**Type:** `int`

Keeps track of metadata like the number of hash table bits and modifications of this data
 structure (to make it possible to throw ConcurrentModificationException in the iterator). Note
 that we choose not to make this volatile, so we do less of a "best effort" to track such
 errors, for better performance.

### `size`

**Type:** `int`

The number of elements contained in the set.

## Constructors

### `<init>()`

Constructs a new empty instance of {@code CompactHashSet}.

### `<init>(`int` expectedSize)`

Constructs a new instance of {@code CompactHashSet} with the specified capacity.
@param expectedSize the initial capacity of this {@code CompactHashSet}.

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

Creates an empty {@code CompactHashSet} instance.

### `create([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) collection)`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

Creates a <i>mutable</i> {@code CompactHashSet} instance containing the elements of the given
 collection in unspecified order.
@param collection the elements that the set should contain
@return a new {@code CompactHashSet} containing those elements (minus duplicates)

### `create([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

Creates a <i>mutable</i> {@code CompactHashSet} instance containing the given elements in
 unspecified order.
@param elements the elements that the set should contain
@return a new {@code CompactHashSet} containing those elements (minus duplicates)

### `createWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.CompactHashSet<E>`](./CompactHashSet.md)

Creates a {@code CompactHashSet} instance, with a high enough "initial capacity" that it
 <i>should</i> hold {@code expectedSize} elements without growth.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty {@code CompactHashSet} with enough capacity to hold {@code expectedSize}
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

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `createHashFloodingResistantDelegate(`int` tableSize)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `convertToHashFloodingResistantImplementation()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `isUsingHashFloodingResistance()`

**Returns:** `boolean`

### `setHashTableMask(`int` mask)`

**Returns:** `void`

Stores the hash table mask as the number of bits needed to represent an index.

### `hashTableMask()`

**Returns:** `int`

Gets the hash table mask using the stored number of hash table bits.

### `incrementModCount()`

**Returns:** `void`

### `add([`E`](E.md) object)`

**Returns:** `boolean`

### `insertEntry(`int` entryIndex, [`E`](E.md) object, `int` hash, `int` mask)`

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

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `remove(`java.lang.Object` object)`

**Returns:** `boolean`

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

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `spliterator()`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `forEach([`java.util.function.Consumer<? super E>`](../../../../java/util/function/Consumer.md) action)`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray([`T[]`](T.md) a)`

**Returns:** [`T[]`](T.md)

### `trimToSize()`

**Returns:** `void`

Ensures that this {@code CompactHashSet} has the smallest representation in memory, given its
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

### `requireElements()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `element(`int` i)`

**Returns:** [`E`](E.md)

### `entry(`int` i)`

**Returns:** `int`

### `setElement(`int` i, [`E`](E.md) value)`

**Returns:** `void`

### `setEntry(`int` i, `int` value)`

**Returns:** `void`

