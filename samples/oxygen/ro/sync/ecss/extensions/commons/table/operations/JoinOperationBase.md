# Class: `JoinOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.JoinOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

## Fields

### `CURSOR_OUTSIDE_THE_TABLE_ERROR_MESSAGE`

**Type:** `java.lang.String`

### `SELECT_AT_LEAST_TWO_ADJACENT_CELLS_ERROR_MESSAGE`

**Type:** `java.lang.String`

### `RECTANGULAR_SELECTIONS_ERROR_MESSAGE`

**Type:** `java.lang.String`

### `ROW_COL_SEPARATOR`

**Type:** `java.lang.String`

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `joinCells([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cellElements)`

**Returns:** `void`

### `populateJoinGroupStartingFrom(`ro.sync.ecss.extensions.commons.table.operations.JoinOperationBase.JoinGroupInformation` groupInformation, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) authorNode, `java.lang.String` cellRepresentation, `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AuthorNode>` mapCellToNode)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `generateColumnSpecifications([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableCellSpanProvider, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

