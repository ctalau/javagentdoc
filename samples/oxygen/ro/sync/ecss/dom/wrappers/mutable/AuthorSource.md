# Class: `AuthorSource`

**Package:** [`ro.sync.ecss.dom.wrappers.mutable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dom.wrappers.mutable.AuthorSource`

**Extends:** `javax.xml.transform.dom.DOMSource`

## Description

#getNode() will return
 a DOM implementation over the Author nodes model.

## Fields

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

The XInclude references over XQuery are not transparent, by default.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)): The author access of the author document.

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean transparentXqueryUpdateReferences)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)): The author access of the author document.
- `transparentXqueryUpdateReferences` (`boolean`): `true` to make xinclude nodes
 transparent in the document model.

## Methods

### `setSystemId(java.lang.String systemId)`

**Returns:** `void`

**Parameters:**
- `systemId` (`java.lang.String`)

### `getSystemId()`

**Returns:** `java.lang.String`

### `getController()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../extensions/api/AuthorDocumentController.md)

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../extensions/api/AuthorAccess.md)

