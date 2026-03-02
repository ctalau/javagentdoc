# Interface: `AuthorUtilAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorUtilAccess`

**Extends:** [`ro.sync.exml.workspace.api.util.UtilAccess`](../../../../exml/workspace/api/util/UtilAccess.md)

## Description

## Methods

### `escapeAttributeValue(java.lang.String attributeValue)`

**Parameters:**
- `attributeValue` (`java.lang.String`): The attribute value.

**Returns:** `java.lang.String`

### `newNonValidatingXMLReader()`

**Returns:** `org.xml.sax.XMLReader`

### `resolvePath(java.net.URL baseURL, java.lang.String relativeLocation, boolean entityResolve, boolean uriResolve)`

**Parameters:**
- `baseURL` (`java.net.URL`): The URL of the current opened XML file.
- `relativeLocation` (`java.lang.String`): The relative location to be resolved.
- `entityResolve` (`boolean`): `true` if the catalog entity resolver should be used.
- `uriResolve` (`boolean`): `true` if the catalog URI resolver should be used.

**Returns:** `java.net.URL`

### `resetXMLCatalogs()`

This way next time the catalogs are needed
 they will first be rebuilt.

**Returns:** `void`

