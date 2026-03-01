# Class: `CALSDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.CALSDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`](../../../AbstractDocumentTypeHelper.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSConstants`](./CALSConstants.md)

## Description

## Fields

### `ROW_ELEMENT_NAMES`

**Type:** `java.lang.String[]`

### `CELL_ELEMENT_NAMES`

**Type:** `java.lang.String[]`

### `TABLE_ELEMENT_NAMES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>()`

## Methods

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `checkTableColSpanIsDefined([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSpanSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElement)`

**Returns:** `void`

### `getTableColSpec([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSpanSupport, `int` colIndex)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](../../support/CALSColSpec.md)

I.E. for DocBook the column specification is defined by the 'colspec' element. 
 If it is missing then the column specification is not defined.

### `updateTableColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElem, `int` startCol, `int` endCol)`

**Returns:** `void`

The `namest` and `nameend` attributes will be set 
 according to the `startCol` and `endCol` supplied values.    
 If the `spanname` attribute is set, then it will be removed.
 If the `colname` attribute is set, then it will be removed.

### `getTableCellSpanProvider([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tgroupElement)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md)

### `updateTableRowSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) cellElem, `int` rowSpan)`

**Returns:** `void`

If the supplied value for the row span is less than or equal to 1 then the 
 attribute will be removed.

### `updateTableColumnNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` colsNumber)`

**Returns:** `void`

### `updateTableRowNumber([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElement, `int` rowsNumber)`

**Returns:** `void`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getAllowedCellAttributesToCopy()`

**Returns:** `java.lang.String[]`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getTableElementForDeletion([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) element)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md)

### `isActuallyTableAndNotTgroup([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `limitRowSpan([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md) rowFragments)`

**Returns:** `void`

Each fragment has inside it a single table row. 
 For example if we have 3 rows and 
 the first row contains a cell with 'morerows=5', we'll set 'morerows=2' on the cell.

### `limitRowSpanInRowDocumentFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../../api/node/AuthorDocumentFragment.md) fragment, `int` maxRowSpanValue)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../../api/node/AuthorDocumentFragment.md)

### `limitRowSpanInRowCells([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../../../../api/node/AuthorParentNode.md) rowNode, `int` maxRowSpanValue)`

**Returns:** `void`

