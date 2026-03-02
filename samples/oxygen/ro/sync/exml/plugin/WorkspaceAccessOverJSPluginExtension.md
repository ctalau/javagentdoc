# Class: `WorkspaceAccessOverJSPluginExtension`

**Package:** [`ro.sync.exml.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.WorkspaceAccessOverJSPluginExtension`

**Implements:** [`ro.sync.exml.plugin.workspace.WorkspaceAccessPluginExtension`](workspace/WorkspaceAccessPluginExtension.md)

## Fields

### `ncz`

**Type:** `org.slf4j.Logger`

### `ocz`

**Type:** `java.util.List<java.net.URL>`

### `mcz`

**Type:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../workspace/api/standalone/StandalonePluginWorkspace.md)

## Constructors

### `<init>(List<URL> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.net.URL>`)

## Methods

### `applicationStarted(StandalonePluginWorkspace arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../workspace/api/standalone/StandalonePluginWorkspace.md))

**Returns:** `void`

### `callFunction(StandalonePluginWorkspace arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../workspace/api/standalone/StandalonePluginWorkspace.md))
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

**Returns:** `java.lang.Object`

### `applicationClosing()`

**Returns:** `boolean`

