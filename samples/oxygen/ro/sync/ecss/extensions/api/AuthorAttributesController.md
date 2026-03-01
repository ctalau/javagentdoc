# Interface: `AuthorAttributesController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorAttributesController`

## Description

## Methods

### `setAttribute(`java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md) value, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

Attributes set in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) 
 will be subject to undo/redo.

