# Class: `CompactHashMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashMap`

**Extends:** `java.util.AbstractMap<K,V>`

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

All optional operations (put and remove) are
 supported. Null keys and values are supported.

 
containsKey(k), put(k, v) and remove(k) are all (expected and
 amortized) constant time operations. Expected in the hashtable sense (depends on the hash
 function doing a good job of distributing the elements to the buckets to a distribution not far
 from uniform), and amortized since some operations can trigger a hash table resize.

 
Unlike java.util.HashMap, iteration is only proportional to the actual size(),
 which is optimal, and *not* the size of the internal hashtable, which could be much larger
 than size(). Furthermore, this structure places significantly reduced load on the garbage
 collector by only using a constant number of internal objects.

 
If there are no removals, then iteration order for the #entrySet, #keySet, and
 #values views is the same as insertion order. Any removal invalidates any ordering
 guarantees.

 
This class should not be assumed to be universally superior to java.util.HashMap.
 Generally speaking, this class reduces object allocation and memory consumption at the price of
 moderately increased constant factors of CPU. Only use this class when there is a specific reason
 to prioritize memory over CPU.

## Fields

### `NOT_FOUND`

**Type:** `java.lang.Object`

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
         - one plus an index into the keys, values, and entries arrays
       

   - another java.util.Map delegate implementation. In most modern JDKs, normal java.util hash
       collections intelligently fall back to a binary search tree if hash table collisions are
       detected. Rather than going to all the trouble of reimplementing this ourselves, we
       simply switch over to use the JDK implementation wholesale if probable hash flooding is
       detected, sacrificing the compactness guarantee in very rare cases in exchange for much
       more reliable worst-case behavior.
   - null, if no entries have yet been added to the map

### `entries`

**Type:** `int[]`

The high bits of each int are the
 part of the smeared hash of the key not covered by the hashtable mask, whereas the low bits are
 the "next" pointer (pointing to the next entry in the bucket chain), which will always be less
 than or equal to the hashtable mask.

 

```

 hash  = aaaaaaaa
 mask  = 00000fff
 next  = 00000bbb
 entry = aaaaabbb
 
```


 
The pointers in [size(), entries.length) are all "null" (UNSET).

### `keys`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The keys in [size(),
 keys.length) are all null.

### `values`

**Type:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

The values in [size(),
 values.length) are all null.

### `metadata`

**Type:** `int`

Note
 that we choose not to make this volatile, so we do less of a "best effort" to track such
 errors, for better performance.

 
For a new instance, where the arrays above have not yet been allocated, the value of 
 metadata is the size that the arrays should be allocated with. Once the arrays have been
 allocated, the value of metadata combines the number of bits in the "short hash", in
 its bottom CompactHashing#HASH_TABLE_BITS_MAX_BITS bits, with a modification count in
 the remaining bits that is used to detect concurrent modification during iteration.

### `size`

**Type:** `int`

### `keySetView`

**Type:** `java.util.Set<K>`

### `entrySetView`

**Type:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `valuesView`

**Type:** `java.util.Collection<V>`

## Constructors

### `<init>()`

### `<init>(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`): the initial capacity of this CompactHashMap.

## Methods

### `create()`

**Returns:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

### `createWithExpectedSize(int expectedSize)`

**Returns:** [`com.google.common.collect.CompactHashMap<K,V>`](./CompactHashMap.md)

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

**Returns:** `java.util.Map<K,V>`

### `createHashFloodingResistantDelegate(int tableSize)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `tableSize` (`int`)

### `convertToHashFloodingResistantImplementation()`

**Returns:** `java.util.Map<K,V>`

### `setHashTableMask(int mask)`

**Returns:** `void`

**Parameters:**
- `mask` (`int`)

### `hashTableMask()`

**Returns:** `int`

### `incrementModCount()`

**Returns:** `void`

### `accessEntry(int index)`

**Returns:** `void`

Used only in CompactLinkedHashMap for LRU
 ordering.

**Parameters:**
- `index` (`int`)

### `put(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `insertEntry(int entryIndex, K key, V value, int hash, int mask)`

**Returns:** `void`

**Parameters:**
- `entryIndex` (`int`)
- `key` (`K`)
- `value` (`V`)
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

### `indexOf(java.lang.Object key)`

**Returns:** `int`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `remove(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `removeHelper(java.lang.Object key)`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

**Parameters:**
- `key` (`java.lang.Object`)

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

### `replaceAll(java.util.function.BiFunction<? super K,? super V,? extends V> function)`

**Returns:** `void`

**Parameters:**
- `function` (`java.util.function.BiFunction<? super K,? super V,? extends V>`)

### `keySet()`

**Returns:** `java.util.Set<K>`

### `createKeySet()`

**Returns:** `java.util.Set<K>`

### `keySetIterator()`

**Returns:** `java.util.Iterator<K>`

### `forEach(java.util.function.BiConsumer<? super K,? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.BiConsumer<? super K,? super V>`)

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

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `values()`

**Returns:** `java.util.Collection<V>`

### `createValues()`

**Returns:** `java.util.Collection<V>`

### `valuesIterator()`

**Returns:** `java.util.Iterator<V>`

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

### `requireKeys()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `requireValues()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `key(int i)`

**Returns:** `K`

**Parameters:**
- `i` (`int`)

### `value(int i)`

**Returns:** `V`

**Parameters:**
- `i` (`int`)

### `entry(int i)`

**Returns:** `int`

**Parameters:**
- `i` (`int`)

### `setKey(int i, K key)`

**Returns:** `void`

**Parameters:**
- `i` (`int`)
- `key` (`K`)

### `setValue(int i, V value)`

**Returns:** `void`

**Parameters:**
- `i` (`int`)
- `value` (`V`)

### `setEntry(int i, int value)`

**Returns:** `void`

**Parameters:**
- `i` (`int`)
- `value` (`int`)

