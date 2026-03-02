# Interface: `SelectionPluginExtension`

**Package:** [`ro.sync.exml.plugin.selection`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.selection.SelectionPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

This is intended to work as follows: the user makes a selection in the editor
 and then goes to the contextual menu and selects from the Plugins entry one of the available
 plugin modules. The context containing the selection is passed to the process plugin method
 and the result is processed by the editor eventually replacing the selection.
 Of course other ways of calling the plugins can be found, like a Plugins main menu for instance.

## Methods

### `process(SelectionPluginContext context)`

It receives the current context and it should
 return the processed content.

**Parameters:**
- `context` ([`ro.sync.exml.plugin.selection.SelectionPluginContext`](./SelectionPluginContext.md)): The context the plugin was invoked in.

**Returns:** [`ro.sync.exml.plugin.selection.SelectionPluginResult`](./SelectionPluginResult.md)

