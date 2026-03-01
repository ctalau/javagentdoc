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

### `handleInsertColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../../api/table/operations/AuthorTableInsertColumnArguments.md) tablePasteColumnArgs)`

**Returns:** `boolean`

### `handleDeleteColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../../api/table/operations/AuthorTableDeleteColumnArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRow([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../../api/table/operations/AuthorTableDeleteRowArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../../api/table/operations/AuthorTableDeleteRowsArguments.md) arguments)`

**Returns:** `boolean`

### `getTableElementContainingOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) access, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

