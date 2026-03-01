# Interface: `AuthorTableColumnWidthProvider`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Methods

### `getCellWidth([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) cellElement, `int` colNumberStart, `int` colSpan)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

For example for a CALS table cell the list with the width representations is obtained by 
 computing the column span and then determining the WidthRepresentation
 for each column the cell spans across.

### `init([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) tableElement)`

**Returns:** `void`

Its intended
 to extract information from the element representing the table only once, not on every 
 getColSpan() or getRowSpan() call.
 
 
 Example: for a DocBook table we identify and cache
 the 'colspec' and 'spanspec' elements from that table.
 
 A new instance of the table column width provider is used for every table in a document 
 so cached data cannot be reused between different tables.

### `commitColumnWidthModifications([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) authorDocumentController, [`ro.sync.ecss.extensions.api.WidthRepresentation[]`](./WidthRepresentation.md) colWidths, `java.lang.String` tableCellsTagName)`

**Returns:** `void`

For example, for the DocBook CALS tables the method updates the columns 
 width specifications in the source document by setting the `colwidth` 
 attribute value of the `colspec` elements. 
 New `colspec` elements will be added if needed.

### `commitTableWidthModification([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) authorDocumentController, `int` newTableWidth, `java.lang.String` tableCellsTagName)`

**Returns:** `void`

For example in the case of DocBook HTML tables sets the 
 `width` attribute value of the `table` element.

### `isTableAcceptingWidth(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

For example, for the DocBook CALS tables which do not accept 
 an `width` attribute the method will return `false`.

### `getTableWidth(`java.lang.String` tableCellsTagName)`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](./WidthRepresentation.md)

For the DocBook HTML tables it returns the WidthRepresentation obtained by analyzing the
 `width` attribute value of the `table` element.

### `isTableAndColumnsResizable(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

For example in the case of the DocBook CALS tables will return `true`
 only if the given table cells tag name is equal to `'entry'`.

### `isAcceptingFixedColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `isAcceptingProportionalColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `isAcceptingPercentageColumnWidths(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

