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

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `splitCell([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `boolean` above)`

**Returns:** `void`

### `clearCell([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cellElem, `java.lang.String[]` removedAttributes)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getIgnoredAttributes()`

**Returns:** `java.lang.String[]`

