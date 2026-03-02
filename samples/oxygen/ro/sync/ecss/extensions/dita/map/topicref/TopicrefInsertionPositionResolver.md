# Class: `TopicrefInsertionPositionResolver`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.TopicrefInsertionPositionResolver`

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author API.

## Methods

### `moveCaretToPosition(java.lang.String insertionLocation)`

**Returns:** `void`

**Parameters:**
- `insertionLocation` (`java.lang.String`): The insertion location.

### `getFirstPositionInNodeWhereTopicrefCanBeInserted(ro.sync.ecss.extensions.api.node.AuthorNode currentNode)`

**Returns:** `int`

**Parameters:**
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The current node.

### `canTopicRefBeInsertedAtPosition(int caretOffset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment topicrefFrag)`

**Returns:** `boolean`

**Parameters:**
- `caretOffset` (`int`): The offset.
- `topicrefFrag` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)): A fragment that contains a topicref element.

### `createTopicrefFragment()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)

### `getUsableSchemaManager()`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.AuthorSchemaManager>`

### `getElementChildren(ro.sync.ecss.extensions.api.node.AuthorNode context)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node.

### `getInsertionPositionsInNode(ro.sync.ecss.extensions.api.node.AuthorNode context)`

**Returns:** `java.util.List<java.lang.Integer>`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The context node.

