# Interface: `AuthorEditorAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorEditorAccess`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPageBase`](../../../../exml/workspace/api/editor/page/author/WSAuthorEditorPageBase.md), [`ro.sync.exml.workspace.api.editor.WSEditorBase`](../../../../exml/workspace/api/editor/WSEditorBase.md)

## Description

It also provides methods to save the file, close, etc.

## Methods

### `getLocationOnScreen(int x, int y)`

**Returns:** `int[]`

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the viewport origin.
- `y` (`int`): The "y" coordinate relative to the viewport origin.

### `modelToView(int offset)`

**Returns:** `int[]`

**Parameters:**
- `offset` (`int`): The document offset to get the corresponding caret shape for.

### `getEditingContext()`

**Returns:** [`ro.sync.ecss.extensions.api.access.EditingSessionContext`](./EditingSessionContext.md)

An editing session corresponds to an editor instance, contains custom 
 attributes that can be set from the API.

### `getExtensionsBundle()`

**Returns:** [`ro.sync.ecss.extensions.api.ExtensionsBundle`](../ExtensionsBundle.md)

### `getUnsavedContentReferenceManager()`

**Returns:** [`ro.sync.ecss.extensions.api.access.UnsavedContentReferenceManager`](./UnsavedContentReferenceManager.md)

