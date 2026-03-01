# Class: `TopicrefMoveAction`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.TopicrefMoveAction`

## Description

The type of transition is generic and depends on the 
 insertion position and target XPath location

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `targetLocation`

**Type:** `java.lang.String`

### `sourceLocation`

**Type:** `java.lang.String`

Can be null

### `relativePosition`

**Type:** `java.lang.String`

### `editor`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../../api/access/AuthorEditorAccess.md)

### `controller`

**Type:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)

### `toMoveNodeLocator`

**Type:** `ro.sync.ecss.extensions.dita.map.topicref.TopicrefMoveAction.NodeSupplier`

## Constructors

### `<init>(`ro.sync.ecss.extensions.dita.map.topicref.TopicrefMoveAction.Builder` builder)`

## Methods

### `execute()`

**Returns:** `void`

### `moveNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) toMoveNode)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

### `locateNodeByXPath()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

### `locateNodeAtCaret()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)

### `builder()`

**Returns:** `ro.sync.ecss.extensions.dita.map.topicref.TopicrefMoveAction.Builder`

