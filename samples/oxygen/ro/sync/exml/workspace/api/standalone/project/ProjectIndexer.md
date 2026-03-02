# Interface: `ProjectIndexer`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectIndexer`

## Methods

### `addProgressMonitor(ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`](./ProjectIndexerProgressMonitor.md))

### `removeProgressMonitor(ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`](./ProjectIndexerProgressMonitor.md))

### `updateIndex(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `cancelUpdateIndex()`

**Returns:** `void`

### `clearIndex()`

**Returns:** `void`

### `isIndexingInProgress()`

**Returns:** `boolean`

### `search(java.lang.String arg0, int arg1)`

**Returns:** `java.util.List<java.net.URL>`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)

### `search(ro.sync.exml.workspace.api.standalone.project.SearchOptions arg0, java.util.function.Predicate<java.lang.String> arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.project.SearchOptions`](./SearchOptions.md))
- `arg1` (`java.util.function.Predicate<java.lang.String>`)

### `searchInReusableComponents(java.lang.String arg0, int arg1)`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.standalone.project.IndexedReusableComponent>`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)

### `hasData()`

**Returns:** `boolean`

### `runAsync(java.lang.Runnable arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.Runnable`)

