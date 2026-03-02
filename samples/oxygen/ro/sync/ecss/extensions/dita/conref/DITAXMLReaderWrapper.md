# Class: `DITAXMLReaderWrapper`

**Package:** [`ro.sync.ecss.extensions.dita.conref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.conref.DITAXMLReaderWrapper`

**Implements:** `org.xml.sax.XMLReader`

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `xmlReader`

**Type:** `org.xml.sax.XMLReader`

### `filteringContentHandler`

**Type:** [`ro.sync.ecss.extensions.dita.conref.DITAFilteringContentHandler`](./DITAFilteringContentHandler.md)

### `isKeyReference`

**Type:** `boolean`

### `systemId`

**Type:** `java.lang.String`

## Constructors

### `<init>(org.xml.sax.XMLReader xmlReader, java.lang.String[] topicPath, java.lang.String[] endTopicPath, java.lang.String sourceClass, boolean isKeyReference)`

**Parameters:**
- `xmlReader` (`org.xml.sax.XMLReader`): The wrapped XML Reader.
- `topicPath` (`java.lang.String[]`): The topic IDs path. If null, the first encountered topic will be used.
- `endTopicPath` (`java.lang.String[]`): If a "conrefend" is specified, this is the end range path
- `sourceClass` (`java.lang.String`): The class attribute value of the element which makes the conref...
- `isKeyReference` (`boolean`): `true` if the reference is a key reference.

## Methods

### `getContentHandler()`

**Returns:** `org.xml.sax.ContentHandler`

### `getDTDHandler()`

**Returns:** `org.xml.sax.DTDHandler`

### `getEntityResolver()`

**Returns:** `org.xml.sax.EntityResolver`

### `getErrorHandler()`

**Returns:** `org.xml.sax.ErrorHandler`

### `getFeature(java.lang.String name)`

**Returns:** `boolean`

**Parameters:**
- `name` (`java.lang.String`)

### `getProperty(java.lang.String name)`

**Returns:** `java.lang.Object`

**Parameters:**
- `name` (`java.lang.String`)

### `parse(org.xml.sax.InputSource input)`

**Returns:** `void`

**Parameters:**
- `input` (`org.xml.sax.InputSource`)

### `processParserException(java.lang.Exception ex)`

**Returns:** `void`

**Parameters:**
- `ex` (`java.lang.Exception`): The exception.

### `parse(java.lang.String systemId)`

**Returns:** `void`

**Parameters:**
- `systemId` (`java.lang.String`)

### `setContentHandler(org.xml.sax.ContentHandler handler)`

**Returns:** `void`

**Parameters:**
- `handler` (`org.xml.sax.ContentHandler`)

### `setDTDHandler(org.xml.sax.DTDHandler handler)`

**Returns:** `void`

**Parameters:**
- `handler` (`org.xml.sax.DTDHandler`)

### `setEntityResolver(org.xml.sax.EntityResolver resolver)`

**Returns:** `void`

**Parameters:**
- `resolver` (`org.xml.sax.EntityResolver`)

### `setErrorHandler(org.xml.sax.ErrorHandler handler)`

**Returns:** `void`

**Parameters:**
- `handler` (`org.xml.sax.ErrorHandler`)

### `setFeature(java.lang.String name, boolean value)`

**Returns:** `void`

**Parameters:**
- `name` (`java.lang.String`)
- `value` (`boolean`)

### `setProperty(java.lang.String name, java.lang.Object value)`

**Returns:** `void`

**Parameters:**
- `name` (`java.lang.String`)
- `value` (`java.lang.Object`)

