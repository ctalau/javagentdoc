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

### `<init>(ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md)): The key manager provider

## Methods

### `insertURLs(AuthorAccess authorAccess, List<URL> urls, List<ReferenceType> types, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`)
- `source` (`int`)

**Returns:** `void`

### `adjustCaretOffset(AuthorAccess authorAccess, int cp)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access
- `cp` (`int`)

**Returns:** `int`

### `addAttributesToTopicrefWithHref(AuthorAccess authorAccess, String topicrefName, ReferenceType refType, StringBuilder stringBuilder, URL url)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `topicrefName` (`java.lang.String`): The topicref name.
- `refType` ([`ro.sync.ecss.extensions.api.ReferenceType`](../../api/ReferenceType.md)): Reference type.
- `stringBuilder` (`java.lang.StringBuilder`): String builder for the topicref structure.
- `url` (`java.net.URL`): The dropped URL.

**Returns:** `void`

### `computeTopicrefForDnDFromDitaReusableComponents(AuthorAccess authorAccess, StringBuilder stringBuilder, String tagName, URL url)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `stringBuilder` (`java.lang.StringBuilder`): String builder for the topicref fragment.
- `tagName` (`java.lang.String`): The topicref tag name.
- `url` (`java.net.URL`): URL to drop.

**Returns:** `void`

### `insertURLs(AuthorAccess authorAccess, List<URL> urls, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `source` (`int`)

**Returns:** `void`

### `isNodeAtOffsetOrItsAncestorTopic(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

**Returns:** `boolean`

