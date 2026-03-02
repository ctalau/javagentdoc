# Class: `XPointerElementLocator`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.XPointerElementLocator`

**Extends:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](../api/link/ElementLocator.md)

## Description

- element(elementID/3/4) - A child sequence appearing after an 
   NCName identifies an element by means of stepwise navigation, 
   starting from the element located by the given name.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `idVerifier`

**Type:** [`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md)

### `xpointerPath`

**Type:** `java.lang.String[]`

### `currentElementIndexStack`

**Type:** `java.util.Stack`

### `xpointerPathDepth`

**Type:** `int`

### `startWithElementID`

**Type:** `boolean`

### `startElementDepth`

**Type:** `int`

### `endElementDepth`

**Type:** `int`

### `lastIndexInParent`

**Type:** `int`

Set in endElement().

## Constructors

### `<init>(IDTypeVerifier idVerifier, String link)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md)): Verifies if an given attribute has the type ID.
- `link` (`java.lang.String`): The link that gives the element position.

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

