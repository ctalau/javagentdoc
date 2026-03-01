# Class: `XHTMLDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.xhtml.XHTMLDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`](../../../AbstractDocumentTypeHelper.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.XHTMLConstants`](./XHTMLConstants.md)

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

### `checkTableColSpanIsDefined([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSpanSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `void`

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `getTableCellSpanProvider([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md)

### `updateTableColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElement, `int` startCol, `int` endCol)`

**Returns:** `void`

### `updateTableRowSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElement, `int` rowSpan)`

**Returns:** `void`

### `updateTableColumnNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` colNum)`

**Returns:** `void`

### `updateTableRowNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` rowsNumber)`

**Returns:** `void`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

