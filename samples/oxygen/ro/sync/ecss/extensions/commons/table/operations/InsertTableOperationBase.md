# Interface: `InsertTableOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`

## Description

## Methods

### `insertTable(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content of the inserted cells.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
   where originally cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The namespace.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): The table helper.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)): The details about table creation. If null, a dialog is 
   presented to let the user choose the details.

**Returns:** `void`

