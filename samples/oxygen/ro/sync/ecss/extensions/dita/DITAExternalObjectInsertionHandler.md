# Class: `DITAExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAExternalObjectInsertionHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](../api/AuthorExternalObjectInsertionHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ONLY_TEXT_CONTENT_DITA_STYLESHEET_FILE`

**Type:** `java.lang.String`

### `REMOVE_FOOTNOTE_FROM_CONTENT_STYLESHEET_FILE`

**Type:** `java.lang.String`

### `contextKeyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)

## Constructors

### `<init>()`

### `<init>([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) contextKeyManagerProvider)`

## Methods

### `insertURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `java.util.List<ro.sync.ecss.extensions.api.ReferenceType>` types, `int` source)`

**Returns:** `void`

### `addFormatAndScopeToLink([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.lang.StringBuilder` contentToInsert, `java.lang.String` referenceTag, `java.net.URL` url, [`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md) type)`

**Returns:** `void`

### `buildMediaReferenceFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.net.URL` base, `java.net.URL` keyHrefLocation, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) contextNode)`

**Returns:** `java.lang.String`

### `buildMediaReferenceFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.net.URL` base, `ro.sync.ecss.dita.reference.keyref.KeyInfo` key, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) contextNode)`

**Returns:** `java.lang.String`

### `buildMediaFragmentInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.net.URL` base, `java.lang.String` outputClass, `java.net.URL` keyHrefLocation, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) contextNode)`

**Returns:** `java.lang.String`

### `createRelatedLinksSectionIfNeeded([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `shouldCreateRelatedLinksElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) rootElement)`

**Returns:** `boolean`

### `isImageReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md) type, `java.net.URL` url)`

**Returns:** `boolean`

### `insertURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `void`

### `getImporterStylesheetFileName([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `getOnlyTextContentStylesheet([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `getFilterContentOfOutputStylesheet()`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `insertAsReferenceWithUpdatedCaretOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.net.URL` referenceURL, [`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md) refType, `java.lang.StringBuilder` contentToInsert, `java.lang.String[]` refData)`

**Returns:** `int`

### `removeOxyCustomQueryParams(`java.net.URL` url)`

**Returns:** `java.net.URL`

### `buildKeyrefFragment(`java.lang.String` elementName, `java.lang.String` keyName)`

**Returns:** `java.lang.String`

