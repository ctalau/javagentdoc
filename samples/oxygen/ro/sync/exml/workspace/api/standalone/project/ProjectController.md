# Interface: `ProjectController`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectController`

## Description

## Methods

### `addProjectChangeListener([`ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener`](./ProjectChangeListener.md) projectChangeListener)`

**Returns:** `void`

### `removeProjectChangeListener([`ro.sync.exml.workspace.api.standalone.project.ProjectChangeListener`](./ProjectChangeListener.md) projectChangeListener)`

**Returns:** `void`

### `getCurrentProjectURL()`

**Returns:** `java.net.URL`

### `addPopUpMenuCustomizer([`ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer`](./ProjectPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `removePopUpMenuCustomizer([`ro.sync.exml.workspace.api.standalone.project.ProjectPopupMenuCustomizer`](./ProjectPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `getSelectedFiles()`

**Returns:** `java.io.File[]`

If both parent and child files/folders are selected, they are all returned.

### `refreshFolders(`java.io.File[]` folders)`

**Returns:** `void`

### `addLinksToFoldersInProjectRoot(`java.io.File[]` folders)`

**Returns:** `void`

### `addRendererCustomizer([`ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`](./ProjectRendererCustomizer.md) rendererCustomizer)`

**Returns:** `void`

### `removeRendererCustomizer([`ro.sync.exml.workspace.api.standalone.project.ProjectRendererCustomizer`](./ProjectRendererCustomizer.md) rendererCustomizer)`

**Returns:** `void`

### `loadProject(`java.io.File` project)`

**Returns:** `void`

### `getProjectIndexer()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.project.ProjectIndexer`](./ProjectIndexer.md)

### `getMainFileResourcesIterator()`

**Returns:** `java.util.Iterator<java.net.URL>`

If the "Main files" support is disabled, an empty iterator will be returned, even if it contains referenced resources.

### `findInFiles([`ro.sync.exml.workspace.api.standalone.project.SearchParams`](./SearchParams.md) findParams)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

