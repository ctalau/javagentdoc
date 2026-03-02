# Class: `ImageLayoutInformation`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.ImageLayoutInformation`

**Extends:** `ro.sync.exml.view.graphics.Rectangle`

## Description

## Fields

### `ascend`

**Type:** `int`

## Constructors

### `<init>(int x, int y, int width, int height)`

No base line information is given.

**Parameters:**
- `x` (`int`): The x coordinate.
- `y` (`int`): The y coordinate.
- `width` (`int`): The width.
- `height` (`int`): The height.

### `<init>(int x, int y, int width, int height, int ascend)`

**Parameters:**
- `x` (`int`): The x coordinate.
- `y` (`int`): The y coordinate.
- `width` (`int`): The width.
- `height` (`int`): The height.
- `ascend` (`int`): The image ascend, -1 if unknown.

## Methods

### `getAscend()`

**Returns:** `int`

### `setAscend(int ascend)`

**Returns:** `void`

**Parameters:**
- `ascend` (`int`): The image ascend.

### `toString()`

**Returns:** `java.lang.String`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

