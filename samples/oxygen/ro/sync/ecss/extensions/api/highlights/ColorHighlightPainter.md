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

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo`](./HighlightPainterInfo.md))

**Returns:** `void`

### `getHighlightLength(ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo`](./HighlightPainterInfo.md))

**Returns:** `int`

### `setColor(ro.sync.exml.view.graphics.Color arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)

**Returns:** `void`

### `setTextDecoration(ro.sync.ecss.extensions.api.highlights.ColorHighlightPainter.TextDecoration arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.extensions.api.highlights.ColorHighlightPainter.TextDecoration`)

**Returns:** `void`

### `setBgColor(ro.sync.exml.view.graphics.Color arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)

**Returns:** `void`

### `setBgColor(ro.sync.exml.view.graphics.Color arg0, boolean arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)
- `arg1` (`boolean`)

**Returns:** `void`

### `useBaseLineForUnderline()`

**Returns:** `boolean`

### `setTextDecorationStroke(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `setStrikeOut(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `getBgColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

### `getColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

### `setTextForegroundColor(ro.sync.exml.view.graphics.Color arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Color`)

**Returns:** `void`

### `getTextForegroundColor()`

**Returns:** `ro.sync.exml.view.graphics.Color`

