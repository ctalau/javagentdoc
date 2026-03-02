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

**Parameters:**
- `offset` (`int`)
- `deleteType` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `wordLevel` (`boolean`)

**Returns:** `boolean`

### `handleDeleteElementTags(ro.sync.ecss.extensions.api.node.AuthorNode nodeToUnwrap, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `nodeToUnwrap` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `handleDeleteSelection(int selectionStart, int selectionEnd, int generatedByActionId, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `selectionStart` (`int`)
- `selectionEnd` (`int`)
- `generatedByActionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `handleJoinElements(ro.sync.ecss.extensions.api.node.AuthorNode targetNode, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> nodesToJoin, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `targetNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `nodesToJoin` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `handlePasteFragment(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, int actionId, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md))
- `actionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `handleTyping(int offset, char ch, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `getLastResult()`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `handleCreateDocumentFragment(int startOffset, int endOffset, int creationPurposeID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `startOffset` (`int`)
- `endOffset` (`int`)
- `creationPurposeID` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `handleDeleteNodes(ro.sync.ecss.extensions.api.node.AuthorNode[] nodes, int deleteType, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `nodes` ([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md))
- `deleteType` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `handleTypingFallback(int offset, char ch, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `changeElementsToMoveUpDown(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> selectedElements)`

For example if the current selected element is a `title` then the element
 that should actually be moved is its parent (e.g. `section` for DocBook).

**Parameters:**
- `selectedElements` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): the selected elements in the author page. This list should be altered
   depending on the framework specific structure.
   
  For example if the current selected element is a `title` then the element
   that should actually be present in this list is its parent (e.g. `section` for DocBook).

**Returns:** `boolean`

### `getAncestorDetectionOptions()`

These are the preferences that 
 control how these ancestors are chosen.

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

### `canBeReplaced(ro.sync.ecss.extensions.api.node.AuthorNode nodeToReplace)`

This callback 
 has a chance of rejecting this behavior when, for example, the node to replace has
 important attributes set on it.

**Parameters:**
- `nodeToReplace` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to replace.

**Returns:** `boolean`

### `getPreferredElement(ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, int offset)`

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)): Provides methods for modifying the Author document.
- `offset` (`int`): The caret offset where the insertion is performed.

**Returns:** `javax.xml.namespace.QName`

