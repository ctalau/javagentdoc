# Class: `CompactHashing`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashing`

## Description

Helper classes and static methods for implementing compact hash-based collections.
@author Jon Noack

## Fields

### `UNSET`

**Type:** `byte`

Indicates blank table entries.

### `HASH_TABLE_BITS_MAX_BITS`

**Type:** `int`

Number of bits used to store the numbers of hash table bits (max 30).

### `MODIFICATION_COUNT_INCREMENT`

**Type:** `int`

Use high bits of metadata for modification count.

### `HASH_TABLE_BITS_MASK`

**Type:** `int`

Bitmask that selects the low bits of metadata to get hashTableBits.

### `MAX_SIZE`

**Type:** `int`

Maximum size of a compact hash-based collection (2^30 - 1 because 0 is UNSET).

### `DEFAULT_SIZE`

**Type:** `int`

Default size of a compact hash-based collection.

### `MIN_HASH_TABLE_SIZE`

**Type:** `int`

Minimum size of the hash table of a compact hash-based collection. Because small hash tables
 use a byte[], any smaller size uses the same amount of memory due to object padding.

### `BYTE_MAX_SIZE`

**Type:** `int`

### `BYTE_MASK`

**Type:** `int`

### `SHORT_MAX_SIZE`

**Type:** `int`

### `SHORT_MASK`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `tableSize(`int` expectedSize)`

**Returns:** `int`

Returns the power of 2 hashtable size required to hold the expected number of items or the
 minimum hashtable size, whichever is greater.

### `createTable(`int` buckets)`

**Returns:** `java.lang.Object`

Creates and returns a properly-sized array with the given number of buckets.

### `tableClear(`java.lang.Object` table)`

**Returns:** `void`

### `tableGet(`java.lang.Object` table, `int` index)`

**Returns:** `int`

Returns {@code table[index]}, where {@code table} is actually a {@code byte[]}, {@code
 short[]}, or {@code int[]}. When it is a {@code byte[]} or {@code short[]}, the returned value
 is unsigned, so the range of possible returned values is 0\u2013255 or 0\u201365535, respectively.

### `tableSet(`java.lang.Object` table, `int` index, `int` entry)`

**Returns:** `void`

Sets {@code table[index]} to {@code entry}, where {@code table} is actually a {@code byte[]},
 {@code short[]}, or {@code int[]}. The value of {@code entry} should fit in the size of the
 assigned array element, when seen as an unsigned value. So if {@code table} is a {@code byte[]}
 then we should have {@code 0 \u2264 entry \u2264 255}, and if {@code table} is a {@code short[]} then we
 should have {@code 0 \u2264 entry \u2264 65535}. It is the caller's responsibility to ensure this.

### `newCapacity(`int` mask)`

**Returns:** `int`

Returns a larger power of 2 hashtable size given the current mask.

 <p>For hashtable sizes less than or equal to 32, the returned power of 2 is 4x the current
 hashtable size to reduce expensive rehashing. Otherwise the returned power of 2 is 2x the
 current hashtable size.

### `getHashPrefix(`int` value, `int` mask)`

**Returns:** `int`

Returns the hash prefix given the current mask.

### `getNext(`int` entry, `int` mask)`

**Returns:** `int`

Returns the index, or 0 if the entry is "null".

### `maskCombine(`int` prefix, `int` suffix, `int` mask)`

**Returns:** `int`

Returns a new value combining the prefix and suffix using the given mask.

### `remove(`java.lang.Object` key, `java.lang.Object` value, `int` mask, `java.lang.Object` table, `int[]` entries, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` keys, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` values)`

**Returns:** `int`

