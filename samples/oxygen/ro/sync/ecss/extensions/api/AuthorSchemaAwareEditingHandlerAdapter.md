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

### `handleDelete(`int` offset, `int` deleteType, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `boolean` wordLevel)`

**Returns:** `boolean`

### `handleDeleteElementTags([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) nodeToUnwrap, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleDeleteSelection(`int` selectionStart, `int` selectionEnd, `int` generatedByActionId, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleJoinElements([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) targetNode, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` nodesToJoin, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handlePasteFragment(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragmentsToInsert, `int` actionId, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleTyping(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `getLastResult()`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `handleCreateDocumentFragment(`int` startOffset, `int` endOffset, `int` creationPurposeID, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `handleDeleteNodes([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md) nodes, `int` deleteType, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleTypingFallback(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `changeElementsToMoveUpDown(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` selectedElements)`

**Returns:** `boolean`

For example if the current selected element is a `title` then the element
 that should actually be moved is its parent (e.g. `section` for DocBook).

### `getAncestorDetectionOptions()`

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

These are the preferences that 
 control how these ancestors are chosen.

### `canBeReplaced([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) nodeToReplace)`

**Returns:** `boolean`

This callback 
 has a chance of rejecting this behavior when, for example, the node to replace has
 important attributes set on it.

### `getPreferredElement([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) ctrl, `int` offset)`

**Returns:** `javax.xml.namespace.QName`

