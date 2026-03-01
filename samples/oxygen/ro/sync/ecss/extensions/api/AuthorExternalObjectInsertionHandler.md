# Class: `AuthorExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`

**Implements:** [`ro.sync.ecss.extensions.api.ExternalObjectInsertionSources`](./ExternalObjectInsertionSources.md), [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

The path to the importer stylesheet must be added in the Classpath tab
 in the Document Type Association edit dialog (as an example you can see the DITA and Docbook document types).

## Fields

### `PASTE_CHECK_CONTENT_PRESERVED_PROPERTY`

**Type:** `java.lang.String`

### `CONTEXT_PATH_SEPARATOR`

**Type:** `char`

### `logger`

**Type:** `org.slf4j.Logger`

### `ONLY_TEXT_CONTENT_STYLESHEET_FILE`

**Type:** `java.lang.String`

### `DEFAULT_STYLESHEET_CONTENT`

**Type:** `java.lang.String`

### `REMOVE_TFOOT_STYLESHEET_FILE`

**Type:** `java.lang.String`

### `extraTestParameters`

**Type:** `java.util.Map<java.lang.String,java.lang.Object>`

## Constructors

### `<init>()`

## Methods

### `insertURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `void`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event.
 

 This call back is received if AuthorExternalObjectInsertionHandler#acceptURLs(AuthorAccess, List, int)
 returned `true` for the same `source` and `urls` list. 
 

 You can use it to link to those specific files/URLs.

### `insertURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `java.util.List<ro.sync.ecss.extensions.api.ReferenceType>` types, `int` source)`

**Returns:** `void`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event.
 

 This call back is received if AuthorExternalObjectInsertionHandler#acceptURLs(AuthorAccess, List, int)
 returned `true` for the same `source` and `urls` list. 
 

 You can use it to link to those specific files/URLs.

### `acceptURLs([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `boolean`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drop position.
 

 By default accepts the URLs from external sources if the URLs are only images or binary files and
 all URLs from paste events and drops from the Oxygen Project and DITA Maps Manager. It calls the "acceptSource" method 
 to check if a certain source of the operation is accepted.

### `acceptSource([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `int` source)`

**Returns:** `boolean`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drag position.
 

 By default accepts paste sources and drags from the Oxygen Project and DITA Maps Manager.

### `containOnlyImages([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urlList)`

**Returns:** `boolean`

### `containOnlyBinaryResources([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.util.List<java.net.URL>` urlList)`

**Returns:** `boolean`

### `insertXHTMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.io.Reader` xhtmlContentReader)`

**Returns:** `void`

### `insertImportedContent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.lang.String` importedContent)`

**Returns:** `void`

The insertion is done schema aware.

### `getOnlyTextContentStylesheet([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `getClassStylesheetResource(`java.lang.Class` clazz, `java.lang.String` resourcePath)`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `getFilterContentOfOutputStylesheet()`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `simpleTransform([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.lang.String` xml, `java.lang.String` xsl)`

**Returns:** `java.lang.String`

### `simpleTransform([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.lang.String` xml, `javax.xml.transform.stream.StreamSource` xsl)`

**Returns:** `java.lang.String`

### `applyAssociatedXSL([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.lang.String` xhtml, `javax.xml.transform.stream.StreamSource` importerStylesheet, `boolean` copyWordImageResources)`

**Returns:** `java.lang.String`

### `setParametersToTransform(`javax.xml.transform.Transformer` transformer, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `boolean` copyWordImageResources)`

**Returns:** `void`

### `checkInsideTable([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `setExtraXSLTParam(`java.lang.String` name, `java.lang.Object` value)`

**Returns:** `void`

### `getParentURL([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

Friendly for tests

### `getContextPathNamesAndUris([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String[]`

### `readInitialXHTMLContent(`java.io.Reader` xhtmlContentReader)`

**Returns:** `java.lang.String`

### `createImporterStylesheetSource([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `javax.xml.transform.stream.StreamSource`

The main
 stylesheet will be applied in a pipeline after the preprocessing stylesheets and generates 
 the markup of the current framework (DITA, DocBook, etc).

### `getStylesheetResource([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `java.lang.String` stylesheetFileName)`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `getImporterStylesheetFileName([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

It will be resolved 
 in the context of the current class loader.

### `getBaseURLAtCaretPosition([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.net.URL`

Usually this is the URL of the opened editor but it can vary if nodes 
 have xml:base defined on them.

### `checkImportedXHTMLContentIsPreservedEntirely()`

**Returns:** `boolean`

If the data is not preserved the content will be copied without any styling and a warning will appear in the console.

### `testDataIsPreserved(`java.lang.String` contentProcessedByStylesheets, `java.lang.String` allWordsPresent)`

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `readExternalPastePreferences([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

