# Class: `HTMLTableCellInfoProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.HTMLTableCellInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProviderBase`](../../../api/AuthorTableColumnWidthProviderBase.md)

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

## Description

Updates the table width modification and the column widths in the document 
 and in the layout model.

## Fields

### `ELEMENT_NAME_COLGROUP`

**Type:** `java.lang.String`

The value is `colgroup`

### `ELEMENT_NAME_COL`

**Type:** `java.lang.String`

The value is `col`

### `ELEMENT_NAME_THEAD`

**Type:** `java.lang.String`

The value is `thead`

### `ELEMENT_NAME_TFOOT`

**Type:** `java.lang.String`

The value is `tfoot`

### `ELEMENT_NAME_TBODY`

**Type:** `java.lang.String`

The value is `tbody`

### `ATTR_NAME_SPAN`

**Type:** `java.lang.String`

The value is `span`

### `ATTR_NAME_WIDTH`

**Type:** `java.lang.String`

The value is `width`

### `ATTR_NAME_ALIGN`

**Type:** `java.lang.String`

The value is `align`

### `HTML_CELL_NAME`

**Type:** `java.lang.String`

The value is `td`

### `HTML_ROW_NAME`

**Type:** `java.lang.String`

The value is `tr`

### `HTML_HEADER_CELL_NAME`

**Type:** `java.lang.String`

The value is `th`

### `logger`

**Type:** `org.slf4j.Logger`

### `colWidthSpecs`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `widthRepresentationsToElementsMap`

**Type:** `java.util.Map<ro.sync.ecss.extensions.api.WidthRepresentation,ro.sync.ecss.extensions.api.node.AuthorElement>`

### `tableElement`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

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

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `void`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getElementsByLocalName(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String localName)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../../api/node/AuthorElement.md)

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current element.
- `localName` (`java.lang.String`): The tag local name to search for.

### `getDescription()`

**Returns:** `java.lang.String`

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

### `getInsertColsOffset()`

**Returns:** `int`

### `createXMLFragment(ro.sync.ecss.extensions.api.WidthRepresentation[] widthRepresentations)`

**Returns:** `java.lang.String`

The fragment will contain a list of `col` elements, one for each 
 column specification:
 

 `
 <col with="string_width_specification" xmlns="namespace"/>
 `
 

 The xmlns attributes will be included in the `col` elements only
 if the table has an associated namespace.

**Parameters:**
- `widthRepresentations` ([`ro.sync.ecss.extensions.api.WidthRepresentation[]`](../../../api/WidthRepresentation.md)): The list of WidthRepresentation specific 
 for each column in the table

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

### `getTableWidth()`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

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

### `isHTMLTableCellTagName(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The table cell tag name to check.

### `getAllColspecWidthRepresentations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `getColSpec(int columnIndex)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

**Parameters:**
- `columnIndex` (`int`): The column index

### `isPreferPercentageColumnWidths(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

