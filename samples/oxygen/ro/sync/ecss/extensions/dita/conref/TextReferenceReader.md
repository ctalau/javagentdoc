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

### `<init>(java.lang.String referenceSystemId, java.lang.String encoding, ro.sync.ecss.extensions.api.access.AuthorUtilAccess authorUtilAccess)`

**Parameters:**
- `referenceSystemId` (`java.lang.String`): The referred file system ID.
- `encoding` (`java.lang.String`): The encoding of the referred file.
 if `null` will use the EncodingDetectorSingleton.getInstance().
- `authorUtilAccess` ([`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](../../api/access/AuthorUtilAccess.md)): Access to util methods.

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

### `extractContent(org.xml.sax.InputSource input)`

**Returns:** `java.lang.StringBuilder`

**Parameters:**
- `input` (`org.xml.sax.InputSource`): The input. If it's null this will be extracted from the referenceSystemId

### `extractLineRange()`

**Returns:** `void`

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

