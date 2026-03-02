# Class: `DITAElementLocator`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAElementLocator`

**Extends:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](../api/link/ElementLocator.md)

## Description

So the link
 has the following pattern: topicID/elementID

## Fields

### `topicId`

**Type:** `java.lang.String`

### `elementId`

**Type:** `java.lang.String`

### `elementStack`

**Type:** `java.util.Stack`

## Constructors

### `<init>(java.lang.String link)`

**Parameters:**
- `link` (`java.lang.String`): The link used to identify the element.

## Methods

### `endElement(java.lang.String uri, java.lang.String localName, java.lang.String name)`

**Returns:** `void`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)

### `startElement(java.lang.String uri, java.lang.String localName, java.lang.String name, ro.sync.ecss.extensions.api.link.Attr[] atts)`

**Returns:** `boolean`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md))

### `isTopic(ro.sync.ecss.extensions.api.link.Attr[] atts)`

**Returns:** `boolean`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.

### `hasConrefAttributes(ro.sync.ecss.extensions.api.link.Attr[] atts)`

**Returns:** `boolean`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.

### `getIdValue(ro.sync.ecss.extensions.api.link.Attr[] atts)`

**Returns:** `java.lang.String`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.

### `getLocalName(java.lang.String qName)`

**Returns:** `java.lang.String`

**Parameters:**
- `qName` (`java.lang.String`)

### `getNumberOfNestedTopics()`

**Returns:** `int`

