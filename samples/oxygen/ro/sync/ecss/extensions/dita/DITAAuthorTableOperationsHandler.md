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

### `handleInsertColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](../api/table/operations/AuthorTableInsertColumnArguments.md) tablePasteColumnArgs)`

**Returns:** `boolean`

### `handleDeleteColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](../api/table/operations/AuthorTableDeleteColumnArguments.md) arguments)`

**Returns:** `boolean`

### `isSimpleTable([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `int` tableOffset)`

**Returns:** `boolean`

### `handleDeleteRow([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](../api/table/operations/AuthorTableDeleteRowArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](../api/table/operations/AuthorTableDeleteRowsArguments.md) arguments)`

**Returns:** `boolean`

### `handleDeleteRows([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` contentIntervals)`

**Returns:** `boolean`

### `getTableElementContainingOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) access, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

### `getColumnSpecification([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) tableElement, `int` columnIndex)`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../api/table/operations/TableColumnSpecificationInformation.md)

### `handleRemoveInvalidColNamesFromTableCells([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) tableElement, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cells)`

**Returns:** `void`

### `handleAttributeChange([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) currentElement, `java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](../api/node/AttrValue.md) newValue)`

**Returns:** `boolean`

### `handlePasteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertRowArguments`](../api/table/operations/AuthorTableInsertRowArguments.md) arguments)`

**Returns:** `boolean`

### `handleCreateTable([`ro.sync.ecss.extensions.api.table.operations.AuthorTableArguments`](../api/table/operations/AuthorTableArguments.md) arguments)`

**Returns:** `boolean`

