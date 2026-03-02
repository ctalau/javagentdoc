# Class: `InsertRowOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.simpletable.InsertRowOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](../../../../commons/table/operations/InsertRowOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.SimpleTableConstants`](./SimpleTableConstants.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableCellsContentConstants`](../../../../commons/table/operations/InsertTableCellsContentConstants.md)

## Description

## Fields

### `cellContent`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `doOperationInternal(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getCellElementName(AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `java.lang.String`

### `getRowElementName(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

**Returns:** `java.lang.String`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `getOperationArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

