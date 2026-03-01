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

### `<init>(`java.lang.String` link)`

## Methods

### `endElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` name)`

**Returns:** `void`

### `startElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` name, [`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md) atts)`

**Returns:** `boolean`

### `getAttributeValues([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md) atts, `java.lang.String` attrName)`

**Returns:** `java.util.Set<java.lang.String>`

