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

### `<init>(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author API.

## Methods

### `moveCaretToPosition(String insertionLocation)`

**Parameters:**
- `insertionLocation` (`java.lang.String`): The insertion location.

**Returns:** `void`

### `getFirstPositionInNodeWhereTopicrefCanBeInserted(AuthorNode currentNode)`

**Parameters:**
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The current node.

**Returns:** `int`

### `canTopicRefBeInsertedAtPosition(int caretOffset, AuthorDocumentFragment topicrefFrag)`

**Parameters:**
- `caretOffset` (`int`): The offset.
- `topicrefFrag` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)): A fragment that contains a topicref element.

**Returns:** `boolean`

### `createTopicrefFragment()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)

### `getUsableSchemaManager()`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.AuthorSchemaManager>`

### `getElementChildren(AuthorNode context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getInsertionPositionsInNode(AuthorNode context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The context node.

**Returns:** `java.util.List<java.lang.Integer>`

