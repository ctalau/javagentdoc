# Class: `ExtensionsBundle`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ExtensionsBundle`

**Implements:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

Extensions of this class must be defined for every document type association defined
 in the **Preferences**/**Document type association** section.
 

 The bundle is created each time the document type association where it is defined matches 
 the current document opened in an editor or the properties of the enclosing 
 document type have been modified while the document type is active.
 At most one instance of an extensions bundle exist at a given time in the editor.
 

 Note: *References to objects that need to be persistent throughout the
 existence of an editor must not be kept here.*.

## Fields

### `authorSchemaAwareEditingSupportAdapter`

**Type:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandlerAdapter`](./AuthorSchemaAwareEditingHandlerAdapter.md)

### `documentTypeName`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `createAuthorReferenceResolver()`

The method is called each time an opened document in an Author editor page 
 matches the document type association where the extensions bundle is defined.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](./AuthorReferenceResolver.md)

### `createAuthorStylesFilter()`

Use this to replace the default styles associated to a node form the document object model, 
 or the styles of the pseudo elements `:before` and `:after`.
 
 

 The method is called each time an opened document in an Author editor page 
 matches the document type association where the extensions bundle is defined.

**Returns:** [`ro.sync.ecss.extensions.api.StylesFilter`](./StylesFilter.md)

### `createAuthorTableCellSpanProvider()`

The table cell span provider is not reused between different tables.
 The method is called for each table in the document so a new instance 
 should be provided each time.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](./AuthorTableCellSpanProvider.md)

### `createAuthorTableColumnWidthProvider()`

The table column width provider is not reused between different tables.
 The method is called for each table in the document so a new instance
 should be provided each time.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`](./AuthorTableColumnWidthProvider.md)

### `createAuthorTableCellSepProvider()`

The table cell separators provider is not reused between different tables.
 The method is called for each table in the document so a new instance 
 should be provided each time.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`](./AuthorTableCellSepProvider.md)

### `getAuthorTableOperationsHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](table/operations/AuthorTableOperationsHandler.md)

### `createAuthorExtensionStateListener()`

This method is called each time the Document Type association where the 
 Author extension and the extensions bundle are defined matches a document 
 opened in an Author page.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md)

### `createAuthorPreloadProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorPreloadProcessor`](./AuthorPreloadProcessor.md)

### `createAuthorAWTDndListener()`

This method is called each time the Document Type association where 
 the extensions bundle is defined matches a document opened in an Author page.

**Returns:** [`ro.sync.exml.editor.xmleditor.pageauthor.AuthorDnDListener`](../../../exml/editor/xmleditor/pageauthor/AuthorDnDListener.md)

### `createAuthorSWTDndListener()`

This method is called each time the Document Type association where 
 the extensions bundle is defined matches a document opened in an Author page.

**Returns:** `com.oxygenxml.editor.editors.author.AuthorDnDListener`

### `createTextSWTDndListener()`

This method is called each time the Document Type association where 
 the extensions bundle is defined matches a document opened in a Text page.

**Returns:** `com.oxygenxml.editor.editors.TextDnDListener`

### `createElementLocatorProvider()`

The ElementLocator is capable
 of locating an element pointed by the supplied link.
 This method is called each time an element needs to be located based on a
 link specification.

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](link/ElementLocatorProvider.md)

### `createIDTypeRecognizer()`

This method is called each time an ID must be recognized or certain ID-aware searches or refactory actions are performed.

**Returns:** [`ro.sync.ecss.extensions.api.link.IDTypeRecognizer`](link/IDTypeRecognizer.md)

### `createSchemaManagerFilter()`

This method is called each time the document type where the extensions bundle 
 is defined matches a document opened in an editor.

**Returns:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](../../../contentcompletion/xml/SchemaManagerFilter.md)

### `createAttributesValueEditor(boolean forEclipsePlugin)`

This is used especially from the "Attributes View" and from attributes editing dialogs 
 available on Author mode and Outliner.

**Parameters:**
- `forEclipsePlugin` (`boolean`): If `true` the code is called from the Eclipse plugin.

**Returns:** [`ro.sync.ecss.extensions.api.AttributesValueEditor`](./AttributesValueEditor.md)

### `createCustomAttributeValueEditor(boolean forEclipsePlugin)`

This is used especially from the "Attributes View" and from attributes editing dialogs 
 available on Author mode and Outliner.

**Parameters:**
- `forEclipsePlugin` (`boolean`): If `true` the code is called from the Eclipse plugin.

**Returns:** [`ro.sync.ecss.extensions.api.CustomAttributeValueEditor`](./CustomAttributeValueEditor.md)

### `getUniqueAttributesIdentifier()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](./UniqueAttributesRecognizer.md)

### `getClipboardFragmentProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](content/ClipboardFragmentProcessor.md)

### `getDocumentTypeID()`

If this returns `null` you will not be able to add 
 ro.sync.ecss.extensions.api.OptionListener or store and retrieve 
 any options at all.

**Returns:** `java.lang.String`

### `resolveCustomAttributeValue(CustomAttributeValueContext attributeValueEditingContext)`

This method is called when the "Open File at Cursor" action is called in the Text editor page.

**Parameters:**
- `attributeValueEditingContext` ([`ro.sync.ecss.extensions.api.CustomAttributeValueContext`](./CustomAttributeValueContext.md)): The editing context.

**Returns:** `java.net.URL`

### `resolveCustomHref(String linkHref)`

**Parameters:**
- `linkHref` (`java.lang.String`): The link href as derrived from the CSS

**Returns:** `java.net.URL`

### `resolveCustomHref(URL currentEditorURL, String linkHref, AuthorAccess authorAccess)`

**Parameters:**
- `currentEditorURL` (`java.net.URL`): The URL of the current editor.
- `linkHref` (`java.lang.String`): The link href as derrived from the CSS
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The Author Access.

**Returns:** `java.net.URL`

### `resolveCustomHref(URL currentEditorURL, AuthorNode contextNode, String linkHref, AuthorAccess authorAccess)`

**Parameters:**
- `currentEditorURL` (`java.net.URL`): The URL of the current editor.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The context node in which the href needs to be computed.
- `linkHref` (`java.lang.String`): The link href as derrived from the CSS
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The Author Access.

**Returns:** `java.net.URL`

### `customizeLinkTooltipDescription(URL currentEditorURL, AuthorNode contextNode, String linkHref, AuthorAccess authorAccess, String computedDescription)`

**Parameters:**
- `currentEditorURL` (`java.net.URL`): The current document URL
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The context node
- `linkHref` (`java.lang.String`): The link href.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The Author access
- `computedDescription` (`java.lang.String`): The already computed description. Usually something like:
   "Click to open: URL"

**Returns:** `java.lang.String`

### `customizeImageTooltipDescription(AuthorNode contextNode, AuthorAccess authorAccess, String computedDescription)`

**Parameters:**
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The context node
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The Author access
- `computedDescription` (`java.lang.String`): The already computed description.

**Returns:** `java.lang.String`

### `createAuthorOutlineCustomizer()`

**Returns:** [`ro.sync.ecss.extensions.api.structure.AuthorOutlineCustomizer`](structure/AuthorOutlineCustomizer.md)

### `createAuthorBreadCrumbCustomizer()`

**Returns:** [`ro.sync.ecss.extensions.api.structure.AuthorBreadCrumbCustomizer`](structure/AuthorBreadCrumbCustomizer.md)

### `getAuthorSchemaAwareEditingHandler()`

The support can either resolve a specific case, let the default implementation take place or reject the
 edit entirely by throwing an InvalidEditException.
 
 It is recommended to extend class AuthorSchemaAwareEditingHandlerAdapter in order to be protected from any
 API additions that may occur in interface AuthorSchemaAwareEditingHandler.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](./AuthorSchemaAwareEditingHandler.md)

### `createExternalObjectInsertionHandler()`

The usual usage for this is to get notified when URLs are dropped from the project or DITA Maps manager in the Author page.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](./AuthorExternalObjectInsertionHandler.md)

### `createTextPageExternalObjectInsertionHandler()`

The usual usage for this is to get notified when URLs are dropped from the project or DITA Maps manager in the Text page.

**Returns:** [`ro.sync.ecss.extensions.api.text.TextPageExternalObjectInsertionHandler`](text/TextPageExternalObjectInsertionHandler.md)

### `getDocumentTypeName()`

You can use it in your extensions bundle to see the name of the document type which created this bundle.

**Returns:** `java.lang.String`

### `setDocumentTypeName(String documentTypeName)`

This must not get called by the user code, it is set internal.

**Parameters:**
- `documentTypeName` (`java.lang.String`): The name of the document type which created this bundle

**Returns:** `void`

### `isContentReference(AuthorNode node)`

This is used in the tables to replace conreffed table rows entirely

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node

**Returns:** `boolean`

### `getProfilingConditionalTextProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.ProfilingConditionalTextProvider`](./ProfilingConditionalTextProvider.md)

### `createXMLNodeCustomizer()`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

### `createLinkTextResolver()`

This text content will be presented as a static text 
 associated with the link in author page.
 
 This resolver will be used when function oxy_link-text() is encountered 
 inside the CSS rules on the 'content' property.

**Returns:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](link/LinkTextResolver.md)

### `createEditPropertiesHandler()`

For example when a user
 double clicks on an element tag we will invoke this extension and a specific dialog
 can be presented.

**Returns:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](./EditPropertiesHandler.md)

### `getAuthorActionEventHandler()`

These events normally have
 built-in handling but this handler gets a chance to perform something different.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](./AuthorActionEventHandler.md)

### `getAuthorImageDecorator()`

Permits decoration of the images that 
 are displayed in the Author view. For instance it can overlay some meta-information 
 over the image.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](./AuthorImageDecorator.md)

### `getHelpPageID(String currentEditorPage)`

If the returned help page ID is an URL, a web browser will be opened pointing to that URL when the user presses F1 in the dialog or when using the Help button.
 If the returned help page ID is an identifier, when help is invoked, the application will open the Oxygen User's Manual and locate this identifier inside it.

**Parameters:**
- `currentEditorPage` (`java.lang.String`): The current editor page mode (Text/Grid/Author/Schema), one of the constants in the "ro.sync.exml.editor.EditorPageConstants" interface.

**Returns:** `java.lang.String`

### `getWebappExtensionsProvier()`

**Returns:** [`ro.sync.ecss.extensions.api.WebappExtensionsProvider`](./WebappExtensionsProvider.md)

### `getSpellCheckerHelper()`

**Returns:** [`ro.sync.ecss.extensions.api.spell.SpellCheckerHelper`](spell/SpellCheckerHelper.md)

