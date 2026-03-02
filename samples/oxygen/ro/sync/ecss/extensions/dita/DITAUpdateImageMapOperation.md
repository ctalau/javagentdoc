# Class: `DITAUpdateImageMapOperation`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAUpdateImageMapOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.imagemap.operations.UpdateImageMapOperationBase`](../commons/imagemap/operations/UpdateImageMapOperationBase.md)

## Description

## Fields

### `ORIGINAL_LAYER_ATTR_NAME`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getNewShapesList(java.lang.String svgText)`

**Parameters:**
- `svgText` (`java.lang.String`)

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

### `getFrameworkSpecificImageMapDom(java.lang.String svgText)`

**Parameters:**
- `svgText` (`java.lang.String`): The SVG text.

**Returns:** `org.w3c.dom.Document`

### `getNewShapesList(org.w3c.dom.Document newMapDOM)`

**Parameters:**
- `newMapDOM` (`org.w3c.dom.Document`): The DOM that contains new shapes.

**Returns:** `java.util.List<ro.sync.ecss.extensions.dita.DITAUpdateImageMapOperation.DITANewShapeDescriptor>`

### `getExistingShapesList(ro.sync.ecss.extensions.api.node.AuthorElement existingImageMap)`

**Parameters:**
- `existingImageMap` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../api/node/AuthorElement.md)

### `getImageMapElement(ro.sync.ecss.extensions.api.node.AuthorElement currentElement)`

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

