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

### `getSortParent(`int` offset, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)

### `getBodyElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) currentElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)

### `isIgnored([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getSortKeysValues([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](../../../sort/SortCriteriaInformation.md) sortInfo)`

**Returns:** `java.lang.String[]`

### `getSortCriteria([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) parent)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, `int` columnNumber)`

**Returns:** `boolean`

### `getRowIndexForTableBody([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md) parent)`

**Returns:** `int`

### `isTableBody([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isTableRow([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isTableHead([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isTableFoot([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isTable([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isTableGroup([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

