# Interface: `AuthorTableHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`

## Description

It contains methods that are specific to a document type and are used to obtain
 table and table cells related information.

## Fields

### `TYPE_CELL`

**Type:** `int`

### `TYPE_ROW`

**Type:** `int`

### `TYPE_TABLE`

**Type:** `int`

## Methods

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.

### `isTable(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.

### `getTableCellSpanProvider(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
 is set to 'table'.

### `checkTableColSpanIsDefined(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableCellSpanProvider, ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `void`

I.E. for DocBook the column span is defined by the 'colspec' element. 
 If it is missing then the column span is not defined.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table cell span provider.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element to be tested.

### `updateTableColSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableCellSpanProvider, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int startCol, int endCol)`

**Returns:** `void`

For example, for the DocBook CALS tables  the `namest` and `nameend` 
 attributes will be set according to the `startCol` and `endCol` supplied values.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The object responsible for providing information 
 about the cell spanning.
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element whose column span will be updated.
- `startCol` (`int`): The new index of start column. It is 1 based and inclusive.
- `endCol` (`int`): The new index of end column. It is 1 based and inclusive.

### `updateTableRowSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, int rowSpan)`

**Returns:** `void`

For example, for the DocBook CALS tables the `morerows` attribute 
 value will be updated.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element whose row span will be updated.
- `rowSpan` (`int`): The new row span value. It is 1 based.

### `updateTableColumnNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int colNum)`

**Returns:** `void`

For example, for the DocBook CALS tables the `cols` attribute 
 value will be updated.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
 is set to 'table'.
- `colNum` (`int`): The updated number of columns.

### `updateTableRowNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int relativeValue)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
 is set to 'table'.
- `relativeValue` (`int`): The number of rows to increase or decrease the current number of table rows.
 If the number of rows must be decreased then the argument must be negative.

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getTableElementForDeletion(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

OBS: For CALS tables we don't want to delete
 only the "tgroup", but the parent table element itself.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): the node whose parent table we are looking for.

### `isColspec(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node.

