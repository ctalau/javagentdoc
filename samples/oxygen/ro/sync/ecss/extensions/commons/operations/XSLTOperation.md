# Class: `XSLTOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.XSLTOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.TransformOperation`](./TransformOperation.md)

## Description

## Constructors

### `<init>()`

## Methods

### `createTransformer(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, javax.xml.transform.Source xslSrc, ro.sync.ecss.extensions.commons.operations.ElementLocationPath currentElementLocation)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author Access.
- `xslSrc` (`javax.xml.transform.Source`): The stylesheet source
- `currentElementLocation` ([`ro.sync.ecss.extensions.commons.operations.ElementLocationPath`](./ElementLocationPath.md)): The XPath location of the current element.

**Returns:** `javax.xml.transform.Transformer`

### `createTransformer(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, javax.xml.transform.Source scriptSrc)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `scriptSrc` (`javax.xml.transform.Source`)

**Returns:** `javax.xml.transform.Transformer`

### `getDescription()`

**Returns:** `java.lang.String`

### `canTreatAsScript(java.lang.String script)`

**Parameters:**
- `script` (`java.lang.String`)

**Returns:** `boolean`

