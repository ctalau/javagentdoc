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

### `<init>(java.lang.String link)`

**Parameters:**
- `link` (`java.lang.String`): The link used to identify the element.

## Methods

### `endElement(java.lang.String uri, java.lang.String localName, java.lang.String name)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)

**Returns:** `void`

### `startElement(java.lang.String uri, java.lang.String localName, java.lang.String name, ro.sync.ecss.extensions.api.link.Attr[] atts)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md))

**Returns:** `boolean`

### `getAttributeValues(ro.sync.ecss.extensions.api.link.Attr[] atts, java.lang.String attrName)`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.
- `attrName` (`java.lang.String`)

**Returns:** `java.util.Set<java.lang.String>`

