# Class: `XHTMLEditImageMapCore`

**Package:** [`ro.sync.ecss.extensions.xhtml.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.imagemap.XHTMLEditImageMapCore`

**Extends:** [`ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore`](../../commons/imagemap/EditImageMapCore.md)

## Description

## Fields

### `XHTML_NS`

**Type:** `java.lang.String`

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

### `generateMapID()`

**Returns:** `java.lang.String`

### `getSupportedFramework(java.lang.String namespaceURI)`

**Returns:** [`ro.sync.ecss.imagemap.SupportedFrameworks`](../../../imagemap/SupportedFrameworks.md)

**Parameters:**
- `namespaceURI` (`java.lang.String`)

