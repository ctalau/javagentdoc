# Class: `XSDNodeRendererCustomizer`

**Package:** [`ro.sync.ecss.extensions.xsd`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xsd.XSDNodeRendererCustomizer`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

## Description

A node represents an entry from Author outline, Author bread crumb,
 Text page outline, content completion proposals window or Elements view.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `schNodeRendererCustomizer`

**Type:** [`ro.sync.ecss.extensions.schematron.SchematronNodeRendererCustomizer`](../schematron/SchematronNodeRendererCustomizer.md)

### `nameToIconPath`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

## Constructors

### `<init>()`

## Methods

### `getImageURL(java.lang.String path)`

**Returns:** `java.lang.String`

**Parameters:**
- `path` (`java.lang.String`): The image path to search for.

### `getRenderingInformation(ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext context)`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../exml/workspace/api/node/customizer/BasicRenderingInformation.md)

**Parameters:**
- `context` ([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md))

### `getDescription()`

**Returns:** `java.lang.String`

