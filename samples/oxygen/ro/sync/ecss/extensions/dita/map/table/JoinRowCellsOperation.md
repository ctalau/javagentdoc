# Class: `JoinRowCellsOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.JoinRowCellsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.JoinRowCellsOperationBase`](../../../commons/table/operations/JoinRowCellsOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.dita.map.table.ReltableConstants`](./ReltableConstants.md)

## Description

If there is a selection, the cell at selection start offset determines 
 the destination cell where the content of the next cells will be moved.

## Constructors

### `<init>()`

## Methods

### `generateColumnSpecifications(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableSpanSupport, AuthorElement tableElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableSpanSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

