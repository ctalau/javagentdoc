# Class: `DITAFilteringContentHandler`

**Package:** [`ro.sync.ecss.extensions.dita.conref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.conref.DITAFilteringContentHandler`

**Implements:** `org.xml.sax.ContentHandler`, `org.xml.sax.ext.LexicalHandler`

## Description

## Fields

### `TOPIC_CLASS`

**Type:** `java.lang.String`

### `contentHandler`

**Type:** `org.xml.sax.ContentHandler`

### `lexicalHandler`

**Type:** `org.xml.sax.ext.LexicalHandler`

### `topicPath`

**Type:** `java.lang.String[]`

### `pathIndex`

**Type:** `int`

### `referredPathDepth`

**Type:** `int`

### `isForwardingEvents`

**Type:** `boolean`

### `proxyNamespaceMapping`

**Type:** `ro.sync.xml.ProxyNamespaceMapping`

### `referenceResolved`

**Type:** `boolean`

### `startDTD`

**Type:** `boolean`

### `endRangePath`

**Type:** `java.lang.String[]`

### `invalidRangeException`

**Type:** `org.xml.sax.SAXException`

Will stop the parsing

### `depth`

**Type:** `int`

### `startRangeDepth`

**Type:** `int`

### `foundEndRangeElement`

**Type:** `boolean`

### `startRangeElementQName`

**Type:** `java.lang.String`

### `isKeyReference`

**Type:** `boolean`

### `mapDocument`

**Type:** `boolean`

### `idOfFoundTopic`

**Type:** `java.lang.String`

### `nestedClassesAndIDs`

**Type:** `java.util.Stack<ro.sync.ecss.extensions.dita.conref.DITAFilteringContentHandler.ClassAndID>`

### `locator`

**Type:** `org.xml.sax.Locator`

## Constructors

### `<init>(java.lang.String[] topicPath, java.lang.String[] endRangePath, java.lang.String sourceClass, boolean isKeyReference)`

**Parameters:**
- `topicPath` (`java.lang.String[]`): The topic IDs path. If null, the first encountered topic will be used.
- `endRangePath` (`java.lang.String[]`): If a "conrefend" is specified, this is the end range path
- `sourceClass` (`java.lang.String`): The class attribute value of the element which makes the conref...
- `isKeyReference` (`boolean`): `true` if the reference is a key reference.

## Methods

### `createInvalidRangeException(java.lang.String situation)`

**Parameters:**
- `situation` (`java.lang.String`): The particular situation

**Returns:** `org.xml.sax.SAXException`

### `setContentHandler(org.xml.sax.ContentHandler contentHandler)`

**Parameters:**
- `contentHandler` (`org.xml.sax.ContentHandler`): The contentHandler to set.

**Returns:** `void`

### `setLexicalHandler(org.xml.sax.ext.LexicalHandler lexicalHandler)`

**Parameters:**
- `lexicalHandler` (`org.xml.sax.ext.LexicalHandler`): The lexicalHandler to set.

**Returns:** `void`

### `characters(char[] ch, int start, int length)`

**Parameters:**
- `ch` (`char[]`)
- `start` (`int`)
- `length` (`int`)

**Returns:** `void`

### `endDocument()`

**Returns:** `void`

### `createConrefDescr(java.lang.String[] topicPath, boolean createFullPath)`

**Parameters:**
- `topicPath` (`java.lang.String[]`): The topic path array.
- `createFullPath` (`boolean`)

**Returns:** `java.lang.String`

### `endElement(java.lang.String uri, java.lang.String localName, java.lang.String name)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)

**Returns:** `void`

### `endPrefixMapping(java.lang.String prefix)`

**Parameters:**
- `prefix` (`java.lang.String`)

**Returns:** `void`

### `ignorableWhitespace(char[] ch, int start, int length)`

**Parameters:**
- `ch` (`char[]`)
- `start` (`int`)
- `length` (`int`)

**Returns:** `void`

### `processingInstruction(java.lang.String target, java.lang.String data)`

**Parameters:**
- `target` (`java.lang.String`)
- `data` (`java.lang.String`)

**Returns:** `void`

### `setDocumentLocator(org.xml.sax.Locator locator)`

**Parameters:**
- `locator` (`org.xml.sax.Locator`)

**Returns:** `void`

### `skippedEntity(java.lang.String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `void`

### `startDocument()`

**Returns:** `void`

### `startElement(java.lang.String uri, java.lang.String localName, java.lang.String name, org.xml.sax.Attributes atts)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)
- `atts` (`org.xml.sax.Attributes`)

**Returns:** `void`

### `startPrefixMapping(java.lang.String prefix, java.lang.String uri)`

**Parameters:**
- `prefix` (`java.lang.String`)
- `uri` (`java.lang.String`)

**Returns:** `void`

### `comment(char[] ch, int start, int length)`

**Parameters:**
- `ch` (`char[]`)
- `start` (`int`)
- `length` (`int`)

**Returns:** `void`

### `endCDATA()`

**Returns:** `void`

### `endDTD()`

**Returns:** `void`

### `endEntity(java.lang.String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `void`

### `startCDATA()`

**Returns:** `void`

### `startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId)`

**Parameters:**
- `name` (`java.lang.String`)
- `publicId` (`java.lang.String`)
- `systemId` (`java.lang.String`)

**Returns:** `void`

### `startEntity(java.lang.String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `void`

### `getNumberOfAncestorTopics()`

**Returns:** `int`

### `getClosestTopicIDValue()`

**Returns:** `java.lang.String`

