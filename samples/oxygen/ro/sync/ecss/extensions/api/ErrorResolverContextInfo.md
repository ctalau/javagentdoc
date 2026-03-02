# Class: `ErrorResolverContextInfo`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ErrorResolverContextInfo`

## Description

## Fields

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)

### `contextNode`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

## Constructors

### `<init>(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The AuthorAccess.

### `<init>(AuthorAccess authorAccess, AuthorNode contextNode)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The AuthorAccess.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The error context node.

## Methods

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)

### `setAuthorAccess(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The new author access.

**Returns:** `void`

### `getContextNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `setContextNode(AuthorNode contextNode)`

**Parameters:**
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The error context node.

**Returns:** `void`

