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

### `getSortParent(int offset, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `offset` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `isIgnored(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation sortInfo)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement parent)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int columnNumber)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `columnNumber` (`int`): The number of the column in which to check.

### `getRowIndexForTableBody(ro.sync.ecss.extensions.api.node.AuthorNode table)`

**Returns:** `int`

**Parameters:**
- `table` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `isTableElement(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

### `isHeadElement(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

### `isRowElement(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

