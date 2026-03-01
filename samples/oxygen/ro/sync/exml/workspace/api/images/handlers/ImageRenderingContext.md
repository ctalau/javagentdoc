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

### `<init>(`ro.sync.exml.view.graphics.Font` font)`

### `<init>(`ro.sync.exml.view.graphics.Font` font, `int` dotsPerInch)`

### `<init>(`ro.sync.exml.view.graphics.Font` font, `int` dotsPerInch, `ro.sync.exml.view.graphics.Rectangle` imageInfo)`

## Methods

### `getFont()`

**Returns:** `ro.sync.exml.view.graphics.Font`

Some image handlers (for example an SVG or a MathML image handler) might use this information to render and compute the image sizes...

### `getDotsPerInch()`

**Returns:** `int`

The default is 96.

### `getImageDimensions()`

**Returns:** `ro.sync.exml.view.graphics.Dimension`

Some image handlers (for example an SVG or a MathML image handler) might use this information to scale images without losing accuracy.
 If the handler does not use this information, the image is automatically scaled by the application to the display dimensions.

