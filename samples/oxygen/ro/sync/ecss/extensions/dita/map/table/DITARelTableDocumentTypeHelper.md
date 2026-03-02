# Class: `DITARelTableDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.DITARelTableDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`](../../../commons/AbstractDocumentTypeHelper.md)

**Implements:** [`ro.sync.ecss.extensions.dita.map.table.ReltableConstants`](./ReltableConstants.md)

## Description

## Constructors

### `<init>()`

## Methods

### `isTableCell(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `isTableRow(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `isTable(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `checkTableColSpanIsDefined(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableSpanSupport, AuthorElement cellElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableSpanSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md))
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `updateTableColSpan(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableSupport, AuthorElement cellElem, int startCol, int endCol)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md))
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `startCol` (`int`)
- `endCol` (`int`)

**Returns:** `void`

### `getTableCellSpanProvider(AuthorElement tgroupElement)`

**Parameters:**
- `tgroupElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `updateTableRowSpan(AuthorAccess authorAccess, AuthorElement cellElem, int rowSpan)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `rowSpan` (`int`)

**Returns:** `void`

### `updateTableColumnNumber(AuthorAccess authorAccess, AuthorElement tableElement, int colsNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `colsNumber` (`int`)

**Returns:** `void`

### `updateTableRowNumber(AuthorAccess authorAccess, AuthorElement tableElement, int rowsNumber)`

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

