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

### `getFullySelectedNode([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, `int` selStart, `int` selEnd, `boolean` hasSelection)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `findNodeOfInterest([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) interestNode, `java.lang.String[]` properties2Check)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

It might be the node 
 name, an attribute value, etc.

### `isNodeOfInterest([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) nodeToEdit, `java.lang.String[]` properties2Check)`

**Returns:** `boolean`

### `isNodeOfInterest([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) nodeToEdit, `java.lang.String` property2Check)`

**Returns:** `boolean`

### `getNodesOfInterest([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) interestNode, `boolean` doSurroundIfMissing)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../../api/node/AuthorNode.md)

### `getSupportedFramework(`java.lang.String` namespaceURI)`

**Returns:** [`ro.sync.ecss.imagemap.SupportedFrameworks`](../../../imagemap/SupportedFrameworks.md)

