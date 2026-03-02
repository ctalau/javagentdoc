# Interface: `TextContext`

**Package:** [`ro.sync.ecss.extensions.api.content`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.content.TextContext`

## Description

## Fields

### `EDITABLE`

**Type:** `int`

### `EDITABLE_IN_FILTERED_CONDITIONAL_PROFILING`

**Type:** `int`

### `NOT_EDITABLE_IN_DELETE_CHANGE_TRACKING`

**Type:** `int`

### `NOT_EDITABLE_IN_READ_ONLY`

**Type:** `int`

## Methods

### `getNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)

### `getText()`

**Returns:** `java.lang.CharSequence`

### `getTextStartOffset()`

The start offset is absolute in the Author Document's content.

**Returns:** `int`

### `getTextEndOffset()`

The end offset is absolute in the Author Document's content.

**Returns:** `int`

### `getEditableState()`

**Returns:** `int`

### `inVisibleContent()`

**Returns:** `boolean`

### `inSpacePreserve()`

**Returns:** `boolean`

### `replaceText(CharSequence newTextContent)`

**Parameters:**
- `newTextContent` (`java.lang.CharSequence`): The new text content.

**Returns:** `void`

