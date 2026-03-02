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

**Returns:** `boolean`

**Parameters:**
- `tablePasteColumnArgs` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../../api/table/operations/AuthorTableInsertColumnArguments.md))

### `handleDeleteColumn(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments arguments)`

**Returns:** `boolean`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../../api/table/operations/AuthorTableDeleteColumnArguments.md))

### `handleDeleteRow(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments arguments)`

**Returns:** `boolean`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../../api/table/operations/AuthorTableDeleteRowArguments.md))

### `handleDeleteRows(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments arguments)`

**Returns:** `boolean`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../../api/table/operations/AuthorTableDeleteRowsArguments.md))

### `getTableElementContainingOffset(ro.sync.ecss.extensions.api.AuthorAccess access, int offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `offset` (`int`)

