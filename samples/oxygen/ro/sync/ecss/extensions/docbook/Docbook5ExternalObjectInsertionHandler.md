# Class: `Docbook5ExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.Docbook5ExternalObjectInsertionHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](../api/AuthorExternalObjectInsertionHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `insertURLs(AuthorAccess authorAccess, List<URL> urls, List<ReferenceType> types, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`)
- `source` (`int`)

**Returns:** `void`

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

