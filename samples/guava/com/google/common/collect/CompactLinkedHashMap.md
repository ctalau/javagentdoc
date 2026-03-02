# Class: `CompactLinkedHashMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactLinkedHashMap`

**Extends:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

All optional operations (put and
 remove) are supported. Null keys and values are supported.

 
containsKey(k), put(k, v) and remove(k) are all (expected and
 amortized) constant time operations. Expected in the hashtable sense (depends on the hash
 function doing a good job of distributing the elements to the buckets to a distribution not far
 from uniform), and amortized since some operations can trigger a hash table resize.

 
As compared with java.util.LinkedHashMap, this structure places significantly reduced
 load on the garbage collector by only using a constant number of internal objects.

 
This class should not be assumed to be universally superior to 
 java.util.LinkedHashMap. Generally speaking, this class reduces object allocation and memory
 consumption at the price of moderately increased constant factors of CPU. Only use this class
 when there is a specific reason to prioritize memory over CPU.

## Fields

### `ENDPOINT`

**Type:** `int`

### `links`

**Type:** `long[]`

The
 high 32 bits of each long is the "prev" pointer, whereas the low 32 bits is the "succ" pointer
 (pointing to the next entry in the linked list). The pointers in [size(), entries.length) are
 all "null" (UNSET).

 
A node with "prev" pointer equal to ENDPOINT is the first node in the linked list,
 and a node with "next" pointer equal to ENDPOINT is the last node.

### `firstEntry`

**Type:** `int`

### `lastEntry`

**Type:** `int`

### `accessOrder`

**Type:** `boolean`

## Constructors

### `<init>()`

### `<init>(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

### `<init>(int expectedSize, boolean accessOrder)`

**Parameters:**
- `expectedSize` (`int`)
- `accessOrder` (`boolean`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactLinkedHashMap<K,V>`](./CompactLinkedHashMap.md)

### `createWithExpectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`): the number of elements you expect to add to the returned set

**Returns:** [`com.google.common.collect.CompactLinkedHashMap<K,V>`](./CompactLinkedHashMap.md)

### `init(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `void`

### `allocArrays()`

**Returns:** `int`

### `createHashFloodingResistantDelegate(int tableSize)`

**Parameters:**
- `tableSize` (`int`)

**Returns:** `java.util.Map<K,V>`

### `convertToHashFloodingResistantImplementation()`

**Returns:** `java.util.Map<K,V>`

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

### `insertEntry(int entryIndex, K key, V value, int hash, int mask)`

**Parameters:**
- `entryIndex` (`int`)
- `key` (`K`)
- `value` (`V`)
- `hash` (`int`)
- `mask` (`int`)

**Returns:** `void`

### `accessEntry(int index)`

**Parameters:**
- `index` (`int`)

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

### `createEntrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `clear()`

**Returns:** `void`

### `requireLinks()`

**Returns:** `long[]`

### `link(int i)`

**Parameters:**
- `i` (`int`)

**Returns:** `long`

### `setLink(int i, long value)`

**Parameters:**
- `i` (`int`)
- `value` (`long`)

**Returns:** `void`

