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

### `<init>([`ro.sync.ecss.dita.ContextKeyManager`](../../../dita/ContextKeyManager.md) keyManager)`

### `<init>()`

### `<init>([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md) keyManagerProvider)`

## Methods

### `hasReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `hasKeyrefReference([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `getDisplayName([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveConrefAndConkeyref([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, [`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md) classValue, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveConrefAndConkeyRefInternal([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver, [`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md) conRef, `boolean` isConKeyRef, `boolean` isKeyrefToElementID)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `computeTopicIdForSelfLink([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String[]` topicPath)`

**Returns:** `void`

### `treatKeyNotFound([`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md) conRef, `java.lang.String` keyrefValWithOutScope, `java.lang.String` keyrefValWithScope)`

**Returns:** `void`

### `resolveCoderef([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver, [`ro.sync.ecss.dita.Reference`](../../../dita/Reference.md) conRef)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `getRangeEndPath([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md) conrefEndVal, `boolean` isConKeyRef)`

**Returns:** `java.lang.String[]`

### `resolveHrefReference(`java.lang.String` hrefValue, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `resolveKeyrefReference(`java.lang.String` keyref, `java.lang.String` classValue, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `parseReferencedTopic(`java.lang.String` systemID, `ro.sync.ecss.dita.reference.keyref.KeyInfo` keyInfo)`

**Returns:** `java.lang.String`

### `getTopicPath(`java.lang.String` value)`

**Returns:** `java.lang.String[]`

### `getDescription()`

**Returns:** `java.lang.String`

### `getReferenceUniqueID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `isReferenceChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` attributeName)`

**Returns:** `boolean`

### `getReferenceSystemID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `getConrefReferenceSystemID([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `java.lang.String`

### `getKeyrefRefereceSystenID([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `java.lang.String`

### `checkTarget([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md) targetDocument)`

**Returns:** `void`

### `setResolveKeyrefsToMetaContentAsConrefs(`boolean` resolveKeyrefsAsConrefs)`

**Returns:** `void`

### `getCacheKey([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

