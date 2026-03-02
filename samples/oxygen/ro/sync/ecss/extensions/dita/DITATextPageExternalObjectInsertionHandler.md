# Class: `DITATextPageExternalObjectInsertionHandler`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITATextPageExternalObjectInsertionHandler`

**Extends:** [`ro.sync.ecss.extensions.api.text.TextPageExternalObjectInsertionHandler`](../api/text/TextPageExternalObjectInsertionHandler.md)

## Description

## Fields

### `CLOSEST_RELATED_LINK_ELEMENT`

**Type:** `java.lang.String`

### `CLOSEST_TOPIC_ELEMENT`

**Type:** `java.lang.String`

### `CLASS_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

### `TOPIC_CLASS_VALUE`

**Type:** `java.lang.String`

### `BODY_CLASS_VALUE`

**Type:** `java.lang.String`

### `FOLLOWING_SIBLINGS`

**Type:** `java.lang.String`

### `FOLLOWING_TOPIC_SIBLINGS`

**Type:** `java.lang.String`

### `RELATED_LINKS_XML_FRAGMENT`

**Type:** `java.lang.String`

### `FIRST_TOPIC_ELEMENT`

**Type:** `java.lang.String`

### `TOPIC_END_TAG_LENGTH`

**Type:** `int`

### `logger`

**Type:** `org.slf4j.Logger`

### `keyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.dita.ContextKeyManagerProvider keyManagerProvider)`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): The key manager provider

## Methods

### `acceptsURLs(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.util.List<java.net.URL> urls, int source)`

**Returns:** `boolean`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `urls` (`java.util.List<java.net.URL>`)
- `source` (`int`)

### `insertURLs(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.util.List<java.net.URL> urlList, int source)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `urlList` (`java.util.List<java.net.URL>`)
- `source` (`int`)

### `insertKeyInfo(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, ro.sync.ecss.dita.reference.keyref.KeyInfo key, java.net.URL originalUrlToInsert)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access
- `key` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`): The keyInfo to insert.
- `originalUrlToInsert` (`java.net.URL`): The original URL to be inserted. It can have additional information regarding the element to be inserted.

### `detectKeyInfo(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL url)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `url` (`java.net.URL`)

### `insertUrlAsReference(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL originalUrl)`

**Returns:** `void`

If a key is found mapped to the URL, a keyref is inserted instead of a direct reference.

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page access
- `originalUrl` (`java.net.URL`): The original URL to insert.

### `insertAsXref(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL resourceToInsert, java.net.URL nodeBaseUrl, ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager schemaManager)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `resourceToInsert` (`java.net.URL`)
- `nodeBaseUrl` (`java.net.URL`)
- `schemaManager` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md))

### `createAndInsertFigureWithImageHref(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL nodeBaseUrl, java.lang.String[] referenceAttributeNameAndValue)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md))
- `nodeBaseUrl` (`java.net.URL`)
- `referenceAttributeNameAndValue` (`java.lang.String[]`)

### `createAndInsertImageRef(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL nodeBaseUrl, ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager schemaManager, java.lang.String[] referenceAttributeNameAndValue)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Offer access to text page API and utilities.
- `nodeBaseUrl` (`java.net.URL`): The value of the base-uri() attribute of the current node.
- `schemaManager` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md)): Text page schema manager
- `referenceAttributeNameAndValue` (`java.lang.String[]`): Pair attribute name and value; For example: href, file://filename.pdf.

### `createAndInsertMediaRef(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager schemaManager, java.net.URL resourceURL, java.lang.String[] referenceAttributeNameAndValue)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Offer access to text page API and utilities.
- `schemaManager` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md)): Text page schema manager
- `resourceURL` (`java.net.URL`): The real URL of the resource - for direct references is the href value, for keys is the resource the key refers.
- `referenceAttributeNameAndValue` (`java.lang.String[]`): Pair attribute name and value; For example: href, file://filename.pdf
 or keyref, theNameOfTheKey

