# Class: `TEIP5ExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.tei`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.TEIP5ExternalObjectInsertionHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](../api/AuthorExternalObjectInsertionHandler.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, java.util.List<ro.sync.ecss.extensions.api.ReferenceType> types, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`)
- `source` (`int`)

**Returns:** `void`

### `isImageReference(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ReferenceType type, java.net.URL url)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `type` ([`ro.sync.ecss.extensions.api.ReferenceType`](../api/ReferenceType.md)): The reference type.
- `url` (`java.net.URL`): The URL.

**Returns:** `boolean`

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, int source)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `urls` (`java.util.List<java.net.URL>`)
- `source` (`int`)

**Returns:** `void`

### `getImporterStylesheetFileName(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `java.lang.String`

