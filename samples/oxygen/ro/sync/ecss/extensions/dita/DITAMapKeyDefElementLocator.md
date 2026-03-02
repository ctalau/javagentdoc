# Class: `DITAMapKeyDefElementLocator`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAMapKeyDefElementLocator`

**Extends:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](../api/link/ElementLocator.md)

## Description

## Fields

### `anchorKeyref`

**Type:** `java.lang.String`

May be prefixed with key scopes.

### `keyScopes`

**Type:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `elemContainsKeyScopes`

**Type:** `java.util.Stack<java.lang.Boolean>`

## Constructors

### `<init>(String link)`

**Parameters:**
- `link` (`java.lang.String`): The link used to identify the element.

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

### `getAttributeValues(Attr[] atts, String attrName)`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.
- `attrName` (`java.lang.String`)

**Returns:** `java.util.Set<java.lang.String>`

