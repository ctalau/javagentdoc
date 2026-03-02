# Class: `DocbookListSortOperation`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.DocbookListSortOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.sort.SortOperation`](./SortOperation.md)

## Description

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

### `canBeSorted(ro.sync.ecss.extensions.api.node.AuthorElement parent, int[] selectedNonIgnoredChildrenInterval)`

**Returns:** `void`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `selectedNonIgnoredChildrenInterval` (`int[]`)

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation sortInfo)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement parent)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `getHelpPageID()`

**Returns:** `java.lang.String`

