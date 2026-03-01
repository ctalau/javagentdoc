# Class: `XHTMLListSortOperation`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.XHTMLListSortOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.sort.SortOperation`](./SortOperation.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getSortParent(`int` offset, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isIgnored([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `canBeSorted([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) parent, `int[]` selectedNonIgnoredChildrenInterval)`

**Returns:** `void`

### `getSortKeysValues([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md) sortInfo)`

**Returns:** `java.lang.String[]`

### `getSortCriteria([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) parent)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `getHelpPageID()`

**Returns:** `java.lang.String`

