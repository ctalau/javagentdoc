# Class: `DITAExternalObjectInsertionHandlerUtil`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAExternalObjectInsertionHandlerUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getReferenceAttributeNameAndValue(ContextKeyManagerProvider keysManagerProvider, AuthorAccess authorAccess, URL base, URL url, AuthorNode contextNode)`

**Parameters:**
- `keysManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The keys manager provider.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The Author access.
- `base` (`java.net.URL`): The base URL.
- `url` (`java.net.URL`): The current URL.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node

**Returns:** `java.lang.String[]`

### `getMediaReferenceAttributeNameAndValue(ContextKeyManagerProvider keysManagerProvider, URL editorLocation, URL base, URL url, AuthorNode contextNode)`

**Parameters:**
- `keysManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The keys manager provider.
- `editorLocation` (`java.net.URL`): The URL location of the current editor.
- `base` (`java.net.URL`): The base URL.
- `url` (`java.net.URL`): The current URL.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node, can be `null`

**Returns:** `java.lang.String[]`

### `getReferenceAttributeNameAndValueInternal(ContextKeyManagerProvider keysManagerProvider, URL editorLocation, URL base, URL url, AuthorNode contextNode, boolean isMediaElement)`

**Parameters:**
- `keysManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The keys manager provider.
- `editorLocation` (`java.net.URL`): The URL location of the current editor.
- `base` (`java.net.URL`): The base URL.
- `url` (`java.net.URL`): The current URL.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The context node, can be `null`
- `isMediaElement` (`boolean`): `true` to insert media objects.

**Returns:** `java.lang.String[]`

### `insertContentReference(ContextKeyManagerProvider keysManagerProvider, AuthorAccess authorAccess, URL url)`

**Parameters:**
- `keysManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The keys manager provider.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access to the current document.
- `url` (`java.net.URL`): Target for the conref.

**Returns:** `void`

### `clearInternalQueryParamsFromExtractedRefAttrVal(URL base, String refAttrValue)`

**Parameters:**
- `base` (`java.net.URL`): The original base URL of the relative value.
- `refAttrValue` (`java.lang.String`): The relative value.

**Returns:** `java.lang.String`

### `detectKeyInfo(URL urlToDrop, URL originatorURL)`

**Parameters:**
- `urlToDrop` (`java.net.URL`): The dropped URL
- `originatorURL` (`java.net.URL`): The URL for which the keys are requested.

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

