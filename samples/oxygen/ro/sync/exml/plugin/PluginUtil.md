# Class: `PluginUtil`

**Package:** [`ro.sync.exml.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.PluginUtil`

## Fields

### `b`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `isPluginInstalled(java.lang.String[] arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `getPlugin(java.lang.String[] arg0)`

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `getPluginDescriptor(java.lang.String[] arg0)`

**Returns:** [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md)

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `getPluginDirs()`

**Returns:** `java.util.List<java.io.File>`

### `getDefaultPluginsDir()`

**Returns:** `java.util.Optional<java.lang.String>`

### `getUserPrefsPluginsDir()`

**Returns:** `java.io.File`

### `getUserPrefsPluginsDirs()`

**Returns:** `java.io.File[]`

### `addPluginStylesFilters(ro.sync.ecss.extensions.api.StylesFilter arg0, ro.sync.ecss.extensions.api.AuthorAccess arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.StylesFilter`](../../ecss/extensions/api/StylesFilter.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.StylesFilter`](../../ecss/extensions/api/StylesFilter.md))
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md))

### `compareVersions(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `int`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

