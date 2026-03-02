# Interface: `AuthorTableAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorTableAccess`

## Description

## Methods

### `getTableCellAbove(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableCellBelow(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableCellIndex(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** `int[]`

### `getTableCellAt(int row, int column, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `row` (`int`): The row, 0 based.
- `column` (`int`): The column, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableRow(int index, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `index` (`int`): The index of the row to find the element for, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getTableRowCount(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** `int`

### `getTableNumberOfColumns(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

**Returns:** `int`

### `getTableColSpanIndices(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** `int[]`

### `getTableRowSpanIndices(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

**Returns:** `int[]`

