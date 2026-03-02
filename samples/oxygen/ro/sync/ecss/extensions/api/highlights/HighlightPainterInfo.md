# Class: `HighlightPainterInfo`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.HighlightPainterInfo`

## Description

## Fields

### `g`

**Type:** `ro.sync.exml.view.graphics.Graphics`

### `currentBoxHeight`

**Type:** `int`

Usually the highlight should expand 
 as high as the containing box.

### `origin`

**Type:** `ro.sync.exml.view.graphics.Point`

### `relativeX`

**Type:** `int`

### `length`

**Type:** `int`

### `startOffset`

**Type:** `int`

### `endOffset`

**Type:** `int`

### `baseLine`

**Type:** `int`

### `fontAscent`

**Type:** `int`

### `fontSize`

**Type:** `int`

### `isHighlightOverText`

**Type:** `boolean`

### `parentLineBoxHeight`

**Type:** `int`

Can be -1 if no parent line box.

### `parentLineBoxWidth`

**Type:** `int`

Can be -1 if no parent line box.

### `parentLineBoxOrigin`

**Type:** `ro.sync.exml.view.graphics.Point`

Can be null if no parent line box.

### `isHighlightOverImage`

**Type:** `boolean`

### `textYPadding`

**Type:** `int`

### `isHighlightOverFormControl`

**Type:** `boolean`

### `viewEndOffset`

**Type:** `int`

## Constructors

### `<init>(Graphics g, int currentBoxHeight, Point origin, int relativeX, int textYPadding, int length, int startOffset, int endOffset, int baseLine, int fontAscent, int fontSize, Point parentLineBoxOrigin, int parentLineBoxWidth, int parentLineBoxHeight, int viewEndOffset)`

**Parameters:**
- `g` (`ro.sync.exml.view.graphics.Graphics`): The graphics
- `currentBoxHeight` (`int`): The current box height.
- `origin` (`ro.sync.exml.view.graphics.Point`): Origin (upper left corner of the box in absolute coordinates)
- `relativeX` (`int`): The x relative to the origin where the highlight must start.
- `textYPadding` (`int`): The relative Y position from box Y used to paint the box.
- `length` (`int`): The length of the highlight, in pixels.
- `startOffset` (`int`): Start offset of highlight
- `endOffset` (`int`): End offset of highlight
- `baseLine` (`int`): The base line relative to the box start
- `fontAscent` (`int`): The font ascent
- `fontSize` (`int`): The font size
- `parentLineBoxOrigin` (`ro.sync.exml.view.graphics.Point`): The origin of the parent line box. Can be null.
- `parentLineBoxWidth` (`int`): The width of the parent line box. Can be -1.
- `parentLineBoxHeight` (`int`): The height of the parent line box. Can be -1.
- `viewEndOffset` (`int`): The end offset of the current view over which the highight is being painted.

## Methods

### `setHighlightOverText(boolean isHighlightOverText)`

**Parameters:**
- `isHighlightOverText` (`boolean`): The isHighlightOverText to set.

**Returns:** `void`

### `getGraphics()`

**Returns:** `ro.sync.exml.view.graphics.Graphics`

### `getCurrentBoxHeight()`

Usually the highlight should expand 
 as high as the containing box.

**Returns:** `int`

### `getOrigin()`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `getRelativeX()`

**Returns:** `int`

### `getTextYPadding()`

**Returns:** `int`

### `getLength()`

**Returns:** `int`

### `setLength(int length)`

**Parameters:**
- `length` (`int`): the new value.

**Returns:** `void`

### `getStartOffset()`

**Returns:** `int`

### `getEndOffset()`

**Returns:** `int`

### `getBaseLine()`

**Returns:** `int`

### `getFontAscent()`

**Returns:** `int`

### `getFontSize()`

**Returns:** `int`

### `isHighlightOverText()`

**Returns:** `boolean`

### `getParentLineBoxHight()`

**Returns:** `int`

### `getParentLineBoxWidth()`

**Returns:** `int`

### `getParentLineBoxOrigin()`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `setHighlightOverImage(boolean isHighlightOverImage)`

**Parameters:**
- `isHighlightOverImage` (`boolean`): `true` if the highlight is over an image

**Returns:** `void`

### `isHighlightOverImage()`

**Returns:** `boolean`

### `setHighlightOverFormControls(boolean isHighlightOverFormControl)`

**Parameters:**
- `isHighlightOverFormControl` (`boolean`): `true` if we have a highlight over form controls.

**Returns:** `void`

### `isHighlightOverFormControl()`

**Returns:** `boolean`

### `getViewEndOffset()`

**Returns:** `int`

