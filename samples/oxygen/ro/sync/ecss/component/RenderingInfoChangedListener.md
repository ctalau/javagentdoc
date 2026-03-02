# Interface: `RenderingInfoChangedListener`

**Package:** [`ro.sync.ecss.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.RenderingInfoChangedListener`

**Extends:** [`ro.sync.ecss.component.BatchEditListener`](./BatchEditListener.md)

## Description

The rendering info includes the style of the node, as computed from the
 associated CSS or its content. When the info is changed for a node it means
 that all its descendants need to be rendered again.

## Methods

### `renderingInfoChanged(AuthorParentNode element, RenderingInfoChangeType type)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](../extensions/api/node/AuthorParentNode.md)): The element whose information was changed.
- `type` ([`ro.sync.ecss.component.RenderingInfoChangeType`](./RenderingInfoChangeType.md)): The type of the change.

**Returns:** `void`

