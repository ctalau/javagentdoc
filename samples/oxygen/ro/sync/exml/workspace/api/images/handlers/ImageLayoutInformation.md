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

**Parameters:**
- `ascend` (`int`): The image ascend.

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

