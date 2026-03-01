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

### `<init>(`ro.sync.exml.view.graphics.Graphics` g, `int` currentBoxHeight, `ro.sync.exml.view.graphics.Point` origin, `int` relativeX, `int` textYPadding, `int` length, `int` startOffset, `int` endOffset, `int` baseLine, `int` fontAscent, `int` fontSize, `ro.sync.exml.view.graphics.Point` parentLineBoxOrigin, `int` parentLineBoxWidth, `int` parentLineBoxHeight, `int` viewEndOffset)`

## Methods

### `setHighlightOverText(`boolean` isHighlightOverText)`

**Returns:** `void`

### `getGraphics()`

**Returns:** `ro.sync.exml.view.graphics.Graphics`

### `getCurrentBoxHeight()`

**Returns:** `int`

Usually the highlight should expand 
 as high as the containing box.

### `getOrigin()`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `getRelativeX()`

**Returns:** `int`

### `getTextYPadding()`

**Returns:** `int`

### `getLength()`

**Returns:** `int`

### `setLength(`int` length)`

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

### `setHighlightOverImage(`boolean` isHighlightOverImage)`

**Returns:** `void`

### `isHighlightOverImage()`

**Returns:** `boolean`

### `setHighlightOverFormControls(`boolean` isHighlightOverFormControl)`

**Returns:** `void`

### `isHighlightOverFormControl()`

**Returns:** `boolean`

### `getViewEndOffset()`

**Returns:** `int`

