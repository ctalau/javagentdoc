# Class: `AbstractTableOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

## Fields

### `CHANGE_TRACKING_BEHAVIOR`

**Type:** `java.lang.String`

### `CHANGE_TRACKING_BEHAVIOR_BLOCK`

**Type:** `java.lang.String`

### `CHANGE_TRACKING_BEHAVIOR_ALLOW`

**Type:** `java.lang.String`

For complex
 table operations, the resulting table layout will be broken.

### `CHANGE_TRACKING_BEHAVIOR_ALLOW_WITHOUT`

**Type:** `java.lang.String`

### `CHANGE_TRACKING_BEHAVIOR_AUTO`

**Type:** `java.lang.String`

### `CHANGE_TRACKING_BEHAVIOR_ARGUMENT`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

### `TABLE_INFO_ARGUMENT_NAME`

**Type:** `java.lang.String`

### `TABLE_INFO_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

### `tableHelper`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)

### `supportsChangeTracking`

**Type:** `boolean`

## Constructors

### `<init>(AuthorTableHelper authorTableHelper)`

**Parameters:**
- `authorTableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper, has methods specific to each document type.

### `<init>(AuthorTableHelper authorTableHelper, boolean markAsChange)`

**Parameters:**
- `authorTableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper, has methods specific to each document type.
- `markAsChange` (`boolean`): `true` if the operation result is marked as a change.

## Methods

### `getElementAncestor(AuthorNode node, int type)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The starting node.
- `type` (`int`): The type of the ancestor.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `isElement(AuthorNode node, String elemLocalName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The AuthorNode to be checked.
- `elemLocalName` (`java.lang.String`): The local name of the element.

**Returns:** `boolean`

### `isTableElement(AuthorNode node, int type)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node to be checked.
- `type` (`int`): The type to search for.

**Returns:** `boolean`

### `findCellInsertionOffset(AuthorAccess authorAccess, AuthorElement tableElement, int row, int column)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element rendered as a table. Its 'display' CSS property
   is set to 'table'.
- `row` (`int`): The table row where the insertion will occur, 0 based.
- `column` (`int`): The column where the insertion will occur, 0 based.

**Returns:** `int`

### `findPreviousCellInRow(AuthorAccess authorAccess, int column, AuthorElement row)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `column` (`int`): The column for which to find the previous cell.
- `row` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The row in which to find the previous cell.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `createEmptyCell(AuthorAccess authorAccess, AuthorElement cell, String[] skippedAttributes)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The reference cell.
- `skippedAttributes` (`java.lang.String[]`): The attributes which should not be copied.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getChangeTrackingBehavior(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access object.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md)): The operation arguments.

**Returns:** `java.lang.String`

### `doOperationWithoutChangeTracking(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `doOperationInternal(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md)): The map of arguments. **All the arguments defined by method 
   #getArguments() must be present in the map of arguments.**

**Returns:** `void`

