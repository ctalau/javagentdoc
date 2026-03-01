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

### `getSortParent(`int` offset, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isIgnored([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getSortKeysValues([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md) sortInfo)`

**Returns:** `java.lang.String[]`

### `getSortCriteria([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) parent)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `int` columnNumber)`

**Returns:** `boolean`

### `getRowIndexForTableBody([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) table)`

**Returns:** `int`

### `isTableElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isHeadElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isRowElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

