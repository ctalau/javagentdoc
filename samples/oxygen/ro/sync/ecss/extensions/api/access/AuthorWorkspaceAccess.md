# Interface: `AuthorWorkspaceAccess`

**Package:** [`ro.sync.ecss.extensions.api.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`

**Extends:** [`ro.sync.exml.workspace.api.Workspace`](../../../../exml/workspace/api/Workspace.md)

## Description

## Methods

### `open(File file)`

**Parameters:**
- `file` (`java.io.File`): The file to be opened.

**Returns:** `boolean`

### `getAllEditorLocations()`

**Returns:** `java.net.URL[]`

### `getEditorAccess(URL location)`

**Parameters:**
- `location` (`java.net.URL`): The editor location

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

