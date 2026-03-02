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

### `getSortParent(int offset, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)

### `getBodyElement(ro.sync.ecss.extensions.api.node.AuthorNode currentElement)`

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md)): The current author node.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)

### `isIgnored(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getSortKeysValues(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation sortInfo)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))
- `sortInfo` ([`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](../../../sort/SortCriteriaInformation.md))

**Returns:** `java.lang.String[]`

### `getSortCriteria(ro.sync.ecss.extensions.api.node.AuthorElement parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `forceSortAll()`

**Returns:** `boolean`

### `isCaretInColumn(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int columnNumber)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md)): The author access.
- `columnNumber` (`int`): The number of the column in which to check.

**Returns:** `boolean`

### `getRowIndexForTableBody(ro.sync.ecss.extensions.api.node.AuthorNode parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../api/node/AuthorNode.md))

**Returns:** `int`

### `isTableBody(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableHead(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableFoot(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTable(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

### `isTableGroup(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md)): The element to be checked.

**Returns:** `boolean`

