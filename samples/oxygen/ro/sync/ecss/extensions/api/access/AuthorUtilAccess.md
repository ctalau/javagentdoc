# Interface: `AuthorUtilAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorUtilAccess`

**Extends:** [`ro.sync.exml.workspace.api.util.UtilAccess`](../../../../exml/workspace/api/util/UtilAccess.md)

## Description

## Methods

### `escapeAttributeValue(`java.lang.String` attributeValue)`

**Returns:** `java.lang.String`

### `newNonValidatingXMLReader()`

**Returns:** `org.xml.sax.XMLReader`

### `resolvePath(`java.net.URL` baseURL, `java.lang.String` relativeLocation, `boolean` entityResolve, `boolean` uriResolve)`

**Returns:** `java.net.URL`

### `resetXMLCatalogs()`

**Returns:** `void`

This way next time the catalogs are needed
 they will first be rebuilt.

