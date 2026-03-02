# Class: `DocBookExtensionsBundleBase`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.DocBookExtensionsBundleBase`

**Extends:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](../api/ExtensionsBundle.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `IMAGEDATA`

**Type:** `java.lang.String`

### `IMAGEOBJECTCO`

**Type:** `java.lang.String`

### `IMAGEOBJECT`

**Type:** `java.lang.String`

### `handler`

**Type:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `decorator`

**Type:** [`ro.sync.ecss.extensions.docbook.DocbookAuthorImageDecorator`](./DocbookAuthorImageDecorator.md)

## Constructors

### `<init>()`

## Methods

### `createAuthorTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md)

### `createAuthorTableColumnWidthProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`](../api/AuthorTableColumnWidthProvider.md)

### `createAuthorTableCellSepProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSepProvider`](../api/AuthorTableCellSepProvider.md)

### `getDocumentNamespace()`

**Returns:** `java.lang.String`

### `createSchemaManagerFilter()`

**Returns:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](../../../contentcompletion/xml/SchemaManagerFilter.md)

### `createXMLNodeCustomizer()`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

### `createLinkTextResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../api/link/LinkTextResolver.md)

### `resolveCustomHref(URL currentEditorURL, AuthorNode contextNode, String linkHref, AuthorAccess authorAccess)`

**Parameters:**
- `currentEditorURL` (`java.net.URL`)
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `linkHref` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `java.net.URL`

### `getAuthorActionEventHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `getAuthorImageDecorator()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](../api/AuthorImageDecorator.md)

### `createEditPropertiesHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](../api/EditPropertiesHandler.md)

### `getSpellCheckerHelper()`

**Returns:** [`ro.sync.ecss.extensions.api.spell.SpellCheckerHelper`](../api/spell/SpellCheckerHelper.md)

