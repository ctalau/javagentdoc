# Interface: `ProjectIndexerProgressMonitor`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`

## Description

## Methods

### `startIndexing()`

**Returns:** `void`

### `endIndexing()`

**Returns:** `void`

### `cancel()`

**Returns:** `void`

### `updateDetailsMessage(`java.lang.String` detailsMessage)`

**Returns:** `void`

### `updateIndexedResourcesCount(`int` count)`

**Returns:** `void`

Emmited between a #startIndexing() and a #endIndexing().

### `isCanceled()`

**Returns:** `boolean`

