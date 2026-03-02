# Class: `TEISchemaAwareEditingHandler`

**Package:** [`ro.sync.ecss.extensions.tei`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.TEISchemaAwareEditingHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter`](../api/AuthorSchemaAwareEditingHandlerAdapter.md)

## Description

Handles typing and paste events inside list (a item with a para will be 
 created and the typing/paste content be put inside it) and tables.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `documentNamespace`

**Type:** `java.lang.String`

### `LIST`

**Type:** `java.lang.String`

### `PARAGRAPH`

**Type:** `java.lang.String`

### `LIST_ITEM`

**Type:** `java.lang.String`

### `TABLE`

**Type:** `java.lang.String`

### `TABLE_ROW`

**Type:** `java.lang.String`

### `TABLE_CELL`

**Type:** `java.lang.String`

### `HEAD`

**Type:** `java.lang.String`

## Constructors

### `<init>(String documentNamespace)`

**Parameters:**
- `documentNamespace` (`java.lang.String`): The document namespace, for different versions of TEI.

## Methods

### `handleTyping(int offset, char ch, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `handleTypingFallback(int offset, char ch, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `handlePasteFragment(int offset, AuthorDocumentFragment[] fragmentsToInsert, int actionId, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md))
- `actionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `handleInsertionEvent(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

**Returns:** `boolean`

### `handleInvalidInsertionEventInLists(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

The solution is to insert the `fragmentsToInsert` into a 'item' element if is possible.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `pushContextElement(WhatElementsCanGoHereContext context, String elementName)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))
- `elementName` (`java.lang.String`)

**Returns:** `void`

### `isElementWithNameAndNamespace(AuthorNode node, String elementLocalName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `elementLocalName` (`java.lang.String`)

**Returns:** `boolean`

### `handleInvalidInsertionEventInTable(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

A row element will be inserted with a new cell in which the fragments will be inserted.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `changeElementsToMoveUpDown(List<AuthorNode> selectedElements)`

**Parameters:**
- `selectedElements` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)

**Returns:** `boolean`

