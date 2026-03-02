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

### `isSaveAllowed(URL arg0, int arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`int`)

**Returns:** `boolean`

### `isSaveAllowed(String arg0, URL arg1, int arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)
- `arg2` (`int`)

**Returns:** `boolean`

### `unlock(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `void`

### `unlock(String arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)

**Returns:** `void`

### `updateLock(URL arg0, int arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`int`)

**Returns:** `void`

### `updateLock(String arg0, URL arg1, int arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)
- `arg2` (`int`)

**Returns:** `void`

### `stripUrlContextId(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `getUrlContextId(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.lang.String`

