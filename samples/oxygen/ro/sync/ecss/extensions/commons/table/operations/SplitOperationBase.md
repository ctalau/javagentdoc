# Class: `SplitOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SplitOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getSplitInfoFromArguments([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `int[]`

### `splitNoInitialSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, `int` nrOfColumnsForSplit, `int` nrOfRowsForSplit)`

**Returns:** `void`

### `getInsertRowOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md)

### `getInsertColumnOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.InsertColumnOperationBase`](./InsertColumnOperationBase.md)

### `getJoinOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.JoinOperationBase`](./JoinOperationBase.md)

### `splitWithInitialSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElem, `int` initialRowSpan, `int` initialColSpan, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, `int` nrOfColumnsForSplit, `int` nrOfRowsForSplit)`

**Returns:** `void`

### `determineCurrentSpan(`int` currentSpan, `int` countForSplit, `int` initialSpan, `int` i)`

**Returns:** `int`

### `getDescription()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getIgnoredAttributesForRowSplit()`

**Returns:** `java.lang.String[]`

### `getIgnoredAttributesForColumnSplit()`

**Returns:** `java.lang.String[]`

### `updateColSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, `int` colSpan)`

**Returns:** `void`

### `getHelpPageID()`

**Returns:** `java.lang.String`

