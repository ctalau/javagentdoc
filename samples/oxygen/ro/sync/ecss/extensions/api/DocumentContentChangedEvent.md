# Interface: `DocumentContentChangedEvent`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DocumentContentChangedEvent`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorDocumentEvent`](./AuthorDocumentEvent.md)

## Description

## Fields

### `INSERT_TEXT_EVENT`

**Type:** `int`

### `INSERT_NODE_EVENT`

**Type:** `int`

### `INSERT_FRAGMENT_EVENT`

**Type:** `int`

### `DELETE_TEXT_EVENT`

**Type:** `int`

### `DELETE_FRAGMENT_EVENT`

**Type:** `int`

## Methods

### `getLength()`

**Returns:** `int`

### `getOffset()`

**Returns:** `int`

### `getParentNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `isSimpleTextEdit()`

**Returns:** `boolean`

### `getType()`

**Returns:** `int`

It can be one of the constants:
 #INSERT_TEXT_EVENT, #INSERT_FRAGMENT_EVENT, #INSERT_NODE_EVENT
 #DELETE_TEXT_EVENT, #DELETE_FRAGMENT_EVENT

