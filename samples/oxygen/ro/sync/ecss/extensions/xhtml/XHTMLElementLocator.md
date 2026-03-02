# Class: `XHTMLElementLocator`

**Package:** [`ro.sync.ecss.extensions.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.XHTMLElementLocator`

**Extends:** [`ro.sync.ecss.extensions.commons.IDElementLocator`](../commons/IDElementLocator.md)

## Description

An internal reference can refer an `id`
 attribute or the `name` attribute of an `a` element. 
 The `name` attribute is not of ID type so it needs to be specifically
 handled.

## Constructors

### `<init>(IDTypeVerifier idVerifier, String link)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md)): Responsible to verify if an attribute has the ID type.
- `link` (`java.lang.String`): The link to be identified.

## Methods

### `startElement(String uri, String localName, String name, Attr[] atts)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md))

**Returns:** `boolean`

