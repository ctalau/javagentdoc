# Class: `DITAAuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAAuthorTableOperationsHandler`

**Extends:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../api/table/operations/AuthorTableOperationsHandler.md)

## Description

## Fields

### `insertRowSimpleTable`

**Type:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.InsertRowOperation`](topic/table/simpletable/InsertRowOperation.md)

### `insertColumnSimpleTable`

**Type:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.InsertColumnOperation`](topic/table/simpletable/InsertColumnOperation.md)

### `insertRowCALSTable`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.InsertRowOperation`](../commons/table/operations/cals/InsertRowOperation.md)

### `insertColumnCALSTable`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.InsertColumnOperation`](../commons/table/operations/cals/InsertColumnOperation.md)

### `deleteColumnSimpleTable`

**Type:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.DeleteColumnOperation`](topic/table/simpletable/DeleteColumnOperation.md)

### `deleteColumnCALSTable`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.DeleteColumnOperation`](../commons/table/operations/cals/DeleteColumnOperation.md)

### `deleteRowSimpleTable`

**Type:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.DeleteRowOperation`](topic/table/simpletable/DeleteRowOperation.md)

### `deleteRowCALSTable`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.cals.DeleteRowOperation`](../commons/table/operations/cals/DeleteRowOperation.md)

### `insertTableOperation`

**Type:** [`ro.sync.ecss.extensions.dita.topic.table.InsertTableOperation`](topic/table/InsertTableOperation.md)

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `handleInsertColumn(AuthorTableInsertColumnArguments tablePasteColumnArgs)`

**Parameters:**
- `tablePasteColumnArgs` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../api/table/operations/AuthorTableInsertColumnArguments.md))

**Returns:** `boolean`

### `handleDeleteColumn(AuthorTableDeleteColumnArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../api/table/operations/AuthorTableDeleteColumnArguments.md))

**Returns:** `boolean`

### `isSimpleTable(AuthorAccess authorAccess, int tableOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `tableOffset` (`int`): The table offset.

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
- `contentIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The content intervals determining the rows to be deleted (all the 
   rows intersecting the content intervals are deleted)

**Returns:** `boolean`

### `getTableElementContainingOffset(AuthorAccess access, int offset)`

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `offset` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

### `getColumnSpecification(AuthorAccess authorAccess, AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
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

### `handlePasteRows(AuthorTableInsertRowArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertRowArguments`](../api/table/operations/AuthorTableInsertRowArguments.md))

**Returns:** `boolean`

### `handleCreateTable(AuthorTableArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableArguments`](../api/table/operations/AuthorTableArguments.md))

**Returns:** `boolean`

