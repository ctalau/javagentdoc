# Class: `CALSAndHTMLTableSortOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.CALSAndHTMLTableSortOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.sort.TableSortOperation`](../../../sort/TableSortOperation.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getSortParent(int offset, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)

### `getBodyElement(AuthorNode currentElement)`

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md)): The current author node.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)

### `isIgnored(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getSortKeysValues(AuthorNode node, SortCriteriaInformation sortInfo)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](../../../sort/SortCriteriaInformation.md))

**Returns:** `java.lang.String[]`

### `getSortCriteria(AuthorElement parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn(AuthorAccess authorAccess, int columnNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md)): The author access.
- `columnNumber` (`int`): The number of the column in which to check.

**Returns:** `boolean`

### `getRowIndexForTableBody(AuthorNode parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))

**Returns:** `int`

### `isTableBody(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableRow(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableHead(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableFoot(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTable(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableGroup(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

