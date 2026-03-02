# Class: `JoinRowCellsOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.JoinRowCellsOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

If there is a selection, the cell at selection start offset determines the destination
 cell where the content of the next cells will be moved. If there is no selection then
 it is assumed that the caret is between two table cells.

## Constructors

### `<init>(AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper with methods specific to a document type.

## Methods

### `doOperationInternal(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `checkForSameRowSpan(AuthorTableCellSpanProvider tableSupport, AuthorElement destinationCell, List sourceCells)`

**Parameters:**
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table support.
- `destinationCell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The destination cell.
- `sourceCells` (`java.util.List`): The list with source cells.

**Returns:** `void`

### `getCell(AuthorAccess authorAccess, int selectionOffset, boolean start)`

This is the last cell whose content will be moved in the destination cell.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `selectionOffset` (`int`): The selection end offset
- `start` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellsBetweenOffsets(AuthorElement rowNode, int startOffset, int endOffset)`

**Parameters:**
- `rowNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node representing the current row.
- `startOffset` (`int`): The start offset, 0 based and inclusive.
- `endOffset` (`int`): The end offset, 0 based and inclusive.

**Returns:** `java.util.List`

### `updateColSpanForMergedCell(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableCellSpanProvider, AuthorElement destCellElement, List sourceCells)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table cells span info provider.
- `destCellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The destination cell element.
- `sourceCells` (`java.util.List`): The list with the cells that will be joined.

**Returns:** `void`

### `generateColumnSpecifications(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableCellSpanProvider, AuthorElement tableElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access. 
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): Table cell span provider.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.

**Returns:** `void`

