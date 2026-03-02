# Class: `AuthorSchemaAwareEditingHandlerAdapter`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](./AuthorSchemaAwareEditingHandler.md)

## Description

## Fields

### `lastHandlerResult`

**Type:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

## Constructors

### `<init>()`

## Methods

### `handleDelete(int offset, int deleteType, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean wordLevel)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`)
- `deleteType` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `wordLevel` (`boolean`)

### `handleDeleteElementTags(ro.sync.ecss.extensions.api.node.AuthorNode nodeToUnwrap, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `nodeToUnwrap` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `handleDeleteSelection(int selectionStart, int selectionEnd, int generatedByActionId, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `selectionStart` (`int`)
- `selectionEnd` (`int`)
- `generatedByActionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `handleJoinElements(ro.sync.ecss.extensions.api.node.AuthorNode targetNode, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> nodesToJoin, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `targetNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `nodesToJoin` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `handlePasteFragment(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, int actionId, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`)
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md))
- `actionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `handleTyping(int offset, char ch, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `getLastResult()`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `handleCreateDocumentFragment(int startOffset, int endOffset, int creationPurposeID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

**Parameters:**
- `startOffset` (`int`)
- `endOffset` (`int`)
- `creationPurposeID` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `handleDeleteNodes(ro.sync.ecss.extensions.api.node.AuthorNode[] nodes, int deleteType, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `nodes` ([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md))
- `deleteType` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `handleTypingFallback(int offset, char ch, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `changeElementsToMoveUpDown(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> selectedElements)`

**Returns:** `boolean`

For example if the current selected element is a `title` then the element
 that should actually be moved is its parent (e.g. `section` for DocBook).

**Parameters:**
- `selectedElements` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): the selected elements in the author page. This list should be altered
 depending on the framework specific structure.
 
For example if the current selected element is a `title` then the element
 that should actually be present in this list is its parent (e.g. `section` for DocBook).

### `getAncestorDetectionOptions()`

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

These are the preferences that 
 control how these ancestors are chosen.

### `canBeReplaced(ro.sync.ecss.extensions.api.node.AuthorNode nodeToReplace)`

**Returns:** `boolean`

This callback 
 has a chance of rejecting this behavior when, for example, the node to replace has
 important attributes set on it.

**Parameters:**
- `nodeToReplace` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to replace.

### `getPreferredElement(ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, int offset)`

**Returns:** `javax.xml.namespace.QName`

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)): Provides methods for modifying the Author document.
- `offset` (`int`): The caret offset where the insertion is performed.

