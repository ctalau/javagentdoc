# Class: `SmallCharMatcher`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.SmallCharMatcher`

**Extends:** [`com.google.common.base.CharMatcher.NamedFastMatcher`](CharMatcher/NamedFastMatcher.md)

## Description

An immutable version of CharMatcher for smallish sets of characters that uses a hash table with
 linear probing to check for matches.
**Author:** Christopher Swenson

## Fields

### `MAX_SIZE`

**Type:** `int`

### `table`

**Type:** `char[]`

### `containsZero`

**Type:** `boolean`

### `filter`

**Type:** `long`

### `C1`

**Type:** `int`

### `C2`

**Type:** `int`

### `DESIRED_LOAD_FACTOR`

**Type:** `double`

## Constructors

### `<init>(`char[]` table, `long` filter, `boolean` containsZero, `java.lang.String` description)`

## Methods

### `smear(`int` hashCode)`

**Returns:** `int`

### `checkFilter(`int` c)`

**Returns:** `boolean`

### `chooseTableSize(`int` setSize)`

**Returns:** `int`

Returns an array size suitable for the backing array of a hash table that uses open addressing
 with linear probing in its implementation. The returned size is the smallest power of two that
 can hold setSize elements with the desired load factor.

### `from(`java.util.BitSet` chars, `java.lang.String` description)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `matches(`char` c)`

**Returns:** `boolean`

### `setBits(`java.util.BitSet` table)`

**Returns:** `void`

