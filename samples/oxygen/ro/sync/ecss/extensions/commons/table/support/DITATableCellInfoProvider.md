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

### `init(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `detectSimpleTableCellTagNames(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.

**Returns:** `java.util.Set<java.lang.String>`

### `isSimpleTableCell(String cellTagName)`

**Parameters:**
- `cellTagName` (`java.lang.String`): The cell tag name to be tested.

**Returns:** `boolean`

### `isRelTableCell(String cellTagName)`

**Parameters:**
- `cellTagName` (`java.lang.String`): The cell tag name to be tested.

**Returns:** `boolean`

### `getColSpan(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getRowSpan(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `hasColumnSpecifications(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellWidth(AuthorElement cellElement, int colNumberStart, int colSpan)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `colNumberStart` (`int`)
- `colSpan` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `commitColumnWidthModifications(AuthorDocumentController authorDocumentController, WidthRepresentation[] colWidths, String tableCellsTagName)`

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md))
- `colWidths` ([`ro.sync.ecss.extensions.api.WidthRepresentation[]`](../../../api/WidthRepresentation.md))
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `void`

### `commitTableWidthModification(AuthorDocumentController authorDocumentController, int newTableWidth, String tableCellsTagName)`

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md))
- `newTableWidth` (`int`)
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `void`

### `getTableWidth(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

### `isTableAcceptingWidth(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isTableAndColumnsResizable(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isAcceptingFixedColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isAcceptingPercentageColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `isAcceptingProportionalColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

### `getAllColspecWidthRepresentations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

