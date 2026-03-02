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

**Returns:** `void`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `detectSimpleTableCellTagNames(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `java.util.Set<java.lang.String>`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.

### `isSimpleTableCell(java.lang.String cellTagName)`

**Returns:** `boolean`

**Parameters:**
- `cellTagName` (`java.lang.String`): The cell tag name to be tested.

### `isRelTableCell(java.lang.String cellTagName)`

**Returns:** `boolean`

**Parameters:**
- `cellTagName` (`java.lang.String`): The cell tag name to be tested.

### `getColSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `hasColumnSpecifications(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `boolean`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getDescription()`

**Returns:** `java.lang.String`

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

