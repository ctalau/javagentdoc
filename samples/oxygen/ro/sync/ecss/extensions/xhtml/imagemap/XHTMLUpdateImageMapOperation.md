# Class: `XHTMLUpdateImageMapOperation`

**Package:** [`ro.sync.ecss.extensions.xhtml.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.imagemap.XHTMLUpdateImageMapOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.imagemap.operations.UpdateImageMapOperationBase`](../../commons/imagemap/operations/UpdateImageMapOperationBase.md)

## Description

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getImageNode(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `getNewShapesList(java.lang.String svgText)`

**Parameters:**
- `svgText` (`java.lang.String`)

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

### `getExistingShapesList(ro.sync.ecss.extensions.api.node.AuthorElement existingImageMap)`

**Parameters:**
- `existingImageMap` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../api/node/AuthorElement.md)

### `getImageMapElement(ro.sync.ecss.extensions.api.node.AuthorElement currentElement)`

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

