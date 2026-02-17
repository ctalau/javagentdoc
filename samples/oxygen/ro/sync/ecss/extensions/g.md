# Class: `g`

**Package:** [`ro.sync.ecss.extensions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.g`

**Extends:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](api/ExtensionsBundle.md)

**Implements:** [`ro.sync.ecss.extensions.api.ClassPathResourcesAccess`](api/ClassPathResourcesAccess.md)

## Fields

### `vez`

**Type:** [`org.slf4j.Logger`](../../../../org/slf4j/Logger.md)

### `oez`

**Type:** [`ro.sync.i18n.c`](../../i18n/c.md)

### `xez`

**Type:** [`ro.sync.ecss.persistance.AuthorExtensionPO`](../persistance/AuthorExtensionPO.md)

### `pez`

**Type:** [`ro.sync.exml.editor.persistance.f`](../../exml/editor/persistance/f.md)

### `nez`

**Type:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](api/ExtensionsBundle.md)

### `qez`

**Type:** [`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md)

### `sez`

**Type:** `java.net.URL`

### `tez`

**Type:** [`ro.sync.exml.workspace.api.editor.documenttype.DocumentTypeInformation`](../../exml/workspace/api/editor/documenttype/DocumentTypeInformation.md)

### `mez`

**Type:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](api/UniqueAttributesRecognizer.md)

### `wez`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)

### `kez`

**Type:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](api/AuthorExtensionStateListener.md)

### `rez`

**Type:** [`ro.sync.util.editorvars.f`](../../util/editorvars/f.md)

### `uez`

**Type:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](api/link/LinkTextResolver.md)

### `lez`

**Type:** [`ro.sync.ecss.extensions.api.AuthorPreloadProcessor`](api/AuthorPreloadProcessor.md)

## Constructors

### `<init>([`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md) arg0, `java.net.URL` arg1)`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `createAuthorReferenceResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](api/AuthorReferenceResolver.md)

### `createAuthorStylesFilter()`

**Returns:** [`ro.sync.ecss.extensions.api.StylesFilter`](api/StylesFilter.md)

### `createAuthorTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](api/AuthorTableCellSpanProvider.md)

### `createAuthorTableColumnWidthProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`](api/AuthorTableColumnWidthProvider.md)

### `createAuthorTableCellSepProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`](api/AuthorTableCellSepProvider.md)

### `createAuthorExtensionStateListener()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](api/AuthorExtensionStateListener.md)

### `ohq([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](api/AuthorExtensionStateListener.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](api/AuthorExtensionStateListener.md)

### `createAuthorAWTDndListener()`

**Returns:** [`ro.sync.exml.editor.xmleditor.pageauthor.AuthorDnDListener`](../../exml/editor/xmleditor/pageauthor/AuthorDnDListener.md)

### `createAuthorSWTDndListener()`

**Returns:** [`com.oxygenxml.editor.editors.author.AuthorDnDListener`](../../../../com/oxygenxml/editor/editors/author/AuthorDnDListener.md)

### `xhq(`java.lang.String` arg0, [`ro.sync.ecss.extensions.api.ExtensionException`](api/ExtensionException.md) arg1)`

**Returns:** `void`

### `createTextSWTDndListener()`

**Returns:** [`com.oxygenxml.editor.editors.TextDnDListener`](../../../../com/oxygenxml/editor/editors/TextDnDListener.md)

### `createElementLocatorProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](api/link/ElementLocatorProvider.md)

### `createIDTypeRecognizer()`

**Returns:** [`ro.sync.ecss.extensions.api.link.IDTypeRecognizer`](api/link/IDTypeRecognizer.md)

### `createSchemaManagerFilter()`

**Returns:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](../../contentcompletion/xml/SchemaManagerFilter.md)

### `qhq()`

**Returns:** [`ro.sync.contentcompletion.xml.extensibility.values.b`](../../contentcompletion/xml/extensibility/values/b.md)

### `phq()`

**Returns:** [`ro.sync.contentcompletion.xml.StyleGuideSchemaManagerFilterBase`](../../contentcompletion/xml/StyleGuideSchemaManagerFilterBase.md)

### `whq([`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md) arg0)`

**Returns:** `java.net.URL`

### `vhq([`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md) arg0, `java.lang.String` arg1)`

**Returns:** `java.net.URL`

### `rhq([`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md) arg0, `java.lang.String` arg1)`

**Returns:** `java.net.URL`

### `thq([`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md) arg0, `java.lang.String` arg1)`

**Returns:** `java.net.URL`

### `shq([`ro.sync.exml.editor.persistance.DocumentTypePO`](../../exml/editor/persistance/DocumentTypePO.md) arg0, `java.lang.String` arg1)`

**Returns:** `java.net.URL`

### `createAttributesValueEditor(`boolean` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.AttributesValueEditor`](api/AttributesValueEditor.md)

### `createCustomAttributeValueEditor(`boolean` arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.CustomAttributeValueEditor`](api/CustomAttributeValueEditor.md)

### `getUniqueAttributesIdentifier()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](api/UniqueAttributesRecognizer.md)

### `getClipboardFragmentProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](api/content/ClipboardFragmentProcessor.md)

### `getDocumentTypeID()`

**Returns:** `java.lang.String`

### `resolveCustomHref(`java.lang.String` arg0)`

**Returns:** `java.net.URL`

### `resolveCustomAttributeValue([`ro.sync.ecss.extensions.api.CustomAttributeValueContext`](api/CustomAttributeValueContext.md) arg0)`

**Returns:** `java.net.URL`

### `resolveCustomHref(`java.net.URL` arg0, `java.lang.String` arg1, [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md) arg2)`

**Returns:** `java.net.URL`

### `resolveCustomHref(`java.net.URL` arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md) arg1, `java.lang.String` arg2, [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md) arg3)`

**Returns:** `java.net.URL`

### `customizeLinkTooltipDescription(`java.net.URL` arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md) arg1, `java.lang.String` arg2, [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md) arg3, `java.lang.String` arg4)`

**Returns:** `java.lang.String`

### `customizeImageTooltipDescription([`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md) arg0, [`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md) arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `getAuthorSchemaAwareEditingHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](api/AuthorSchemaAwareEditingHandler.md)

### `createAuthorOutlineCustomizer()`

**Returns:** [`ro.sync.ecss.extensions.api.structure.AuthorOutlineCustomizer`](api/structure/AuthorOutlineCustomizer.md)

### `createXMLNodeCustomizer()`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

### `createAuthorBreadCrumbCustomizer()`

**Returns:** [`ro.sync.ecss.extensions.api.structure.AuthorBreadCrumbCustomizer`](api/structure/AuthorBreadCrumbCustomizer.md)

### `createExternalObjectInsertionHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](api/AuthorExternalObjectInsertionHandler.md)

### `createTextPageExternalObjectInsertionHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.text.TextPageExternalObjectInsertionHandler`](api/text/TextPageExternalObjectInsertionHandler.md)

### `uhq()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](api/AuthorExternalObjectInsertionHandler.md)

### `isContentReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](api/node/AuthorNode.md) arg0)`

**Returns:** `boolean`

### `getClassPathResources()`

**Returns:** `java.net.URL[]`

### `getProfilingConditionalTextProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.ProfilingConditionalTextProvider`](api/ProfilingConditionalTextProvider.md)

### `getAuthorTableOperationsHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](api/table/operations/AuthorTableOperationsHandler.md)

### `zhq([`ro.sync.ecss.extensions.api.link.LinkTextResolver`](api/link/LinkTextResolver.md) arg0)`

**Returns:** `void`

### `createLinkTextResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](api/link/LinkTextResolver.md)

### `yhq([`ro.sync.ecss.extensions.api.AuthorPreloadProcessor`](api/AuthorPreloadProcessor.md) arg0)`

**Returns:** `void`

### `createAuthorPreloadProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorPreloadProcessor`](api/AuthorPreloadProcessor.md)

### `getDocumentTypeName()`

**Returns:** `java.lang.String`

### `createEditPropertiesHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](api/EditPropertiesHandler.md)

### `getAuthorActionEventHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](api/AuthorActionEventHandler.md)

### `getAuthorImageDecorator()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](api/AuthorImageDecorator.md)

### `getHelpPageID(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `getWebappExtensionsProvier()`

**Returns:** [`ro.sync.ecss.extensions.api.WebappExtensionsProvider`](api/WebappExtensionsProvider.md)

### `getSpellCheckerHelper()`

**Returns:** [`ro.sync.ecss.extensions.api.spell.SpellCheckerHelper`](api/spell/SpellCheckerHelper.md)

### `toString()`

**Returns:** `java.lang.String`

