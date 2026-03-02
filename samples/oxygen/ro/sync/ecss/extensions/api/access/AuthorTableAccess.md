# Interface: `AuthorTableAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorTableAccess`

## Description

## Methods

### `getTableCellAbove(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

### `getTableCellBelow(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

### `getTableCellIndex(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `int[]`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

### `getTableCellAt(int row, int column, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

**Parameters:**
- `row` (`int`): The row, 0 based.
- `column` (`int`): The column, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

### `getTableRow(int index, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

**Parameters:**
- `index` (`int`): The index of the row to find the element for, 0 based.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

### `getTableRowCount(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `int`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

### `getTableNumberOfColumns(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `int`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table element.

### `getTableColSpanIndices(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `int[]`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

### `getTableRowSpanIndices(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `int[]`

The indices are 0 based.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The table cell element.

