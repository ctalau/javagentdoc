# Class: `DeleteRowOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.DeleteRowOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

If there is a selection in the table all the rows that intersect
 that selection are removed. If there is no selection in the table, the row at caret is deleted.

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) documentTypeHelper)`

## Methods

### `performDeleteRows([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` contentIntervals)`

**Returns:** `boolean`

The rows that must be deleted are determined in the following order:
 

 - by the list of content intervals if not `null`

 - all the rows that intersect the selection

 - the row at caret offset

### `performDeleteRows([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` startRowOffset, `int` endRowOffset)`

**Returns:** `boolean`

The row that must be deleted is determined in the following order:
 

 - by startRowOffset and endRowOffset if both are bigger than `0`

 - all the rows that intersect the selection

 - the row at caret offset

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

For this operation the caret must be inside a table cell.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `createSplitCellOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.SplitCellAboveBelowOperationBase`](./SplitCellAboveBelowOperationBase.md)

The operation is needed to split the cells that span over multiple rows and start on the row to be deleted.

