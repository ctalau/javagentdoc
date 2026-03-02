# Interface: `LockHandlerFactoryPluginExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.LockHandlerFactoryPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `getLockHandler()`

**Returns:** [`ro.sync.exml.plugin.lock.LockHandler`](../lock/LockHandler.md)

Might be `null` if not 
 supported.

### `isLockingSupported(java.lang.String protocol)`

**Returns:** `boolean`

**Parameters:**
- `protocol` (`java.lang.String`): The URL protocol (like "http" or "file")

