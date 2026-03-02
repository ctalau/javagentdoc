# Class: `RectangleHighlightPainter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.RectangleHighlightPainter`

**Implements:** [`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md), [`ro.sync.ecss.extensions.api.highlights.PrioritizableHighlightPainter`](./PrioritizableHighlightPainter.md)

## Description

## Fields

### `fillColor`

**Type:** `ro.sync.exml.view.graphics.Color`

## Constructors

### `<init>(ro.sync.exml.view.graphics.Color fillColor)`

**Parameters:**
- `fillColor` (`ro.sync.exml.view.graphics.Color`): The fill color.

## Methods

### `getZLayer()`

**Returns:** `ro.sync.ecss.extensions.api.highlights.PrioritizableHighlightPainter.ZLayer`

### `paint(ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo pi)`

**Returns:** `void`

**Parameters:**
- `pi` ([`ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo`](./HighlightPainterInfo.md))

### `paintHighlight(ro.sync.exml.view.graphics.Graphics g, int x, int y, int width, int height)`

**Returns:** `void`

**Parameters:**
- `g` (`ro.sync.exml.view.graphics.Graphics`): The graphics used for paint.
- `x` (`int`): The x coordinate.
- `y` (`int`): The y coordinate.
- `width` (`int`): The rectangle width.
- `height` (`int`): The rectangle height.

### `setFillColor(ro.sync.exml.view.graphics.Color fillColor)`

**Returns:** `void`

**Parameters:**
- `fillColor` (`ro.sync.exml.view.graphics.Color`): The fill color to set.

