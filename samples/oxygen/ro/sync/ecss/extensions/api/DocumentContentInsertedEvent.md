# Interface: `DocumentContentInsertedEvent`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`

**Extends:** [`ro.sync.ecss.extensions.api.DocumentContentChangedEvent`](./DocumentContentChangedEvent.md)

## Description

It can have one of the types:
 DocumentContentChangedEvent#INSERT_TEXT_EVENT
 DocumentContentChangedEvent#INSERT_NODE_EVENT
 DocumentContentChangedEvent#INSERT_FRAGMENT_EVENT

## Methods

### `getInsertedText()`

**Returns:** `java.lang.String`

### `getInsertedNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getInsertedFragment()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

