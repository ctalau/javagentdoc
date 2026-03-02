# Class: `ImageRenderingContext`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext`

## Description

## Fields

### `font`

**Type:** `ro.sync.exml.view.graphics.Font`

### `dotsPerInch`

**Type:** `int`

### `imageInfo`

**Type:** `ro.sync.exml.view.graphics.Rectangle`

## Constructors

### `<init>(Font font)`

**Parameters:**
- `font` (`ro.sync.exml.view.graphics.Font`): The font.

### `<init>(Font font, int dotsPerInch)`

**Parameters:**
- `font` (`ro.sync.exml.view.graphics.Font`): The font.
- `dotsPerInch` (`int`): The current monitor DPI (Dots per Inch)

### `<init>(Font font, int dotsPerInch, Rectangle imageInfo)`

**Parameters:**
- `font` (`ro.sync.exml.view.graphics.Font`): The font.
- `dotsPerInch` (`int`): The current monitor DPI (Dots per Inch)
- `imageInfo` (`ro.sync.exml.view.graphics.Rectangle`): Image's layout info.

## Methods

### `getFont()`

Some image handlers (for example an SVG or a MathML image handler) might use this information to render and compute the image sizes...

**Returns:** `ro.sync.exml.view.graphics.Font`

### `getDotsPerInch()`

The default is 96.

**Returns:** `int`

### `getImageDimensions()`

Some image handlers (for example an SVG or a MathML image handler) might use this information to scale images without losing accuracy.
 If the handler does not use this information, the image is automatically scaled by the application to the display dimensions.

**Returns:** `ro.sync.exml.view.graphics.Dimension`

