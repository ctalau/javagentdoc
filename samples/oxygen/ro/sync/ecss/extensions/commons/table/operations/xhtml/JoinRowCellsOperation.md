# Class: `JoinRowCellsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.xhtml.JoinRowCellsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.JoinRowCellsOperationBase`](../JoinRowCellsOperationBase.md)

## Description

If selection exists, the cell at start selection offset determines the destination cell where
 the content of the next cells will be moved. 
 If there is no selection then the caret must be between two table cells.

## Constructors

### `<init>()`

## Methods

### `generateColumnSpecifications(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSpanSupport, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableSpanSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

