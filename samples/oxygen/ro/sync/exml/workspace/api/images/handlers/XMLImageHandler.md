# Class: `XMLImageHandler`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.XMLImageHandler`

**Extends:** [`ro.sync.exml.workspace.api.images.handlers.EditImageHandler`](./EditImageHandler.md)

## Description

The image is either embedded in the XML content or referenced from it...

## Constructors

### `<init>()`

## Methods

### `canHandleNamespace(String namespace)`

For instance if the element is from 
 the MathML namespace, then a MathML handler would return true, and it can be used to generate an image 
 from it.

**Parameters:**
- `namespace` (`java.lang.String`): The namespace of the element from the document.

**Returns:** `boolean`

### `canHandleNodeContext(NodeContext nodeContext)`

For instance if the element is from 
 the MathML namespace, then a MathML handler would return true, and it can be used to generate an image 
 from it.

**Parameters:**
- `nodeContext` ([`ro.sync.exml.workspace.api.node.NodeContext`](../../node/NodeContext.md)): The context for an element.

**Returns:** `boolean`

### `canHandle(String rootNamespace, String rootLocalName, Attributes rootAttributes)`

**Parameters:**
- `rootNamespace` (`java.lang.String`): The root namespace.
- `rootLocalName` (`java.lang.String`): The root local name.
- `rootAttributes` (`org.xml.sax.Attributes`): The root attributes.

**Returns:** `boolean`

### `canHandleVectorialImages()`

**Returns:** `boolean`

