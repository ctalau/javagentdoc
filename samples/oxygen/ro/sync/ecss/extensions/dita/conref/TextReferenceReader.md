# Class: `TextReferenceReader`

**Package:** [`ro.sync.ecss.extensions.dita.conref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.conref.TextReferenceReader`

**Implements:** `org.xml.sax.XMLReader`

## Description

It also extracts the text inside a given line interval.

## Fields

### `contentHandler`

**Type:** `org.xml.sax.ContentHandler`

### `entityResolver`

**Type:** `org.xml.sax.EntityResolver`

### `referenceSystemId`

**Type:** `java.lang.String`

### `encoding`

**Type:** `java.lang.String`

### `lineStart`

**Type:** `int`

0-based

### `lineEnd`

**Type:** `int`

0-based

### `CONTENT_RANGE_REGEX`

**Type:** `java.util.regex.Pattern`

### `LINE_REGEX`

**Type:** `java.util.regex.Pattern`

### `LINE_RANGE_REGEX`

**Type:** `java.util.regex.Pattern`

## Constructors

### `<init>(`java.lang.String` referenceSystemId, `java.lang.String` encoding, [`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](../../api/access/AuthorUtilAccess.md) authorUtilAccess)`

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

### `extractContent(`org.xml.sax.InputSource` input)`

**Returns:** `java.lang.StringBuilder`

### `extractLineRange()`

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

