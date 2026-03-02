# Class: `InsertColumnOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.InsertColumnOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertColumnOperationBase`](../InsertColumnOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSConstants`](./CALSConstants.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableCellsContentConstants`](../InsertTableCellsContentConstants.md)

## Description

## Fields

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `cellContent`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md)): The table helper

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md))

**Returns:** `void`

### `updateColumnCellsSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement tgroup, int newColumnIndex, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, java.lang.String namespace, int noOfColumnsToBeInserted)`

For CALS tables the column specifications must be updated.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `tgroup` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `newColumnIndex` (`int`)
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../../api/table/operations/TableColumnSpecificationInformation.md))
- `namespace` (`java.lang.String`)
- `noOfColumnsToBeInserted` (`int`)

**Returns:** `void`

### `getDefaultColWidthValue()`

Can be overwritten by an implementor.

**Returns:** `java.lang.String`

### `getUniqueColSpecName(java.util.Set<java.lang.String> colSpecNames, int colSpecIndex)`

**Parameters:**
- `colSpecNames` (`java.util.Set<java.lang.String>`): The set of column specification names.
- `colSpecIndex` (`int`): The index of the column specification, 1 based.

**Returns:** `java.lang.String`

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement row, int newColumnIndex)`

**Parameters:**
- `row` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `newColumnIndex` (`int`)

**Returns:** `java.lang.String`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

