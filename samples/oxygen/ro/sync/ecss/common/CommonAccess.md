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

### `setCommonAccessCustomizer(b arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.common.b`)

**Returns:** `void`

### `insertXIncludeAtOffset(AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `void`

### `computeXIncludeStringForNodeAtOffset(AuthorAccess arg0, int arg1, c arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.exml.j.c`)

**Returns:** `java.lang.String`

### `insertXIncludeAtOffset(AuthorAccess arg0, int arg1, c arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.exml.j.c`)

**Returns:** `void`

### `insertXInclude(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `pasteContentAsXInclude(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `d(AuthorWorkspaceAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../extensions/api/access/AuthorWorkspaceAccess.md))

**Returns:** `void`

### `getAuthorActionEventHandler(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../extensions/api/AuthorActionEventHandler.md)

### `getContentReferencedNode(ExtensionsBundle arg0, AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ExtensionsBundle`](../extensions/api/ExtensionsBundle.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md)

### `toggleComment(AuthorAccess arg0, AuthorNode arg1, int arg2, int arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg2` (`int`)
- `arg3` (`int`)

**Returns:** `void`

### `isToggleCommentPossibleOnSelection(AuthorAccess arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `boolean`

### `isNodeCoveredBySimplePathExpression(AuthorNode arg0, List<String> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.List<java.lang.String>`)

**Returns:** `boolean`

### `invokeLater(Runnable arg0)`

**Parameters:**
- `arg0` (`java.lang.Runnable`)

**Returns:** `void`

### `createAuthorDocumentProvider(URL arg0, Reader arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../extensions/api/node/AuthorDocumentProvider.md)

