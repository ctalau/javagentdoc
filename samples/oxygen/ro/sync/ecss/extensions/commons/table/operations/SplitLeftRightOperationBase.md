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

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `decreaseColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, `boolean` left)`

**Returns:** `void`

### `getAttributesSkippedAtCopy()`

**Returns:** `java.lang.String[]`

