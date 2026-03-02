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

### `<init>(ContextKeyManager keyManager)`

**Parameters:**
- `keyManager` ([`ro.sync.ecss.dita.ContextKeyManager`](../../../dita/ContextKeyManager.md)): The context-aware key manager.

### `<init>()`

### `<init>(ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)): The context-aware key manager provider.

## Methods

### `hasReferences(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `hasKeyrefReference(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element to be analyzed.

**Returns:** `boolean`

### `getDisplayName(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `resolveReference(AuthorNode node, String systemID, AuthorAccess authorAccess, EntityResolver entityResolver)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveConrefAndConkeyref(AuthorElement element, AttrValue classValue, String systemID, AuthorAccess authorAccess, EntityResolver entityResolver)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which has references.
- `classValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md)): The value of the class attribute
- `systemID` (`java.lang.String`): The system ID of the document which has references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access implementation.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveConrefAndConkeyRefInternal(AuthorElement element, String systemID, AuthorAccess authorAccess, EntityResolver entityResolver, Reference conRef, boolean isConKeyRef, boolean isKeyrefToElementID)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element that has references.
- `systemID` (`java.lang.String`): The system ID of the document that has references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to the Author API.
- `entityResolver` (`org.xml.sax.EntityResolver`): Entity resolver.
- `conRef` ([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md)): Content reference object.
- `isConKeyRef` (`boolean`): `true` if it's a conkeyref.
- `isKeyrefToElementID` (`boolean`): `true` if it's a keyref to an element ID.

**Returns:** `javax.xml.transform.sax.SAXSource`

### `computeTopicIdForSelfLink(AuthorElement element, String[] topicPath)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which does the conreffing
- `topicPath` (`java.lang.String[]`): The topic path.

**Returns:** `void`

### `treatKeyNotFound(Reference conRef, String keyrefValWithOutScope, String keyrefValWithScope)`

**Parameters:**
- `conRef` ([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md)): Content reference.
- `keyrefValWithOutScope` (`java.lang.String`): The key reference value without the scope.
- `keyrefValWithScope` (`java.lang.String`): The key reference value.

**Returns:** `void`

### `resolveCoderef(AuthorAccess authorAccess, EntityResolver entityResolver, Reference conRef)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to the Author API.
- `entityResolver` (`org.xml.sax.EntityResolver`): Entity resolver.
- `conRef` ([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md)): Content reference.

**Returns:** `javax.xml.transform.sax.SAXSource`

### `getRangeEndPath(AuthorElement element, String systemID, AttrValue conrefEndVal, boolean isConKeyRef)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The source element which has the attribute
- `systemID` (`java.lang.String`): The system ID of the document which has references.
- `conrefEndVal` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md)): Conrefend value.
- `isConKeyRef` (`boolean`): `true` if is conkeyref.

**Returns:** `java.lang.String[]`

### `resolveHrefReference(String hrefValue, AuthorElement element, AuthorAccess authorAccess, EntityResolver entityResolver)`

**Parameters:**
- `hrefValue` (`java.lang.String`): The value of the href attribute
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which has references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access implementation.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveKeyrefReference(String keyref, String classValue, AuthorElement element, String systemID, AuthorAccess authorAccess)`

**Parameters:**
- `keyref` (`java.lang.String`): The value of the keyref attribute
- `classValue` (`java.lang.String`): The value of the class attribute
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element which has references.
- `systemID` (`java.lang.String`): The system ID of the node with references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access implementation.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.

**Returns:** `javax.xml.transform.sax.SAXSource`

### `parseReferencedTopic(String systemID, KeyInfo keyInfo)`

**Parameters:**
- `systemID` (`java.lang.String`): The system ID of the topic.
- `keyInfo` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`): Key info.

**Returns:** `java.lang.String`

### `getTopicPath(String value)`

**Parameters:**
- `value` (`java.lang.String`): The `conref` attribute value.

**Returns:** `java.lang.String[]`

### `getDescription()`

**Returns:** `java.lang.String`

### `getReferenceUniqueID(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `isReferenceChanged(AuthorNode node, String attributeName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

**Returns:** `boolean`

### `getReferenceSystemID(AuthorNode node, AuthorAccess authorAccess)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `getConrefReferenceSystemID(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.

**Returns:** `java.lang.String`

### `getKeyrefRefereceSystenID(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.

**Returns:** `java.lang.String`

### `checkTarget(AuthorNode node, AuthorDocument targetDocument)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `targetDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))

**Returns:** `void`

### `setResolveKeyrefsToMetaContentAsConrefs(boolean resolveKeyrefsAsConrefs)`

**Parameters:**
- `resolveKeyrefsAsConrefs` (`boolean`)

**Returns:** `void`

### `getCacheKey(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

