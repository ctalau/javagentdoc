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

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) authorTableHelper)`

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) authorTableHelper, `boolean` markAsChange)`

## Methods

### `getElementAncestor([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `int` type)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `isElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `java.lang.String` elemLocalName)`

**Returns:** `boolean`

### `isTableElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `int` type)`

**Returns:** `boolean`

### `findCellInsertionOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `int` row, `int` column)`

**Returns:** `int`

### `findPreviousCellInRow([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` column, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) row)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `createEmptyCell([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, `java.lang.String[]` skippedAttributes)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getChangeTrackingBehavior([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `java.lang.String`

### `doOperationWithoutChangeTracking([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

