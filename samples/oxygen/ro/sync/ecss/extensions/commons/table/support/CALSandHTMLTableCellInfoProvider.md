# Class: `CALSandHTMLTableCellInfoProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.CALSandHTMLTableCellInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProviderBase`](../../../api/AuthorTableColumnWidthProviderBase.md)

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

## Description

## Fields

### `calsTableCellInfoProvider`

**Type:** [`ro.sync.ecss.extensions.commons.table.support.CALSTableCellInfoProvider`](./CALSTableCellInfoProvider.md)

### `htmlTableCellInfoProvider`

**Type:** [`ro.sync.ecss.extensions.commons.table.support.HTMLTableCellInfoProvider`](./HTMLTableCellInfoProvider.md)

## Constructors

### `<init>()`

## Methods

### `getColSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableNode)`

**Returns:** `void`

**Parameters:**
- `tableNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getDescription()`

**Returns:** `java.lang.String`

### `getCALSTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `getXHTMLTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `hasColumnSpecifications(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `boolean`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getCellWidth(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int colNumberStart, int colSpan)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `colNumberStart` (`int`)
- `colSpan` (`int`)

### `commitColumnWidthModifications(ro.sync.ecss.extensions.api.AuthorDocumentController authorDocumentController, ro.sync.ecss.extensions.api.WidthRepresentation[] colWidths, java.lang.String tableCellsTagName)`

**Returns:** `void`

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md))
- `colWidths` ([`ro.sync.ecss.extensions.api.WidthRepresentation[]`](../../../api/WidthRepresentation.md))
- `tableCellsTagName` (`java.lang.String`)

### `commitTableWidthModification(ro.sync.ecss.extensions.api.AuthorDocumentController authorDocumentController, int newTableWidth, java.lang.String tableCellsTagName)`

**Returns:** `void`

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md))
- `newTableWidth` (`int`)
- `tableCellsTagName` (`java.lang.String`)

### `getTableWidth(java.lang.String tableCellsTagName)`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

### `isTableAcceptingWidth(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

### `isTableAndColumnsResizable(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

### `isAcceptingFixedColumnWidths(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

### `isAcceptingPercentageColumnWidths(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

### `isAcceptingProportionalColumnWidths(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

### `getAllColspecWidthRepresentations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `isPreferPercentageColumnWidths(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

