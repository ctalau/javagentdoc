# Class: `SimpleTableSortOperation`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.SimpleTableSortOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.sort.TableSortOperation`](./TableSortOperation.md)

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
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isIgnored(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getSortKeysValues(AuthorNode node, SortCriteriaInformation sortInfo)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

**Returns:** `java.lang.String[]`

### `getSortCriteria(AuthorElement parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn(AuthorAccess authorAccess, int columnNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `columnNumber` (`int`): The number of the column in which to check.

**Returns:** `boolean`

### `getRowIndexForTableBody(AuthorNode table)`

**Parameters:**
- `table` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `int`

### `isTableElement(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isHeadElement(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isRowElement(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

