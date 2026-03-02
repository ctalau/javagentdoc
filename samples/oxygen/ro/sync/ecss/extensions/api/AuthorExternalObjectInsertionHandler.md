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

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, int source)`

**Returns:** `void`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event.
 

 This call back is received if AuthorExternalObjectInsertionHandler#acceptURLs(AuthorAccess, List, int)
 returned `true` for the same `source` and `urls` list. 
 

 You can use it to link to those specific files/URLs.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access
- `urls` (`java.util.List<java.net.URL>`): The list of URLs.
- `source` (`int`): The source of the URLs, one of the AuthorExternalObjectInsertionHandler constants.

### `insertURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, java.util.List<ro.sync.ecss.extensions.api.ReferenceType> types, int source)`

**Returns:** `void`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event.
 

 This call back is received if AuthorExternalObjectInsertionHandler#acceptURLs(AuthorAccess, List, int)
 returned `true` for the same `source` and `urls` list. 
 

 You can use it to link to those specific files/URLs.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access
- `urls` (`java.util.List<java.net.URL>`): The list of URLs.
- `types` (`java.util.List<ro.sync.ecss.extensions.api.ReferenceType>`): The type of the URL reference - if null, the type will be inferred.
- `source` (`int`): The source of the URLs, one of the AuthorExternalObjectInsertionHandler constants.

### `acceptURLs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urls, int source)`

**Returns:** `boolean`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drop position.
 

 By default accepts the URLs from external sources if the URLs are only images or binary files and
 all URLs from paste events and drops from the Oxygen Project and DITA Maps Manager. It calls the "acceptSource" method 
 to check if a certain source of the operation is accepted.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.
- `urls` (`java.util.List<java.net.URL>`): The list of URLs.
- `source` (`int`): The source of the URLs, one of the AuthorExternalObjectInsertionHandler constants.

### `acceptSource(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int source)`

**Returns:** `boolean`

The `source` of the insertion can be a **paste** event or a 
 **drag and drop** event. If the source is of **drag and drop** type and 
 it is accepted, the caret will be moved to the drag position.
 

 By default accepts paste sources and drags from the Oxygen Project and DITA Maps Manager.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.
- `source` (`int`): The source of the URLs, one of the 
 AuthorExternalObjectInsertionHandler constants (that represents a 
 **paste** or a **drag and drop** event)

### `containOnlyImages(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urlList)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `urlList` (`java.util.List<java.net.URL>`): The list of URLs

### `containOnlyBinaryResources(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.net.URL> urlList)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `urlList` (`java.util.List<java.net.URL>`): The list of URLs

### `insertXHTMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.io.Reader xhtmlContentReader)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access
- `xhtmlContentReader` (`java.io.Reader`): The XTHML content reader

### `insertImportedContent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String importedContent)`

**Returns:** `void`

The insertion is done schema aware.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.
- `importedContent` (`java.lang.String`): The imported content.

### `getOnlyTextContentStylesheet(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `javax.xml.transform.stream.StreamSource`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

### `getClassStylesheetResource(java.lang.Class clazz, java.lang.String resourcePath)`

**Returns:** `javax.xml.transform.stream.StreamSource`

**Parameters:**
- `clazz` (`java.lang.Class`): The class where to search for the stylesheet resource
- `resourcePath` (`java.lang.String`): The resource to find.

### `getFilterContentOfOutputStylesheet()`

**Returns:** `javax.xml.transform.stream.StreamSource`

### `simpleTransform(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String xml, java.lang.String xsl)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): helper object for creating the transformer
- `xml` (`java.lang.String`): the input XML of the transformation
- `xsl` (`java.lang.String`): the input XSLT of the transformation

### `simpleTransform(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String xml, javax.xml.transform.stream.StreamSource xsl)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): helper object for creating the transformer
- `xml` (`java.lang.String`): the input XML of the transformation
- `xsl` (`javax.xml.transform.stream.StreamSource`): the input XSLT of the transformation

### `applyAssociatedXSL(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String xhtml, javax.xml.transform.stream.StreamSource importerStylesheet, boolean copyWordImageResources)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The AuthorAccess object of the current Author document.
- `xhtml` (`java.lang.String`): The XHTML fragment .
- `importerStylesheet` (`javax.xml.transform.stream.StreamSource`): The XSLT stylesheet for applying to specified XHTML fragment.
- `copyWordImageResources` (`boolean`): `true` if the stylesheet should copy temp images files from Word.

### `setParametersToTransform(javax.xml.transform.Transformer transformer, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean copyWordImageResources)`

**Returns:** `void`

**Parameters:**
- `transformer` (`javax.xml.transform.Transformer`): The XSLT transformer.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.
- `copyWordImageResources` (`boolean`): `true` to copy image resources from word document

### `checkInsideTable(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.

### `setExtraXSLTParam(java.lang.String name, java.lang.Object value)`

**Returns:** `void`

**Parameters:**
- `name` (`java.lang.String`): Param name.
- `value` (`java.lang.Object`): Param value.

### `getParentURL(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

Friendly for tests

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The access for the current editor.

### `getContextPathNamesAndUris(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

### `readInitialXHTMLContent(java.io.Reader xhtmlContentReader)`

**Returns:** `java.lang.String`

**Parameters:**
- `xhtmlContentReader` (`java.io.Reader`): The XHTML content reader

### `createImporterStylesheetSource(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `javax.xml.transform.stream.StreamSource`

The main
 stylesheet will be applied in a pipeline after the preprocessing stylesheets and generates 
 the markup of the current framework (DITA, DocBook, etc).

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The Author access API.

### `getStylesheetResource(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String stylesheetFileName)`

**Returns:** `javax.xml.transform.stream.StreamSource`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): the current framework
- `stylesheetFileName` (`java.lang.String`): the name of the stylesheet resource

### `getImporterStylesheetFileName(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

It will be resolved 
 in the context of the current class loader.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access API.

### `getBaseURLAtCaretPosition(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.net.URL`

Usually this is the URL of the opened editor but it can vary if nodes 
 have xml:base defined on them.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

### `checkImportedXHTMLContentIsPreservedEntirely()`

**Returns:** `boolean`

If the data is not preserved the content will be copied without any styling and a warning will appear in the console.

### `testDataIsPreserved(java.lang.String contentProcessedByStylesheets, java.lang.String allWordsPresent)`

**Returns:** `boolean`

**Parameters:**
- `contentProcessedByStylesheets` (`java.lang.String`)
- `allWordsPresent` (`java.lang.String`)

### `getDescription()`

**Returns:** `java.lang.String`

### `readExternalPastePreferences(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.

