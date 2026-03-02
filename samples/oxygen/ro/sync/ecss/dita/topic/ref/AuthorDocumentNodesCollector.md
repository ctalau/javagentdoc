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

### `<init>(AuthorDocument document)`

**Parameters:**
- `document` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../../extensions/api/node/AuthorDocument.md)): The document to collect nodes from.

## Methods

### `collect(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../extensions/api/node/AuthorNode.md))

**Returns:** `void`

### `collect()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `collectNodes(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)): The author access for the document.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

