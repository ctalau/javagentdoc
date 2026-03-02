# Class: `DocbookListSortOperation`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.DocbookListSortOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.sort.SortOperation`](./SortOperation.md)

## Description

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

### `canBeSorted(ro.sync.ecss.extensions.api.node.AuthorElement parent, int[] selectedNonIgnoredChildrenInterval)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `selectedNonIgnoredChildrenInterval` (`int[]`)

**Returns:** `void`

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation sortInfo)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md))

**Returns:** `java.lang.String[]`

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `getHelpPageID()`

**Returns:** `java.lang.String`

