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

### `getColSpan([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `java.lang.Integer`

### `getRowSpan([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `java.lang.Integer`

### `init([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableNode)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `getCALSTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `getXHTMLTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `hasColumnSpecifications([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `boolean`

### `getCellWidth([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement, `int` colNumberStart, `int` colSpan)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `commitColumnWidthModifications([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) authorDocumentController, [`ro.sync.ecss.extensions.api.WidthRepresentation[]`](../../../api/WidthRepresentation.md) colWidths, `java.lang.String` tableCellsTagName)`

**Returns:** `void`

### `commitTableWidthModification([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) authorDocumentController, `int` newTableWidth, `java.lang.String` tableCellsTagName)`

**Returns:** `void`

### `getTableWidth(`java.lang.String` tableCellsTagName)`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

### `isTableAcceptingWidth(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `isTableAndColumnsResizable(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `isAcceptingFixedColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `isAcceptingPercentageColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `isAcceptingProportionalColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `getAllColspecWidthRepresentations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `isPreferPercentageColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

