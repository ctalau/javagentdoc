# Class: `XHTMLExtensionsBundle`

**Package:** [`ro.sync.ecss.extensions.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.XHTMLExtensionsBundle`

**Extends:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](../api/ExtensionsBundle.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `xhtmlAuthorTableOperationsHandler`

**Type:** [`ro.sync.ecss.extensions.xhtml.XHTMLAuthorTableOperationsHandler`](./XHTMLAuthorTableOperationsHandler.md)

### `uniqueAttributesRecognizer`

**Type:** [`ro.sync.ecss.extensions.xhtml.id.XHTMLUniqueAttributesRecognizer`](id/XHTMLUniqueAttributesRecognizer.md)

### `handler`

**Type:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `decorator`

**Type:** [`ro.sync.ecss.extensions.xhtml.XHTMLAuthorImageDecorator`](./XHTMLAuthorImageDecorator.md)

## Constructors

### `<init>()`

## Methods

### `createAuthorExtensionStateListener()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../api/AuthorExtensionStateListener.md)

### `createAuthorTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md)

### `createAuthorTableColumnWidthProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`](../api/AuthorTableColumnWidthProvider.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getDocumentTypeID()`

**Returns:** `java.lang.String`

### `getUniqueAttributesIdentifier()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](../api/UniqueAttributesRecognizer.md)

### `getClipboardFragmentProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](../api/content/ClipboardFragmentProcessor.md)

### `createElementLocatorProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](../api/link/ElementLocatorProvider.md)

### `createExternalObjectInsertionHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler`](../api/AuthorExternalObjectInsertionHandler.md)

### `createSchemaManagerFilter()`

**Returns:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](../../../contentcompletion/xml/SchemaManagerFilter.md)

### `createXMLNodeCustomizer()`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

### `getAuthorTableOperationsHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`](../api/table/operations/AuthorTableOperationsHandler.md)

### `createIDTypeRecognizer()`

**Returns:** [`ro.sync.ecss.extensions.api.link.IDTypeRecognizer`](../api/link/IDTypeRecognizer.md)

### `getAuthorActionEventHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `getAuthorImageDecorator()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](../api/AuthorImageDecorator.md)

### `createEditPropertiesHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](../api/EditPropertiesHandler.md)

### `hasASibling(AuthorElement element, String siblingName, String[] siblingAttributes, String siblingAttrValue)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)): The current element.
- `siblingName` (`java.lang.String`): The sibling name.
- `siblingAttributes` (`java.lang.String[]`): The sibbling attributes to check.
- `siblingAttrValue` (`java.lang.String`): The value that sibling's attributes must have.

**Returns:** `boolean`

### `getHelpPageID(String currentEditorPage)`

**Parameters:**
- `currentEditorPage` (`java.lang.String`)

**Returns:** `java.lang.String`

