# Class: `XHTMLAuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.XHTMLAuthorTableOperationsHandler`

**Extends:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../api/table/operations/AuthorTableOperationsHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `XHTML_NAMESPACE`

**Type:** `java.lang.String`

### `insertColumnOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertColumnOperation`](../commons/table/operations/xhtml/InsertColumnOperation.md)

### `insertRowOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertRowOperation`](../commons/table/operations/xhtml/InsertRowOperation.md)

### `insertTableOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertTableOperation`](../commons/table/operations/xhtml/InsertTableOperation.md)

### `deleteColumnOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.DeleteColumnOperation`](../commons/table/operations/xhtml/DeleteColumnOperation.md)

### `deleteRowOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.DeleteRowOperation`](../commons/table/operations/xhtml/DeleteRowOperation.md)

## Constructors

### `<init>()`

## Methods

### `handleInsertColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../api/table/operations/AuthorTableInsertColumnArguments.md) tablePasteColumnArgs)`

**Returns:** `boolean`

### `handleDeleteColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../api/table/operations/AuthorTableDeleteColumnArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRow([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../api/table/operations/AuthorTableDeleteRowArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../api/table/operations/AuthorTableDeleteRowsArguments.md) arguments)`

**Returns:** `boolean`

### `getTableElementContainingOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) access, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

