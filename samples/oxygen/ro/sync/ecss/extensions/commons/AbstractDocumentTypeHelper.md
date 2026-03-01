# Class: `AbstractDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](table/operations/AuthorTableHelper.md)

## Description

## Constructors

### `<init>()`

## Methods

### `isElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `java.lang.String` elemLocalName)`

**Returns:** `boolean`

### `isTableCell([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isTable([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isTableRow([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getTableElementForDeletion([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) element)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `getAllowedCellAttributesToCopy()`

**Returns:** `java.lang.String[]`

### `isContentReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

This is used in the tables to replace conreffed table rows entirely

### `isColspec([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

