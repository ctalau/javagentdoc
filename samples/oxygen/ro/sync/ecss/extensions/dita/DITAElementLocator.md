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

### `<init>(`java.lang.String` link)`

## Methods

### `endElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` name)`

**Returns:** `void`

### `startElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` name, [`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md) atts)`

**Returns:** `boolean`

### `isTopic([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md) atts)`

**Returns:** `boolean`

### `hasConrefAttributes([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md) atts)`

**Returns:** `boolean`

### `getIdValue([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md) atts)`

**Returns:** `java.lang.String`

### `getLocalName(`java.lang.String` qName)`

**Returns:** `java.lang.String`

### `getNumberOfNestedTopics()`

**Returns:** `int`

