# Class: `SplitCellAboveBelowOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SplitCellAboveBelowOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

The new cell resulting from the split operation will be positioned above or below the original cell.

## Fields

### `SPLIT_ABOVE`

**Type:** `java.lang.String`

The value is `Above`.

### `SPLIT_BELOW`

**Type:** `java.lang.String`

The value is `Below`.

### `ARGUMENT_NAME`

**Type:** `java.lang.String`

The value is `Split point`.

## Constructors

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Document type specific table information helper.

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `splitCell(ro.sync.ecss.extensions.api.node.AuthorElement cell, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean above)`

**Parameters:**
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell to split.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to author functionality.
- `above` (`boolean`): If `true` the cell will be split above.

**Returns:** `void`

### `clearCell(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cellElem, java.lang.String[] removedAttributes)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to author functionality.
- `cellElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell to remove the specified attributes for.
- `removedAttributes` (`java.lang.String[]`): The attributes which should be removed.

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getIgnoredAttributes()`

**Returns:** `java.lang.String[]`

