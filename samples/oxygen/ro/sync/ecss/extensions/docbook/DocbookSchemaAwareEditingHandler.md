# Class: `DocbookSchemaAwareEditingHandler`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.DocbookSchemaAwareEditingHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter`](../api/AuthorSchemaAwareEditingHandlerAdapter.md)

## Description

Handles typing and paste events inside itemizedlist, orderlist (a 
 listitem with a para will be created and the typing/paste content be put inside it) and tables.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `documentNamespace`

**Type:** `java.lang.String`

### `ITEMIZED_LIST`

**Type:** `java.lang.String`

### `LIST_ITEM`

**Type:** `java.lang.String`

### `SECT1`

**Type:** `java.lang.String`

### `SECT2`

**Type:** `java.lang.String`

### `SECT3`

**Type:** `java.lang.String`

### `SECT4`

**Type:** `java.lang.String`

### `SECT5`

**Type:** `java.lang.String`

### `SECTION`

**Type:** `java.lang.String`

### `ORDERED_LIST`

**Type:** `java.lang.String`

### `HTML_TABLE`

**Type:** `java.lang.String`

### `CALS_TABLE`

**Type:** `java.lang.String`

### `TABLE_HEAD`

**Type:** `java.lang.String`

### `TABLE_FOOT`

**Type:** `java.lang.String`

### `TABLE_BODY`

**Type:** `java.lang.String`

### `CALS_TABLE_ROW`

**Type:** `java.lang.String`

### `CALS_TABLE_ENTRY`

**Type:** `java.lang.String`

### `HTML_TABLE_ROW`

**Type:** `java.lang.String`

### `HTML_TABLE_ENTRY`

**Type:** `java.lang.String`

### `PARA`

**Type:** `java.lang.String`

### `TITLE`

**Type:** `java.lang.String`

### `INFO_SUFIX`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String documentNamespace)`

**Parameters:**
- `documentNamespace` (`java.lang.String`): The document namespace, for different versions of Docbook.

## Methods

### `handleTyping(int offset, char ch, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `handleTypingFallback(int offset, char ch, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `ch` (`char`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `handlePasteFragment(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, int actionId, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md))
- `actionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `handleInsertionEvent(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

**Returns:** `boolean`

### `isHTMLTable(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The author node.

**Returns:** `boolean`

### `handleInvalidInsertionEventInSect(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorSchemaManager authorSchemaManager)`

The solution is to insert the `fragmentsToInsert` into a 'title' element if the sect element is empty or
 into a 'para' element if the sect already contains a 'title' or 'info' element.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `handleInvalidInsertionEventInEmptySect(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorSchemaManager authorSchemaManager)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): Schema manager

**Returns:** `boolean`

### `getInfoElementChildOfSect(java.lang.String sectElementName)`

**Parameters:**
- `sectElementName` (`java.lang.String`): The sect element name.

**Returns:** `java.lang.String`

### `handleInvalidInsertionEventInLists(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorSchemaManager authorSchemaManager)`

The fallback is to insert 
 the `fragmentsToInsert` into a 'listitem/para' structure if is possible.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `pushContextElement(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context, java.lang.String elementName)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))
- `elementName` (`java.lang.String`)

**Returns:** `void`

### `isElementWithNameAndNamespace(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String elementLocalName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `elementLocalName` (`java.lang.String`)

**Returns:** `boolean`

### `handleInvalidInsertionEventSurroundingInPara(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorSchemaManager authorSchemaManager)`

For example 'important'.
 The fallback is to insert the `fragmentsToInsert` into a 'para' element if is possible.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `handleInvalidInsertionEventInTable(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragmentsToInsert, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorSchemaManager authorSchemaManager)`

A row element will
 be inserted (either 'row' or 'tr') with a new cell (either 'entry' or 'td') in which the fragments will be inserted.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `changeElementsToMoveUpDown(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> selectedElements)`

**Parameters:**
- `selectedElements` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)

**Returns:** `boolean`

### `getAncestorDetectionOptions()`

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

### `getPreferredElement(ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, int offset)`

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md))
- `offset` (`int`)

**Returns:** `javax.xml.namespace.QName`

### `getCurrentDocNsAttrFrag()`

**Returns:** `java.lang.String`

