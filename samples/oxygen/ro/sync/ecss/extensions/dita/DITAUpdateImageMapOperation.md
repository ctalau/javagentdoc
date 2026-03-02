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

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

**Parameters:**
- `svgText` (`java.lang.String`)

### `getFrameworkSpecificImageMapDom(java.lang.String svgText)`

**Returns:** `org.w3c.dom.Document`

**Parameters:**
- `svgText` (`java.lang.String`): The SVG text.

### `getNewShapesList(org.w3c.dom.Document newMapDOM)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.dita.DITAUpdateImageMapOperation.DITANewShapeDescriptor>`

**Parameters:**
- `newMapDOM` (`org.w3c.dom.Document`): The DOM that contains new shapes.

### `getExistingShapesList(ro.sync.ecss.extensions.api.node.AuthorElement existingImageMap)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../api/node/AuthorElement.md)

**Parameters:**
- `existingImageMap` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))

### `getImageMapElement(ro.sync.ecss.extensions.api.node.AuthorElement currentElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md))

