# Class: `SmallCharMatcher`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.SmallCharMatcher`

**Extends:** `com.google.common.base.CharMatcher.NamedFastMatcher`

## Description

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

### `<init>(char[] table, long filter, boolean containsZero, java.lang.String description)`

**Parameters:**
- `table` (`char[]`)
- `filter` (`long`)
- `containsZero` (`boolean`)
- `description` (`java.lang.String`)

## Methods

### `smear(int hashCode)`

**Returns:** `int`

**Parameters:**
- `hashCode` (`int`)

### `checkFilter(int c)`

**Returns:** `boolean`

**Parameters:**
- `c` (`int`)

### `chooseTableSize(int setSize)`

**Returns:** `int`

The returned size is the smallest power of two that
 can hold setSize elements with the desired load factor.

**Parameters:**
- `setSize` (`int`)

### `from(java.util.BitSet chars, java.lang.String description)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `chars` (`java.util.BitSet`)
- `description` (`java.lang.String`)

### `matches(char c)`

**Returns:** `boolean`

**Parameters:**
- `c` (`char`)

### `setBits(java.util.BitSet table)`

**Returns:** `void`

**Parameters:**
- `table` (`java.util.BitSet`)

