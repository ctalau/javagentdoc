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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getImageMapElement(AuthorElement currentElement)`

**Parameters:**
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getNewShapesList(String svgText)`

**Parameters:**
- `svgText` (`java.lang.String`): The SVG text.

**Returns:** `java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`

### `getExistingShapesList(AuthorElement existingImageMap)`

**Parameters:**
- `existingImageMap` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The existing Image Map.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../../api/node/AuthorElement.md)

### `mergeImageMaps(AuthorDocumentController controller, AuthorElement currentImageMap, List<? extends NewShapeDescriptor> newShapeElements)`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The document controller.
- `currentImageMap` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The original map element.
- `newShapeElements` (`java.util.List<? extends ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor>`): The list of new shapes.

**Returns:** `void`

### `getXmlForNewShape(AuthorDocumentController controller, Map<Integer,AuthorElement> shapeElements, NewShapeDescriptor newShapeElement)`

It tries to inherit some XML attributes (for example the links) from the current document.

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The document controller.
- `shapeElements` (`java.util.Map<java.lang.Integer,ro.sync.ecss.extensions.api.node.AuthorElement>`): The shape elements in the current document.
- `newShapeElement` ([`ro.sync.ecss.extensions.commons.imagemap.operations.NewShapeDescriptor`](./NewShapeDescriptor.md)): The new shape elements.

**Returns:** `java.lang.String`

### `getShapesMap(AuthorElement[] imageMapElements)`

**Parameters:**
- `imageMapElements` ([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../../api/node/AuthorElement.md)): The image map elements.

**Returns:** `java.util.Map<java.lang.Integer,ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getNodeToReplace(AuthorDocumentController controller, AuthorEditorAccess editorAccess, int caretOffset)`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The document controller.
- `editorAccess` ([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../../api/access/AuthorEditorAccess.md)): The editor access.
- `caretOffset` (`int`): The caret offset.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

