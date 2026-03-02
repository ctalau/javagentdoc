# Interface: `AuthorSelectionAndCaretModel`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorSelectionModel`](./AuthorSelectionModel.md)

## Description

## Methods

### `getCaretOffset()`

**Returns:** `int`

### `moveTo(int offset)`

**Parameters:**
- `offset` (`int`): The new position of the caret.

**Returns:** `void`

### `moveTo(int offset, boolean select)`

**Parameters:**
- `offset` (`int`): new offset for the caret. The offset must be >= 1 and less
   than the document size; if not, it is silently ignored.
- `select` (`boolean`): if true, the current selection is extended to
   match the new caret offset.

**Returns:** `void`

