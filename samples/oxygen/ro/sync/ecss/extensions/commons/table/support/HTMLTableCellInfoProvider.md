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

### `getColSpan(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getRowSpan(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `init(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `getElementsByLocalName(AuthorElement element, String localName)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current element.
- `localName` (`java.lang.String`): The tag local name to search for.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../../api/node/AuthorElement.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `hasColumnSpecifications(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

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

### `getInsertColsOffset()`

**Returns:** `int`

### `createXMLFragment(WidthRepresentation[] widthRepresentations)`

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

**Returns:** `java.lang.String`

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

### `getTableWidth()`

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

### `isHTMLTableCellTagName(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The table cell tag name to check.

**Returns:** `boolean`

### `getAllColspecWidthRepresentations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `getColSpec(int columnIndex)`

**Parameters:**
- `columnIndex` (`int`): The column index

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `isPreferPercentageColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`)

**Returns:** `boolean`

