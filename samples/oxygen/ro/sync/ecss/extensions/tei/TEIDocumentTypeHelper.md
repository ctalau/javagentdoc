# Class: `TEIDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.tei`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.TEIDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`](../commons/AbstractDocumentTypeHelper.md)

**Implements:** [`ro.sync.ecss.extensions.tei.table.TEIConstants`](table/TEIConstants.md)

## Description

## Fields

### `ROW_ELEMENT_NAMES`

**Type:** `java.lang.String[]`

### `CELL_ELEMENT_NAMES`

**Type:** `java.lang.String[]`

### `TABLE_ELEMENT_NAMES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>()`

## Methods

### `checkTableColSpanIsDefined(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableCellSpanProvider, AuthorElement cellElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md))
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))

**Returns:** `void`

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `getTableCellSpanProvider(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md)

### `updateTableColSpan(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableCellSpanProvider, AuthorElement cellElement, int startCol, int endCol)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md))
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `startCol` (`int`)
- `endCol` (`int`)

**Returns:** `void`

### `updateTableRowSpan(AuthorAccess authorAccess, AuthorElement cellElement, int rowSpan)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `rowSpan` (`int`)

**Returns:** `void`

### `updateTableColumnNumber(AuthorAccess authorAccess, AuthorElement tableElement, int colNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `colNumber` (`int`)

**Returns:** `void`

### `updateTableRowNumber(AuthorAccess authorAccess, AuthorElement tableElement, int relativeValue)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))
- `relativeValue` (`int`)

**Returns:** `void`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

