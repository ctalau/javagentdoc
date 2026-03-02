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

### `<init>(ro.sync.ecss.dita.ContextKeyManager keyManager)`

**Parameters:**
- `keyManager` ([`ro.sync.ecss.dita.ContextKeyManager`](../../../../dita/ContextKeyManager.md)): The context-aware key manager.

### `<init>(ro.sync.ecss.dita.ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../../dita/ContextKeyManagerProvider.md)): The context-aware key manager provider.

### `<init>()`

## Methods

### `hasReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

### `isKeyReference(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The Author node.

### `getHrefInfo(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `ro.sync.ecss.extensions.dita.map.topicref.DITAMapRefResolver.HrefInfo`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node

### `getHrefValue(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `java.lang.String`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element.

### `isInRelTable(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node

### `getDisplayName(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

### `resolveOtherFormatToDITA(ro.sync.ecss.extensions.api.node.AuthorNode node, org.xml.sax.InputSource inputSource)`

**Returns:** `org.xml.sax.InputSource`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node.
- `inputSource` (`org.xml.sax.InputSource`): The input source

### `hasEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Returns:** `boolean`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

### `allowsValidatationForEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Returns:** `boolean`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

### `replaceReference(ro.sync.ecss.extensions.api.node.AuthorDocumentProvider targetProvider, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorReferenceNode referenceNode)`

**Returns:** `void`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../api/node/AuthorDocumentProvider.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../../api/node/AuthorReferenceNode.md))

### `getReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))

### `checkTarget(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.node.AuthorDocument targetDocument)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `targetDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../../api/node/AuthorDocument.md))

### `getReferenceUniqueID(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

### `isReferenceChanged(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String attributeName)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

### `setResolveAllTopicReferences(boolean resolveAllTopicRefs)`

**Returns:** `void`

**Parameters:**
- `resolveAllTopicRefs` (`boolean`)

### `setExpandMapReferences(boolean isExpand)`

**Returns:** `void`

**Parameters:**
- `isExpand` (`boolean`)

### `getGrammarCache()`

**Returns:** `java.lang.Object`

### `setGrammarCache(java.lang.Object grammarCache)`

**Returns:** `void`

**Parameters:**
- `grammarCache` (`java.lang.Object`)

### `getCacheKey(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

