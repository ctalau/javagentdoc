# Class: `EditPropertiesHandlerAdapter`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.EditPropertiesHandlerAdapter`

**Implements:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](./EditPropertiesHandler.md)

## Description

A custom implementation to handle editing properties for an author node. For example when a user
 double clicks on an element tag we will invoke this extension and a specific dialog
 can be presented. The user can edit different facets of that element, like attributes.

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `editProperties([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) authorNode, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `canEditProperties([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) authorNode)`

**Returns:** `boolean`

