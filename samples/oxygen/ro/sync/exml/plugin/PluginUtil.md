# Class: `PluginUtil`

**Package:** [`ro.sync.exml.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.PluginUtil`

## Fields

### `b`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `isPluginInstalled(String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** `boolean`

### `getPlugin(String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

### `getPluginDescriptor(String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md)

### `getPluginDirs()`

**Returns:** `java.util.List<java.io.File>`

### `getDefaultPluginsDir()`

**Returns:** `java.util.Optional<java.lang.String>`

### `getUserPrefsPluginsDir()`

**Returns:** `java.io.File`

### `getUserPrefsPluginsDirs()`

**Returns:** `java.io.File[]`

### `addPluginStylesFilters(StylesFilter arg0, AuthorAccess arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.StylesFilter`](../../ecss/extensions/api/StylesFilter.md))
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.StylesFilter`](../../ecss/extensions/api/StylesFilter.md)

### `compareVersions(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `int`

