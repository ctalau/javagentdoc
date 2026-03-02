# Class: `InsertRowOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.InsertRowOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](../InsertRowOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSConstants`](./CALSConstants.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableCellsContentConstants`](../InsertTableCellsContentConstants.md)

## Description

## Fields

### `cellContent`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper helper)`

**Parameters:**
- `helper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md)): Table helper

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `java.lang.String`

### `getRowElementName(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

**Returns:** `java.lang.String`

### `useCurrentRowTemplateOnInsert()`

**Returns:** `boolean`

### `getOperationArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

