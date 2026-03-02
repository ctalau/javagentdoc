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

### `<init>(ContextKeyManager keyManager)`

**Parameters:**
- `keyManager` ([`ro.sync.ecss.dita.ContextKeyManager`](../../../../dita/ContextKeyManager.md)): The context-aware key manager.

### `<init>(ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../../dita/ContextKeyManagerProvider.md)): The context-aware key manager provider.

### `<init>()`

## Methods

### `hasReferences(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isKeyReference(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The Author node.

**Returns:** `boolean`

### `getHrefInfo(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node

**Returns:** `ro.sync.ecss.extensions.dita.map.topicref.DITAMapRefResolver.HrefInfo`

### `getHrefValue(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element.

**Returns:** `java.lang.String`

### `isInRelTable(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node

**Returns:** `boolean`

### `getDisplayName(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `resolveReference(AuthorNode node, String systemID, AuthorAccess authorAccess, EntityResolver entityResolver)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveOtherFormatToDITA(AuthorNode node, InputSource inputSource)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node.
- `inputSource` (`org.xml.sax.InputSource`): The input source

**Returns:** `org.xml.sax.InputSource`

### `hasEditableReference(String systemID, AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `allowsValidatationForEditableReference(String systemID, AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `replaceReference(AuthorDocumentProvider targetProvider, AuthorAccess authorAccess, AuthorReferenceNode referenceNode)`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../../api/node/AuthorDocumentProvider.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../../api/node/AuthorReferenceNode.md))

**Returns:** `void`

### `getReferenceSystemID(AuthorNode node, AuthorAccess authorAccess)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `checkTarget(AuthorNode node, AuthorDocument targetDocument)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `targetDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../../api/node/AuthorDocument.md))

**Returns:** `void`

### `getReferenceUniqueID(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `isReferenceChanged(AuthorNode node, String attributeName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

**Returns:** `boolean`

### `setResolveAllTopicReferences(boolean resolveAllTopicRefs)`

**Parameters:**
- `resolveAllTopicRefs` (`boolean`)

**Returns:** `void`

### `setExpandMapReferences(boolean isExpand)`

**Parameters:**
- `isExpand` (`boolean`)

**Returns:** `void`

### `getGrammarCache()`

**Returns:** `java.lang.Object`

### `setGrammarCache(Object grammarCache)`

**Parameters:**
- `grammarCache` (`java.lang.Object`)

**Returns:** `void`

### `getCacheKey(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

