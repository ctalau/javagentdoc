# Interface: `ProjectIndexer`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectIndexer`

## Methods

### `addProgressMonitor([`ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`](./ProjectIndexerProgressMonitor.md) arg0)`

**Returns:** `void`

### `removeProgressMonitor([`ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`](./ProjectIndexerProgressMonitor.md) arg0)`

**Returns:** `void`

### `updateIndex(`boolean` arg0)`

**Returns:** `void`

### `cancelUpdateIndex()`

**Returns:** `void`

### `clearIndex()`

**Returns:** `void`

### `isIndexingInProgress()`

**Returns:** `boolean`

### `search(`java.lang.String` arg0, `int` arg1)`

**Returns:** `java.util.List<java.net.URL>`

### `search([`ro.sync.exml.workspace.api.standalone.project.SearchOptions`](./SearchOptions.md) arg0, `java.util.function.Predicate<java.lang.String>` arg1)`

**Returns:** `java.lang.String`

### `searchInReusableComponents(`java.lang.String` arg0, `int` arg1)`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.standalone.project.IndexedReusableComponent>`

### `hasData()`

**Returns:** `boolean`

### `runAsync(`java.lang.Runnable` arg0)`

**Returns:** `void`

