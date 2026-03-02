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

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

**Parameters:**
- `collection` (`java.util.Collection<? extends ro.sync.ecss.extensions.api.node.AuthorNode>`): A collection of nodes.

### `getFirstLeaf(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](./AuthorDocumentFragment.md)): The document fragment.

### `getPossibleLeaf(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> children)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

**Parameters:**
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The children

### `getFirstChildElement(ro.sync.ecss.extensions.api.node.AuthorParentNode parentNode)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](./AuthorElement.md)

**Parameters:**
- `parentNode` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](./AuthorParentNode.md)): The parent element.

### `getChildIndex(int offset, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> children)`

**Returns:** `int`

**Parameters:**
- `offset` (`int`): Searched offset.
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The list of children.

