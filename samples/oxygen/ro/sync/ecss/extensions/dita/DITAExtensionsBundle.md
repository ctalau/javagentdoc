# Class: `DITAExtensionsBundle`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAExtensionsBundle`

**Extends:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](../api/ExtensionsBundle.md)

**Implements:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `KEYREF_PREFIX`

**Type:** `java.lang.String`

### `KEYWORD_KEYREF_PREFIX`

**Type:** `java.lang.String`

### `ditaAuthorTableOperationsHandler`

**Type:** [`ro.sync.ecss.extensions.dita.DITAAuthorTableOperationsHandler`](./DITAAuthorTableOperationsHandler.md)

### `decorator`

**Type:** [`ro.sync.ecss.extensions.dita.DITAAuthorImageDecorator`](./DITAAuthorImageDecorator.md)

### `uniqueAttributesRecognizer`

**Type:** [`ro.sync.ecss.extensions.dita.id.DITAUniqueAttributesRecognizer`](id/DITAUniqueAttributesRecognizer.md)

### `ditaSchemaAwareEditingHandler`

**Type:** [`ro.sync.ecss.extensions.dita.DITASchemaAwareEditingHandler`](./DITASchemaAwareEditingHandler.md)

### `keyManager`

**Type:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)

### `keyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)

### `handler`

**Type:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

## Constructors

### `<init>()`

## Methods

### `createAuthorExtensionStateListener()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../api/AuthorExtensionStateListener.md)

### `createContextKeyManager(ro.sync.ecss.extensions.api.access.EditingSessionContext context)`

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

The key manager may resolve keys depending on the editing session context.
 The current implementation checks the DITAAccess#DITA_ROOT_MAP_URL_ATTRIBUTE
 and if it was set, the specified map is used. Otherwise, it uses the
 default ditamap in Autor.

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.access.EditingSessionContext`](../api/access/EditingSessionContext.md)): The editing session context.

### `getClipboardFragmentProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](../api/content/ClipboardFragmentProcessor.md)

### `createAuthorReferenceResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../api/AuthorReferenceResolver.md)

### `createAuthorTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md)

### `createAuthorTableColumnWidthProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`](../api/AuthorTableColumnWidthProvider.md)

### `createAuthorTableCellSepProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`](../api/AuthorTableCellSepProvider.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getDocumentTypeID()`

**Returns:** `java.lang.String`

### `getUniqueAttributesIdentifier()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](../api/UniqueAttributesRecognizer.md)

### `createElementLocatorProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](../api/link/ElementLocatorProvider.md)

### `customizeLinkTooltipDescription(java.net.URL currentEditorURL, ro.sync.ecss.extensions.api.node.AuthorNode contextNode, java.lang.String linkHref, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String computedDescription)`

**Returns:** `java.lang.String`

**Parameters:**
- `currentEditorURL` (`java.net.URL`)
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `linkHref` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `computedDescription` (`java.lang.String`)

### `customizeImageTooltipDescription(ro.sync.ecss.extensions.api.node.AuthorNode contextNode, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String computedDescription)`

**Returns:** `java.lang.String`

**Parameters:**
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `computedDescription` (`java.lang.String`)

### `computeImageAltText(ro.sync.ecss.extensions.api.node.AuthorNode contextNode, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String computedDescription)`

**Returns:** `java.lang.String`

**Parameters:**
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): Context node.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Author access
- `computedDescription` (`java.lang.String`): Already computed description

### `resolveCustomHref(java.net.URL currentEditorURL, ro.sync.ecss.extensions.api.node.AuthorNode contextNode, java.lang.String linkHref, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.net.URL`

**Parameters:**
- `currentEditorURL` (`java.net.URL`)
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `linkHref` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

### `resolveCustomKeyref(java.net.URL currentEditorURL, ro.sync.ecss.extensions.api.node.AuthorNode contextNode, java.lang.String linkHref)`

**Returns:** `java.net.URL`

**Parameters:**
- `currentEditorURL` (`java.net.URL`): The URL of the current editor.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The context node in which the href needs to be computed.
- `linkHref` (`java.lang.String`): The link href as derrived from the CSS

### `isImage(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The node to check.

### `getAuthorSchemaAwareEditingHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](../api/AuthorSchemaAwareEditingHandler.md)

### `createSchemaManagerFilter()`

**Returns:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](../../../contentcompletion/xml/SchemaManagerFilter.md)

### `getAuthorUserName()`

**Returns:** `java.lang.String`

### `createExternalObjectInsertionHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](../api/AuthorExternalObjectInsertionHandler.md)

### `createTextPageExternalObjectInsertionHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.text.TextPageExternalObjectInsertionHandler`](../api/text/TextPageExternalObjectInsertionHandler.md)

### `isContentReference(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

### `getProfilingConditionalTextProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.ProfilingConditionalTextProvider`](../api/ProfilingConditionalTextProvider.md)

### `createXMLNodeCustomizer()`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

### `getAuthorTableOperationsHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../api/table/operations/AuthorTableOperationsHandler.md)

### `createLinkTextResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../api/link/LinkTextResolver.md)

### `createIDTypeRecognizer()`

**Returns:** [`ro.sync.ecss.extensions.api.link.IDTypeRecognizer`](../api/link/IDTypeRecognizer.md)

### `getKeyManager()`

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `getAuthorActionEventHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `getAuthorImageDecorator()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](../api/AuthorImageDecorator.md)

### `createEditPropertiesHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](../api/EditPropertiesHandler.md)

### `getHelpPageID(java.lang.String currentEditorPage)`

**Returns:** `java.lang.String`

**Parameters:**
- `currentEditorPage` (`java.lang.String`)

### `getContextKeyManager()`

**Returns:** [`ro.sync.ecss.dita.ContextKeyManager`](../../dita/ContextKeyManager.md)

### `resolveCustomAttributeValue(ro.sync.ecss.extensions.api.CustomAttributeValueContext attributeValueEditingContext)`

**Returns:** `java.net.URL`

**Parameters:**
- `attributeValueEditingContext` ([`ro.sync.ecss.extensions.api.CustomAttributeValueContext`](../api/CustomAttributeValueContext.md))

### `getSpellCheckerHelper()`

**Returns:** [`ro.sync.ecss.extensions.api.spell.SpellCheckerHelper`](../api/spell/SpellCheckerHelper.md)

