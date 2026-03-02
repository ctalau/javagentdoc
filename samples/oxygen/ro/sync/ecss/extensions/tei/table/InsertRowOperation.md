# Class: `InsertRowOperation`

**Package:** [`ro.sync.ecss.extensions.tei.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.table.InsertRowOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](../../commons/table/operations/InsertRowOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.tei.table.TEIConstants`](./TEIConstants.md)

## Description

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): Table helper.

## Methods

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `java.lang.String`

### `getRowElementName(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `java.lang.String`

### `useCurrentRowTemplateOnInsert()`

**Returns:** `boolean`

