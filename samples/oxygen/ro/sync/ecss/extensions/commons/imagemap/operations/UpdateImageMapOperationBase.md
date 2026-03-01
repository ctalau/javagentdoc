# Class: `UpdateImageMapOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.imagemap.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.imagemap.operations.UpdateImageMapOperationBase`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_SHAPES`

**Type:** `java.lang.String`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getImageMapElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getNewShapesList(`java.lang.String` svgText)`

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

### `getExistingShapesList([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) existingImageMap)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../../api/node/AuthorElement.md)

### `mergeImageMaps([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentImageMap, `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>` newShapeElements)`

**Returns:** `void`

### `getXmlForNewShape([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, `java.util.Map<java.lang.Integer,ro.sync.ecss.extensions.api.node.AuthorElement>` shapeElements, [`ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor`](./NewShapeDescriptor.md) newShapeElement)`

**Returns:** `java.lang.String`

It tries to inherit some XML attributes (for example the links) from the current document.

### `getShapesMap([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../../api/node/AuthorElement.md) imageMapElements)`

**Returns:** `java.util.Map<java.lang.Integer,ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getNodeToReplace([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../../api/access/AuthorEditorAccess.md) editorAccess, `int` caretOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

