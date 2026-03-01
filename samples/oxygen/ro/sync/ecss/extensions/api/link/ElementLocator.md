# Class: `ElementLocator`

**Package:** [`ro.sync.ecss.extensions.api.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.link.ElementLocator`

## Description

The source XML is parsed and notifications will be forwarded 
 to ElementLocator objects in order for the references to be resolved.

## Fields

### `link`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` link)`

## Methods

### `startElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` qName, [`ro.sync.ecss.extensions.api.link.Attr[]`](./Attr.md) atts)`

**Returns:** `boolean`

This method is invoked at the beginning of every element in the 
 XML document; an event will be fired for every `startElement` 
 (even when the element is empty).

### `endElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` qName)`

**Returns:** `void`

This method is invoked at the end of every
 element in the XML document; an event will be fired 
 for every `endElement` (even when the element is empty).

