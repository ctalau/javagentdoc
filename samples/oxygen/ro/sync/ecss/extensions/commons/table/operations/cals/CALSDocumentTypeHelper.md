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

### `checkTableColSpanIsDefined(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSpanSupport, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableSpanSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

### `getTableColSpec(ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSpanSupport, int colIndex)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.CALSColSpec`](../../support/CALSColSpec.md)

I.E. for DocBook the column specification is defined by the 'colspec' element. 
 If it is missing then the column specification is not defined.

**Parameters:**
- `tableSpanSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md)): The table span support.
- `colIndex` (`int`): The index of the column. The index of column is 1 based.

### `updateTableColSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int startCol, int endCol)`

**Returns:** `void`

The `namest` and `nameend` attributes will be set 
 according to the `startCol` and `endCol` supplied values.    
 If the `spanname` attribute is set, then it will be removed.
 If the `colname` attribute is set, then it will be removed.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `startCol` (`int`)
- `endCol` (`int`)

### `getTableCellSpanProvider(ro.sync.ecss.extensions.api.node.AuthorElement tgroupElement)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md)

**Parameters:**
- `tgroupElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

### `updateTableRowSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int rowSpan)`

**Returns:** `void`

If the supplied value for the row span is less than or equal to 1 then the 
 attribute will be removed.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `rowSpan` (`int`)

### `updateTableColumnNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int colsNumber)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `colsNumber` (`int`)

### `updateTableRowNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int rowsNumber)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `rowsNumber` (`int`)

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getAllowedCellAttributesToCopy()`

**Returns:** `java.lang.String[]`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getTableElementForDeletion(ro.sync.ecss.extensions.api.node.AuthorNode element)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md)

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))

### `isActuallyTableAndNotTgroup(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md)): the node for which we perform the check.

### `limitRowSpan(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] rowFragments)`

**Returns:** `void`

Each fragment has inside it a single table row. 
 For example if we have 3 rows and 
 the first row contains a cell with 'morerows=5', we'll set 'morerows=2' on the cell.

**Parameters:**
- `rowFragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md)): The fragments of rows to be limited.

### `limitRowSpanInRowDocumentFragment(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment, int maxRowSpanValue)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../../api/node/AuthorDocumentFragment.md)

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../../api/node/AuthorDocumentFragment.md)): Fragment that contains the row to be limited.
- `maxRowSpanValue` (`int`): The maximum value of the 'morerows' attribute.

### `limitRowSpanInRowCells(ro.sync.ecss.extensions.api.node.AuthorParentNode rowNode, int maxRowSpanValue)`

**Returns:** `void`

**Parameters:**
- `rowNode` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../../../../api/node/AuthorParentNode.md)): The row node to be limited.
- `maxRowSpanValue` (`int`): The maximum value of the 'morerows' attribute.

