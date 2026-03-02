# Class: `InsertColumnOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.InsertColumnOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

## Fields

### `POSITION_ARGUMENT`

**Type:** `java.lang.String`

### `CUSTOM_COLUMN_INSERTION_ARGUMENT`

**Type:** `java.lang.String`

The value is `insertMultipleColumns`

### `INSERT_MULTIPLE_COLUMNS_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

### `POSITION_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper documentTypeHelper)`

**Parameters:**
- `documentTypeHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Document type helper, has methods specific to a 
   document type.

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `performInsertColumn(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, boolean cellsFragments, ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase insertRowOperation, ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase insertTableOperation)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The cells namespace.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content of the inserted cells.
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md)): The column specification data.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
   where originally cells.
- `insertRowOperation` ([`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md)): The insert row operation used to insert new rows when 
   there are fragments that cannot be inserted in the new column.
- `insertTableOperation` ([`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](./InsertTableOperationBase.md)): The insert table operation used to insert the column 
   wrapped in a new table when the insert offset is not inside a table.

**Returns:** `void`

### `performInsertColumns(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, java.lang.String insertPosition, boolean customColumnInsertion, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, boolean cellsFragments, ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase insertRowOperation, ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase insertTableOperation)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The cells namespace.
- `insertPosition` (`java.lang.String`): The relative position where the new column will be inserted.
- `customColumnInsertion` (`boolean`)
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content of the inserted cells.
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md)): The column specification data.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
   where originally cells.
- `insertRowOperation` ([`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md)): The insert row operation used to insert new rows when 
   there are fragments that cannot be inserted in the new column.
- `insertTableOperation` ([`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](./InsertTableOperationBase.md)): The insert table operation used to insert the column 
   wrapped in a new table when the insert offset is not inside a table.

**Returns:** `void`

### `insertColumns(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, java.lang.String namespace, java.lang.String insertPosition, int caretOffset, int noOfColumnsToBeInserted)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `namespace` (`java.lang.String`): The table elements namespace.
- `insertPosition` (`java.lang.String`): The insert position. One of AuthorConstants#POSITION_AFTER or
   AuthorConstants#POSITION_BEFORE constants.
- `caretOffset` (`int`): The caret offset.
- `noOfColumnsToBeInserted` (`int`): The number of columns to be inserted.

**Returns:** `void`

### `insertColumns(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, java.lang.String insertPosition, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, boolean cellsFragments, ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase insertRowOperation, int caretOffset, int noOfColumnsToBeInserted, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The table elements namespace.
- `insertPosition` (`java.lang.String`): The insert position. One of AuthorConstants#POSITION_AFTER or
   AuthorConstants#POSITION_BEFORE constants.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The fragments to be inserted in cells
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md)): Column specification information
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
   where originally cells.
- `insertRowOperation` ([`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md)): Insert row operation.
- `caretOffset` (`int`): The caret offset.
- `noOfColumnsToBeInserted` (`int`): The number of columns to be inserted.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.

**Returns:** `void`

### `updateColumnCellsSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement tableElem, int newColumnIndex, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, java.lang.String namespace, int noOfColumnsToBeInserted)`

A cell intersects the column to insert if its start column index is less than
 the new column index and the end column index of the cell is greater or equal
 than the new column `(startColSpan < newColumnIndex && endColSpan >= newColumnIndex)`.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table cell span provider.
- `tableElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `newColumnIndex` (`int`): The index of the column to insert.
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md)): The table column specification data.
- `namespace` (`java.lang.String`): The namespace to be used.
- `noOfColumnsToBeInserted` (`int`): The number of columns to be inserted.

**Returns:** `void`

### `insertNewColumnsCells(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int newColumnIndex, java.lang.String namespace, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragment, ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase insertRowOperation, int noOfColumnsToBeInserted, int initialNumberOfColumns)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `newColumnIndex` (`int`): The column index, 0 based.
- `namespace` (`java.lang.String`): The namespace to be used.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The source fragments from which the attributes and content
   must be copied.If there are more fragments than inserted cells, the contents 
   of the remaining fragments are inserted in the last cell.
- `cellsFragment` (`boolean`): `true` if the fragments represents cells.
- `insertRowOperation` ([`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md)): The insert row operation used to insert new rows when 
   there are fragments that cannot be inserted in the new column.
- `noOfColumnsToBeInserted` (`int`): The number of rows to be inserted.
- `initialNumberOfColumns` (`int`): The number of columns before insertion.

**Returns:** `void`

### `checkForCompatibility(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, int rowIndex)`

If there are fragments for which there is no corresponding new cell, an exception 
 is thrown.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The cell content fragments.
- `rowIndex` (`int`): The row number for each a fragment cannot be inserted.

**Returns:** `boolean`

### `findColumnIndex(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int offset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `offset` (`int`): The offset of the searched column.

**Returns:** `int`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement rowElement, int newColumnIndex)`

**Parameters:**
- `rowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The row element where the new cell will be inserted.
- `newColumnIndex` (`int`): The new column index. 0 based.

**Returns:** `java.lang.String`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `removeMultipleInsertionDescriptor(ro.sync.ecss.extensions.api.ArgumentDescriptor[] superArguments)`

**Parameters:**
- `superArguments` ([`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)): The input arguments list.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

