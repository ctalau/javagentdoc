# Class: `AuthorDocumentNodesCollector`

**Package:** [`ro.sync.ecss.dita.topic.ref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.topic.ref.AuthorDocumentNodesCollector`

## Description

## Fields

### `document`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../../extensions/api/node/AuthorDocument.md)

### `nodes`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

## Constructors

### `<init>(ro.sync.ecss.extensions.api.node.AuthorDocument document)`

**Parameters:**
- `document` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../../extensions/api/node/AuthorDocument.md)): The document to collect nodes from.

## Methods

### `collect(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../extensions/api/node/AuthorNode.md))

### `collect()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `collectNodes(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)): The author access for the document.

