# Interface: `XMLUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.XMLUtilAccess`

## Description

## Fields

### `TRANSFORMER_XALAN`

**Type:** `int`

### `TRANSFORMER_SAXON_6`

**Type:** `int`

### `TRANSFORMER_SAXON_HOME_EDITION`

**Type:** `int`

### `TRANSFORMER_SAXON_PROFESSIONAL_EDITION`

**Type:** `int`

### `TRANSFORMER_SAXON_ENTERPRISE_EDITION`

**Type:** `int`

### `EXTENSION_PREFIX`

**Type:** `java.lang.String`

### `EXTENSION_NS`

**Type:** `java.lang.String`

## Methods

### `createXSLTTransformer(Source styleSource, URL[] extensionJars, int transformerType)`

The options set in the oXygen preferences are used.

**Parameters:**
- `styleSource` (`javax.xml.transform.Source`): The source XSL
- `extensionJars` (`java.net.URL[]`): Jars with extension libraries which can be used by the transformer, can be `null`
- `transformerType` (`int`): The type of the transformer to create, one of the constants defined in this class starting with TRANSFORMER_

**Returns:** `javax.xml.transform.Transformer`

### `createSaxon9XSLTTransformerWithExtensions(Source styleSource, ExtensionFunctionDefinition[] extensionFunctions, int transformerType)`

**Parameters:**
- `styleSource` (`javax.xml.transform.Source`): The source XSL
- `extensionFunctions` (`net.sf.saxon.lib.ExtensionFunctionDefinition[]`): Jars with extension libraries which can be used by the transformer, can be `null`
- `transformerType` (`int`): The type of the transformer to create can only be TRANSFORMER_SAXON_HOME_EDITION.

**Returns:** `javax.xml.transform.Transformer`

### `createXSLTTransformer(Source styleSource, URL[] extensionJars, int transformerType, boolean useOxygenOptions)`

**Parameters:**
- `styleSource` (`javax.xml.transform.Source`): The source XSL
- `extensionJars` (`java.net.URL[]`): Jars with extension libraries which can be used by the transformer. Can be `null`.
- `transformerType` (`int`): The type of the transformer to create, one of the constants defined in this class starting with TRANSFORMER_
- `useOxygenOptions` (`boolean`): If `true` the options set in the oXygen preferences are used. Otherwise no options are set to the transformers.

**Returns:** `javax.xml.transform.Transformer`

### `createSaxon9HEXSLTTransformerWithExtensions(Source styleSource, ExtensionFunctionDefinition[] saxonExtensions)`

This is 
 necessary when the extension functions cannot be called by reflection because 
 there is no license for the commercial version of Saxon 9.
 
 
The Saxon 9 options set in the oXygen preferences are not used.

**Parameters:**
- `styleSource` (`javax.xml.transform.Source`): The source XSL
- `saxonExtensions` (`net.sf.saxon.lib.ExtensionFunctionDefinition[]`): The list of Saxon 9 extensions.

**Returns:** `javax.xml.transform.Transformer`

### `createXQueryTransformer(Source xquerySource, URL[] extensionJars, int transformerType)`

The options set in the oXygen preferences are used.

**Parameters:**
- `xquerySource` (`javax.xml.transform.Source`): The source XQuery file
- `extensionJars` (`java.net.URL[]`): Jars with extension libraries which can be used by the transformer, can be `null`
- `transformerType` (`int`): The type of the transformer to create, can only be #TRANSFORMER_SAXON_HOME_EDITION

**Returns:** `javax.xml.transform.Transformer`

### `createXQueryTransformer(Source xquerySource, URL[] extensionJars, int transformerType, boolean useOxygenOptions)`

**Parameters:**
- `xquerySource` (`javax.xml.transform.Source`): The source XQuery file
- `extensionJars` (`java.net.URL[]`): Jars with extension libraries which can be used by the transformer.
                            Can be `null`.
- `transformerType` (`int`): The type of the transformer to create, can only be #TRANSFORMER_SAXON_HOME_EDITION
- `useOxygenOptions` (`boolean`): If `true` the options set in the oXygen preferences are used.
                            Otherwise no options are set to the transformers.

**Returns:** `javax.xml.transform.Transformer`

### `resetXMLCatalogs()`

This way next time the catalogs are needed
 they will first be rebuilt.

**Returns:** `void`

### `resolvePathThroughCatalogs(URL baseURL, String relativeLocation, boolean entityResolve, boolean uriResolve)`

**Parameters:**
- `baseURL` (`java.net.URL`): The URL of the current opened XML file.
- `relativeLocation` (`java.lang.String`): The relative location to be resolved.
- `entityResolve` (`boolean`): `true` if the catalog entity resolver should be used.
- `uriResolve` (`boolean`): `true` if the catalog URI resolver should be used.

**Returns:** `java.net.URL`

### `escapeAttributeValue(String attributeValue)`

**Parameters:**
- `attributeValue` (`java.lang.String`): The attribute value.

**Returns:** `java.lang.String`

### `escapeTextValue(String textValue)`

