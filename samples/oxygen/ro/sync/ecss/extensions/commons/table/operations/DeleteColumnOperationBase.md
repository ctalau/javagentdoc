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

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper documentTypeHelper)`

**Parameters:**
- `documentTypeHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): The table helper specific to a document type. 
 An implementation of ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper.

## Methods

### `performDeleteColumn(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.api.ContentInterval> columnIntervals, boolean placeCaretInNextCell)`

**Returns:** `boolean`

The columns are detected in the following order:
 

   - from the given column intervals

   - from the selection

   - from the caret position

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The access to Author operations.
- `columnIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals of the column to be deleted.
 If `null`, the column at caret offset is deleted.
- `placeCaretInNextCell` (`boolean`): `true` to place caret in the next cell.

### `computeCommonCols(java.util.List<java.lang.Integer> commonCols, int[] colSpanIndices)`

**Returns:** `java.util.List<java.lang.Integer>`

**Parameters:**
- `commonCols` (`java.util.List<java.lang.Integer>`): the common columns computed until now.
- `colSpanIndices` (`int[]`)

### `updateColspec(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.Integer deletedColumnIndex)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `deletedColumnIndex` (`java.lang.Integer`): The index of the deleted column.

### `updateAppliableColWidthsNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElem, int deletedColumnIndex)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table access.
- `deletedColumnIndex` (`int`): The deleted column index.

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

For this operation the caret must be inside a table cell.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `updateTableColSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider spanProvider, ro.sync.ecss.extensions.api.node.AuthorElement cell, int colStartIndex, int colEndIndex)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `spanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table span provider.
 The object responsible for providing information 
 about the cell spanning.
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell.
- `colStartIndex` (`int`): The new column start index, 1 based.
- `colEndIndex` (`int`): The new column end index, 1 based.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `canDeleteColumn()`

**Returns:** `boolean`

