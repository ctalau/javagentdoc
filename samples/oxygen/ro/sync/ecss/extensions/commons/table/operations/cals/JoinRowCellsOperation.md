# Class: `JoinRowCellsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.JoinRowCellsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.JoinRowCellsOperationBase`](../JoinRowCellsOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSConstants`](./CALSConstants.md)

## Description

If selection exists, the cell at selection start offset determines the destination cell where
 the content of the next cells will be moved. 
 If there is no selection, then the caret must be between
 two table cells. 
 The operation modifies the `namest` and `nameend`
 attributes of the destination cell.

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) tableHelper)`

### `<init>()`

## Methods

### `generateColumnSpecifications([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSpanSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