**Parameters:**
- `textValue` (`java.lang.String`): The text value.

**Returns:** `java.lang.String`

### `unescapeAttributeValue(String attributeValue)`

**Parameters:**
- `attributeValue` (`java.lang.String`): The attribute value to be unescaped.

**Returns:** `java.lang.String`

### `prettyPrint(Reader reader, String systemID)`

The oXygen pretty printing options are used.

**Parameters:**
- `reader` (`java.io.Reader`): The reader with over the document that is to be pretty printed.
- `systemID` (`java.lang.String`): The URL location where the current XML fragment to format and indent is located. 
   This parameter is not required but it may be used to solves relative entities from the DOCTYPE declaration in the XML content.

**Returns:** `java.lang.String`

### `newNonValidatingXMLReader()`

**Returns:** `org.xml.sax.XMLReader`

### `newNonValidatingXMLReader(Object grammarCacheToken)`

If you are parsing XML fragments with DOCTYPE many times in your operation this method will be faster than
  the `newNonValidatingXMLReader()` method.
 

 *Usage example:*
 `

```
 String xml = new String("<!DOCTYPE map PUBLIC \"-//OASIS//DTD DITA Map//EN\" \"map.dtd\">\n" +
     "<map/>");
 Object grammarToken = null;
 for (int i = 0; i < 100000; i++) {
   XMLReaderWithGrammar readerAndCache = authorAccess.getXMLUtilAccess().newNonValidatingXMLReader(grammarToken);
   XMLReader reader = readerAndCache.getXmlReader();
   grammarToken = readerAndCache.getGrammarCache();
   reader.parse(new InputSource(new StringReader(xml)));
 }
 
```
`

**Parameters:**
- `grammarCacheToken` (`java.lang.Object`): The grammar cache token, if not null, it will be used to cache the grammar pool.

**Returns:** [`ro.sync.exml.workspace.api.util.XMLReaderWithGrammar`](./XMLReaderWithGrammar.md)

### `getEntityResolver()`

The resolver also looks at the additionally set priority entity resolvers.

**Returns:** `org.xml.sax.EntityResolver`

### `getURIResolver()`

The resolver also looks at the additionally set priority URI resolvers.

**Returns:** `javax.xml.transform.URIResolver`

### `addPriorityEntityResolver(EntityResolver entityResolver)`

For performance reasons, when Oxygen only needs the URL of an entity, it does not call the EntityResolver#resolveEntity(String, String)
 method because it also fetches the content of the entity. To intercept also these cases, your EntityResolver should extend the 
 EntityUrlResolver interface.

**Parameters:**
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver which will be called with priority before Oxygen calls the standard resolvers which are
   based on the catalog files specified in the preferences catalogs list and in each document type association.

**Returns:** `void`

### `removePriorityEntityResolver(EntityResolver entityResolver)`

**Parameters:**
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver which will be called with priority before Oxygen calls the standard resolvers which are
   based on the catalog files specified in the preferences catalogs list and in each document type association.

**Returns:** `void`

### `addPriorityURIResolver(URIResolver uriResolver)`

**Parameters:**
- `uriResolver` (`javax.xml.transform.URIResolver`): The URI resolver which will be called with priority before Oxygen calls the standard resolvers which are
   based on the catalog files specified in the preferences catalogs list and in each document type association.

**Returns:** `void`

### `removePriorityURIResolver(URIResolver uriResolver)`

**Parameters:**
- `uriResolver` (`javax.xml.transform.URIResolver`): The URI resolver which will be called with priority before Oxygen calls the standard resolvers which are
   based on the catalog files specified in the preferences catalogs list and in each document type association.

**Returns:** `void`

### `threeWayAutoMerge(String ancestor, String left, String right, MergeConflictResolutionMethods conflictResolutionMethod)`

**Parameters:**
- `ancestor` (`java.lang.String`): The original file string which has been modified into left and right.
- `left` (`java.lang.String`): The left version of the file string, the one with "our" changes.
- `right` (`java.lang.String`): The right version of the file string, the one with "others" changes.
- `conflictResolutionMethod` ([`ro.sync.merge.MergeConflictResolutionMethods`](../../../../merge/MergeConflictResolutionMethods.md)): The conflict resolution method to use.

**Returns:** [`ro.sync.merge.MergeResult`](../../../../merge/MergeResult.md)

### `getXMLStructureAsDTD(Reader reader)`

**Parameters:**
- `reader` (`java.io.Reader`): The reader representing the XML document to get the learn structure for.

**Returns:** `java.lang.String`

### `getAssociatedTransformationScenarioInputURL(URL xsltOrXQueryLocation)`

**Parameters:**
- `xsltOrXQueryLocation` (`java.net.URL`): XSLT or XQuery location.

**Returns:** `java.net.URL`

### `getAssociatedValidationScenarioInputURL(URL schemaLocation)`

The first found scenario will be used.

**Parameters:**
- `schemaLocation` (`java.net.URL`): Schema location.

**Returns:** `java.net.URL`

