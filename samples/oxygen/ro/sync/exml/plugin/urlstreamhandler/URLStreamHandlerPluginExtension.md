# Interface: `URLStreamHandlerPluginExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.URLStreamHandlerPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md), [`ro.sync.exml.plugin.urlstreamhandler.URLStreamHandlerPluginExtensionConstants`](./URLStreamHandlerPluginExtensionConstants.md)

## Description

This plugin extension can provide URL stream handlers for multiple protocols, other than
 then ones handled by the application (like `file`, `http`,
 `ftp`, `sftp` or `https`).
 

 

 If it is necessary to impose the application stream URL handlers for 
 specific URLs with protocols like:`http`, `https`, 
 `ftp` or `sftp`, 
 the TargetedURLStreamHandlerPluginExtension can be used.

## Methods

### `getURLStreamHandler(java.lang.String protocol)`

**Returns:** `java.net.URLStreamHandler`

**Parameters:**
- `protocol` (`java.lang.String`): The name of the protocol.

