# Class: `DITASimpleTableDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.simpletable.DITASimpleTableDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`](../../../../commons/AbstractDocumentTypeHelper.md)

**Implements:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.SimpleTableConstants`](./SimpleTableConstants.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `isTableCell([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `isTableRow([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `isTable([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `checkTableColSpanIsDefined([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSpanSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `void`

### `updateTableColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElem, `int` startCol, `int` endCol)`

**Returns:** `void`

### `getTableCellSpanProvider([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tgroupElement)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md)

### `updateTableRowSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElem, `int` rowSpan)`

**Returns:** `void`

### `updateTableColumnNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` colsNumber)`

**Returns:** `void`

### `updateTableRowNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` rowsNumber)`

**Returns:** `void`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `isContentReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

