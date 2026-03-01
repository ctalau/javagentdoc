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

### `setUserContext([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md) arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `setContextId(`java.net.URL` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `getContextId([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md) arg0)`

**Returns:** `java.lang.String`

### `stripUrlContextId(`java.net.URL` arg0)`

**Returns:** `java.net.URL`

### `stripUrl(`java.net.URL` arg0)`

**Returns:** `java.net.URL`

### `getUrlContextId(`java.net.URL` arg0)`

**Returns:** `java.lang.String`

### `openConnection(`java.net.URL` arg0, `java.net.Proxy` arg1)`

**Returns:** `java.net.URLConnection`

### `openConnection(`java.net.URL` arg0)`

**Returns:** `java.net.URLConnection`

### `openConnectionInContext(`java.lang.String` arg0, `java.net.URL` arg1, `java.net.Proxy` arg2)`

**Returns:** `java.net.URLConnection`

### `hashCode(`java.net.URL` arg0)`

**Returns:** `int`

### `hostsEqual(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `boolean`

