# Interface: `EditPropertiesHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.EditPropertiesHandler`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

For example when a user
 double clicks on an element tag we will invoke this extension and a specific dialog
 can be presented. The user can edit different facets of that element, like attributes.
 

 It is recommended to extend class EditPropertiesHandlerAdapter in order to be protected from any
 API additions that may occur in interface EditPropertiesHandler.

## Methods

### `editProperties(ro.sync.ecss.extensions.api.node.AuthorNode authorNode, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): Author node to edit the properties for.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Author access.

### `canEditProperties(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Returns:** `boolean`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): Author node to edit the properties for.

