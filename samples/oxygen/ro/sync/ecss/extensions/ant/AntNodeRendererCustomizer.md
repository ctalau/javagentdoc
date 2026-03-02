# Class: `AntNodeRendererCustomizer`

**Package:** [`ro.sync.ecss.extensions.ant`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.ant.AntNodeRendererCustomizer`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

## Description

A node represents an entry from Author outline, Author bread crumb,
 Text page outline, content completion proposals window or Elements view.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `nameToIconPath`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `tasksSet`

**Type:** `java.util.Set<java.lang.String>`

### `typesSet`

**Type:** `java.util.Set<java.lang.String>`

### `TASKS_IMAGE_PATH`

**Type:** `java.lang.String`

### `TYPES_IMAGE_PATH`

**Type:** `java.lang.String`

### `PROPERTY_IMAGE_PATH`

**Type:** `java.lang.String`

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

### `getDescription()`

**Returns:** `java.lang.String`

