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

### `<init>([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../../dita/ContextKeyManagerProvider.md) keyManagerProvider)`

## Methods

### `insertURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `java.util.List<ro.sync.ecss.extensions.api.ReferenceType>` types, `int` source)`

**Returns:** `void`

### `adjustCaretOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `int` cp)`

**Returns:** `int`

### `addAttributesToTopicrefWithHref([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` topicrefName, [`ro.sync.ecss.extensions.api.ReferenceType`](../../api/ReferenceType.md) refType, `java.lang.StringBuilder` stringBuilder, `java.net.URL` url)`

**Returns:** `void`

### `computeTopicrefForDnDFromDitaReusableComponents([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.StringBuilder` stringBuilder, `java.lang.String` tagName, `java.net.URL` url)`

**Returns:** `void`

### `insertURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `void`

### `isNodeAtOffsetOrItsAncestorTopic([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

