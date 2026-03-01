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

### `<init>(`java.lang.String[]` topicPath, `java.lang.String[]` endRangePath, `java.lang.String` sourceClass, `boolean` isKeyReference)`

## Methods

### `createInvalidRangeException(`java.lang.String` situation)`

**Returns:** `org.xml.sax.SAXException`

### `setContentHandler(`org.xml.sax.ContentHandler` contentHandler)`

**Returns:** `void`

### `setLexicalHandler(`org.xml.sax.ext.LexicalHandler` lexicalHandler)`

**Returns:** `void`

### `characters(`char[]` ch, `int` start, `int` length)`

**Returns:** `void`

### `endDocument()`

**Returns:** `void`

### `createConrefDescr(`java.lang.String[]` topicPath, `boolean` createFullPath)`

**Returns:** `java.lang.String`

### `endElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` name)`

**Returns:** `void`

### `endPrefixMapping(`java.lang.String` prefix)`

**Returns:** `void`

### `ignorableWhitespace(`char[]` ch, `int` start, `int` length)`

**Returns:** `void`

### `processingInstruction(`java.lang.String` target, `java.lang.String` data)`

**Returns:** `void`

### `setDocumentLocator(`org.xml.sax.Locator` locator)`

**Returns:** `void`

### `skippedEntity(`java.lang.String` name)`

**Returns:** `void`

### `startDocument()`

**Returns:** `void`

### `startElement(`java.lang.String` uri, `java.lang.String` localName, `java.lang.String` name, `org.xml.sax.Attributes` atts)`

**Returns:** `void`

### `startPrefixMapping(`java.lang.String` prefix, `java.lang.String` uri)`

**Returns:** `void`

### `comment(`char[]` ch, `int` start, `int` length)`

**Returns:** `void`

### `endCDATA()`

**Returns:** `void`

### `endDTD()`

**Returns:** `void`

### `endEntity(`java.lang.String` name)`

**Returns:** `void`

### `startCDATA()`

**Returns:** `void`

### `startDTD(`java.lang.String` name, `java.lang.String` publicId, `java.lang.String` systemId)`

**Returns:** `void`

### `startEntity(`java.lang.String` name)`

**Returns:** `void`

### `getNumberOfAncestorTopics()`

**Returns:** `int`

### `getClosestTopicIDValue()`

**Returns:** `java.lang.String`

