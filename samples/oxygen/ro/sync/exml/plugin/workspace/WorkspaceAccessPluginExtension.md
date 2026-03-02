# Interface: `WorkspaceAccessPluginExtension`

**Package:** [`ro.sync.exml.plugin.workspace`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.workspace.WorkspaceAccessPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `applicationStarted(ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace pluginWorkspaceAccess)`

**Returns:** `void`

Notified when the application is started.
 

 **IMPORTANT**: This method must not block, the plug-in can add its listeners or customize the main menu and then return.

**Parameters:**
- `pluginWorkspaceAccess` ([`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../../workspace/api/standalone/StandalonePluginWorkspace.md)): The workspace access

### `applicationClosing()`

**Returns:** `boolean`

You can reject the close.

