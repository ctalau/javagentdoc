# Class: `EditImageMapWithSurroundCore`

**Package:** [`ro.sync.ecss.extensions.commons.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.imagemap.EditImageMapWithSurroundCore`

**Extends:** [`ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore`](./EditImageMapCore.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getNodesOfInterest(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode interestNode, boolean doSurroundIfMissing)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../../api/node/AuthorNode.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `interestNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node of interest if available when calling the method. If `null`
                            it will be determined from the AuthorAccess, from the caret position.
- `doSurroundIfMissing` (`boolean`): If `true` the missing part of the image map will be added.

### `needComplexSurround(ro.sync.ecss.extensions.api.node.AuthorNode nodeToEdit)`

**Returns:** `boolean`

**Parameters:**
- `nodeToEdit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to edit.

### `getNodesOfInterestCriteria(java.lang.String namespace)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `namespace` (`java.lang.String`): The namespace of the document.

