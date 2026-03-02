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

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper with methods specific to a document type.

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `joinCells(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cellElements)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `cellElements` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The cells fragments.

**Returns:** `void`

### `populateJoinGroupStartingFrom(ro.sync.ecss.extensions.commons.table.operations.JoinOperationBase.JoinGroupInformation groupInformation, ro.sync.ecss.extensions.api.node.AuthorNode authorNode, java.lang.String cellRepresentation, java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AuthorNode> mapCellToNode)`

**Parameters:**
- `groupInformation` (`ro.sync.ecss.extensions.commons.table.operations.JoinOperationBase.JoinGroupInformation`): Information about group start and end row and column.
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The cell node.
- `cellRepresentation` (`java.lang.String`): Cell representation (like column_number-row_number)
- `mapCellToNode` (`java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AuthorNode>`): The map between cell representations and nodes

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `generateColumnSpecifications(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableCellSpanProvider, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access. 
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): Table cell span provider.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.

**Returns:** `void`

