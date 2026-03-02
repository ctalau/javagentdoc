# Class: `DITAConRefResolver`

**Package:** [`ro.sync.ecss.extensions.dita.conref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.conref.DITAConRefResolver`

**Extends:** [`ro.sync.ecss.extensions.api.DITAConrefsResolverBase`](../../api/DITAConrefsResolverBase.md)

**Implements:** [`ro.sync.ecss.extensions.api.CacheableAuthorReferencesResolver`](../../api/CacheableAuthorReferencesResolver.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ATTRIBUTE_CLASS`

**Type:** `java.lang.String`

### `ATTRIBUTE_KEYREF`

**Type:** `java.lang.String`

### `ATTRIBUTE_CONREF`

**Type:** `java.lang.String`

### `CODEREF_CLASS`

**Type:** `java.lang.String`

### `ATTRIBUTE_CONREF_END`

**Type:** `java.lang.String`

### `ATTRIBUTE_CONKEYREF`

**Type:** `java.lang.String`

### `ATTRIBUTE_CONACTION`

**Type:** `java.lang.String`

### `ATTRIBUTE_HREF`

**Type:** `java.lang.String`

### `ATTRIBUTE_FORMAT`

**Type:** `java.lang.String`

### `ATTRIBUTE_ID`

**Type:** `java.lang.String`

### `TOPIC_CLASS_FRAG`

**Type:** `java.lang.String`

### `grammarCache`

**Type:** `java.lang.Object`

### `grammarCacheInUse`

**Type:** `boolean`

### `resolveAlsoKeyRefs`

**Type:** `boolean`

False by default, when editing in the Author page
 the CSS provides the link test.

### `keyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)

## Constructors

### `<init>(ro.sync.ecss.dita.ContextKeyManager keyManager)`

**Parameters:**
- `keyManager` ([`ro.sync.ecss.dita.ContextKeyManager`](../../../dita/ContextKeyManager.md)): The context-aware key manager.

### `<init>()`

### `<init>(ro.sync.ecss.dita.ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)): The context-aware key manager provider.

## Methods

### `hasReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `hasKeyrefReference(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `boolean`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element to be analyzed.

### `getDisplayName(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

### `resolveConrefAndConkeyref(ro.sync.ecss.extensions.api.node.AuthorElement element, ro.sync.ecss.extensions.api.node.AttrValue classValue, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which has references.
- `classValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md)): The value of the class attribute
- `systemID` (`java.lang.String`): The system ID of the document which has references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access implementation.
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver

### `resolveConrefAndConkeyRefInternal(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver, ro.sync.ecss.dita.Reference conRef, boolean isConKeyRef, boolean isKeyrefToElementID)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element that has references.
- `systemID` (`java.lang.String`): The system ID of the document that has references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to the Author API.
- `entityResolver` (`org.xml.sax.EntityResolver`): Entity resolver.
- `conRef` ([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md)): Content reference object.
- `isConKeyRef` (`boolean`): `true` if it's a conkeyref.
- `isKeyrefToElementID` (`boolean`): `true` if it's a keyref to an element ID.

### `computeTopicIdForSelfLink(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String[] topicPath)`

**Returns:** `void`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which does the conreffing
- `topicPath` (`java.lang.String[]`): The topic path.

### `treatKeyNotFound(ro.sync.ecss.dita.Reference conRef, java.lang.String keyrefValWithOutScope, java.lang.String keyrefValWithScope)`

**Returns:** `void`

**Parameters:**
- `conRef` ([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md)): Content reference.
- `keyrefValWithOutScope` (`java.lang.String`): The key reference value without the scope.
- `keyrefValWithScope` (`java.lang.String`): The key reference value.

### `resolveCoderef(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver, ro.sync.ecss.dita.Reference conRef)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to the Author API.
- `entityResolver` (`org.xml.sax.EntityResolver`): Entity resolver.
- `conRef` ([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md)): Content reference.

### `getRangeEndPath(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String systemID, ro.sync.ecss.extensions.api.node.AttrValue conrefEndVal, boolean isConKeyRef)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The source element which has the attribute
- `systemID` (`java.lang.String`): The system ID of the document which has references.
- `conrefEndVal` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md)): Conrefend value.
- `isConKeyRef` (`boolean`): `true` if is conkeyref.

### `resolveHrefReference(java.lang.String hrefValue, ro.sync.ecss.extensions.api.node.AuthorElement element, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `hrefValue` (`java.lang.String`): The value of the href attribute
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which has references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access implementation.
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver

### `resolveKeyrefReference(java.lang.String keyref, java.lang.String classValue, ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `keyref` (`java.lang.String`): The value of the keyref attribute
- `classValue` (`java.lang.String`): The value of the class attribute
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which has references.
- `systemID` (`java.lang.String`): The system ID of the node with references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access implementation.
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.

### `parseReferencedTopic(java.lang.String systemID, ro.sync.ecss.dita.reference.keyref.KeyInfo keyInfo)`

**Returns:** `java.lang.String`

**Parameters:**
- `systemID` (`java.lang.String`): The system ID of the topic.
- `keyInfo` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`): Key info.

### `getTopicPath(java.lang.String value)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `value` (`java.lang.String`): The `conref` attribute value.

### `getDescription()`

**Returns:** `java.lang.String`

### `getReferenceUniqueID(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `isReferenceChanged(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String attributeName)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

### `getReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `getConrefReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `java.lang.String`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.

### `getKeyrefRefereceSystenID(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `java.lang.String`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.

### `checkTarget(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.node.AuthorDocument targetDocument)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `targetDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))

### `setResolveKeyrefsToMetaContentAsConrefs(boolean resolveKeyrefsAsConrefs)`

**Returns:** `void`

**Parameters:**
- `resolveKeyrefsAsConrefs` (`boolean`)

### `getCacheKey(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

