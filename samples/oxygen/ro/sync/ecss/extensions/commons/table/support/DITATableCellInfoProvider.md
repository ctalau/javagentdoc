# Class: `DITATableCellInfoProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.DITATableCellInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProviderBase`](../../../api/AuthorTableColumnWidthProviderBase.md)

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

## Description

## Fields

### `SIMPLETABLE_CLASS_VALUE`

**Type:** `java.lang.String`

### `SIMPLETABLE_CELL_CLASS_VALUE`

**Type:** `java.lang.String`

### `SIMPLETABLE_ROW_CLASS_VALUE`

**Type:** `java.lang.String`

### `SIMPLETABLE_HEAD_CLASS_VALUE`

**Type:** `java.lang.String`

### `ATTRIBUTE_NAME_CLASS`

**Type:** `java.lang.String`

The value is `class`

### `ATTRIBUTE_NAME_RELCOLWIDTH`

**Type:** `java.lang.String`

The value is `relcolwidth`

### `calsProvider`

**Type:** [`ro.sync.ecss.extensions.commons.table.support.CALSTableCellInfoProvider`](./CALSTableCellInfoProvider.md)

### `simpleTableCellSpanProvider`

**Type:** [`ro.sync.ecss.extensions.commons.table.support.DITASimpleTableCellSpanProvider`](./DITASimpleTableCellSpanProvider.md)

### `columnWidths`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `simpleTableCellTagNames`

**Type:** `java.util.Set<java.lang.String>`

### `tableElement`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

## Constructors

### `<init>()`

## Methods

### `init([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

### `detectSimpleTableCellTagNames([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `java.util.Set<java.lang.String>`

### `isSimpleTableCell(`java.lang.String` cellTagName)`

**Returns:** `boolean`

### `isRelTableCell(`java.lang.String` cellTagName)`

**Returns:** `boolean`

### `getColSpan([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `java.lang.Integer`

### `getRowSpan([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `java.lang.Integer`

### `hasColumnSpecifications([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

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

