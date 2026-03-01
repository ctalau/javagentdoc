# Class: `TEIExtensionsBundleBase`

**Package:** [`ro.sync.ecss.extensions.tei`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.TEIExtensionsBundleBase`

**Extends:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](../api/ExtensionsBundle.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `teiSchemaAwareEditingHandler`

**Type:** [`ro.sync.ecss.extensions.tei.TEISchemaAwareEditingHandler`](./TEISchemaAwareEditingHandler.md)

### `handler`

**Type:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `decorator`

**Type:** [`ro.sync.ecss.extensions.tei.TEIAuthorImageDecorator`](./TEIAuthorImageDecorator.md)

## Constructors

### `<init>()`

## Methods

### `createAuthorTableCellSpanProvider()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../api/AuthorTableCellSpanProvider.md)

### `getDocumentNamespace()`

**Returns:** `java.lang.String`

### `getAuthorSchemaAwareEditingHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaAwareEditingHandler`](../api/AuthorSchemaAwareEditingHandler.md)

### `createXMLNodeCustomizer()`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

### `getAuthorActionEventHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandler`](../api/AuthorActionEventHandler.md)

### `getAuthorImageDecorator()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](../api/AuthorImageDecorator.md)

### `createEditPropertiesHandler()`

**Returns:** [`ro.sync.ecss.extensions.api.EditPropertiesHandler`](../api/EditPropertiesHandler.md)

### `getSpellCheckerHelper()`

**Returns:** [`ro.sync.ecss.extensions.api.spell.SpellCheckerHelper`](../api/spell/SpellCheckerHelper.md)

