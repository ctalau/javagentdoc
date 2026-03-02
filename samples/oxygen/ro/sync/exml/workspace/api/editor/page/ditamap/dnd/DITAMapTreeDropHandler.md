# Class: `DITAMapTreeDropHandler`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap.dnd`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.dnd.DITAMapTreeDropHandler`

## Description

## Constructors

### `<init>()`

## Methods

### `acceptDragOverURLs(java.util.List resourcesToRefer, ro.sync.ecss.extensions.api.node.AuthorNode contextNode, boolean asChild)`

Use this method to accept or reject it.

**Parameters:**
- `resourcesToRefer` (`java.util.List`): The resources which will be linked in the map, usually URL or File objects.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)): Node over which the mouse is moved.
- `asChild` (`boolean`): `true` if when dropped the list of URLs will be added as children, `false` if they will be added 
   as siblings (after) the context node. This depends on the position of the mouse relative to the context node bounds.

**Returns:** `boolean`

### `consumeDropURLs(java.util.List resourcesToRefer, ro.sync.ecss.extensions.api.node.AuthorNode destination, boolean asChild)`

**Parameters:**
- `resourcesToRefer` (`java.util.List`): The resources which will be dropped, usually URL or File objects.
- `destination` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../../../ecss/extensions/api/node/AuthorNode.md)): The node over which the drop was done.
- `asChild` (`boolean`): `true` if when dropped the list of URLs will be added as children, `false` if they will be added 
   as siblings (after) the destination node. This depends on the position of the mouse relative to the destination node bounds.

**Returns:** `boolean`

