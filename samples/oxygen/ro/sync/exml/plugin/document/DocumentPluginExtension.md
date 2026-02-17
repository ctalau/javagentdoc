# Interface: `DocumentPluginExtension`

**Package:** [`ro.sync.exml.plugin.document`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.document.DocumentPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

The document plugin can be called from the contextual menu.
 The context containing the document is passed to the plugin process method
 and the result is processed by the editor.

## Methods

### `process([`ro.sync.exml.plugin.document.DocumentPluginContext`](./DocumentPluginContext.md) context)`

**Returns:** [`ro.sync.exml.plugin.document.DocumentPluginResult`](./DocumentPluginResult.md)

It receives the current context and it should
 return the processed content.

