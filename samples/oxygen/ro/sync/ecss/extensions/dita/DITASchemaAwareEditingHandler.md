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

### `handleInsertContent(int offset, String content, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`): Insertion offset.
- `content` (`java.lang.String`): Text to insert.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

**Returns:** `boolean`

### `createFragment(Iterator<String> iterator, StringBuilder xmlFragment)`

**Parameters:**
- `iterator` (`java.util.Iterator<java.lang.String>`): Iterator of list with the elements to insert.
- `xmlFragment` (`java.lang.StringBuilder`): The xml fragment.

**Returns:** `void`

### `handlePasteFragment(int offset, AuthorDocumentFragment[] fragmentsToInsert, int actionId, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`)
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md))
- `actionId` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `boolean`

### `convertXrefToLink(AuthorDocumentFragment xrefsFragment, CIElement linkElement, AuthorDocumentController ctrl, int offsetInsideRelatedLinks)`

**Parameters:**
- `xrefsFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../api/node/AuthorDocumentFragment.md)): A fragment containing one or more XREFs.
- `linkElement` ([`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)): A LINK element used to get the new LINK's name and attributes.
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md)): The Author document controller.
- `offsetInsideRelatedLinks` (`int`): Offset inside related inks (after the start tag).

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../api/node/AuthorDocumentFragment.md)

### `acceptsAttr(List<CIAttribute> acceptedAttrs, String attributeName)`

**Parameters:**
- `acceptedAttrs` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`): The list of accepted attributes.
- `attributeName` (`java.lang.String`): The searched attribute.

**Returns:** `boolean`

### `handleInsertionEvent(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, boolean isTypingEvent)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `isTypingEvent` (`boolean`): `true` when the invocation context is a typing action, not paste.

**Returns:** `boolean`

### `handleInsertionEventInRelatedLink(int offset, AuthorNode linkNode, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `linkNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The link node where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

**Returns:** `boolean`

### `handleXrefsInsertionEvent(int offset, AuthorNode nodeAtInsertionOffset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `nodeAtInsertionOffset` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Node at insertion offset
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

**Returns:** `boolean`

### `isRelatedLinkElement(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Node to check.

**Returns:** `boolean`

### `isRelatedLinkText(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Node to check.

**Returns:** `boolean`

### `onlyXrefs(AuthorDocumentFragment[] fragments)`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): the fragments.

**Returns:** `boolean`

### `handleInvalidInsertionInTitlealts(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

The fallback is to insert the `fragmentsToInsert` into a `navtitle` element, if possible.
 If a `navtitle` already exists, try to insert the fragment into a `searchtitle`.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): The author schema manager.

**Returns:** `boolean`

### `tryInsertContentInElement(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager, WhatElementsCanGoHereContext context, String elementName)`

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): The author schema manager.
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The current context.
- `elementName` (`java.lang.String`): The name of the element inside which the insertion is tried.

**Returns:** `boolean`

### `handleInvalidInsertionEventInTopic(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

The fallback is to insert the `fragmentsToInsert` into a 'title' element if is possible.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `getElementName(AuthorSchemaManager schemaManager, WhatElementsCanGoHereContext context, String elementClass, boolean isElementsSearchStrict)`

**Parameters:**
- `schemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): The schema manager.
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.
- `elementClass` (`java.lang.String`): The element's class.
- `isElementsSearchStrict` (`boolean`): `true` means that this method will check if an element already exists.
   If it does, it's name won't be returned as the result. Instead the method will look for a non-existing element which could go in 
   the current context. `false` means that this method will not check if an element already exists.

**Returns:** `java.lang.String`

### `getElement(AuthorSchemaManager schemaManager, WhatElementsCanGoHereContext context, String elementClass, boolean isElementsSearchStrict)`

**Parameters:**
- `schemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): The schema manager.
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.
- `elementClass` (`java.lang.String`): The element's class.
- `isElementsSearchStrict` (`boolean`): `true` means that this method will check if an element already exists.
   If it does, it's name won't be returned as the result. Instead the method will look for a non-existing element which could go in 
   the current context. `false` means that this method will not check if an element already exists.

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

### `deriveContextWithElements(WhatElementsCanGoHereContext context, AuthorSchemaManager authorSchemaManager, String[] elements, LinkedList<String> elementsToAdd)`

Context will be altered.

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context where the elements will be pushed
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): The author schema manager
- `elements` (`java.lang.String[]`): The elements that should be pushed
- `elementsToAdd` (`java.util.LinkedList<java.lang.String>`): The name of the elements that will be added when handling

**Returns:** `boolean`

### `handleInvalidInsertionEventInSteps(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

The fallback is to insert 
 the `fragmentsToInsert` into a 'steps/cmd' structure if is possible.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): Schema manager

**Returns:** `boolean`

### `isOnlyParas(AuthorDocumentFragment[] fragmentsToAnalyze)`

**Parameters:**
- `fragmentsToAnalyze` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): The given fragments to analyze

**Returns:** `boolean`

### `handleInsertElementsInternal(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager, WhatElementsCanGoHereContext context, LinkedList<String> elements)`

**Parameters:**
- `offset` (`int`): Insertion offset.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): The fragments to insert.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md)): Schema manager.
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): Used to determine what elements can be inserted in current context.
- `elements` (`java.util.LinkedList<java.lang.String>`): A list of elements to insert.

**Returns:** `boolean`

### `pushContextElement(WhatElementsCanGoHereContext context, String elementName)`

**Note: ** The given context is altered.

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context to derive.
- `elementName` (`java.lang.String`): The element to push inside the context.

**Returns:** `void`

### `pushContextElement(WhatElementsCanGoHereContext context, String elementName, LinkedList<String> elements)`

**Note: ** The given context is altered.

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context to derive.
- `elementName` (`java.lang.String`): The element to push inside the context.
- `elements` (`java.util.LinkedList<java.lang.String>`): a list with elements to insert, in insertion order.

**Returns:** `void`

### `isElementWithClassParticle(AuthorNode node, String classParticle)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The node
- `classParticle` (`java.lang.String`): The element class

**Returns:** `boolean`

### `handleInvalidInsertionEventInStep(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

The fallback is to insert 
 the `fragmentsToInsert` into a 'para' element if is possible.

**Parameters:**
- `offset` (`int`): Offset where the insertion event occurred.
- `fragmentsToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../api/node/AuthorDocumentFragment.md)): Fragments that must be inserted at the given offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../api/AuthorSchemaManager.md))

**Returns:** `boolean`

### `handleInvalidInsertionEventInTable(int offset, AuthorDocumentFragment[] fragmentsToInsert, AuthorAccess authorAccess, AuthorSchemaManager authorSchemaManager)`

A row element will
 be inserted (either 'row' or 'tr') with a new cell (either 'entry' or 'td') in which the fragments will be inserted.

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

### `getAncestorDetectionOptions()`

**Returns:** `ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter.WrapInAncestorsOptions`

### `canBeReplaced(AuthorNode nodeToReplace)`

**Parameters:**
- `nodeToReplace` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getPreferredElement(AuthorDocumentController ctrl, int offset)`

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md))
- `offset` (`int`)

**Returns:** `javax.xml.namespace.QName`

