# Class: `Hashing`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Hashing`

## Description

## Fields

### `C1`

**Type:** `long`

### `C2`

**Type:** `long`

### `MAX_TABLE_SIZE`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `smear(int hashCode)`

**Returns:** `int`

**Parameters:**
- `hashCode` (`int`)

### `smearedHash(java.lang.Object o)`

**Returns:** `int`

**Parameters:**
- `o` (`java.lang.Object`)

### `closedTableSize(int expectedEntries, double loadFactor)`

**Returns:** `int`

**Parameters:**
- `expectedEntries` (`int`)
- `loadFactor` (`double`)

### `needsResizing(int size, int tableSize, double loadFactor)`

**Returns:** `boolean`

**Parameters:**
- `size` (`int`)
- `tableSize` (`int`)
- `loadFactor` (`double`)

