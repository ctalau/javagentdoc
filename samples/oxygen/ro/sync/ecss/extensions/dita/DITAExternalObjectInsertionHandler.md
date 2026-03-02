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

### `<init>(ro.sync.ecss.dita.ContextKeyManagerProvider contextKeyManagerProvider)`

**Parameters:**
- `contextKeyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The context key manager provider

## Methods

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, java.util.List<ro.sync.ecss.extensions.api.ReferenceType> types, int source)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`)
- `source` (`int`)

### `addFormatAndScopeToLink(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.StringBuilder contentToInsert, java.lang.String referenceTag, java.net.URL url, ro.sync.ecss.extensions.api.ReferenceType type)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access to the Author API.
- `contentToInsert` (`java.lang.StringBuilder`): Object used to build the reference with all its attributes.
- `referenceTag` (`java.lang.String`): Name of the reference element.
- `url` (`java.net.URL`): Pasted URL.
- `type` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md)): Reference type. Can be `null`.

### `buildMediaReferenceFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.net.URL base, java.net.URL keyHrefLocation, ro.sync.ecss.extensions.api.node.AuthorNode contextNode)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access class to the author functions.
- `base` (`java.net.URL`): URL of current document.
- `keyHrefLocation` (`java.net.URL`): URL of the current key.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node

### `buildMediaReferenceFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.net.URL base, ro.sync.ecss.dita.reference.keyref.KeyInfo key, ro.sync.ecss.extensions.api.node.AuthorNode contextNode)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access class to the author functions.
- `base` (`java.net.URL`): URL of current document.
- `key` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node

### `buildMediaFragmentInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.net.URL base, java.lang.String outputClass, java.net.URL keyHrefLocation, ro.sync.ecss.extensions.api.node.AuthorNode contextNode)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access class to the author functions.
- `base` (`java.net.URL`): URL of current document.
- `outputClass` (`java.lang.String`): The media object output class.
- `keyHrefLocation` (`java.net.URL`): URL of the current key.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The context node. Can be `null`

### `createRelatedLinksSectionIfNeeded(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access.

### `shouldCreateRelatedLinksElement(ro.sync.ecss.extensions.api.node.AuthorElement rootElement)`

**Returns:** `boolean`

**Parameters:**
- `rootElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The root element of the document.

### `isImageReference(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ReferenceType type, java.net.URL url)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `type` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md)): The reference type.
- `url` (`java.net.URL`): The URL.

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, int source)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `source` (`int`)

### `getImporterStylesheetFileName(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

### `getOnlyTextContentStylesheet(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `javax.xml.transform.stream.StreamSource`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access

### `getFilterContentOfOutputStylesheet()`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `insertAsReferenceWithUpdatedCaretOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.net.URL referenceURL, ro.sync.ecss.extensions.api.ReferenceType refType, java.lang.StringBuilder contentToInsert, java.lang.String[] refData)`

**Returns:** `int`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `referenceURL` (`java.net.URL`)
- `refType` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md))
- `contentToInsert` (`java.lang.StringBuilder`)
- `refData` (`java.lang.String[]`)

### `removeOxyCustomQueryParams(java.net.URL url)`

**Returns:** `java.net.URL`

**Parameters:**
- `url` (`java.net.URL`): The provided URL.

### `buildKeyrefFragment(java.lang.String elementName, java.lang.String keyName)`

**Returns:** `java.lang.String`

**Parameters:**
- `elementName` (`java.lang.String`): The name of the element that will be referred as keyref.
- `keyName` (`java.lang.String`): The name of the key that will be used.

