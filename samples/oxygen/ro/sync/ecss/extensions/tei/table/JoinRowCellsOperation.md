# Class: `JoinRowCellsOperation`

**Package:** [`ro.sync.ecss.extensions.tei.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.table.JoinRowCellsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.JoinRowCellsOperationBase`](../../commons/table/operations/JoinRowCellsOperationBase.md)

## Description

If there is a selection, the cell at selection start offset determines 
 the destination cell where the content of the next cells will be moved. 
 If there is no selection then the caret must be positioned between 
 two table cells before calling this operation.

## Constructors

### `<init>()`

## Methods

### `generateColumnSpecifications([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../api/AuthorTableCellSpanProvider.md) tableSpanSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

