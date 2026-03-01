# Class: `InsertColumnOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.simpletable.InsertColumnOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertColumnOperationBase`](../../../../commons/table/operations/InsertColumnOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.SimpleTableConstants`](./SimpleTableConstants.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableCellsContentConstants`](../../../../commons/table/operations/InsertTableCellsContentConstants.md)

## Description

## Fields

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `cellContent`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../../commons/table/operations/AuthorTableHelper.md) documentTypeHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getCellElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) rowElement, `int` newColumnIndex)`

**Returns:** `java.lang.String`

### `getCellName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) rowElement, `java.lang.String[]` possibleValues, `int` newColumnIndex)`

**Returns:** `java.lang.String`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `updateColumnCellsSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElem, `int` newColumnIndex, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../../api/table/operations/TableColumnSpecificationInformation.md) columnSpecification, `java.lang.String` namespace, `int` noOfColumnsToBeInserted)`

**Returns:** `void`

