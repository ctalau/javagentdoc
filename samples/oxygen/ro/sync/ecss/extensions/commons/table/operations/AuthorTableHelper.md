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

### `isTableCell(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.

**Returns:** `boolean`

### `isTableRow(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.

**Returns:** `boolean`

### `isTable(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.

**Returns:** `boolean`

### `getTableCellSpanProvider(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
   is set to 'table'.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

### `checkTableColSpanIsDefined(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableCellSpanProvider, AuthorElement cellElement)`

I.E. for DocBook the column span is defined by the 'colspec' element. 
 If it is missing then the column span is not defined.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableCellSpanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table cell span provider.
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element to be tested.

**Returns:** `void`

### `updateTableColSpan(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableCellSpanProvider, AuthorElement cellElem, int startCol, int endCol)`

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

**Returns:** `void`

### `updateTableRowSpan(AuthorAccess authorAccess, AuthorElement cellElem, int rowSpan)`

For example, for the DocBook CALS tables the `morerows` attribute 
 value will be updated.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell element whose row span will be updated.
- `rowSpan` (`int`): The new row span value. It is 1 based.

**Returns:** `void`

### `updateTableColumnNumber(AuthorAccess authorAccess, AuthorElement tableElement, int colNum)`

For example, for the DocBook CALS tables the `cols` attribute 
 value will be updated.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
   is set to 'table'.
- `colNum` (`int`): The updated number of columns.

**Returns:** `void`

### `updateTableRowNumber(AuthorAccess authorAccess, AuthorElement tableElement, int relativeValue)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access. 
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
   is set to 'table'.
- `relativeValue` (`int`): The number of rows to increase or decrease the current number of table rows.
   If the number of rows must be decreased then the argument must be negative.

**Returns:** `void`

### `getIgnoredRowAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredColumnAttributes()`

**Returns:** `java.lang.String[]`

### `getIgnoredCellIDAttributes()`

**Returns:** `java.lang.String[]`

### `getTableElementForDeletion(AuthorNode node)`

OBS: For CALS tables we don't want to delete
 only the "tgroup", but the parent table element itself.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): the node whose parent table we are looking for.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

### `isColspec(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node.

**Returns:** `boolean`

