# Class: `DeleteColumnOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.DeleteColumnOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

If there are selections 
 in the table, all the columns that intersect the selections are removed.
 If there is no selection in the table, the column at caret is deleted.

## Fields

### `tableElem`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `deletedColumnsIndices`

**Type:** `java.util.List<java.lang.Integer>`

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) documentTypeHelper)`

## Methods

### `performDeleteColumn([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` columnIntervals, `boolean` placeCaretInNextCell)`

**Returns:** `boolean`

The columns are detected in the following order:
 

   - from the given column intervals

   - from the selection

   - from the caret position

### `computeCommonCols(`java.util.List<java.lang.Integer>` commonCols, `int[]` colSpanIndices)`

**Returns:** `java.util.List<java.lang.Integer>`

### `updateColspec([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.Integer` deletedColumnIndex)`

**Returns:** `void`

### `updateAppliableColWidthsNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElem, `int` deletedColumnIndex)`

**Returns:** `void`

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

For this operation the caret must be inside a table cell.

### `updateTableColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) spanProvider, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, `int` colStartIndex, `int` colEndIndex)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `canDeleteColumn()`

**Returns:** `boolean`

