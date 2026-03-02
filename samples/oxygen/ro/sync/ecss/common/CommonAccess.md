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

### `setCommonAccessCustomizer(ro.sync.ecss.common.b arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.common.b`)

**Returns:** `void`

### `insertXIncludeAtOffset(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `void`

### `computeXIncludeStringForNodeAtOffset(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, ro.sync.exml.j.c arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.exml.j.c`)

**Returns:** `java.lang.String`

### `insertXIncludeAtOffset(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, ro.sync.exml.j.c arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.exml.j.c`)

**Returns:** `void`

### `insertXInclude(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `pasteContentAsXInclude(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `d(ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../extensions/api/access/AuthorWorkspaceAccess.md))

**Returns:** `void`

### `getAuthorActionEventHandler(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../extensions/api/AuthorActionEventHandler.md)

### `getContentReferencedNode(ro.sync.ecss.extensions.api.ExtensionsBundle arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ExtensionsBundle`](../extensions/api/ExtensionsBundle.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md)

### `toggleComment(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1, int arg2, int arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg2` (`int`)
- `arg3` (`int`)

**Returns:** `void`

### `isToggleCommentPossibleOnSelection(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `boolean`

### `isNodeCoveredBySimplePathExpression(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.util.List<java.lang.String> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.List<java.lang.String>`)

**Returns:** `boolean`

### `invokeLater(java.lang.Runnable arg0)`

**Parameters:**
- `arg0` (`java.lang.Runnable`)

**Returns:** `void`

### `createAuthorDocumentProvider(java.net.URL arg0, java.io.Reader arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../extensions/api/node/AuthorDocumentProvider.md)

