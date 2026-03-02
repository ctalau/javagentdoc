# Interface: `WSOutline`

**Package:** [`ro.sync.exml.workspace.api.editor.page`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.WSOutline`

## Description

## Methods

### `getSelectedPaths(boolean minimizeSelectedPaths)`

The tree path contain arrays of AuthorNodes starting from the AuthorDocument and ending in the selected leaf node.
 The bread crumb displays the path to the last node selected in the Outline.

**Parameters:**
- `minimizeSelectedPaths` (`boolean`): If true and a parent and a child is selected, then only the parent is the list.

**Returns:** `javax.swing.tree.TreePath[]`

### `setSelectionPaths(TreePath[] treePath)`

**Parameters:**
- `treePath` (`javax.swing.tree.TreePath[]`): The path to select.

**Returns:** `void`

