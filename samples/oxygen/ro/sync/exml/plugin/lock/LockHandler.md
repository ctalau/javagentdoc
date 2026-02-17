# Interface: `LockHandler`

**Package:** [`ro.sync.exml.plugin.lock`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.lock.LockHandler`

## Description

## Methods

### `unlock(`java.net.URL` resource)`

**Returns:** `void`

### `updateLock(`java.net.URL` resource, `int` timeoutSeconds)`

**Returns:** `void`

This will get called at the beginning to lock the resource and after that periodically.

