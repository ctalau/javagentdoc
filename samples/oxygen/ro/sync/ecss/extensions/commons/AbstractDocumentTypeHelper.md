# Class: `AbstractDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.AbstractDocumentTypeHelper`

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](table/operations/AuthorTableHelper.md)

## Description

## Constructors

### `<init>()`

## Methods

### `isElement(AuthorNode node, String elemLocalName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The AuthorNode to be checked.
- `elemLocalName` (`java.lang.String`): The local name of the element.

**Returns:** `boolean`

### `isTableCell(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isTable(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isTableRow(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableElementForDeletion(AuthorNode element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `getAllowedCellAttributesToCopy()`

**Returns:** `java.lang.String[]`

### `isContentReference(AuthorNode node)`

This is used in the tables to replace conreffed table rows entirely

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The node

**Returns:** `boolean`

### `isColspec(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The node.

**Returns:** `boolean`

