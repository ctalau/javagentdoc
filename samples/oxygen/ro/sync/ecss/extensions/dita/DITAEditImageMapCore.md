# Class: `DITAEditImageMapCore`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAEditImageMapCore`

**Extends:** [`ro.sync.ecss.extensions.commons.imagemap.EditImageMapWithSurroundCore`](../commons/imagemap/EditImageMapWithSurroundCore.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getSupportedFramework(String namespaceURI)`

**Parameters:**
- `namespaceURI` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.imagemap.SupportedFrameworks`](../../imagemap/SupportedFrameworks.md)

### `getNodesOfInterestCriteria(String namespace)`

**Parameters:**
- `namespace` (`java.lang.String`)

**Returns:** `java.lang.String[]`

### `needComplexSurround(AuthorNode nodeToEdit)`

**Parameters:**
- `nodeToEdit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isNodeOfInterest(AuthorNode nodeToEdit, String property2Check)`

**Parameters:**
- `nodeToEdit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `property2Check` (`java.lang.String`)

**Returns:** `boolean`

