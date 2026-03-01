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

### `getImageURL(`java.lang.String` path)`

**Returns:** `java.lang.String`

### `getRenderingInformation([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md) context)`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../exml/workspace/api/node/customizer/BasicRenderingInformation.md)

### `getDITAClass([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md) context)`

**Returns:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass`

### `getDitaClassForClassValue(`java.lang.String` classValue)`

**Returns:** `ro.sync.ecss.extensions.dita.DITANodeRendererCustomizer.DitaClass`

### `getDescription()`

**Returns:** `java.lang.String`

