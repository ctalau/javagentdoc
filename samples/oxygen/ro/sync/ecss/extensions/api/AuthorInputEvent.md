# Class: `AuthorInputEvent`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorInputEvent`

## Description

## Fields

### `SHIFT_PRESSED`

**Type:** `int`

The value is 1 << 0.

### `CTRL_PRESSED`

**Type:** `int`

The value is 1 << 1.

### `META_PRESSED`

**Type:** `int`

The value is 1 << 2.

### `ALT_PRESSED`

**Type:** `int`

The value is 1 << 3.

### `ALT_GRAPH_PRESSED`

**Type:** `int`

The value is 1 << 5.

### `modifiers`

**Type:** `int`

### `consumed`

**Type:** `boolean`

## Constructors

### `<init>(int modifiers)`

**Parameters:**
- `modifiers` (`int`): The modifiers.

## Methods

### `consume()`

**Returns:** `void`

### `isConsumed()`

**Returns:** `boolean`

### `isShiftPressed()`

**Returns:** `boolean`

### `isCtrlPressed()`

**Returns:** `boolean`

### `isAltPressed()`

**Returns:** `boolean`

### `isAltGraphPressed()`

**Returns:** `boolean`

### `isMetaPressed()`

**Returns:** `boolean`

### `getModifiers()`

**Returns:** `int`

### `isCtrlPressed(int modifiers)`

**Parameters:**
- `modifiers` (`int`): The modifiers

**Returns:** `boolean`

### `isMetaPressed(int modifiers)`

**Parameters:**
- `modifiers` (`int`): The modifiers.

**Returns:** `boolean`

### `isCommandPressed()`

**Returns:** `boolean`

### `isCommandPressed(int modifiers)`

**Parameters:**
- `modifiers` (`int`): The modifiers

**Returns:** `boolean`

