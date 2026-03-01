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

### `<init>(`boolean` colsepAndRowSepAreVisibleByDefault)`

### `<init>()`

The default visibility for the rowsep and 
 colsep. (i.e. if no `colsep` or `rowsep` attributes are present 
 in the table) is hidden.

### `<init>(`boolean` colsepAndRowSepAreVisibleByDefault, [`ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener`](errorscanner/TableLayoutErrorsListener.md) errorsListener)`

## Methods

### `getColSpan([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem)`

**Returns:** `java.lang.Integer`

In case the 'spanspec' attribute is missing 
 then the column span is defined by the 'namest' and 'nameend' attribute.

### `getColSpanInterval([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem)`

**Returns:** `int[]`

In case the 'spanspec' attribute is missing 
 then the column span is defined by the 'namest' and 'nameend' attribute.

### `getColSpan(`java.lang.String` namest, `java.lang.String` nameend, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `int[]`

### `getRowSpan([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `java.lang.Integer`

### `init([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `void`

### `reportInvalidFloat([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) child, `java.lang.String` value, `java.lang.String` originalValue)`

**Returns:** `void`

### `isColspec([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) child)`

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getSpanSpec(`java.lang.String` spanSpecName)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec`](./CALSColSpanSpec.md)

### `getCellSpanSpec([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpanSpec`](./CALSColSpanSpec.md)

If 'spanname' attribute is present the corresponding span specification will be returned.
 Otherwise a new span specification will be returned looking at the name of columns
 spanned by the cell.

### `getColumnSpec([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColumnSpec([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement, `int` columnIndex)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColSpec(`java.lang.String` colSpecName)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColSpec(`int` columnNumber)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md)

### `getColSpecElement([`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](./CALSColSpec.md) colspec)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getColSpecs()`

**Returns:** `java.util.Set<ro.sync.ecss.extensions.commons.table.support.CALSColSpec>`

The list is ordered ascending by the column specification index ('colnum' attribute).

### `hasColumnSpecifications([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `boolean`

### `getCellWidth([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElement, `int` colNumberStart, `int` colSpan)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `commitColumnWidthModifications([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) authorDocumentController, [`ro.sync.ecss.extensions.api.WidthRepresentation[]`](../../../api/WidthRepresentation.md) colWidths, `java.lang.String` tableCellsTagName)`

**Returns:** `void`

### `isTableCell(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `getUniqueColumnName(`int` colNumber)`

**Returns:** `java.lang.String`

### `getTableElement()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

This method is used to find the `table` element 
 (parent of the `tgroup` element)
 for getting and setting the "width" attribute.

### `commitTableWidthModification([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) authorDocumentController, `int` newTableWidth, `java.lang.String` tableCellsTagName)`

**Returns:** `void`

### `getTableWidth(`java.lang.String` tableCellsTagName)`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

### `isTableAcceptingWidth(`java.lang.String` tableCellsTagName)`

**Returns:** `boolean`

### `getTableWidth()`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

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

### `getColSep([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem, `int` columnIndex)`

**Returns:** `boolean`

### `getRowSep([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem, `int` columnIndex)`

**Returns:** `boolean`

### `getColSepOrRowSepFromAttributes([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem, `boolean` needingColSep)`

**Returns:** `java.lang.Boolean[]`

### `isTableElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isTgroupElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `getAttributeValue([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) elem, `java.lang.String` attributeName)`

**Returns:** `java.lang.String`

For flexibility reasons also checks with the upper case attribute name.

