# Class: `PluginConfigExtension`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.PluginConfigExtension`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.plugin.WebappServletPluginExtension`](./WebappServletPluginExtension.md)

## Fields

### `defaultOptions`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `optionsStorage`

**Type:** [`ro.sync.exml.workspace.api.options.WSOptionsStorage`](../../../../../exml/workspace/api/options/WSOptionsStorage.md)

## Constructors

### `<init>()`

## Methods

### `getPath()`

**Returns:** `java.lang.String`

### `init()`

**Returns:** `void`

### `doGet(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

### `doPut(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

### `doDelete(javax.servlet.http.HttpServletRequest arg0, javax.servlet.http.HttpServletResponse arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

### `getOption(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `setOption(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `saveOptions()`

**Returns:** `void`

### `getDefaultOptions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `setDefaultOptions(java.util.Map<java.lang.String,java.lang.String> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.lang.String>`)

### `getOptionsForm()`

**Returns:** `java.lang.String`

### `getOptionsJson()`

**Returns:** `java.lang.String`

### `requiresAuthorization()`

**Returns:** `boolean`

### `serializeMapToJSON(java.util.Map<java.lang.String,java.lang.Object> arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.lang.Object>`)

