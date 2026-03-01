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

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) documentTypeHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `performInsertColumn([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md) columnSpecification, `boolean` cellsFragments, [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md) insertRowOperation, [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](./InsertTableOperationBase.md) insertTableOperation)`

**Returns:** `void`

### `performInsertColumns([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, `java.lang.String` insertPosition, `boolean` customColumnInsertion, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md) columnSpecification, `boolean` cellsFragments, [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md) insertRowOperation, [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](./InsertTableOperationBase.md) insertTableOperation)`

**Returns:** `void`

### `insertColumns([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `java.lang.String` namespace, `java.lang.String` insertPosition, `int` caretOffset, `int` noOfColumnsToBeInserted)`

**Returns:** `void`

### `insertColumns([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, `java.lang.String` insertPosition, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md) columnSpecification, `boolean` cellsFragments, [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md) insertRowOperation, `int` caretOffset, `int` noOfColumnsToBeInserted, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

### `updateColumnCellsSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElem, `int` newColumnIndex, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../api/table/operations/TableColumnSpecificationInformation.md) columnSpecification, `java.lang.String` namespace, `int` noOfColumnsToBeInserted)`

**Returns:** `void`

A cell intersects the column to insert if its start column index is less than
 the new column index and the end column index of the cell is greater or equal
 than the new column `(startColSpan < newColumnIndex && endColSpan >= newColumnIndex)`.

### `insertNewColumnsCells([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `int` newColumnIndex, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragment, [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md) insertRowOperation, `int` noOfColumnsToBeInserted, `int` initialNumberOfColumns)`

**Returns:** `void`

### `checkForCompatibility([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `int` rowIndex)`

**Returns:** `boolean`

If there are fragments for which there is no corresponding new cell, an exception 
 is thrown.

### `findColumnIndex([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` offset)`

**Returns:** `int`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) rowElement, `int` newColumnIndex)`

**Returns:** `java.lang.String`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `removeMultipleInsertionDescriptor([`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md) superArguments)`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

