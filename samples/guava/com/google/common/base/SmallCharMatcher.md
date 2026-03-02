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

### `<init>(char[] table, long filter, boolean containsZero, String description)`

**Parameters:**
- `table` (`char[]`)
- `filter` (`long`)
- `containsZero` (`boolean`)
- `description` (`java.lang.String`)

## Methods

### `smear(int hashCode)`

**Parameters:**
- `hashCode` (`int`)

**Returns:** `int`

### `checkFilter(int c)`

**Parameters:**
- `c` (`int`)

**Returns:** `boolean`

### `chooseTableSize(int setSize)`

The returned size is the smallest power of two that
 can hold setSize elements with the desired load factor.

**Parameters:**
- `setSize` (`int`)

**Returns:** `int`

### `from(BitSet chars, String description)`

**Parameters:**
- `chars` (`java.util.BitSet`)
- `description` (`java.lang.String`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `matches(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** `boolean`

### `setBits(BitSet table)`

**Parameters:**
- `table` (`java.util.BitSet`)

**Returns:** `void`

