# Class: `IDElementLocator`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.IDElementLocator`

**Extends:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](../api/link/ElementLocator.md)

## Description

## Fields

### `idVerifier`

**Type:** [`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md)

## Constructors

### `<init>(IDTypeVerifier idVerifier, String link)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md)): Used to check if an attribute has ID type.
- `link` (`java.lang.String`): The link used to identify an element.

## Methods

### `endElement(String uri, String localName, String name)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)

**Returns:** `void`

### `startElement(String uri, String localName, String name, Attr[] atts)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md))

**Returns:** `boolean`

