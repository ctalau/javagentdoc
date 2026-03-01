# Interface: `AuthorSchemaAwareEditingHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`

## Description

The handler can either resolve a specific case, let the default implementation take place or reject the
 edit entirely by throwing an InvalidEditException.   
 

 It is recommended to extend class AuthorSchemaAwareEditingHandlerAdapter in order to be protected from any
 API additions that may occur in interface AuthorSchemaAwareEditingHandler.

## Fields

### `ACTION_ID_TYPING`

**Type:** `int`

### `ACTION_ID_DELETE`

**Type:** `int`

### `ACTION_ID_BACKSPACE`

**Type:** `int`

### `ACTION_ID_PASTE`

**Type:** `int`

### `ACTION_ID_CUT`

**Type:** `int`

### `ACTION_ID_DND`

**Type:** `int`

### `ACTION_ID_INSERT_FRAGMENT`

**Type:** `int`

### `CREATE_FRAGMENT_PURPOSE_COPY`

**Type:** `int`

### `CREATE_FRAGMENT_PURPOSE_CUT`

**Type:** `int`

### `CREATE_FRAGMENT_PURPOSE_DND_COPY`

**Type:** `int`

### `CREATE_FRAGMENT_PURPOSE_DND_MOVE`

**Type:** `int`

## Methods

### `handleDelete(`int` offset, `int` deleteType, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `boolean` wordLevel)`

**Returns:** `boolean`

### `handleDeleteNodes([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md) nodes, `int` deleteType, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleDeleteSelection(`int` selectionStart, `int` selectionEnd, `int` generatedByActionId, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

The event is generated when a selection exists inside the document and one of following actions takes place:
 
 
 - typing (insert a new character in document by typing);

 - cut;
 
 - DND move;

 - delete or backspace.

### `handlePasteFragment(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragmentsToInsert, `int` actionId, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

In this case, selection removal is handled before calling this method.
 
 - a DND action. In this case source  removal is handled after calling this method (unless an exception was thrown).
 
 - an insert fragment event occurred as a result of an schema aware insert event, 
 like AuthorDocumentController#insertXMLFragmentSchemaAware(String, int). Selection removal is handled 
 before calling this method.

### `handleTyping(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

If the event is not handled, the default implementation 
 of a handler will be given a chance to handle the event. If that fails to
 provide a solution, #handleTypingFallback(int, char, AuthorAccess)
 will get called.

### `handleCodePointTyping(`int` offset, `int` codePoint, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

If the event is not handled, the default implementation 
 of a handler will be given a chance to handle the event. If that fails to
 provide a solution, #handleCodePointTypingFallback(int, int, AuthorAccess)
 will get called.

### `handleTypingFallback(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

This call comes when this object's
 #handleTyping(int, char, AuthorAccess) method did not handle the 
 typing event and neither did the #handleTyping(int, char, AuthorAccess) from
 the default implementation. 
 
As a fallback solution, a paragraph can be inserted at the given offset 
 (if allowed) and then the typed character can be inserted inside it.

### `handleCodePointTypingFallback(`int` offset, `int` codePoint, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

This call comes when this object's
 #handleCodePointTyping(int, int, AuthorAccess) method did not handle the 
 typing event and neither did the #handleCodePointTyping(int, int, AuthorAccess) 
 from the default implementation. 
 
As a fallback solution, a paragraph can be inserted at the given offset 
 (if allowed) and then the typed character can be inserted inside it.

### `handleDeleteElementTags([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) nodeToUnwrap, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

(Unwrapping)

### `handleJoinElements([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) targetNode, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` nodesToJoin, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleCreateDocumentFragment(`int` startOffset, `int` endOffset, `int` creationPurposeID, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

