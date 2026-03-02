# Class: `DitaLinkTextResolver`

**Package:** [`ro.sync.ecss.extensions.dita.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver`

**Extends:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../../api/link/LinkTextResolver.md)

## Description

It also resolves key references provided that the ditamap is opened in DITA Map Manager."

## Fields

### `CONCURRENT_HASH_MAP_LOAD_FACTOR`

**Type:** `float`

### `logger`

**Type:** `org.slf4j.Logger`

### `ATTRIBUTE_KEYREF`

**Type:** `java.lang.String`

### `ATTRIBUTE_HREF`

**Type:** `java.lang.String`

### `NOT_RESOLVED`

**Type:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

We want to avoid retrying if nothing changes.

### `TITLE_NOT_FOUND`

**Type:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

We want to avoid retrying if nothing changes.

### `PENDING`

**Type:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `keyrefs`

**Type:** `java.util.Map<java.lang.String,ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo>`

Maps a key name to a text content of the key.

### `hrefs`

**Type:** `java.util.Map<java.lang.String,ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo>`

Maps a href to the title that should be presented for the
 referred topic.

### `ditaLinkElements`

**Type:** `java.util.Map<java.lang.String,java.util.WeakHashMap<ro.sync.ecss.extensions.api.node.AuthorNode,java.lang.Object>>`

The value is a WeakHashMap in which only the keys are used. The WeakHashMap
 uses weak references an more than that it does a clean up of the garbage collected
 keys.

### `authorListenerAdapter`

**Type:** [`ro.sync.ecss.extensions.api.AuthorListenerAdapter`](../../api/AuthorListenerAdapter.md)

So when they change we must also refresh.

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)

### `resolvesTopicrefs`

**Type:** `boolean`

### `keyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.dita.ContextKeyManager keyManager)`

**Parameters:**
- `keyManager` ([`ro.sync.ecss.dita.ContextKeyManager`](../../../dita/ContextKeyManager.md)): The context-aware key manager.

### `<init>(ro.sync.ecss.dita.ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)): The context-aware key manager provider.

## Methods

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): Author node.

**Returns:** `java.lang.String`

### `resolveTopicRefReference(ro.sync.ecss.extensions.api.node.AuthorElement element, ro.sync.ecss.extensions.api.node.AttrValue classValue)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Author element that contains the topicref reference.
- `classValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md)): The value of the class attribute

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `extractNavTitle(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The topicref/topichead element.

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `findNavtitleInTopicmetaChildren(ro.sync.ecss.extensions.api.node.AuthorElement topicmeta)`

**Parameters:**
- `topicmeta` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The topicmeta element

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `resolveHrefReference(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String hrefValue)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Author element that contains the href reference.
- `hrefValue` (`java.lang.String`): The href reference value

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `resolveKeyrefReference(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String keyref, java.lang.String classValue)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Author element that contains the keyref reference.
- `keyref` (`java.lang.String`): The keyref reference value
- `classValue` (`java.lang.String`): The value of the class attribute

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `resolveKeyRefToKeydefMetadata(java.lang.String classValue, ro.sync.ecss.dita.reference.keyref.KeyInfo keyInfo)`

**Parameters:**
- `classValue` (`java.lang.String`): Class value.
- `keyInfo` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`): Key info.

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `getLocationForDisplay(java.lang.String absoluteLocation, ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `absoluteLocation` (`java.lang.String`): The absolute location.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The context node.

**Returns:** `java.lang.String`

### `getFileNotFoundInfo(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String hrefValue, java.io.FileNotFoundException e)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node being resolved.
- `hrefValue` (`java.lang.String`): The href to resolve.
- `e` (`java.io.FileNotFoundException`): The exception.

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `computeCacheKey(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String hrefValue)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The current node
- `hrefValue` (`java.lang.String`): Href value

**Returns:** `java.lang.String`

### `getParentTopicID(ro.sync.ecss.extensions.api.node.AuthorNode element)`

If the element 
 is a topic element, this method will return the given element's ID. If 
 no topic contains the given element (almost impossible) it will return empty
 string.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element for which should be computed the parent topic ID.

**Returns:** `java.lang.String`

### `computeKeyScopesHash(ro.sync.ecss.extensions.api.node.AuthorNode elem)`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element.

**Returns:** `java.lang.String`

### `isLocalDITAReference(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Reference element.

**Returns:** `boolean`

### `isLocalReference(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Reference element.

**Returns:** `boolean`

### `update(java.util.Set<java.lang.String> modifiedURLs)`

**Parameters:**
- `modifiedURLs` (`java.util.Set<java.lang.String>`): The URLs that are modified.

**Returns:** `void`

### `isHrefElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `refresh()`

**Returns:** `void`

### `refreshNodeReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `void`

### `buildKeyrefCacheKey(ro.sync.ecss.extensions.api.node.AuthorElement node, java.lang.String keyName, java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo> keys)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node on which the keyRef appears.
- `keyName` (`java.lang.String`): The name of the keyRef.
- `keys` (`java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`): The keys map.

**Returns:** `java.lang.String`

### `clearReferencesCache()`

**Returns:** `void`

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `void`

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `void`

