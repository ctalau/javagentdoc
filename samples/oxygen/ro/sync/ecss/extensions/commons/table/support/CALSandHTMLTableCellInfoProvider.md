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

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableNode)`

**Parameters:**
- `tableNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `getCALSTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `getXHTMLTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `hasColumnSpecifications(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getCellWidth(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int colNumberStart, int colSpan)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `colNumberStart` (`int`)
- `colSpan` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `commitColumnWidthModifications(ro.sync.ecss.extensions.api.AuthorDocumentController authorDocumentController, ro.sync.ecss.extensions.api.WidthRepresentation[] colWidths, java.lang.String tableCellsTagName)`

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md))
- `colWidths` ([`ro.sync.ecss.extensions.api.WidthRepresentation[]`](../../../api/WidthRepresentation.md))
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `void`

### `commitTableWidthModification(ro.sync.ecss.extensions.api.AuthorDocumentController authorDocumentController, int newTableWidth, java.lang.String tableCellsTagName)`

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md))
- `newTableWidth` (`int`)
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `void`

### `getTableWidth(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

### `isTableAcceptingWidth(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isTableAndColumnsResizable(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isAcceptingFixedColumnWidths(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isAcceptingPercentageColumnWidths(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isAcceptingProportionalColumnWidths(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `getAllColspecWidthRepresentations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `isPreferPercentageColumnWidths(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

