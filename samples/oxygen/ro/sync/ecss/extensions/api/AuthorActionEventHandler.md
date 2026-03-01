# Interface: `AuthorActionEventHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorActionEventHandler`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

Since 19.0 an AuthorActionEventHandlerBase extended API base has been added which can be extended to provide additional functionality.

## Methods

### `handleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType` eventType)`

**Returns:** `boolean`

### `canHandleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType` eventType)`

**Returns:** `boolean`

### `canHandleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorActionEventDetails`](./AuthorActionEventDetails.md) eventDetails)`

**Returns:** `boolean`

### `getListItemAncestorToSplit([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

