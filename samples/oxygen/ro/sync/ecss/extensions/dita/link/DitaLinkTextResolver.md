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

### `<init>([`ro.sync.ecss.dita.ContextKeyManager`](../../../dita/ContextKeyManager.md) keyManager)`

### `<init>([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md) keyManagerProvider)`

## Methods

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `resolveTopicRefReference([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, [`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md) classValue)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `extractNavTitle([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `findNavtitleInTopicmetaChildren([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) topicmeta)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `resolveHrefReference([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` hrefValue)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `resolveKeyrefReference([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` keyref, `java.lang.String` classValue)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `resolveKeyRefToKeydefMetadata(`java.lang.String` classValue, `ro.sync.ecss.dita.reference.keyref.KeyInfo` keyInfo)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `getLocationForDisplay(`java.lang.String` absoluteLocation, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `getFileNotFoundInfo([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` hrefValue, `java.io.FileNotFoundException` e)`

**Returns:** `ro.sync.ecss.extensions.dita.link.DitaLinkTextResolver.ResolvedLinkInfo`

### `computeCacheKey([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` hrefValue)`

**Returns:** `java.lang.String`

### `getParentTopicID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) element)`

**Returns:** `java.lang.String`

If the element 
 is a topic element, this method will return the given element's ID. If 
 no topic contains the given element (almost impossible) it will return empty
 string.

### `computeKeyScopesHash([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) elem)`

**Returns:** `java.lang.String`

### `isLocalDITAReference([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `isLocalReference([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `update(`java.util.Set<java.lang.String>` modifiedURLs)`

**Returns:** `void`

### `isHrefElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element)`

**Returns:** `boolean`

### `refresh()`

**Returns:** `void`

### `refreshNodeReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `void`

### `buildKeyrefCacheKey([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) node, `java.lang.String` keyName, `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>` keys)`

**Returns:** `java.lang.String`

### `clearReferencesCache()`

**Returns:** `void`

### `activated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `deactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

