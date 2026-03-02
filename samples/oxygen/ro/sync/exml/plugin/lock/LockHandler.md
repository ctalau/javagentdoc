# Interface: `LockHandler`

**Package:** [`ro.sync.exml.plugin.lock`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.lock.LockHandler`

## Description

## Methods

### `unlock(java.net.URL resource)`

**Returns:** `void`

**Parameters:**
- `resource` (`java.net.URL`): The URL to unlock

### `updateLock(java.net.URL resource, int timeoutSeconds)`

**Returns:** `void`

This will get called at the beginning to lock the resource and after that periodically.

**Parameters:**
- `resource` (`java.net.URL`): The URL to lock.
- `timeoutSeconds` (`int`): The timeout in seconds to set for the lock 
 (so that the lock expires after the timeout passes).
 The refresh on the lock is called about every (timeout/2) seconds.

