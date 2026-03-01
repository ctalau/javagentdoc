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

### `<init>([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

## Methods

### `moveCaretToPosition(`java.lang.String` insertionLocation)`

**Returns:** `void`

### `getFirstPositionInNodeWhereTopicrefCanBeInserted([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) currentNode)`

**Returns:** `int`

### `canTopicRefBeInsertedAtPosition(`int` caretOffset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md) topicrefFrag)`

**Returns:** `boolean`

### `createTopicrefFragment()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)

### `getUsableSchemaManager()`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.AuthorSchemaManager>`

### `getElementChildren([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) context)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getInsertionPositionsInNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) context)`

**Returns:** `java.util.List<java.lang.Integer>`

