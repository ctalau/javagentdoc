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

### `getNewShapesList(`java.lang.String` svgText)`

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

### `getFrameworkSpecificImageMapDom(`java.lang.String` svgText)`

**Returns:** `org.w3c.dom.Document`

### `getNewShapesList(`org.w3c.dom.Document` newMapDOM)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.dita.DITAUpdateImageMapOperation.DITANewShapeDescriptor>`

### `getExistingShapesList([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) existingImageMap)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../api/node/AuthorElement.md)

### `getImageMapElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md) currentElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../api/node/AuthorElement.md)

