# Class: `CompactLinkedHashMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactLinkedHashMap`

**Extends:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

CompactLinkedHashMap is an implementation of a Map with insertion or LRU iteration order,
 maintained with a doubly linked list through the entries. All optional operations (put and
 remove) are supported. Null keys and values are supported.

 <p>{@code containsKey(k)}, {@code put(k, v)} and {@code remove(k)} are all (expected and
 amortized) constant time operations. Expected in the hashtable sense (depends on the hash
 function doing a good job of distributing the elements to the buckets to a distribution not far
 from uniform), and amortized since some operations can trigger a hash table resize.

 <p>As compared with {@link java.util.LinkedHashMap}, this structure places significantly reduced
 load on the garbage collector by only using a constant number of internal objects.

 <p>This class should not be assumed to be universally superior to {@code
 java.util.LinkedHashMap}. Generally speaking, this class reduces object allocation and memory
 consumption at the price of moderately increased constant factors of CPU. Only use this class
 when there is a specific reason to prioritize memory over CPU.
@author Louis Wasserman

## Fields

### `ENDPOINT`

**Type:** `int`

### `links`

**Type:** `long[]`

Contains the link pointers corresponding with the entries, in the range of [0, size()). The
 high 32 bits of each long is the "prev" pointer, whereas the low 32 bits is the "succ" pointer
 (pointing to the next entry in the linked list). The pointers in [size(), entries.length) are
 all "null" (UNSET).

 <p>A node with "prev" pointer equal to {@code ENDPOINT} is the first node in the linked list,
 and a node with "next" pointer equal to {@code ENDPOINT} is the last node.

### `firstEntry`

**Type:** `int`

Pointer to the first node in the linked list, or {@code ENDPOINT} if there are no entries.

### `lastEntry`

**Type:** `int`

Pointer to the last node in the linked list, or {@code ENDPOINT} if there are no entries.

### `accessOrder`

**Type:** `boolean`

## Constructors

### `<init>()`

### `<init>(`int` expectedSize)`

### `<init>(`int` expectedSize, `boolean` accessOrder)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactLinkedHashMap<K,V>`](./CompactLinkedHashMap.md)

Creates an empty {@code CompactLinkedHashMap} instance.

### `createWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.CompactLinkedHashMap<K,V>`](./CompactLinkedHashMap.md)

Creates a {@code CompactLinkedHashMap} instance, with a high enough "initial capacity" that it
 <i>should</i> hold {@code expectedSize} elements without rebuilding internal data structures.
@param expectedSize the number of elements you expect to add to the returned set
@return a new, empty {@code CompactLinkedHashMap} with enough capacity to hold {@code
     expectedSize} elements without resizing
@throws IllegalArgumentException if {@code expectedSize} is negative

### `init(`int` expectedSize)`

**Returns:** `void`

### `allocArrays()`

**Returns:** `int`

### `createHashFloodingResistantDelegate(`int` tableSize)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `convertToHashFloodingResistantImplementation()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

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

### `insertEntry(`int` entryIndex, [`K`](K.md) key, [`V`](V.md) value, `int` hash, `int` mask)`

**Returns:** `void`

### `accessEntry(`int` index)`

**Returns:** `void`

### `moveLastEntry(`int` dstIndex, `int` mask)`

**Returns:** `void`

### `resizeEntries(`int` newCapacity)`

**Returns:** `void`

### `firstEntryIndex()`

**Returns:** `int`

### `adjustAfterRemove(`int` indexBeforeRemove, `int` indexRemoved)`

**Returns:** `int`

### `createEntrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `createKeySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `createValues()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `clear()`

**Returns:** `void`

### `requireLinks()`

**Returns:** `long[]`

### `link(`int` i)`

**Returns:** `long`

### `setLink(`int` i, `long` value)`

**Returns:** `void`

