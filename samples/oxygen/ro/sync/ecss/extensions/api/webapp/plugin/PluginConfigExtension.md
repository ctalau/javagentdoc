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

### `doGet(HttpServletRequest arg0, HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `doPut(HttpServletRequest arg0, HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `doDelete(HttpServletRequest arg0, HttpServletResponse arg1)`

**Parameters:**
- `arg0` (`javax.servlet.http.HttpServletRequest`)
- `arg1` (`javax.servlet.http.HttpServletResponse`)

**Returns:** `void`

### `getOption(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `setOption(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `saveOptions()`

**Returns:** `void`

### `getDefaultOptions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `setDefaultOptions(Map<String,String> arg0)`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.lang.String>`)

**Returns:** `void`

### `getOptionsForm()`

**Returns:** `java.lang.String`

### `getOptionsJson()`

**Returns:** `java.lang.String`

### `requiresAuthorization()`

**Returns:** `boolean`

### `serializeMapToJSON(Map<String,Object> arg0)`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.lang.Object>`)

**Returns:** `java.lang.String`

