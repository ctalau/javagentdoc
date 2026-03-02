# Interface: `ProjectController`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectController`

## Description

## Methods

### `addProjectChangeListener(ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener projectChangeListener)`

**Returns:** `void`

**Parameters:**
- `projectChangeListener` ([`ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener`](./ProjectChangeListener.md)): The project listener to add.

### `removeProjectChangeListener(ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener projectChangeListener)`

**Returns:** `void`

**Parameters:**
- `projectChangeListener` ([`ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener`](./ProjectChangeListener.md)): The project listener to remove.

### `getCurrentProjectURL()`

**Returns:** `java.net.URL`

### `addPopUpMenuCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer`](./ProjectPopupMenuCustomizer.md)): the pop-up menu customizer to add.

### `removePopUpMenuCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer popUpCustomizer)`

**Returns:** `void`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer`](./ProjectPopupMenuCustomizer.md)): the pop-up menu customizer to remove.

### `getSelectedFiles()`

**Returns:** `java.io.File[]`

If both parent and child files/folders are selected, they are all returned.

### `refreshFolders(java.io.File[] folders)`

**Returns:** `void`

**Parameters:**
- `folders` (`java.io.File[]`): An array of folders to refresh.

### `addLinksToFoldersInProjectRoot(java.io.File[] folders)`

**Returns:** `void`

**Parameters:**
- `folders` (`java.io.File[]`): The folders to refer. They should already be created on disk before calling this API which just links to it.

### `addRendererCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer rendererCustomizer)`

**Returns:** `void`

**Parameters:**
- `rendererCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`](./ProjectRendererCustomizer.md)): the renderer customizer to add.

### `removeRendererCustomizer(ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer rendererCustomizer)`

**Returns:** `void`

**Parameters:**
- `rendererCustomizer` ([`ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`](./ProjectRendererCustomizer.md)): the renderer customizer to remove.

### `loadProject(java.io.File project)`

**Returns:** `void`

**Parameters:**
- `project` (`java.io.File`): The project file.

### `getProjectIndexer()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.project.ProjectIndexer`](./ProjectIndexer.md)

### `getMainFileResourcesIterator()`

**Returns:** `java.util.Iterator<java.net.URL>`

If the "Main files" support is disabled, an empty iterator will be returned, even if it contains referenced resources.

### `findInFiles(ro.sync.exml.workspace.api.standalone.project.SearchParams findParams)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

**Parameters:**
- `findParams` ([`ro.sync.exml.workspace.api.standalone.project.SearchParams`](./SearchParams.md)): The find parameters.

