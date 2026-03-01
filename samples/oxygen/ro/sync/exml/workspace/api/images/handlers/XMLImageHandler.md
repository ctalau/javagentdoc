# Class: `XMLImageHandler`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.XMLImageHandler`

**Extends:** [`ro.sync.exml.workspace.api.images.handlers.EditImageHandler`](./EditImageHandler.md)

## Description

The image is either embedded in the XML content or referenced from it...

## Constructors

### `<init>()`

## Methods

### `canHandleNamespace(`java.lang.String` namespace)`

**Returns:** `boolean`

For instance if the element is from 
 the MathML namespace, then a MathML handler would return true, and it can be used to generate an image 
 from it.

### `canHandleNodeContext([`ro.sync.exml.workspace.api.node.NodeContext`](../../node/NodeContext.md) nodeContext)`

**Returns:** `boolean`

For instance if the element is from 
 the MathML namespace, then a MathML handler would return true, and it can be used to generate an image 
 from it.

### `canHandle(`java.lang.String` rootNamespace, `java.lang.String` rootLocalName, `org.xml.sax.Attributes` rootAttributes)`

**Returns:** `boolean`

### `canHandleVectorialImages()`

**Returns:** `boolean`

