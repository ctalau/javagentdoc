# Interface: `AuthorTableColumnWidthProvider`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Methods

### `getCellWidth(AuthorElement cellElement, int colNumberStart, int colSpan)`

For example for a CALS table cell the list with the width representations is obtained by 
 computing the column span and then determining the WidthRepresentation
 for each column the cell spans across.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The node that represents a table cell in CSS.
- `colNumberStart` (`int`): The column number the cell starts at.
- `colSpan` (`int`): The column span of the cell.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `init(AuthorElement tableElement)`

Its intended
 to extract information from the element representing the table only once, not on every 
 getColSpan() or getRowSpan() call.
 
 
 Example: for a DocBook table we identify and cache
 the 'colspec' and 'spanspec' elements from that table.
 
 A new instance of the table column width provider is used for every table in a document 
 so cached data cannot be reused between different tables.

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element representing a table (it has the CSS display property 
   set on 'table').

**Returns:** `void`

### `commitColumnWidthModifications(AuthorDocumentController authorDocumentController, WidthRepresentation[] colWidths, String tableCellsTagName)`

For example, for the DocBook CALS tables the method updates the columns 
 width specifications in the source document by setting the `colwidth` 
 attribute value of the `colspec` elements. 
 New `colspec` elements will be added if needed.

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)): The AuthorDocumentController used to commit the table modifications
   in the document.
- `colWidths` ([`ro.sync.ecss.extensions.api.WidthRepresentation[]`](./WidthRepresentation.md)): The new column WidthRepresentation to set. The column widths must be ordered 
   according to the corresponding column numbers.
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type (e.g. 'entry' for CALS or 'td' for HTML).

**Returns:** `void`

### `commitTableWidthModification(AuthorDocumentController authorDocumentController, int newTableWidth, String tableCellsTagName)`

For example in the case of DocBook HTML tables sets the 
 `width` attribute value of the `table` element.

**Parameters:**
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)): The AuthorDocumentController used to commit the table width modifications
   in the document.
- `newTableWidth` (`int`): The new table WidthRepresentation to set. The value is given in pixels.
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type (e.g. 'entry' for CALS or 'td' for HTML).

**Returns:** `void`

### `isTableAcceptingWidth(String tableCellsTagName)`

For example, for the DocBook CALS tables which do not accept 
 an `width` attribute the method will return `false`.

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type (e.g. 'entry' for CALS or 'td' for HTML).

**Returns:** `boolean`

### `getTableWidth(String tableCellsTagName)`

For the DocBook HTML tables it returns the WidthRepresentation obtained by analyzing the
 `width` attribute value of the `table` element.

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type (e.g. 'entry' for CALS or 'td' for HTML).

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](./WidthRepresentation.md)

### `isTableAndColumnsResizable(String tableCellsTagName)`

For example in the case of the DocBook CALS tables will return `true`
 only if the given table cells tag name is equal to `'entry'`.

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type (e.g. CALS or HTML).

**Returns:** `boolean`

### `isAcceptingFixedColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type
   (e.g. CALS or HTML).

**Returns:** `boolean`

### `isAcceptingProportionalColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type
   (e.g. CALS or HTML).

**Returns:** `boolean`

### `isAcceptingPercentageColumnWidths(String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cells tag name. Used to identify the table type
   (e.g. CALS or HTML).

**Returns:** `boolean`

