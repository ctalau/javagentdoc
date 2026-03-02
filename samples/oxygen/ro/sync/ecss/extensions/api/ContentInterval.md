# Class: `ContentInterval`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ContentInterval`

## Description

## Fields

### `startOffset`

**Type:** `int`

### `endOffset`

**Type:** `int`

## Constructors

### `<init>(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): Interval **inclusive** start offset.
- `endOffset` (`int`): Interval **exclusive** end offset.

## Methods

### `getStartOffset()`

**Returns:** `int`

### `getEndOffset()`

**Returns:** `int`

### `getLength()`

**Returns:** `int`

### `contains(int offset)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`): An offset.

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

