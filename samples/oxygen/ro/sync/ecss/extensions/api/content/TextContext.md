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

**Returns:** `int`

The start offset is absolute in the Author Document's content.

### `getTextEndOffset()`

**Returns:** `int`

The end offset is absolute in the Author Document's content.

### `getEditableState()`

**Returns:** `int`

### `inVisibleContent()`

**Returns:** `boolean`

### `inSpacePreserve()`

**Returns:** `boolean`

### `replaceText(`java.lang.CharSequence` newTextContent)`

**Returns:** `void`

