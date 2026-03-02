# Class: `SplitLeftRightOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SplitLeftRightOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

The new cell resulting from the split operation will be positioned to the left
 or to the right of the original cell.

## Fields

### `SPLIT_LEFT`

**Type:** `java.lang.String`

The value is `Left`.

### `SPLIT_RIGHT`

**Type:** `java.lang.String`

The value is `Right`.

### `ARGUMENT_NAME`

**Type:** `java.lang.String`

The value is `Split name`.

## Constructors

### `<init>(AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Document type specific table information helper.

## Methods

### `doOperationInternal(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `decreaseColSpan(AuthorAccess authorAccess, AuthorTableCellSpanProvider tableSupport, AuthorElement cell, boolean left)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to author functionality.
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table cell span support.
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell to update the column span for.
- `left` (`boolean`): If `true` then the column span of the cell will be 
   shrunk starting from the left.

**Returns:** `void`

### `getAttributesSkippedAtCopy()`

**Returns:** `java.lang.String[]`

