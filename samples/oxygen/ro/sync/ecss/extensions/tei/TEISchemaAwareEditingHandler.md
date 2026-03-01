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

### `<init>(`java.lang.String` documentNamespace)`

## Methods

### `handleTyping(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleTypingFallback(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handlePasteFragment(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, `int` actionId, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleInsertionEvent(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleInvalidInsertionEventInLists(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The solution is to insert the `fragmentsToInsert` into a 'item' element if is possible.

### `pushContextElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementName)`

**Returns:** `void`

### `isElementWithNameAndNamespace([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `java.lang.String` elementLocalName)`

**Returns:** `boolean`

### `handleInvalidInsertionEventInTable(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

A row element will be inserted with a new cell in which the fragments will be inserted.

### `changeElementsToMoveUpDown(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` selectedElements)`

**Returns:** `boolean`

