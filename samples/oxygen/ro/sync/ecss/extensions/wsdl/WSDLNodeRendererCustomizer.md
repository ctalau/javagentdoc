# Class: `WSDLNodeRendererCustomizer`

**Package:** [`ro.sync.ecss.extensions.wsdl`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.wsdl.WSDLNodeRendererCustomizer`

**Extends:** [`ro.sync.exml.workspace.api.node.customizer.XMLNodeRendererCustomizer`](../../../exml/workspace/api/node/customizer/XMLNodeRendererCustomizer.md)

## Description

A node represents an entry from Author outline, Author bread crumb,
 Text page outline, content completion proposals window or Elements view.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `nameToIconPath`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `xsdNodeRendererCustomizer`

**Type:** [`ro.sync.ecss.extensions.xsd.XSDNodeRendererCustomizer`](../xsd/XSDNodeRendererCustomizer.md)

## Constructors

### `<init>()`

## Methods

### `getImageURL(`java.lang.String` path)`

**Returns:** `java.lang.String`

### `getRenderingInformation([`ro.sync.exml.workspace.api.node.customizer.NodeRendererCustomizerContext`](../../../exml/workspace/api/node/customizer/NodeRendererCustomizerContext.md) context)`

**Returns:** [`ro.sync.exml.workspace.api.node.customizer.BasicRenderingInformation`](../../../exml/workspace/api/node/customizer/BasicRenderingInformation.md)

### `getDescription()`

**Returns:** `java.lang.String`

