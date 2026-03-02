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

### `minimizeAuthorCollection(Collection<? extends AuthorNode> collection)`

**Parameters:**
- `collection` (`java.util.Collection<? extends ro.sync.ecss.extensions.api.node.AuthorNode>`): A collection of nodes.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getFirstLeaf(AuthorDocumentFragment fragment)`

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](./AuthorDocumentFragment.md)): The document fragment.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getPossibleLeaf(List<AuthorNode> children)`

**Parameters:**
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The children

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](./AuthorNode.md)

### `getFirstChildElement(AuthorParentNode parentNode)`

**Parameters:**
- `parentNode` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](./AuthorParentNode.md)): The parent element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](./AuthorElement.md)

### `getChildIndex(int offset, List<AuthorNode> children)`

**Parameters:**
- `offset` (`int`): Searched offset.
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): The list of children.

**Returns:** `int`

