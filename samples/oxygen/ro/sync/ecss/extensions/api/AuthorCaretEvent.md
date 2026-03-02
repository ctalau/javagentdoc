# Class: `AuthorCaretEvent`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorCaretEvent`

## Description

## Fields

### `offset`

**Type:** `int`

### `node`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `selection`

**Type:** `java.util.List<int[]>`

If there is no selection the list contains a single entry with [caret offset, caret offset].

## Constructors

### `<init>(int offset, List<int[]> selectionIntervals, AuthorNode node)`

**Parameters:**
- `offset` (`int`): The absolute caret position inside the Author page.
- `selectionIntervals` (`java.util.List<int[]>`): The selection [start offset, end offset] intervals list. 
   If there is no selection the list contains a single entry with [caret offset, caret offset].
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node holding the caret offset.

## Methods

### `getOffset()`

**Returns:** `int`

### `getNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getSelectionStart()`

**Returns:** `int`

### `getSelectionEnd()`

**Returns:** `int`

### `getSelectionIntervals()`

If there is no selection the list contains a single [caret offset, caret offset] entry.

**Returns:** `java.util.List<int[]>`

### `toString()`

**Returns:** `java.lang.String`

