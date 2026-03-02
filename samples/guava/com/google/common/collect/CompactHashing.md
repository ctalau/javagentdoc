# Class: `CompactHashing`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CompactHashing`

## Description

## Fields

### `UNSET`

**Type:** `byte`

### `HASH_TABLE_BITS_MAX_BITS`

**Type:** `int`

### `MODIFICATION_COUNT_INCREMENT`

**Type:** `int`

### `HASH_TABLE_BITS_MASK`

**Type:** `int`

### `MAX_SIZE`

**Type:** `int`

### `DEFAULT_SIZE`

**Type:** `int`

### `MIN_HASH_TABLE_SIZE`

**Type:** `int`

Because small hash tables
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

### `tableSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `int`

### `createTable(int buckets)`

**Parameters:**
- `buckets` (`int`)

**Returns:** `java.lang.Object`

### `tableClear(Object table)`

**Parameters:**
- `table` (`java.lang.Object`)

**Returns:** `void`

### `tableGet(Object table, int index)`

When it is a byte[] or short[], the returned value
 is unsigned, so the range of possible returned values is 0–255 or 0–65535, respectively.

**Parameters:**
- `table` (`java.lang.Object`)
- `index` (`int`)

**Returns:** `int`

### `tableSet(Object table, int index, int entry)`

The value of entry should fit in the size of the
 assigned array element, when seen as an unsigned value. So if table is a byte[]
 then we should have 0 ≤ entry ≤ 255, and if table is a short[] then we
 should have 0 ≤ entry ≤ 65535. It is the caller's responsibility to ensure this.

**Parameters:**
- `table` (`java.lang.Object`)
- `index` (`int`)
- `entry` (`int`)

**Returns:** `void`

### `newCapacity(int mask)`

For hashtable sizes less than or equal to 32, the returned power of 2 is 4x the current
 hashtable size to reduce expensive rehashing. Otherwise the returned power of 2 is 2x the
 current hashtable size.

**Parameters:**
- `mask` (`int`)

**Returns:** `int`

### `getHashPrefix(int value, int mask)`

**Parameters:**
- `value` (`int`)
- `mask` (`int`)

**Returns:** `int`

### `getNext(int entry, int mask)`

**Parameters:**
- `entry` (`int`)
- `mask` (`int`)

**Returns:** `int`

### `maskCombine(int prefix, int suffix, int mask)`

**Parameters:**
- `prefix` (`int`)
- `suffix` (`int`)
- `mask` (`int`)

**Returns:** `int`

### `remove(Object key, Object value, int mask, Object table, int[] entries, lang@Nullable Object[] keys, lang@Nullable Object[] values)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)
- `mask` (`int`)
- `table` (`java.lang.Object`)
- `entries` (`int[]`)
- `keys` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `values` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `int`

