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

### `updateDetailsMessage(java.lang.String detailsMessage)`

**Parameters:**
- `detailsMessage` (`java.lang.String`): The message that show the state of the indexer.

**Returns:** `void`

### `updateIndexedResourcesCount(int count)`

Emmited between a #startIndexing() and a #endIndexing().

**Parameters:**
- `count` (`int`): The new count.

**Returns:** `void`

### `isCanceled()`

**Returns:** `boolean`

