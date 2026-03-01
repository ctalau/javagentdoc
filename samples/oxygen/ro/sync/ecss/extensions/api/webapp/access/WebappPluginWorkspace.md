# Interface: `WebappPluginWorkspace`

**Package:** [`ro.sync.ecss.extensions.api.webapp.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.access.WebappPluginWorkspace`

**Extends:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../../../../../exml/workspace/api/standalone/StandalonePluginWorkspace.md)

## Fields

### `restApiVersion`

**Type:** `java.lang.String`

### `OXYGEN_WEBAPP_DATA_DIR`

**Type:** `java.lang.String`

## Methods

### `addEditingSessionLifecycleListener([`ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener`](./WebappEditingSessionLifecycleListener.md) arg0)`

**Returns:** `void`

### `addDITAMapEditingSessionLifecycleListener([`ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener`](./WebappEditingSessionLifecycleListener.md) arg0)`

**Returns:** `void`

### `removeEditingSessionLifecycleListener([`ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener`](./WebappEditingSessionLifecycleListener.md) arg0)`

**Returns:** `void`

### `removeDITAMapEditingSessionLifecycleListener([`ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener`](./WebappEditingSessionLifecycleListener.md) arg0)`

**Returns:** `void`

### `getAllEditingSessionLifecycleListeners()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener>`

### `getAllDITAMapEditingSessionLifecycleListeners()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener>`

### `getServletFilters()`

**Returns:** `java.util.List<javax.servlet.Filter>`

### `getMonitoringStats()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `setDITAKeyDefinitionManagerProvider([`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManagerProvider`](../../../../../exml/workspace/api/editor/page/ditamap/keys/KeyDefinitionManagerProvider.md) arg0)`

**Returns:** `void`

### `getSessionStore()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.SessionStore`](../SessionStore.md)

