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

### `<init>(`java.lang.String` namespace)`

## Methods

### `handleInsertColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../api/table/operations/AuthorTableInsertColumnArguments.md) tablePasteColumnArgs)`

**Returns:** `boolean`

### `handleDeleteColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../api/table/operations/AuthorTableDeleteColumnArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRow([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../api/table/operations/AuthorTableDeleteRowArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../api/table/operations/AuthorTableDeleteRowsArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` contentIntervals)`

**Returns:** `boolean`

### `containXhtmlTable([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` contentIntervals)`

**Returns:** `boolean`

### `getTableElementContainingOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) access, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

### `getColumnSpecification([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) access, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) tableElement, `int` columnIndex)`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../api/table/operations/TableColumnSpecificationInformation.md)

### `handleRemoveInvalidColNamesFromTableCells([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) tableElement, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cells)`

**Returns:** `void`

### `handleAttributeChange([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) currentElement, `java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](../api/node/AttrValue.md) newValue)`

**Returns:** `boolean`

