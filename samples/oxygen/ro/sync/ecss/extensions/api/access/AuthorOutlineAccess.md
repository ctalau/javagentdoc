# Interface: `AuthorOutlineAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorOutlineAccess`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSOutline`](../../../../exml/workspace/api/editor/page/WSOutline.md)

## Description

## Methods

### `refreshNodes(AuthorNode[] nodes)`

If the developer sets an AuthorOutlineCustomizer or an AuthorBreadCrumbCustomizer which uses as render text
 for a node the information available in another node, if the second node changes, the Outline/Bread Crumb components
 do not know what other nodes to update.
 
 Example:
 If the developer renders for a <chapter> the gathered text from the <title> child nodes then he will have to add
 a document listener and when a <title> node's text changes update the parent <chapter>.

**Parameters:**
- `nodes` ([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](../node/AuthorNode.md)): The nodes to Refresh in the outline/bread crumb

**Returns:** `void`

