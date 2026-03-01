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

### `isHTMLTable([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `handleInvalidInsertionEventInSect(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The solution is to insert the `fragmentsToInsert` into a 'title' element if the sect element is empty or
 into a 'para' element if the sect already contains a 'title' or 'info' element.

### `handleInvalidInsertionEventInEmptySect(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

### `getInfoElementChildOfSect(`java.lang.String` sectElementName)`

**Returns:** `java.lang.String`

### `handleInvalidInsertionEventInLists(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The fallback is to insert 
 the `fragmentsToInsert` into a 'listitem/para' structure if is possible.

### `pushContextElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementName)`

**Returns:** `void`

### `isElementWithNameAndNamespace([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `java.lang.String` elementLocalName)`

**Returns:** `boolean`

### `handleInvalidInsertionEventSurroundingInPara(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

For example 'important'.
 The fallback is to insert the `fragmentsToInsert` into a 'para' element if is possible.

### `handleInvalidInsertionEventInTable(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

A row element will
 be inserted (either 'row' or 'tr') with a new cell (either 'entry' or 'td') in which the fragments will be inserted.

### `changeElementsToMoveUpDown(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` selectedElements)`

**Returns:** `boolean`

### `getAncestorDetectionOptions()`

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

### `getPreferredElement([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md) ctrl, `int` offset)`

**Returns:** `javax.xml.namespace.QName`

### `getCurrentDocNsAttrFrag()`

**Returns:** `java.lang.String`

