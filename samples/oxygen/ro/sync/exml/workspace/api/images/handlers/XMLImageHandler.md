# Class: `XMLImageHandler`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.XMLImageHandler`

**Extends:** [`ro.sync.exml.workspace.api.images.handlers.EditImageHandler`](./EditImageHandler.md)

## Description

The image is either embedded in the XML content or referenced from it...

## Constructors

### `<init>()`

## Methods

### `canHandleNamespace(java.lang.String namespace)`

For instance if the element is from 
 the MathML namespace, then a MathML handler would return true, and it can be used to generate an image 
 from it.

**Parameters:**
- `namespace` (`java.lang.String`): The namespace of the element from the document.

**Returns:** `boolean`

### `canHandleNodeContext(ro.sync.exml.workspace.api.node.NodeContext nodeContext)`

For instance if the element is from 
 the MathML namespace, then a MathML handler would return true, and it can be used to generate an image 
 from it.

**Parameters:**
- `nodeContext` ([`ro.sync.exml.workspace.api.node.NodeContext`](../../node/NodeContext.md)): The context for an element.

**Returns:** `boolean`

### `canHandle(java.lang.String rootNamespace, java.lang.String rootLocalName, org.xml.sax.Attributes rootAttributes)`

**Parameters:**
- `rootNamespace` (`java.lang.String`): The root namespace.
- `rootLocalName` (`java.lang.String`): The root local name.
- `rootAttributes` (`org.xml.sax.Attributes`): The root attributes.

**Returns:** `boolean`

### `canHandleVectorialImages()`

**Returns:** `boolean`

