# Interface: `Highlight`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.Highlight`

## Description

## Fields

### `HOVER_ACTIONS_PROVIDER_ADDITIONAL_DATA`

**Type:** `java.lang.String`

The value should be a HighlightActionsProvider

## Methods

### `getStartOffset()`

**Returns:** `int`

### `getEndOffset()`

**Returns:** `int`

**Note:** empty highlights have `startOffset == endOffset + 1`

### `isEmpty()`

**Returns:** `boolean`

### `getAdditionalData()`

**Returns:** `java.lang.Object`

### `getAdditionalData(`java.lang.String` key)`

**Returns:** `java.lang.Object`

### `setAdditionalData(`java.lang.String` key, `java.lang.Object` additionalData)`

**Returns:** `void`

### `getPainter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md)

### `getId()`

**Returns:** `java.lang.String`

