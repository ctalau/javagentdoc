# Class: `XHTMLUpdateImageMapOperation`

**Package:** [`ro.sync.ecss.extensions.xhtml.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.imagemap.XHTMLUpdateImageMapOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.imagemap.operations.UpdateImageMapOperationBase`](../../commons/imagemap/operations/UpdateImageMapOperationBase.md)

## Description

## Constructors

### `<init>()`

## Methods

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getImageNode(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `getNewShapesList(String svgText)`

**Parameters:**
- `svgText` (`java.lang.String`)

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

### `getExistingShapesList(AuthorElement existingImageMap)`

**Parameters:**
- `existingImageMap` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../api/node/AuthorElement.md)

### `getImageMapElement(AuthorElement currentElement)`

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

