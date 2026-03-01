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

### `<init>(`int` offset, `java.util.List<int[]>` selectionIntervals, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

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

**Returns:** `java.util.List<int[]>`

If there is no selection the list contains a single [caret offset, caret offset] entry.

### `toString()`

**Returns:** `java.lang.String`

