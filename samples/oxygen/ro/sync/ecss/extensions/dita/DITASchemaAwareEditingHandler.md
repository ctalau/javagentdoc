# Class: `DITASchemaAwareEditingHandler`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITASchemaAwareEditingHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter`](../api/AuthorSchemaAwareEditingHandlerAdapter.md)

## Description

Handles typing and paste events inside steps, steps-unordered (a 
 new step with a cmd will be created and the typing/paste content be put inside it) and tables (CALS and simple).

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ROOT`

**Type:** `java.lang.String`

### `PARAGRAPH_ELEMENT_NAME`

**Type:** `java.lang.String`

### `CLASS_ATTR`

**Type:** `java.lang.String`

### `DESC_CLASS`

**Type:** `java.lang.String`

### `XREF_CLASS`

**Type:** `java.lang.String`

### `RELATED_LINKS_CLASS`

**Type:** `java.lang.String`

### `LINK_CLASS`

**Type:** `java.lang.String`

### `LINKTEXT_CLASS`

**Type:** `java.lang.String`

### `LINKPOOL_CLASS`

**Type:** `java.lang.String`

### `LINKLIST_CLASS`

**Type:** `java.lang.String`

### `STEPS_CLASS`

**Type:** `java.lang.String`

### `STEP_CLASS`

**Type:** `java.lang.String`

### `STEPS_UNORDERED_CLASS`

**Type:** `java.lang.String`

### `SIMPLE_TABLE_CLASS`

**Type:** `java.lang.String`

### `SIMPLE_TABLE_ROW_CLASS`

**Type:** `java.lang.String`

### `SIMPLE_TABLE_ENTRY_CLASS`

**Type:** `java.lang.String`

### `REL_TABLE_CLASS`

**Type:** `java.lang.String`

### `REL_TABLE_ROW_CLASS`

**Type:** `java.lang.String`

### `REL_TABLE_ENTRY_CLASS`

**Type:** `java.lang.String`

### `TABLE_HEAD_CLASS`

**Type:** `java.lang.String`

### `TABLE_BODY_CLASS`

**Type:** `java.lang.String`

### `CALS_TABLE_ROW_CLASS`

**Type:** `java.lang.String`

### `CALS_TABLE_ENTRY_CLASS`

**Type:** `java.lang.String`

### `CMD_CLASS`

**Type:** `java.lang.String`

### `TOPIC_CLASS`

**Type:** `java.lang.String`

### `TITLE_CLASS`

**Type:** `java.lang.String`

### `PARAGRAPH_CLASS`

**Type:** `java.lang.String`

### `TITLEALTS_CLASS`

**Type:** `java.lang.String`

### `NAVTITLE_CLASS`

**Type:** `java.lang.String`

### `SEARCHTITLE_CLASS`

**Type:** `java.lang.String`

### `BODY_ELEMENT`

**Type:** `java.lang.String`

### `MATHML_NS`

**Type:** `java.lang.String`

### `GENERAL_BAD`

**Type:** `java.util.Set<javax.xml.namespace.QName>`

## Constructors

### `<init>()`

## Methods

### `handleTyping(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleTypingFallback(`int` offset, `char` ch, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleInsertContent(`int` offset, `java.lang.String` content, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `createFragment(`java.util.Iterator<java.lang.String>` iterator, `java.lang.StringBuilder` xmlFragment)`

**Returns:** `void`

### `handlePasteFragment(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, `int` actionId, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `convertXrefToLink([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../api/node/AuthorDocumentFragment.md) xrefsFragment, [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md) linkElement, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md) ctrl, `int` offsetInsideRelatedLinks)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../api/node/AuthorDocumentFragment.md)

### `acceptsAttr(`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>` acceptedAttrs, `java.lang.String` attributeName)`

**Returns:** `boolean`

### `handleInsertionEvent(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `boolean` isTypingEvent)`

**Returns:** `boolean`

### `handleInsertionEventInRelatedLink(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) linkNode, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleXrefsInsertionEvent(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) nodeAtInsertionOffset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `isRelatedLinkElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isRelatedLinkText([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `onlyXrefs([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragments)`

**Returns:** `boolean`

### `handleInvalidInsertionInTitlealts(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The fallback is to insert the `fragmentsToInsert` into a `navtitle` element, if possible.
 If a `navtitle` already exists, try to insert the fragment into a `searchtitle`.

### `tryInsertContentInElement(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementName)`

**Returns:** `boolean`

### `handleInvalidInsertionEventInTopic(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The fallback is to insert the `fragmentsToInsert` into a 'title' element if is possible.

### `getElementName([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) schemaManager, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementClass, `boolean` isElementsSearchStrict)`

**Returns:** `java.lang.String`

### `getElement([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) schemaManager, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementClass, `boolean` isElementsSearchStrict)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

### `deriveContextWithElements([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager, `java.lang.String[]` elements, `java.util.LinkedList<java.lang.String>` elementsToAdd)`

**Returns:** `boolean`

Context will be altered.

### `handleInvalidInsertionEventInSteps(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The fallback is to insert 
 the `fragmentsToInsert` into a 'steps/cmd' structure if is possible.

### `isOnlyParas([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToAnalyze)`

**Returns:** `boolean`

### `handleInsertElementsInternal(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.util.LinkedList<java.lang.String>` elements)`

**Returns:** `boolean`

### `pushContextElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementName)`

**Returns:** `void`

**Note: ** The given context is altered.

### `pushContextElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementName, `java.util.LinkedList<java.lang.String>` elements)`

**Returns:** `void`

**Note: ** The given context is altered.

### `isElementWithClassParticle([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `java.lang.String` classParticle)`

**Returns:** `boolean`

### `handleInvalidInsertionEventInStep(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

The fallback is to insert 
 the `fragmentsToInsert` into a 'para' element if is possible.

### `handleInvalidInsertionEventInTable(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md) fragmentsToInsert, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

A row element will
 be inserted (either 'row' or 'tr') with a new cell (either 'entry' or 'td') in which the fragments will be inserted.

### `changeElementsToMoveUpDown(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` selectedElements)`

**Returns:** `boolean`

### `getAncestorDetectionOptions()`

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

### `canBeReplaced([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) nodeToReplace)`

**Returns:** `boolean`

### `getPreferredElement([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md) ctrl, `int` offset)`

**Returns:** `javax.xml.namespace.QName`

