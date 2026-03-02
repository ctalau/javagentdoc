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

### `setUserContext(UserContext arg0, URL arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md))
- `arg1` (`java.net.URL`)

**Returns:** `void`

### `setContextId(URL arg0, String arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `getContextId(UserContext arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md))

**Returns:** `java.lang.String`

### `stripUrlContextId(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `stripUrl(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URL`

### `getUrlContextId(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.lang.String`

### `openConnection(URL arg0, Proxy arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.Proxy`)

**Returns:** `java.net.URLConnection`

### `openConnection(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.net.URLConnection`

### `openConnectionInContext(String arg0, URL arg1, Proxy arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.Proxy`)

**Returns:** `java.net.URLConnection`

### `hashCode(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `int`

### `hostsEqual(URL arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

**Returns:** `boolean`

