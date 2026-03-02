# Class: `DITAMapExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.dita.map`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.DITAMapExternalObjectInsertionHandler`

**Extends:** [`ro.sync.ecss.extensions.dita.DITAExternalObjectInsertionHandler`](../DITAExternalObjectInsertionHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `keyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)

### `TOPICREF_NAME_PARAM`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.dita.ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)): The key manager provider

## Methods

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, java.util.List<ro.sync.ecss.extensions.api.ReferenceType> types, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`)
- `source` (`int`)

**Returns:** `void`

### `adjustCaretOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int cp)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access
- `cp` (`int`)

**Returns:** `int`

### `addAttributesToTopicrefWithHref(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String topicrefName, ro.sync.ecss.extensions.api.ReferenceType refType, java.lang.StringBuilder stringBuilder, java.net.URL url)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `topicrefName` (`java.lang.String`): The topicref name.
- `refType` ([`ro.sync.ecss.extensions.api.ReferenceType`](../../api/ReferenceType.md)): Reference type.
- `stringBuilder` (`java.lang.StringBuilder`): String builder for the topicref structure.
- `url` (`java.net.URL`): The dropped URL.

**Returns:** `void`

### `computeTopicrefForDnDFromDitaReusableComponents(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.StringBuilder stringBuilder, java.lang.String tagName, java.net.URL url)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `stringBuilder` (`java.lang.StringBuilder`): String builder for the topicref fragment.
- `tagName` (`java.lang.String`): The topicref tag name.
- `url` (`java.net.URL`): URL to drop.

**Returns:** `void`

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `source` (`int`)

**Returns:** `void`

### `isNodeAtOffsetOrItsAncestorTopic(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

**Returns:** `boolean`

