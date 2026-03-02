# Interface: `AuthorActionEventHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorActionEventHandler`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

Since 19.0 an AuthorActionEventHandlerBase extended API base has been added which can be extended to provide additional functionality.

## Methods

### `handleEvent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType eventType)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Author access.
- `eventType` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`): The type of the generated event.

### `canHandleEvent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType eventType)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access to the Author API.
- `eventType` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`): The type of event generated.

### `canHandleEvent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorActionEventDetails eventDetails)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access to the Author API.
- `eventDetails` ([`ro.sync.ecss.extensions.api.AuthorActionEventDetails`](./AuthorActionEventDetails.md)): The details of the event generated.

### `getListItemAncestorToSplit(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node.
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access object to the Author API.

