# Class: `JoinRowCellsOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.JoinRowCellsOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

If there is a selection, the cell at selection start offset determines the destination
 cell where the content of the next cells will be moved. If there is no selection then
 it is assumed that the caret is between two table cells.

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `checkForSameRowSpan([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) destinationCell, `java.util.List` sourceCells)`

**Returns:** `void`

### `getCell([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` selectionOffset, `boolean` start)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

This is the last cell whose content will be moved in the destination cell.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellsBetweenOffsets([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) rowNode, `int` startOffset, `int` endOffset)`

**Returns:** `java.util.List`

### `updateColSpanForMergedCell([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableCellSpanProvider, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) destCellElement, `java.util.List` sourceCells)`

**Returns:** `void`

### `generateColumnSpecifications([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableCellSpanProvider, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

