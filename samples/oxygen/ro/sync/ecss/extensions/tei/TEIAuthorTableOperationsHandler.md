# Class: `TEIAuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.tei`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.TEIAuthorTableOperationsHandler`

**Extends:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../api/table/operations/AuthorTableOperationsHandler.md)

## Description

## Fields

### `insertColumnOperation`

**Type:** [`ro.sync.ecss.extensions.tei.table.InsertColumnOperation`](table/InsertColumnOperation.md)

### `insertRowOperation`

**Type:** [`ro.sync.ecss.extensions.tei.table.InsertRowOperation`](table/InsertRowOperation.md)

### `insertTableOperation`

**Type:** [`ro.sync.ecss.extensions.tei.table.InsertTableOperation`](table/InsertTableOperation.md)

### `deleteColumnOperation`

**Type:** [`ro.sync.ecss.extensions.tei.table.DeleteColumnOperation`](table/DeleteColumnOperation.md)

### `deleteRowOperation`

**Type:** [`ro.sync.ecss.extensions.tei.table.DeleteRowOperation`](table/DeleteRowOperation.md)

### `logger`

**Type:** `org.slf4j.Logger`

### `namespace`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` namespace)`

## Methods

### `handleInsertColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../api/table/operations/AuthorTableInsertColumnArguments.md) tablePasteColumnsArgs)`

**Returns:** `boolean`

### `handleDeleteColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../api/table/operations/AuthorTableDeleteColumnArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRow([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../api/table/operations/AuthorTableDeleteRowArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../api/table/operations/AuthorTableDeleteRowsArguments.md) arguments)`

**Returns:** `boolean`

### `getTableElementContainingOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) access, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

