# Class: `SplitOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SplitOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Parameters:**
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper with methods specific to a document type.

## Methods

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `getSplitInfoFromArguments(ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `int[]`

**Parameters:**
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md)): The map of arguments.

### `splitNoInitialSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cell, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, ro.sync.ecss.extensions.api.AuthorDocumentController controller, int nrOfColumnsForSplit, int nrOfRowsForSplit)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell to span.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent table element
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The Author document controller
- `nrOfColumnsForSplit` (`int`): The split columns number
- `nrOfRowsForSplit` (`int`): The split rows number

### `getInsertRowOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`](./InsertRowOperationBase.md)

### `getInsertColumnOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.InsertColumnOperationBase`](./InsertColumnOperationBase.md)

### `getJoinOperation()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.JoinOperationBase`](./JoinOperationBase.md)

### `splitWithInitialSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement cell, ro.sync.ecss.extensions.api.node.AuthorElement tableElem, int initialRowSpan, int initialColSpan, ro.sync.ecss.extensions.api.AuthorDocumentController controller, int nrOfColumnsForSplit, int nrOfRowsForSplit)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell to span.
- `tableElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent table element
- `initialRowSpan` (`int`): Initial row span
- `initialColSpan` (`int`): Initial column span
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The Author document controller
- `nrOfColumnsForSplit` (`int`): The split columns number
- `nrOfRowsForSplit` (`int`): The split rows number

### `determineCurrentSpan(int currentSpan, int countForSplit, int initialSpan, int i)`

**Returns:** `int`

**Parameters:**
- `currentSpan` (`int`): The last computed span.
- `countForSplit` (`int`): The new number of cells.
- `initialSpan` (`int`): The initial span of the the cell which will be split.
- `i` (`int`): The current step.

### `getDescription()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getIgnoredAttributesForRowSplit()`

**Returns:** `java.lang.String[]`

### `getIgnoredAttributesForColumnSplit()`

**Returns:** `java.lang.String[]`

### `updateColSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement cell, int colSpan)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to author functionality.
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)): The table cell span support.
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table cell to update the column span for.
- `colSpan` (`int`): The number of columns that this cell spans over

### `getHelpPageID()`

**Returns:** `java.lang.String`

