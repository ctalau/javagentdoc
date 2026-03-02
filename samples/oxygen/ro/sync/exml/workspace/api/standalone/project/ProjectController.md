# Interface: `ProjectController`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectController`

## Description

## Methods

### `addProjectChangeListener(ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener projectChangeListener)`

**Parameters:**
- `projectChangeListener` ([`ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener`](./ProjectChangeListener.md)): The project listener to add.

**Returns:** `void`

### `removeProjectChangeListener(ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener projectChangeListener)`

**Parameters:**
- `projectChangeListener` ([`ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener`](./ProjectChangeListener.md)): The project listener to remove.

**Returns:** `void`

### `getCurrentProjectURL()`

**Returns:** `java.net.URL`

### `addPopUpMenuCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer popUpCustomizer)`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer`](./ProjectPopupMenuCustomizer.md)): the pop-up menu customizer to add.

**Returns:** `void`

### `removePopUpMenuCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer popUpCustomizer)`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer`](./ProjectPopupMenuCustomizer.md)): the pop-up menu customizer to remove.

**Returns:** `void`

### `getSelectedFiles()`

If both parent and child files/folders are selected, they are all returned.

**Returns:** `java.io.File[]`

### `refreshFolders(java.io.File[] folders)`

**Parameters:**
- `folders` (`java.io.File[]`): An array of folders to refresh.

**Returns:** `void`

### `addLinksToFoldersInProjectRoot(java.io.File[] folders)`

**Parameters:**
- `folders` (`java.io.File[]`): The folders to refer. They should already be created on disk before calling this API which just links to it.

**Returns:** `void`

### `addRendererCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer rendererCustomizer)`

**Parameters:**
- `rendererCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`](./ProjectRendererCustomizer.md)): the renderer customizer to add.

**Returns:** `void`

### `removeRendererCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer rendererCustomizer)`

**Parameters:**
- `rendererCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`](./ProjectRendererCustomizer.md)): the renderer customizer to remove.

**Returns:** `void`

### `loadProject(java.io.File project)`

**Parameters:**
- `project` (`java.io.File`): The project file.

**Returns:** `void`

### `getProjectIndexer()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.project.ProjectIndexer`](./ProjectIndexer.md)

### `getMainFileResourcesIterator()`

If the "Main files" support is disabled, an empty iterator will be returned, even if it contains referenced resources.

**Returns:** `java.util.Iterator<java.net.URL>`

### `findInFiles(ro.sync.exml.workspace.api.standalone.project.SearchParams findParams)`

**Parameters:**
- `findParams` ([`ro.sync.exml.workspace.api.standalone.project.SearchParams`](./SearchParams.md)): The find parameters.

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

