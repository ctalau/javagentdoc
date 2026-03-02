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

### `isTopic(Attr[] atts)`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.

**Returns:** `boolean`

### `hasConrefAttributes(Attr[] atts)`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.

**Returns:** `boolean`

### `getIdValue(Attr[] atts)`

**Parameters:**
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md)): The attributes of the element.

**Returns:** `java.lang.String`

### `getLocalName(String qName)`

**Parameters:**
- `qName` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getNumberOfNestedTopics()`

**Returns:** `int`

