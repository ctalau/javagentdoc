# Class: `DITAMapRefResolver`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.DITAMapRefResolver`

**Extends:** [`ro.sync.ecss.extensions.dita.conref.DITAConRefResolver`](../../conref/DITAConRefResolver.md)

**Implements:** [`ro.sync.ecss.extensions.api.DITAMapReferencesResolver`](../../../api/DITAMapReferencesResolver.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `ATTRIBUTE_KEYREF`

**Type:** `java.lang.String`

### `ATTRIBUTE_HREF`

**Type:** `java.lang.String`

### `ATTRIBUTE_SCOPE`

**Type:** `java.lang.String`

### `ATTRIBUTE_FORMAT`

**Type:** `java.lang.String`

### `ATTRIBUTE_CLASS`

**Type:** `java.lang.String`

### `ATTRIBUTE_PROCESSING_ROLE`

**Type:** `java.lang.String`

### `resolveAllTopicRefs`

**Type:** `boolean`

If false, will resolve only map references, defaults to false

### `grammarCache`

**Type:** `java.lang.Object`

### `isExpandMapReferences`

**Type:** `boolean`

## Constructors

### `<init>([`ro.sync.ecss.dita.ContextKeyManager`](../../../../dita/ContextKeyManager.md) keyManager)`

### `<init>([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../../dita/ContextKeyManagerProvider.md) keyManagerProvider)`

### `<init>()`

## Methods

### `hasReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isKeyReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getHrefInfo([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `ro.sync.ecss.extensions.dita.map.topicref.DITAMapRefResolver.HrefInfo`

### `getHrefValue([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) element)`

**Returns:** `java.lang.String`

### `isInRelTable([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getDisplayName([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveOtherFormatToDITA([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `org.xml.sax.InputSource` inputSource)`

**Returns:** `org.xml.sax.InputSource`

### `hasEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `allowsValidatationForEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `replaceReference([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../api/node/AuthorDocumentProvider.md) targetProvider, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../../api/node/AuthorReferenceNode.md) referenceNode)`

**Returns:** `void`

### `getReferenceSystemID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `checkTarget([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../../api/node/AuthorDocument.md) targetDocument)`

**Returns:** `void`

### `getReferenceUniqueID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `isReferenceChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `java.lang.String` attributeName)`

**Returns:** `boolean`

### `setResolveAllTopicReferences(`boolean` resolveAllTopicRefs)`

**Returns:** `void`

### `setExpandMapReferences(`boolean` isExpand)`

**Returns:** `void`

### `getGrammarCache()`

**Returns:** `java.lang.Object`

### `setGrammarCache(`java.lang.Object` grammarCache)`

**Returns:** `void`

### `getCacheKey([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

