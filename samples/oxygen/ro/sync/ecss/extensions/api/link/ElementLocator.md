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

### `<init>(String link)`

**Parameters:**
- `link` (`java.lang.String`): The link to be used to identify the element.

## Methods

### `startElement(String uri, String localName, String qName, Attr[] atts)`

This method is invoked at the beginning of every element in the 
 XML document; an event will be fired for every `startElement` 
 (even when the element is empty).

**Parameters:**
- `uri` (`java.lang.String`): the namespace URI, or the empty string if the
          element has no namespace URI or if namespace
          processing is not being performed
- `localName` (`java.lang.String`): the local name of the element
- `qName` (`java.lang.String`): the qualified name of the element
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](./Attr.md)): an array with the attributes attached to the element. If
          there are no attributes, it shall be empty. 
          The attributes are represented as Attr objects.

**Returns:** `boolean`

### `endElement(String uri, String localName, String qName)`

This method is invoked at the end of every
 element in the XML document; an event will be fired 
 for every `endElement` (even when the element is empty).

**Parameters:**
- `uri` (`java.lang.String`): the namespace URI, or the empty string if the
          element has no namespace URI or if namespace
          processing is not being performed
- `localName` (`java.lang.String`): the local name of the element
- `qName` (`java.lang.String`): the qualified XML name of the element

**Returns:** `void`

