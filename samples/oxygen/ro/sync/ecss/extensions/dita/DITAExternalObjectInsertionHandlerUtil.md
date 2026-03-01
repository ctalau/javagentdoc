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

### `getReferenceAttributeNameAndValue([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) keysManagerProvider, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.net.URL` base, `java.net.URL` url, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) contextNode)`

**Returns:** `java.lang.String[]`

### `getMediaReferenceAttributeNameAndValue([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) keysManagerProvider, `java.net.URL` editorLocation, `java.net.URL` base, `java.net.URL` url, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) contextNode)`

**Returns:** `java.lang.String[]`

### `getReferenceAttributeNameAndValueInternal([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) keysManagerProvider, `java.net.URL` editorLocation, `java.net.URL` base, `java.net.URL` url, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) contextNode, `boolean` isMediaElement)`

**Returns:** `java.lang.String[]`

### `insertContentReference([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) keysManagerProvider, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.net.URL` url)`

**Returns:** `void`

### `clearInternalQueryParamsFromExtractedRefAttrVal(`java.net.URL` base, `java.lang.String` refAttrValue)`

**Returns:** `java.lang.String`

### `detectKeyInfo(`java.net.URL` urlToDrop, `java.net.URL` originatorURL)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

