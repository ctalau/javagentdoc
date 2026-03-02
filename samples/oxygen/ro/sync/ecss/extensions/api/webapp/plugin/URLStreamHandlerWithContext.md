# Class: `URLStreamHandlerWithContext`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.URLStreamHandlerWithContext`

**Extends:** `java.net.URLStreamHandler`

## Fields

### `FAKE_ORIGIN`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `setUserContext(ro.sync.ecss.extensions.api.webapp.plugin.UserContext arg0, java.net.URL arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md))
- `arg1` (`java.net.URL`)

### `setContextId(java.net.URL arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

### `getContextId(ro.sync.ecss.extensions.api.webapp.plugin.UserContext arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md))

### `stripUrlContextId(java.net.URL arg0)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)

### `stripUrl(java.net.URL arg0)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getUrlContextId(java.net.URL arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.net.URL`)

### `openConnection(java.net.URL arg0, java.net.Proxy arg1)`

**Returns:** `java.net.URLConnection`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.Proxy`)

### `openConnection(java.net.URL arg0)`

**Returns:** `java.net.URLConnection`

**Parameters:**
- `arg0` (`java.net.URL`)

### `openConnectionInContext(java.lang.String arg0, java.net.URL arg1, java.net.Proxy arg2)`

**Returns:** `java.net.URLConnection`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.Proxy`)

### `hashCode(java.net.URL arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` (`java.net.URL`)

### `hostsEqual(java.net.URL arg0, java.net.URL arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

