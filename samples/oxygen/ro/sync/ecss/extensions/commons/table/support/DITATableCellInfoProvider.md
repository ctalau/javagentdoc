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

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `detectSimpleTableCellTagNames(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.

**Returns:** `java.util.Set<java.lang.String>`

### `isSimpleTableCell(java.lang.String cellTagName)`

**Parameters:**
- `cellTagName` (`java.lang.String`): The cell tag name to be tested.

**Returns:** `boolean`

### `isRelTableCell(java.lang.String cellTagName)`

**Parameters:**
- `cellTagName` (`java.lang.String`): The cell tag name to be tested.

**Returns:** `boolean`

### `getColSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `hasColumnSpecifications(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

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

