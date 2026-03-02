# Interface: `AuthorDocument`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AuthorDocument`

**Extends:** [`ro.sync.ecss.extensions.api.node.AuthorParentNode`](./AuthorParentNode.md)

## Description

Conceptually, it is the root of the document tree, and provides the primary 
 access to the document's data.

## Methods

### `getRootElement()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](./AuthorElement.md)

### `getSystemID()`

**Returns:** `java.lang.String`

### `getLength()`

**Returns:** `int`

### `getElementById(String id)`

**Parameters:**
- `id` (`java.lang.String`): The ID of the searched element. Should not contain the # symbol.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../AuthorElementBaseInterface.md)

