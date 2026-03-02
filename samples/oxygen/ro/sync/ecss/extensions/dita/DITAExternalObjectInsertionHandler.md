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

### `<init>(ContextKeyManagerProvider contextKeyManagerProvider)`

**Parameters:**
- `contextKeyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The context key manager provider

## Methods

### `insertURLs(AuthorAccess authorAccess, List<URL> urls, List<ReferenceType> types, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`)
- `source` (`int`)

**Returns:** `void`

### `addFormatAndScopeToLink(AuthorAccess authorAccess, StringBuilder contentToInsert, String referenceTag, URL url, ReferenceType type)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access to the Author API.
- `contentToInsert` (`java.lang.StringBuilder`): Object used to build the reference with all its attributes.
- `referenceTag` (`java.lang.String`): Name of the reference element.
- `url` (`java.net.URL`): Pasted URL.
- `type` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md)): Reference type. Can be `null`.

**Returns:** `void`

### `buildMediaReferenceFragment(AuthorAccess authorAccess, URL base, URL keyHrefLocation, AuthorNode contextNode)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access class to the author functions.
- `base` (`java.net.URL`): URL of current document.
- `keyHrefLocation` (`java.net.URL`): URL of the current key.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node

**Returns:** `java.lang.String`

### `buildMediaReferenceFragment(AuthorAccess authorAccess, URL base, KeyInfo key, AuthorNode contextNode)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access class to the author functions.
- `base` (`java.net.URL`): URL of current document.
- `key` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node

**Returns:** `java.lang.String`

### `buildMediaFragmentInternal(AuthorAccess authorAccess, URL base, String outputClass, URL keyHrefLocation, AuthorNode contextNode)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access class to the author functions.
- `base` (`java.net.URL`): URL of current document.
- `outputClass` (`java.lang.String`): The media object output class.
- `keyHrefLocation` (`java.net.URL`): URL of the current key.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The context node. Can be `null`

**Returns:** `java.lang.String`

### `createRelatedLinksSectionIfNeeded(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

**Returns:** `void`

### `shouldCreateRelatedLinksElement(AuthorElement rootElement)`

**Parameters:**
- `rootElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The root element of the document.

**Returns:** `boolean`

### `isImageReference(AuthorAccess authorAccess, ReferenceType type, URL url)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `type` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md)): The reference type.
- `url` (`java.net.URL`): The URL.

**Returns:** `boolean`

### `insertURLs(AuthorAccess authorAccess, List<URL> urls, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `source` (`int`)

**Returns:** `void`

### `getImporterStylesheetFileName(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `getOnlyTextContentStylesheet(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access

**Returns:** `javax.xml.transform.stream.StreamSource`

### `getFilterContentOfOutputStylesheet()`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `insertAsReferenceWithUpdatedCaretOffset(AuthorAccess authorAccess, URL referenceURL, ReferenceType refType, StringBuilder contentToInsert, String[] refData)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `referenceURL` (`java.net.URL`)
- `refType` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md))
- `contentToInsert` (`java.lang.StringBuilder`)
- `refData` (`java.lang.String[]`)

**Returns:** `int`

### `removeOxyCustomQueryParams(URL url)`

**Parameters:**
- `url` (`java.net.URL`): The provided URL.

**Returns:** `java.net.URL`

### `buildKeyrefFragment(String elementName, String keyName)`

**Parameters:**
- `elementName` (`java.lang.String`): The name of the element that will be referred as keyref.
- `keyName` (`java.lang.String`): The name of the key that will be used.

**Returns:** `java.lang.String`

