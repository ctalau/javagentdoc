# Class: `JoinCellAboveBelowOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.JoinCellAboveBelowOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

The operation is possible only for cells that span over the same number of columns.

## Fields

### `JOIN_ABOVE`

**Type:** `java.lang.String`

### `JOIN_BELOW`

**Type:** `java.lang.String`

### `ARGUMENT_NAME`

**Type:** `java.lang.String`

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `createDeleteRowOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.DeleteRowOperationBase`](./DeleteRowOperationBase.md)

Can be overwritten by custom code.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

