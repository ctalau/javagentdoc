# Class: `DITANodeRendererCustomizer`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

## Description

A node represents an entry from Author outline, Author bread crumb,
 Text page outline, content completion proposals window or Elements view.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `classToIconPath`

**Type:** `java.util.EnumMap<ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass,java.lang.String>`

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

### `getDITAClass(ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext context)`

**Returns:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass`

**Parameters:**
- `context` ([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md)): The context to determine the dita class for.

### `getDitaClassForClassValue(java.lang.String classValue)`

**Returns:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass`

**Parameters:**
- `classValue` (`java.lang.String`): The class attribute value.

### `getDescription()`

**Returns:** `java.lang.String`

