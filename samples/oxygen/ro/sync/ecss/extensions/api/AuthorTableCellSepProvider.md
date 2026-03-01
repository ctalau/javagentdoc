# Interface: `AuthorTableCellSepProvider`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Methods

### `getColSep([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) cellElement, `int` columnIndex)`

**Returns:** `boolean`

Note that if the cell is the last from its row, the separator is not painted even if this
 method returns `true`.

### `getRowSep([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) cellElement, `int` columnIndex)`

**Returns:** `boolean`

Note that if the cell is on the last row, the separator is not painted 
 even if this method returns `true`.

### `init([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) tableElement)`

**Returns:** `void`

Its intended
 to extract information from the element representing the table only once, not on every 
 getColSep() or getRowSep() call. Example: for a CALS table we identify and cache
 the `colsep` and `rowsep` elements from that table.
 
 A new instance of the table cell span provider is used for every table in a document so 
 cached data cannot be used between different tables..

