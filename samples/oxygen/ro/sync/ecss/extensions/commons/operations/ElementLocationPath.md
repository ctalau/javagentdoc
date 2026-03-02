# Class: `ElementLocationPath`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ElementLocationPath`

## Description

## Fields

### `path`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.operations.ElementLocationPath.ElementLocationPathComponent>`

## Constructors

### `<init>()`

## Methods

### `getPath()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.ElementLocationPath.ElementLocationPathComponent>`

### `toXPath()`

**Returns:** `java.lang.String`

### `addFront(ro.sync.ecss.extensions.commons.operations.ElementLocationPath.ElementLocationPathComponent comp)`

**Parameters:**
- `comp` (`ro.sync.ecss.extensions.commons.operations.ElementLocationPath.ElementLocationPathComponent`): The component to add.

**Returns:** [`ro.sync.ecss.extensions.commons.operations.ElementLocationPath`](./ElementLocationPath.md)

### `getCurrentElementLocation(ro.sync.ecss.extensions.api.AuthorReviewController authorReviewController, ro.sync.ecss.extensions.api.node.AuthorElement currentElement, ro.sync.ecss.extensions.api.node.AuthorElement sourceElement)`

**Parameters:**
- `authorReviewController` ([`ro.sync.ecss.extensions.api.AuthorReviewController`](../../api/AuthorReviewController.md)): The author review controller, used to identify deleted nodes.
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The current element at caret.
- `sourceElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element to transform.

**Returns:** [`ro.sync.ecss.extensions.commons.operations.ElementLocationPath`](./ElementLocationPath.md)

