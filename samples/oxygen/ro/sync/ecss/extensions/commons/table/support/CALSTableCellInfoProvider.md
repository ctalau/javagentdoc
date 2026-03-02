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

**Returns:** `java.lang.Integer`

In case the 'spanspec' attribute is missing 
 then the column span is defined by the 'namest' and 'nameend' attribute.

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getColSpanInterval(ro.sync.ecss.extensions.api.node.AuthorElement cellElem)`

**Returns:** `int[]`

In case the 'spanspec' attribute is missing 
 then the column span is defined by the 'namest' and 'nameend' attribute.

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): Cell we want to check for spans.

### `getColSpan(java.lang.String namest, java.lang.String nameend, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `int[]`

**Parameters:**
- `namest` (`java.lang.String`): The start span column name.
- `nameend` (`java.lang.String`): The end span column name.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `void`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `reportInvalidFloat(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, ro.sync.ecss.extensions.api.node.AuthorElement child, java.lang.String value, java.lang.String originalValue)`

**Returns:** `void`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table.
- `child` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The child element.
- `value` (`java.lang.String`): The value to check.
- `originalValue` (`java.lang.String`): The original value.

### `isColspec(ro.sync.ecss.extensions.api.node.AuthorElement child)`

**Returns:** `boolean`

**Parameters:**
- `child` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The child

### `getDescription()`

**Returns:** `java.lang.String`

### `getSpanSpec(java.lang.String spanSpecName)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec`](./CALSColSpanSpec.md)

**Parameters:**
- `spanSpecName` (`java.lang.String`): The name of the column span specification.

### `getCellSpanSpec(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec`](./CALSColSpanSpec.md)

If 'spanname' attribute is present the corresponding span specification will be returned.
 Otherwise a new span specification will be returned looking at the name of columns
 spanned by the cell.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell element.

### `getColumnSpec(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell element.

### `getColumnSpec(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell element.
- `columnIndex` (`int`): The index of the column. (used only when there is no colname on the element.)

### `getColSpec(java.lang.String colSpecName)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

**Parameters:**
- `colSpecName` (`java.lang.String`): The name of column specification.

### `getColSpec(int columnNumber)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

**Parameters:**
- `columnNumber` (`int`): The column number, one based.

### `getColSpecElement(ro.sync.ecss.extensions.commons.table.support.CALSColSpec colspec)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

**Parameters:**
- `colspec` ([`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)): The column specification.

### `getColSpecs()`

**Returns:** `java.util.Set<ro.sync.ecss.extensions.commons.table.support.CALSColSpec>`

The list is ordered ascending by the column specification index ('colnum' attribute).

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

### `isTableCell(java.lang.String tableCellsTagName)`

**Returns:** `boolean`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The name of an element.

### `getUniqueColumnName(int colNumber)`

**Returns:** `java.lang.String`

**Parameters:**
- `colNumber` (`int`): The column number

### `getTableElement()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

This method is used to find the `table` element 
 (parent of the `tgroup` element)
 for getting and setting the "width" attribute.

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

### `getTableWidth()`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

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

### `getColSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int columnIndex)`

**Returns:** `boolean`

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

### `getRowSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int columnIndex)`

**Returns:** `boolean`

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

### `getColSepOrRowSepFromAttributes(ro.sync.ecss.extensions.api.node.AuthorElement cellElem, boolean needingColSep)`

**Returns:** `java.lang.Boolean[]`

**Parameters:**
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element.
- `needingColSep` (`boolean`): `true` if the `colsep` is needed, 
 `false` for the `rowsep`.

### `isTableElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `boolean`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The analyzed element.

### `isTgroupElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `boolean`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The analyzed element.

### `getAttributeValue(ro.sync.ecss.extensions.api.node.AuthorElement elem, java.lang.String attributeName)`

**Returns:** `java.lang.String`

For flexibility reasons also checks with the upper case attribute name.

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element.
- `attributeName` (`java.lang.String`): The attribute name.

