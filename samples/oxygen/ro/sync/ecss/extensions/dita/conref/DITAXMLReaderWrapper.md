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

### `<init>(`org.xml.sax.XMLReader` xmlReader, `java.lang.String[]` topicPath, `java.lang.String[]` endTopicPath, `java.lang.String` sourceClass, `boolean` isKeyReference)`

## Methods

### `getContentHandler()`

**Returns:** `org.xml.sax.ContentHandler`

### `getDTDHandler()`

**Returns:** `org.xml.sax.DTDHandler`

### `getEntityResolver()`

**Returns:** `org.xml.sax.EntityResolver`

### `getErrorHandler()`

**Returns:** `org.xml.sax.ErrorHandler`

### `getFeature(`java.lang.String` name)`

**Returns:** `boolean`

### `getProperty(`java.lang.String` name)`

**Returns:** `java.lang.Object`

### `parse(`org.xml.sax.InputSource` input)`

**Returns:** `void`

### `processParserException(`java.lang.Exception` ex)`

**Returns:** `void`

### `parse(`java.lang.String` systemId)`

**Returns:** `void`

### `setContentHandler(`org.xml.sax.ContentHandler` handler)`

**Returns:** `void`

### `setDTDHandler(`org.xml.sax.DTDHandler` handler)`

**Returns:** `void`

### `setEntityResolver(`org.xml.sax.EntityResolver` resolver)`

**Returns:** `void`

### `setErrorHandler(`org.xml.sax.ErrorHandler` handler)`

**Returns:** `void`

### `setFeature(`java.lang.String` name, `boolean` value)`

**Returns:** `void`

### `setProperty(`java.lang.String` name, `java.lang.Object` value)`

**Returns:** `void`

