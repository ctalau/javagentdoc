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

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper documentTypeHelper)`

**Parameters:**
- `documentTypeHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../../commons/table/operations/AuthorTableHelper.md)): Document type helper, has methods specific to a document type.

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement rowElement, int newColumnIndex)`

**Parameters:**
- `rowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `newColumnIndex` (`int`)

**Returns:** `java.lang.String`

### `getCellName(ro.sync.ecss.extensions.api.node.AuthorElement rowElement, java.lang.String[] possibleValues, int newColumnIndex)`

**Parameters:**
- `rowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The row element to insert the cell into.
- `possibleValues` (`java.lang.String[]`): The possible cell names.
- `newColumnIndex` (`int`): The index where the cell can be inserted.

**Returns:** `java.lang.String`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `updateColumnCellsSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement tableElem, int newColumnIndex, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, java.lang.String namespace, int noOfColumnsToBeInserted)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `tableElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `newColumnIndex` (`int`)
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../../api/table/operations/TableColumnSpecificationInformation.md))
- `namespace` (`java.lang.String`)
- `noOfColumnsToBeInserted` (`int`)

**Returns:** `void`

