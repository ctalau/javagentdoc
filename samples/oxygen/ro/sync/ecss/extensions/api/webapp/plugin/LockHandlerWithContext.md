# Class: `LockHandlerWithContext`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.LockHandlerWithContext`

**Extends:** [`ro.sync.exml.plugin.lock.LockHandlerBase`](../../../../../exml/plugin/lock/LockHandlerBase.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `isSaveAllowed(java.net.URL arg0, int arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`int`)

**Returns:** `boolean`

### `isSaveAllowed(java.lang.String arg0, java.net.URL arg1, int arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)
- `arg2` (`int`)

**Returns:** `boolean`

### `unlock(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `void`

### `unlock(java.lang.String arg0, java.net.URL arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)

**Returns:** `void`

### `updateLock(java.net.URL arg0, int arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`int`)

**Returns:** `void`

### `updateLock(java.lang.String arg0, java.net.URL arg1, int arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)
- `arg2` (`int`)

**Returns:** `void`

### `stripUrlContextId(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `getUrlContextId(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.lang.String`

