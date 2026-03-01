# Class: `CommonAccess`

**Package:** [`ro.sync.ecss.common`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.common.CommonAccess`

## Fields

### `c`

**Type:** `org.slf4j.Logger`

### `d`

**Type:** `ro.sync.i18n.c`

### `b`

**Type:** `ro.sync.ecss.common.b`

## Constructors

### `<init>()`

## Methods

### `setCommonAccessCustomizer(`ro.sync.ecss.common.b` arg0)`

**Returns:** `void`

### `insertXIncludeAtOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1)`

**Returns:** `void`

### `computeXIncludeStringForNodeAtOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1, `ro.sync.exml.j.c` arg2)`

**Returns:** `java.lang.String`

### `insertXIncludeAtOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1, `ro.sync.exml.j.c` arg2)`

**Returns:** `void`

### `insertXInclude([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `pasteContentAsXInclude([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `d([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../extensions/api/access/AuthorWorkspaceAccess.md) arg0)`

**Returns:** `void`

### `getAuthorActionEventHandler([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../extensions/api/AuthorActionEventHandler.md)

### `getContentReferencedNode([`ro.sync.ecss.extensions.api.ExtensionsBundle`](../extensions/api/ExtensionsBundle.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md)

### `toggleComment([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg1, `int` arg2, `int` arg3)`

**Returns:** `void`

### `isToggleCommentPossibleOnSelection([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1, `int` arg2)`

**Returns:** `boolean`

### `isNodeCoveredBySimplePathExpression([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `java.util.List<java.lang.String>` arg1)`

**Returns:** `boolean`

### `invokeLater(`java.lang.Runnable` arg0)`

**Returns:** `void`

### `createAuthorDocumentProvider(`java.net.URL` arg0, `java.io.Reader` arg1, `boolean` arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../extensions/api/node/AuthorDocumentProvider.md)

