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

### `<init>(XMLReader xmlReader, String[] topicPath, String[] endTopicPath, String sourceClass, boolean isKeyReference)`

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

### `getFeature(String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `boolean`

### `getProperty(String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `java.lang.Object`

### `parse(InputSource input)`

**Parameters:**
- `input` (`org.xml.sax.InputSource`)

**Returns:** `void`

### `processParserException(Exception ex)`

**Parameters:**
- `ex` (`java.lang.Exception`): The exception.

**Returns:** `void`

### `parse(String systemId)`

**Parameters:**
- `systemId` (`java.lang.String`)

**Returns:** `void`

### `setContentHandler(ContentHandler handler)`

**Parameters:**
- `handler` (`org.xml.sax.ContentHandler`)

**Returns:** `void`

### `setDTDHandler(DTDHandler handler)`

**Parameters:**
- `handler` (`org.xml.sax.DTDHandler`)

**Returns:** `void`

### `setEntityResolver(EntityResolver resolver)`

**Parameters:**
- `resolver` (`org.xml.sax.EntityResolver`)

**Returns:** `void`

### `setErrorHandler(ErrorHandler handler)`

**Parameters:**
- `handler` (`org.xml.sax.ErrorHandler`)

**Returns:** `void`

### `setFeature(String name, boolean value)`

**Parameters:**
- `name` (`java.lang.String`)
- `value` (`boolean`)

**Returns:** `void`

### `setProperty(String name, Object value)`

**Parameters:**
- `name` (`java.lang.String`)
- `value` (`java.lang.Object`)

**Returns:** `void`

