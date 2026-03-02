# Class: `DocbookAuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.DocbookAuthorTableOperationsHandler`

**Extends:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../api/table/operations/AuthorTableOperationsHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `insertCALSColumnOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.InsertColumnOperation`](../commons/table/operations/cals/InsertColumnOperation.md)

### `insertXHTMLColumnOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertColumnOperation`](../commons/table/operations/xhtml/InsertColumnOperation.md)

### `insertXHTMLRowOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertRowOperation`](../commons/table/operations/xhtml/InsertRowOperation.md)

### `insertCALSRowOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.InsertRowOperation`](../commons/table/operations/cals/InsertRowOperation.md)

### `insertTableOperation`

**Type:** [`ro.sync.ecss.extensions.docbook.table.InsertTableOperation`](table/InsertTableOperation.md)

### `deleteXHTMLColumnOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.DeleteColumnOperation`](../commons/table/operations/xhtml/DeleteColumnOperation.md)

### `deleteCALSColumnOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.DeleteColumnOperation`](../commons/table/operations/cals/DeleteColumnOperation.md)

### `deleteXHTMLRowOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.DeleteRowOperation`](../commons/table/operations/xhtml/DeleteRowOperation.md)

### `deleteCALSRowOperation`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.DeleteRowOperation`](../commons/table/operations/cals/DeleteRowOperation.md)

### `namespace`

**Type:** `java.lang.String`

## Constructors

### `<init>(String namespace)`

**Parameters:**
- `namespace` (`java.lang.String`): Docbook namespace.

## Methods

### `handleInsertColumn(AuthorTableInsertColumnArguments tablePasteColumnArgs)`

**Parameters:**
- `tablePasteColumnArgs` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../api/table/operations/AuthorTableInsertColumnArguments.md))

**Returns:** `boolean`

### `handleDeleteColumn(AuthorTableDeleteColumnArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../api/table/operations/AuthorTableDeleteColumnArguments.md))

**Returns:** `boolean`

### `handleDeleteRow(AuthorTableDeleteRowArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../api/table/operations/AuthorTableDeleteRowArguments.md))

**Returns:** `boolean`

### `handleDeleteRows(AuthorTableDeleteRowsArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../api/table/operations/AuthorTableDeleteRowsArguments.md))

**Returns:** `boolean`

### `handleDeleteRows(AuthorAccess authorAccess, List<ContentInterval> contentIntervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The Author access.
- `contentIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): List of content

**Returns:** `boolean`

### `containXhtmlTable(AuthorAccess authorAccess, List<ContentInterval> contentIntervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `contentIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The content intervals to check.

**Returns:** `boolean`

### `getTableElementContainingOffset(AuthorAccess access, int offset)`

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `offset` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

### `getColumnSpecification(AuthorAccess access, AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../api/table/operations/TableColumnSpecificationInformation.md)

### `handleRemoveInvalidColNamesFromTableCells(AuthorAccess authorAccess, AuthorElement tableElement, List<AuthorElement> cells)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)

**Returns:** `void`

### `handleAttributeChange(AuthorAccess authorAccess, AuthorElement currentElement, String attributeName, AttrValue newValue)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `attributeName` (`java.lang.String`)
- `newValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../api/node/AttrValue.md))

**Returns:** `boolean`

