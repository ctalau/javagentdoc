# Interface: `ProjectIndexer`

**Package:** [`ro.sync.exml.workspace.api.standalone.project`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.project.ProjectIndexer`

## Methods

### `addProgressMonitor(ProjectIndexerProgressMonitor arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`](./ProjectIndexerProgressMonitor.md))

**Returns:** `void`

### `removeProgressMonitor(ProjectIndexerProgressMonitor arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.project.ProjectIndexerProgressMonitor`](./ProjectIndexerProgressMonitor.md))

**Returns:** `void`

### `updateIndex(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `cancelUpdateIndex()`

**Returns:** `void`

### `clearIndex()`

**Returns:** `void`

### `isIndexingInProgress()`

**Returns:** `boolean`

### `search(String arg0, int arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)

**Returns:** `java.util.List<java.net.URL>`

### `search(SearchOptions arg0, Predicate<String> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.project.SearchOptions`](./SearchOptions.md))
- `arg1` (`java.util.function.Predicate<java.lang.String>`)

**Returns:** `java.lang.String`

### `searchInReusableComponents(String arg0, int arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)

**Returns:** `java.util.List<ro.sync.exml.workspace.api.standalone.project.IndexedReusableComponent>`

### `hasData()`

**Returns:** `boolean`

### `runAsync(Runnable arg0)`

**Parameters:**
- `arg0` (`java.lang.Runnable`)

**Returns:** `void`

