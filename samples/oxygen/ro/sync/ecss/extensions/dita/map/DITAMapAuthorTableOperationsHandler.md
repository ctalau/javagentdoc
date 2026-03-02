# Class: `DITAMapAuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.dita.map`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.DITAMapAuthorTableOperationsHandler`

**Extends:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../../api/table/operations/AuthorTableOperationsHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `insertColumnOperation`

**Type:** [`ro.sync.ecss.extensions.dita.map.table.InsertColumnOperation`](table/InsertColumnOperation.md)

### `insertRowOperation`

**Type:** [`ro.sync.ecss.extensions.dita.map.table.InsertRowOperation`](table/InsertRowOperation.md)

### `deleteColumnOperation`

**Type:** [`ro.sync.ecss.extensions.dita.map.table.DeleteColumnOperation`](table/DeleteColumnOperation.md)

### `insertTableOperation`

**Type:** [`ro.sync.ecss.extensions.dita.map.table.InsertTableOperation`](table/InsertTableOperation.md)

### `deleteRowOperation`

**Type:** [`ro.sync.ecss.extensions.dita.map.table.DeleteRowOperation`](table/DeleteRowOperation.md)

## Constructors

### `<init>()`

## Methods

### `handleInsertColumn(ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments tablePasteColumnArgs)`

**Parameters:**
- `tablePasteColumnArgs` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../../api/table/operations/AuthorTableInsertColumnArguments.md))

**Returns:** `boolean`

### `handleDeleteColumn(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../../api/table/operations/AuthorTableDeleteColumnArguments.md))

**Returns:** `boolean`

### `handleDeleteRow(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../../api/table/operations/AuthorTableDeleteRowArguments.md))

**Returns:** `boolean`

### `handleDeleteRows(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../../api/table/operations/AuthorTableDeleteRowsArguments.md))

**Returns:** `boolean`

### `getTableElementContainingOffset(ro.sync.ecss.extensions.api.AuthorAccess access, int offset)`

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `offset` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

