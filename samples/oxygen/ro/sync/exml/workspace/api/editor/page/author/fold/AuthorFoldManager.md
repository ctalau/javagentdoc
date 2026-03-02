# Interface: `AuthorFoldManager`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.fold`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.fold.AuthorFoldManager`

## Description

The CSS is used to mark nodes as foldable:
 
 https://www.oxygenxml.com/doc/ug-oxygen/#topics/dg-folding-elements.html

## Methods

### `isFoldable(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)): The Author Node.

**Returns:** `boolean`

### `isFolded(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)): The Author Node.

**Returns:** `boolean`

### `expandFold(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)): The Author Node.

**Returns:** `void`

### `collapseFold(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)): The Author Node.

**Returns:** `void`

