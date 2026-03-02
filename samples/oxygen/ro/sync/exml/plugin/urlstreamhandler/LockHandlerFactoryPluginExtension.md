# Interface: `LockHandlerFactoryPluginExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.LockHandlerFactoryPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `getLockHandler()`

Might be `null` if not 
 supported.

**Returns:** [`ro.sync.exml.plugin.lock.LockHandler`](../lock/LockHandler.md)

### `isLockingSupported(java.lang.String protocol)`

**Parameters:**
- `protocol` (`java.lang.String`): The URL protocol (like "http" or "file")

**Returns:** `boolean`

