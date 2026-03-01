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

### `createXSLTTransformer(`javax.xml.transform.Source` styleSource, `java.net.URL[]` extensionJars, `int` transformerType)`

**Returns:** `javax.xml.transform.Transformer`

The options set in the oXygen preferences are used.

### `createSaxon9XSLTTransformerWithExtensions(`javax.xml.transform.Source` styleSource, `net.sf.saxon.lib.ExtensionFunctionDefinition[]` extensionFunctions, `int` transformerType)`

**Returns:** `javax.xml.transform.Transformer`

### `createXSLTTransformer(`javax.xml.transform.Source` styleSource, `java.net.URL[]` extensionJars, `int` transformerType, `boolean` useOxygenOptions)`

**Returns:** `javax.xml.transform.Transformer`

### `createSaxon9HEXSLTTransformerWithExtensions(`javax.xml.transform.Source` styleSource, `net.sf.saxon.lib.ExtensionFunctionDefinition[]` saxonExtensions)`

**Returns:** `javax.xml.transform.Transformer`

This is 
 necessary when the extension functions cannot be called by reflection because 
 there is no license for the commercial version of Saxon 9.
 
 
The Saxon 9 options set in the oXygen preferences are not used.

### `createXQueryTransformer(`javax.xml.transform.Source` xquerySource, `java.net.URL[]` extensionJars, `int` transformerType)`

**Returns:** `javax.xml.transform.Transformer`

The options set in the oXygen preferences are used.

### `createXQueryTransformer(`javax.xml.transform.Source` xquerySource, `java.net.URL[]` extensionJars, `int` transformerType, `boolean` useOxygenOptions)`

**Returns:** `javax.xml.transform.Transformer`

### `resetXMLCatalogs()`

**Returns:** `void`

This way next time the catalogs are needed
 they will first be rebuilt.

### `resolvePathThroughCatalogs(`java.net.URL` baseURL, `java.lang.String` relativeLocation, `boolean` entityResolve, `boolean` uriResolve)`

**Returns:** `java.net.URL`

### `escapeAttributeValue(`java.lang.String` attributeValue)`

**Returns:** `java.lang.String`

### `escapeTextValue(`java.lang.String` textValue)`

**Returns:** `java.lang.String`

### `unescapeAttributeValue(`java.lang.String` attributeValue)`

**Returns:** `java.lang.String`

### `prettyPrint(`java.io.Reader` reader, `java.lang.String` systemID)`

**Returns:** `java.lang.String`

The oXygen pretty printing options are used.

### `newNonValidatingXMLReader()`

**Returns:** `org.xml.sax.XMLReader`

### `newNonValidatingXMLReader(`java.lang.Object` grammarCacheToken)`

**Returns:** [`ro.sync.exml.workspace.api.util.XMLReaderWithGrammar`](./XMLReaderWithGrammar.md)

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

### `getEntityResolver()`

**Returns:** `org.xml.sax.EntityResolver`

The resolver also looks at the additionally set priority entity resolvers.

### `getURIResolver()`

**Returns:** `javax.xml.transform.URIResolver`

The resolver also looks at the additionally set priority URI resolvers.

### `addPriorityEntityResolver(`org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `void`

For performance reasons, when Oxygen only needs the URL of an entity, it does not call the EntityResolver#resolveEntity(String, String)
 method because it also fetches the content of the entity. To intercept also these cases, your EntityResolver should extend the 
 EntityUrlResolver interface.

### `removePriorityEntityResolver(`org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `void`

### `addPriorityURIResolver(`javax.xml.transform.URIResolver` uriResolver)`

**Returns:** `void`

### `removePriorityURIResolver(`javax.xml.transform.URIResolver` uriResolver)`

**Returns:** `void`

### `threeWayAutoMerge(`java.lang.String` ancestor, `java.lang.String` left, `java.lang.String` right, [`ro.sync.merge.MergeConflictResolutionMethods`](../../../../merge/MergeConflictResolutionMethods.md) conflictResolutionMethod)`

**Returns:** [`ro.sync.merge.MergeResult`](../../../../merge/MergeResult.md)

### `getXMLStructureAsDTD(`java.io.Reader` reader)`

**Returns:** `java.lang.String`

### `getAssociatedTransformationScenarioInputURL(`java.net.URL` xsltOrXQueryLocation)`

**Returns:** `java.net.URL`

### `getAssociatedValidationScenarioInputURL(`java.net.URL` schemaLocation)`

**Returns:** `java.net.URL`

The first found scenario will be used.

