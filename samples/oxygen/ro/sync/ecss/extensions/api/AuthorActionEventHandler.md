# Interface: `AuthorActionEventHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorActionEventHandler`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

Since 19.0 an AuthorActionEventHandlerBase extended API base has been added which can be extended to provide additional functionality.

## Methods

### `handleEvent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType eventType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Author access.
- `eventType` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`): The type of the generated event.

**Returns:** `boolean`

### `canHandleEvent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType eventType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access to the Author API.
- `eventType` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`): The type of event generated.

**Returns:** `boolean`

### `canHandleEvent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorActionEventDetails eventDetails)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access to the Author API.
- `eventDetails` ([`ro.sync.ecss.extensions.api.AuthorActionEventDetails`](./AuthorActionEventDetails.md)): The details of the event generated.

**Returns:** `boolean`

### `getListItemAncestorToSplit(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess access)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node.
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access object to the Author API.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

