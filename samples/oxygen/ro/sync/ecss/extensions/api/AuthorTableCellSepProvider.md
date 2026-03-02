# Interface: `AuthorTableCellSepProvider`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Methods

### `getColSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

**Returns:** `boolean`

Note that if the cell is the last from its row, the separator is not painted even if this
 method returns `true`.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The node that represents a table cell in CSS.
- `columnIndex` (`int`): The index of the column, used to identify the colspec associated 
 to the cell. The colspec can give information about the colsep. 1 based.

### `getRowSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

**Returns:** `boolean`

Note that if the cell is on the last row, the separator is not painted 
 even if this method returns `true`.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The node that represents a table cell in CSS.
- `columnIndex` (`int`): The index of the column, used to identify the rowspec associated 
 to the cell. The rowspec can give information about the colsep. 1 based.

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `void`

Its intended
 to extract information from the element representing the table only once, not on every 
 getColSep() or getRowSep() call. Example: for a CALS table we identify and cache
 the `colsep` and `rowsep` elements from that table.
 
 A new instance of the table cell span provider is used for every table in a document so 
 cached data cannot be used between different tables..

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement representing a table (it has the CSS display property 
 set on 'table').

