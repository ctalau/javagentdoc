# Class: `WebappServletPluginExtension`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.WebappServletPluginExtension`

**Implements:** [`ro.sync.exml.plugin.PluginExtension`](../../../../../exml/plugin/PluginExtension.md)

## Fields

### `METHOD_GET`

**Type:** `java.lang.Object`

### `METHOD_POST`

**Type:** `java.lang.Object`

### `METHOD_PUT`

**Type:** `java.lang.Object`

### `METHOD_DELETE`

**Type:** `java.lang.Object`

### `config`

**Type:** `javax.servlet.ServletConfig`

## Constructors

### `<init>()`

## Methods

### `init(javax.servlet.ServletConfig arg0)`

**Parameters:**
- `arg0` (`javax.servlet.ServletConfig`)

**Returns:** `void`

### `init()`

**Returns:** `void`

### `service(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `doGet(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `doPost(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `doPut(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `doDelete(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `getPath()`

**Returns:** `java.lang.String`

### `getServletConfig()`

**Returns:** `javax.servlet.ServletConfig`

### `requiresAuthorization()`

**Returns:** `boolean`

