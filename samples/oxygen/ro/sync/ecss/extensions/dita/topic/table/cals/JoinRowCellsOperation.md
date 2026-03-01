# Class: `JoinRowCellsOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.cals.JoinRowCellsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.cals.JoinRowCellsOperation`](../../../../commons/table/operations/cals/JoinRowCellsOperation.md)

## Description

If selection exists, the cell at selection start offset determines the destination cell where
 the content of the next cells will be moved. 
 If there is no selection, then the caret must be between
 two table cells. 
 The operation modifies the `namest` and `nameend`
 attributes of the destination cell.

## Constructors

### `<init>()`

