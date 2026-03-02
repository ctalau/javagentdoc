# Class: `AuthorNodeUtil`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AuthorNodeUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ATTRIBUTE_VALUE_MARKER`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `minimizeAuthorCollection(java.util.Collection<? extends ro.sync.ecss.extensions.api.node.AuthorNode> collection)`

**Parameters:**
- `collection` (`java.util.Collection<? extends ro.sync.ecss.extensions.api.node.AuthorNode>`): A collection of nodes.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getFirstLeaf(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment)`

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](./AuthorDocumentFragment.md)): The document fragment.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getPossibleLeaf(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> children)`

**Parameters:**
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The children

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getFirstChildElement(ro.sync.ecss.extensions.api.node.AuthorParentNode parentNode)`

**Parameters:**
- `parentNode` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](./AuthorParentNode.md)): The parent element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](./AuthorElement.md)

### `getChildIndex(int offset, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> children)`

**Parameters:**
- `offset` (`int`): Searched offset.
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The list of children.

**Returns:** `int`

