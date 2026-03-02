# Interface: `AuthorAttributesController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorAttributesController`

## Description

## Methods

### `setAttribute(java.lang.String attributeName, ro.sync.ecss.extensions.api.node.AttrValue value, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `void`

Attributes set in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) 
 will be subject to undo/redo.

**Parameters:**
- `attributeName` (`java.lang.String`): Name of the attribute being changed.
- `value` ([`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md)): New AttrValue for the attribute. If `null`, the attribute is 
 removed from the element.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute is changing.

