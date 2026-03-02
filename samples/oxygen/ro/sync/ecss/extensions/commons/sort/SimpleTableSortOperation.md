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

**Parameters:**
- `offset` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isIgnored(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation sortInfo)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

**Returns:** `java.lang.String[]`

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int columnNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `columnNumber` (`int`): The number of the column in which to check.

**Returns:** `boolean`

### `getRowIndexForTableBody(ro.sync.ecss.extensions.api.node.AuthorNode table)`

**Parameters:**
- `table` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `int`

### `isTableElement(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isHeadElement(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isRowElement(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

