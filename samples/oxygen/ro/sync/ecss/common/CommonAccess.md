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

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.common.b`)

### `insertXIncludeAtOffset(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

### `computeXIncludeStringForNodeAtOffset(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, ro.sync.exml.j.c arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.exml.j.c`)

### `insertXIncludeAtOffset(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, ro.sync.exml.j.c arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.exml.j.c`)

### `insertXInclude(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `pasteContentAsXInclude(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `d(ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../extensions/api/access/AuthorWorkspaceAccess.md))

### `getAuthorActionEventHandler(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../extensions/api/AuthorActionEventHandler.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `getContentReferencedNode(ro.sync.ecss.extensions.api.ExtensionsBundle arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ExtensionsBundle`](../extensions/api/ExtensionsBundle.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

### `toggleComment(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1, int arg2, int arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg2` (`int`)
- `arg3` (`int`)

### `isToggleCommentPossibleOnSelection(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, int arg2)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`int`)

### `isNodeCoveredBySimplePathExpression(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.util.List<java.lang.String> arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.List<java.lang.String>`)

### `invokeLater(java.lang.Runnable arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.Runnable`)

### `createAuthorDocumentProvider(java.net.URL arg0, java.io.Reader arg1, boolean arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../extensions/api/node/AuthorDocumentProvider.md)

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)
- `arg2` (`boolean`)

