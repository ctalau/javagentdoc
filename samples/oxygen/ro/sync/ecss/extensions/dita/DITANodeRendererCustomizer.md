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

### `getImageURL(String path)`

**Parameters:**
- `path` (`java.lang.String`): The image path to search for.

**Returns:** `java.lang.String`

### `getRenderingInformation(NodeRendererCustomizerContext context)`

**Parameters:**
- `context` ([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md))

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../exml/workspace/api/node/customizer/BasicRenderingInformation.md)

### `getDITAClass(NodeRendererCustomizerContext context)`

**Parameters:**
- `context` ([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md)): The context to determine the dita class for.

**Returns:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass`

### `getDitaClassForClassValue(String classValue)`

**Parameters:**
- `classValue` (`java.lang.String`): The class attribute value.

**Returns:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass`

### `getDescription()`

**Returns:** `java.lang.String`

