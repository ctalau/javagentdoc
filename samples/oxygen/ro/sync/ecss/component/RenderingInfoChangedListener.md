# Interface: `RenderingInfoChangedListener`

**Package:** [`ro.sync.ecss.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.RenderingInfoChangedListener`

**Extends:** [`ro.sync.ecss.component.BatchEditListener`](./BatchEditListener.md)

## Description

The rendering info includes the style of the node, as computed from the
 associated CSS or its content. When the info is changed for a node it means
 that all its descendants need to be rendered again.

## Methods

### `renderingInfoChanged([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../extensions/api/node/AuthorParentNode.md) element, [`ro.sync.ecss.component.RenderingInfoChangeType`](./RenderingInfoChangeType.md) type)`

**Returns:** `void`

