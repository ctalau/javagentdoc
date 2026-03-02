# Class: `DITARelTableDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.DITARelTableDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`](../../../commons/AbstractDocumentTypeHelper.md)

**Implements:** [`ro.sync.ecss.extensions.dita.map.table.ReltableConstants`](./ReltableConstants.md)

## Description

## Constructors

### `<init>()`

## Methods

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `isTable(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `checkTableColSpanIsDefined(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSpanSupport, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableSpanSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md))
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `updateTableColSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int startCol, int endCol)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md))
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `startCol` (`int`)
- `endCol` (`int`)

**Returns:** `void`

### `getTableCellSpanProvider(ro.sync.ecss.extensions.api.node.AuthorElement tgroupElement)`

**Parameters:**
- `tgroupElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `updateTableRowSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int rowSpan)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `rowSpan` (`int`)

**Returns:** `void`

### `updateTableColumnNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int colsNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `colsNumber` (`int`)

**Returns:** `void`

### `updateTableRowNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int rowsNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `rowsNumber` (`int`)

**Returns:** `void`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

