# Class: `CALSTableCellInfoProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.CALSTableCellInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProviderBase`](../../../api/AuthorTableColumnWidthProviderBase.md)

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md), [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSConstants`](../operations/cals/CALSConstants.md), [`ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`](../../../api/AuthorTableCellSepProvider.md)

## Description

## Fields

### `DEFAULT_WIDTH_REPRESENTATION`

**Type:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

PUBLIC BECAUSE IT WAS USED IN OLDER VERSIONS AS API.

### `CALS_DOCBOOK_CELL_NAME`

**Type:** `java.lang.String`

### `colspecInfosMap`

**Type:** `java.util.Map<ro.sync.ecss.extensions.commons.table.support.CALSColSpec,ro.sync.ecss.extensions.api.node.AuthorElement>`

### `spanspecInfos`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec>`

### `tableElement`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `COLSPEC_NAME_PREFIX`

**Type:** `java.lang.String`

### `colsepAndRowSepAreVisibleByDefault`

**Type:** `boolean`

For DITA they 
 are hidden, for Docbook are visible.

## Constructors

### `<init>(boolean colsepAndRowSepAreVisibleByDefault)`

**Parameters:**
- `colsepAndRowSepAreVisibleByDefault` (`boolean`): The default visibility for the rowsep and 
   colsep. (i.e. if no `colsep` or `rowsep` attributes are present 
   in the table).

### `<init>()`

The default visibility for the rowsep and 
 colsep. (i.e. if no `colsep` or `rowsep` attributes are present 
 in the table) is hidden.

### `<init>(boolean colsepAndRowSepAreVisibleByDefault, ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener errorsListener)`

**Parameters:**
- `colsepAndRowSepAreVisibleByDefault` (`boolean`): The default visibility for the rowsep and 
   colsep. (i.e. if no `colsep` or `rowsep` attributes are present 
   in the table).
- `errorsListener` ([`ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener`](errorscanner/TableLayoutErrorsListener.md)): Table layout errors listener.

## Methods

### `getColSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElem)`

In case the 'spanspec' attribute is missing 
 then the column span is defined by the 'namest' and 'nameend' attribute.

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getColSpanInterval(ro.sync.ecss.extensions.api.node.AuthorElement cellElem)`

In case the 'spanspec' attribute is missing 
 then the column span is defined by the 'namest' and 'nameend' attribute.

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): Cell we want to check for spans.

**Returns:** `int[]`

### `getColSpan(java.lang.String namest, java.lang.String nameend, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `namest` (`java.lang.String`): The start span column name.
- `nameend` (`java.lang.String`): The end span column name.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `int[]`

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `reportInvalidFloat(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, ro.sync.ecss.extensions.api.node.AuthorElement child, java.lang.String value, java.lang.String originalValue)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table.
- `child` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The child element.
- `value` (`java.lang.String`): The value to check.
- `originalValue` (`java.lang.String`): The original value.

**Returns:** `void`

### `isColspec(ro.sync.ecss.extensions.api.node.AuthorElement child)`

**Parameters:**
- `child` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The child

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getSpanSpec(java.lang.String spanSpecName)`

**Parameters:**
- `spanSpecName` (`java.lang.String`): The name of the column span specification.

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec`](./CALSColSpanSpec.md)

### `getCellSpanSpec(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

If 'spanname' attribute is present the corresponding span specification will be returned.
 Otherwise a new span specification will be returned looking at the name of columns
 spanned by the cell.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell element.

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec`](./CALSColSpanSpec.md)

### `getColumnSpec(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell element.

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColumnSpec(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell element.
- `columnIndex` (`int`): The index of the column. (used only when there is no colname on the element.)

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColSpec(java.lang.String colSpecName)`

**Parameters:**
- `colSpecName` (`java.lang.String`): The name of column specification.

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColSpec(int columnNumber)`

**Parameters:**
- `columnNumber` (`int`): The column number, one based.

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColSpecElement(ro.sync.ecss.extensions.commons.table.support.CALSColSpec colspec)`

**Parameters:**
- `colspec` ([`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)): The column specification.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getColSpecs()`

The list is ordered ascending by the column specification index ('colnum' attribute).

**Returns:** `java.util.Set<ro.sync.ecss.extensions.commons.table.support.CALSColSpec>`

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

### `isTableCell(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The name of an element.

**Returns:** `boolean`

### `getUniqueColumnName(int colNumber)`

**Parameters:**
- `colNumber` (`int`): The column number

**Returns:** `java.lang.String`

### `getTableElement()`

This method is used to find the `table` element 
 (parent of the `tgroup` element)
 for getting and setting the "width" attribute.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

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

### `getTableWidth()`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

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

### `getColSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int columnIndex)`

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `getRowSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int columnIndex)`

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `getColSepOrRowSepFromAttributes(ro.sync.ecss.extensions.api.node.AuthorElement cellElem, boolean needingColSep)`

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element.
- `needingColSep` (`boolean`): `true` if the `colsep` is needed, 
   `false` for the `rowsep`.

**Returns:** `java.lang.Boolean[]`

### `isTableElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The analyzed element.

**Returns:** `boolean`

### `isTgroupElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The analyzed element.

**Returns:** `boolean`

### `getAttributeValue(ro.sync.ecss.extensions.api.node.AuthorElement elem, java.lang.String attributeName)`

For flexibility reasons also checks with the upper case attribute name.

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element.
- `attributeName` (`java.lang.String`): The attribute name.

**Returns:** `java.lang.String`

