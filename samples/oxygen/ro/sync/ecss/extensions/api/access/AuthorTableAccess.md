# Interface: `AuthorTableAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorTableAccess`

## Description

## Methods

### `getTableCellAbove(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableCellBelow(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableCellIndex(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** `int[]`

### `getTableCellAt(int row, int column, AuthorElement tableElement)`

**Parameters:**
- `row` (`int`): The row, 0 based.
- `column` (`int`): The column, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableRow(int index, AuthorElement tableElement)`

**Parameters:**
- `index` (`int`): The index of the row to find the element for, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableRowCount(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** `int`

### `getTableNumberOfColumns(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** `int`

### `getTableColSpanIndices(AuthorElement cellElement)`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** `int[]`

### `getTableRowSpanIndices(AuthorElement cellElement)`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** `int[]`

