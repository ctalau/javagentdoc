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

**Parameters:**
- `hashCode` (`int`)

**Returns:** `int`

### `smearedHash(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `int`

### `closedTableSize(int expectedEntries, double loadFactor)`

**Parameters:**
- `expectedEntries` (`int`)
- `loadFactor` (`double`)

**Returns:** `int`

### `needsResizing(int size, int tableSize, double loadFactor)`

**Parameters:**
- `size` (`int`)
- `tableSize` (`int`)
- `loadFactor` (`double`)

**Returns:** `boolean`