### `createAndInsertElementInRelatedLinks(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL nodeBaseUrl, ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager schemaManager, java.lang.String[] referenceAttributeNameAndValue)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Offer access to text page API and utilities.
- `nodeBaseUrl` (`java.net.URL`): The value of the base-uri() attribute of the current node.
- `schemaManager` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md)): Text page schema manager
- `referenceAttributeNameAndValue` (`java.lang.String[]`): Pair attribute name and value; For example: href, file://filename.pdf.

### `insertAsRelatedLink(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.lang.String fragment)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Text acces
- `fragment` (`java.lang.String`): XML fragment to insert.

### `preferRelatedLinks(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage tp)`

**Returns:** `boolean`

**Parameters:**
- `tp` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): The text page.

### `computeKeyReferenceFragment(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, ro.sync.ecss.dita.reference.keyref.KeyInfo key, boolean forceInsertAsVariableKeyref, boolean preferRelatedLinks, boolean isImage)`

**Returns:** `java.lang.String`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Contains methods specific to XML editors.
- `key` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`): The key to insert.
- `forceInsertAsVariableKeyref` (`boolean`): `true` to force insert a variable (ph with keyref).
- `preferRelatedLinks` (`boolean`): `true` to prefer insertion as related links.
- `isImage` (`boolean`): `true` if in reference to image.

### `createRelatedLinksSection(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Contains methods specific to XML editors.

### `createRelatedLinksSectionInternal(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Contains methods specific to XML editors.

### `computeMediaObjectFrag(ro.sync.ecss.dita.ContextKeyManagerProvider keyManagerProvider, ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, ro.sync.ecss.dita.reference.keyref.KeyInfo keyInfo)`

**Returns:** `java.lang.String`

**Parameters:**
- `keyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md))
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Contains methods specific to XML editors.
- `keyInfo` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `insertContentReference(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.net.URL url)`

**Returns:** `void`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Access to the current document.
- `url` (`java.net.URL`): Target for the conref.

### `computeMediaReferenceXMLToInsert(ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager schemaManager, java.util.Map<java.lang.String,java.lang.String> mediaProperties, java.lang.String mediaElementName)`

**Returns:** `java.lang.String`

**Parameters:**
- `schemaManager` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md)): Text page XML schema manager.
- `mediaProperties` (`java.util.Map<java.lang.String,java.lang.String>`): The properties of the media object.
- `mediaElementName` (`java.lang.String`): XML element corresponding of the media object.

### `computeObjectReferenceXMLToInsert(java.util.Map<java.lang.String,java.lang.String> mediaProperties, java.lang.String mediaElementName)`

**Returns:** `java.lang.String`

**Parameters:**
- `mediaProperties` (`java.util.Map<java.lang.String,java.lang.String>`): The properties of the media object.
- `mediaElementName` (`java.lang.String`): XML element corresponding of the media object.

### `computeVideoAndAudioReferenceXMLToInsert(ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager schemaManager, java.util.Map<java.lang.String,java.lang.String> mediaProperties, java.lang.String mediaElementName)`

**Returns:** `java.lang.String`

**Parameters:**
- `schemaManager` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md)): Text page XML schema manager.
- `mediaProperties` (`java.util.Map<java.lang.String,java.lang.String>`): The properties of the media object.
- `mediaElementName` (`java.lang.String`): XML element corresponding of the media object.

### `getMostUsedMediaElementNameToDrop(ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage textAccess, java.lang.String imposedKeyAttribute, java.lang.String mediaType)`

**Returns:** `java.lang.String`

**Parameters:**
- `textAccess` ([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md)): Contains methods specific to XML editors.
- `imposedKeyAttribute` (`java.lang.String`): The reference attribute name (`href / keyref` 
                                or `data / datakeyref`) and value.
- `mediaType` (`java.lang.String`): Possible media types: `audio, video or iframe`.

### `removeOxyCustomQueryParams(java.net.URL url)`

**Returns:** `java.net.URL`

**Parameters:**
- `url` (`java.net.URL`): The provided URL.

### `isHTMLReference(java.net.URL url)`

**Returns:** `boolean`

**Parameters:**
- `url` (`java.net.URL`)

