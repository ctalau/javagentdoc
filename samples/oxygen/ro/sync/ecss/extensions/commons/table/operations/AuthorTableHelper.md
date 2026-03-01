# Interface: `AuthorTableHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`

## Description

It contains methods that are specific to a document type and are used to obtain
 table and table cells related information.

## Fields

### `TYPE_CELL`

**Type:** `int`

### `TYPE_ROW`

**Type:** `int`

### `TYPE_TABLE`

**Type:** `int`

## Methods

### `isTableCell([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isTableRow([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isTable([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getTableCellSpanProvider([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `checkTableColSpanIsDefined([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableCellSpanProvider, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `void`

I.E. for DocBook the column span is defined by the 'colspec' element. 
 If it is missing then the column span is not defined.

### `updateTableColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableCellSpanProvider, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem, `int` startCol, `int` endCol)`

**Returns:** `void`

For example, for the DocBook CALS tables  the `namest` and `nameend` 
 attributes will be set according to the `startCol` and `endCol` supplied values.

### `updateTableRowSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem, `int` rowSpan)`

**Returns:** `void`

For example, for the DocBook CALS tables the `morerows` attribute 
 value will be updated.

### `updateTableColumnNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `int` colNum)`

**Returns:** `void`

For example, for the DocBook CALS tables the `cols` attribute 
 value will be updated.

### `updateTableRowNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `int` relativeValue)`

**Returns:** `void`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getTableElementForDeletion([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

OBS: For CALS tables we don't want to delete
 only the "tgroup", but the parent table element itself.

### `isColspec([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

