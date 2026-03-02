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

### `<init>(String referenceSystemId, String encoding, AuthorUtilAccess authorUtilAccess)`

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

### `extractContent(InputSource input)`

**Parameters:**
- `input` (`org.xml.sax.InputSource`): The input. If it's null this will be extracted from the referenceSystemId

**Returns:** `java.lang.StringBuilder`

### `extractLineRange()`

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

