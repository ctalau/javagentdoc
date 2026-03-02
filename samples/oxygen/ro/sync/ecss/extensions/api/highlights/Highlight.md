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

### `getAdditionalData(java.lang.String key)`

**Returns:** `java.lang.Object`

**Parameters:**
- `key` (`java.lang.String`): the key for which the additional data is to be retrieved.
 The key Highlight#HOVER_ACTIONS_PROVIDER_ADDITIONAL_DATA can be used in order to get
 the HighlightActionsProvider object, providing a set of actions and some rendering information.
 This can be used to display a widget when hovering over the highlight, from which the provided actions can be performed.

### `setAdditionalData(java.lang.String key, java.lang.Object additionalData)`

**Returns:** `void`

**Parameters:**
- `key` (`java.lang.String`): The key for which the additional data is set.

 The key Highlight#HOVER_ACTIONS_PROVIDER_ADDITIONAL_DATA can be used in order to set
 an actions provider for the highlight, containing a set of actions, as well as some information about their rendering. 
 The goal is to display a widget when hovering over the highlight, from which the provided actions can be performed.
- `additionalData` (`java.lang.Object`): The additional data to set.

 For the Highlight#HOVER_ACTIONS_PROVIDER_ADDITIONAL_DATA key,
 the value must be a HighlightActionsProvider.

### `getPainter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md)

### `getId()`

**Returns:** `java.lang.String`

