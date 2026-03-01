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

### `<init>([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) keyManagerProvider)`

## Methods

### `acceptsURLs([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.util.List<java.net.URL>` urls, `int` source)`

**Returns:** `boolean`

### `insertURLs([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.util.List<java.net.URL>` urlList, `int` source)`

**Returns:** `void`

### `insertKeyInfo([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `ro.sync.ecss.dita.reference.keyref.KeyInfo` key, `java.net.URL` originalUrlToInsert)`

**Returns:** `void`

### `detectKeyInfo([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` url)`

**Returns:** `ro.sync.ecss.dita.reference.keyref.KeyInfo`

### `insertUrlAsReference([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` originalUrl)`

**Returns:** `void`

If a key is found mapped to the URL, a keyref is inserted instead of a direct reference.

### `insertAsXref([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` resourceToInsert, `java.net.URL` nodeBaseUrl, [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md) schemaManager)`

**Returns:** `void`

### `createAndInsertFigureWithImageHref([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` nodeBaseUrl, `java.lang.String[]` referenceAttributeNameAndValue)`

**Returns:** `void`

### `createAndInsertImageRef([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` nodeBaseUrl, [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md) schemaManager, `java.lang.String[]` referenceAttributeNameAndValue)`

**Returns:** `void`

### `createAndInsertMediaRef([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md) schemaManager, `java.net.URL` resourceURL, `java.lang.String[]` referenceAttributeNameAndValue)`

**Returns:** `void`

### `createAndInsertElementInRelatedLinks([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` nodeBaseUrl, [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md) schemaManager, `java.lang.String[]` referenceAttributeNameAndValue)`

**Returns:** `void`

### `insertAsRelatedLink([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.lang.String` fragment)`

**Returns:** `void`

### `preferRelatedLinks([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) tp)`

**Returns:** `boolean`

### `computeKeyReferenceFragment([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `ro.sync.ecss.dita.reference.keyref.KeyInfo` key, `boolean` forceInsertAsVariableKeyref, `boolean` preferRelatedLinks, `boolean` isImage)`

**Returns:** `java.lang.String`

### `createRelatedLinksSection([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess)`

**Returns:** `void`

### `createRelatedLinksSectionInternal([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess)`

**Returns:** `void`

### `computeMediaObjectFrag([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) keyManagerProvider, [`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `ro.sync.ecss.dita.reference.keyref.KeyInfo` keyInfo)`

**Returns:** `java.lang.String`

### `insertContentReference([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.net.URL` url)`

**Returns:** `void`

### `computeMediaReferenceXMLToInsert([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md) schemaManager, `java.util.Map<java.lang.String,java.lang.String>` mediaProperties, `java.lang.String` mediaElementName)`

**Returns:** `java.lang.String`

### `computeObjectReferenceXMLToInsert(`java.util.Map<java.lang.String,java.lang.String>` mediaProperties, `java.lang.String` mediaElementName)`

**Returns:** `java.lang.String`

### `computeVideoAndAudioReferenceXMLToInsert([`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](../../../exml/workspace/api/editor/page/text/WSTextXMLSchemaManager.md) schemaManager, `java.util.Map<java.lang.String,java.lang.String>` mediaProperties, `java.lang.String` mediaElementName)`

**Returns:** `java.lang.String`

### `getMostUsedMediaElementNameToDrop([`ro.sync.exml.workspace.api.editor.page.text.xml.WSXMLTextEditorPage`](../../../exml/workspace/api/editor/page/text/xml/WSXMLTextEditorPage.md) textAccess, `java.lang.String` imposedKeyAttribute, `java.lang.String` mediaType)`

**Returns:** `java.lang.String`

### `removeOxyCustomQueryParams(`java.net.URL` url)`

**Returns:** `java.net.URL`

### `isHTMLReference(`java.net.URL` url)`

**Returns:** `boolean`

