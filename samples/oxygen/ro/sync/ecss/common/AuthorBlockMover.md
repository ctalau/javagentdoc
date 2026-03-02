# Class: `AuthorBlockMover`

**Package:** [`ro.sync.ecss.common`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.common.AuthorBlockMover`

## Fields

### `d`

**Type:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md)

### `b`

**Type:** [`ro.sync.ecss.extensions.api.AuthorSelectionModel`](../extensions/api/AuthorSelectionModel.md)

### `c`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md)

## Constructors

### `<init>(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

## Methods

### `d(AuthorBlockMover._b arg0, db arg1)`

**Parameters:**
- `arg0` (`ro.sync.ecss.common.AuthorBlockMover._b`)
- `arg1` (`ro.sync.ecss.css.db`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `b(List<AuthorNode> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)

**Returns:** `boolean`

### `e()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `g()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md)

### `i(List<AuthorNode> arg0, AuthorBlockMover._b arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` (`ro.sync.ecss.common.AuthorBlockMover._b`)

**Returns:** `int`

### `h(List<AuthorNode> arg0, ContextElement arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` ([`ro.sync.contentcompletion.xml.ContextElement`](../../contentcompletion/xml/ContextElement.md))

**Returns:** `boolean`

### `c()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](../extensions/api/AuthorSchemaAwareEditingHandler.md)

### `moveBlock(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `moveBlock(AuthorBlockMover._b arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.common.AuthorBlockMover._b`)

**Returns:** `void`

### `f(int arg0, AuthorDocumentFragment[] arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../extensions/api/node/AuthorDocumentFragment.md))

**Returns:** `void`

