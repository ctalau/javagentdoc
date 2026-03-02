# Class: `EditImageMapCore`

**Package:** [`ro.sync.ecss.extensions.commons.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getFullySelectedNode(AuthorDocumentController ctrl, int selStart, int selEnd, boolean hasSelection)`

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Author document controller.
- `selStart` (`int`): Selection start (inclusive).
- `selEnd` (`int`): Selection end (exclusive).
- `hasSelection` (`boolean`): `true` if has selection.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `findNodeOfInterest(AuthorAccess authorAccess, AuthorNode interestNode, String[] properties2Check)`

It might be the node 
 name, an attribute value, etc.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `interestNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node of interest if available when calling the method. If `null`
                            it will be determined from the AuthorAccess, from the caret position.
- `properties2Check` (`java.lang.String[]`): The properties to check.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `isNodeOfInterest(AuthorNode nodeToEdit, String[] properties2Check)`

**Parameters:**
- `nodeToEdit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to check.
- `properties2Check` (`java.lang.String[]`): The array of properties to check.

**Returns:** `boolean`

### `isNodeOfInterest(AuthorNode nodeToEdit, String property2Check)`

**Parameters:**
- `nodeToEdit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to edit candidate.
- `property2Check` (`java.lang.String`): The property value to check.

**Returns:** `boolean`

### `getNodesOfInterest(AuthorAccess authorAccess, AuthorNode interestNode, boolean doSurroundIfMissing)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `interestNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node of interest if available when calling the method. If `null`
                              it will be determined from the AuthorAccess, from the caret position.
- `doSurroundIfMissing` (`boolean`): If `true` the missing part of the image map will be added.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../../api/node/AuthorNode.md)

### `getSupportedFramework(String namespaceURI)`

**Parameters:**
- `namespaceURI` (`java.lang.String`): The namespace uri of the element.

**Returns:** [`ro.sync.ecss.imagemap.SupportedFrameworks`](../../../imagemap/SupportedFrameworks.md)

