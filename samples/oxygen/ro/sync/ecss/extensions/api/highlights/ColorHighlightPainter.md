# Class: `ColorHighlightPainter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.ColorHighlightPainter`

**Implements:** [`ro.sync.ecss.extensions.api.highlights.TextForegroundHighlighterPainter`](./TextForegroundHighlighterPainter.md), [`ro.sync.ecss.extensions.api.highlights.PrioritizableHighlightPainter`](./PrioritizableHighlightPainter.md)

## Fields

### `color`

**Type:** `ro.sync.exml.view.graphics.Color`

### `height`

**Type:** `int`

### `totalHeight`

**Type:** `int`

### `decoration`

**Type:** `ro.sync.ecss.extensions.api.highlights.ColorHighlightPainter.TextDecoration`

### `textDecorationStroke`

**Type:** `int`

### `bgColor`

**Type:** `ro.sync.exml.view.graphics.Color`

### `foregroundColor`

**Type:** `ro.sync.exml.view.graphics.Color`

### `useParentLineBoxHeight`

**Type:** `boolean`

## Constructors

### `<init>()`

### `<init>(ro.sync.exml.view.graphics.Color arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)
- `arg1` (`int`)
- `arg2` (`int`)

## Methods

### `getZLayer()`

**Returns:** `ro.sync.ecss.extensions.api.highlights.PrioritizableHighlightPainter.ZLayer`

### `paint(ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo`](./HighlightPainterInfo.md))

### `getHighlightLength(ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo`](./HighlightPainterInfo.md))

### `setColor(ro.sync.exml.view.graphics.Color arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)

### `setTextDecoration(ro.sync.ecss.extensions.api.highlights.ColorHighlightPainter.TextDecoration arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.extensions.api.highlights.ColorHighlightPainter.TextDecoration`)

### `setBgColor(ro.sync.exml.view.graphics.Color arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)

### `setBgColor(ro.sync.exml.view.graphics.Color arg0, boolean arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)
- `arg1` (`boolean`)

### `useBaseLineForUnderline()`

**Returns:** `boolean`

### `setTextDecorationStroke(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setStrikeOut(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `getBgColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

### `getColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

### `setTextForegroundColor(ro.sync.exml.view.graphics.Color arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)

### `getTextForegroundColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

