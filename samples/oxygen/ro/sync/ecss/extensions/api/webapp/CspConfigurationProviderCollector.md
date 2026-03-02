# Class: `CspConfigurationProviderCollector`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.CspConfigurationProviderCollector`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `pluginAdditionalCspConfigurations`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.webapp.PluginCspConfiguration>`

### `collectedCspConfigurations`

**Type:** `java.util.List<java.util.Map<ro.sync.exml.plugin.workspace.security.CspDirective,java.util.List<java.lang.String>>>`

### `propertyListener`

**Type:** `ro.sync.options.d`

## Constructors

### `<init>()`

## Methods

### `getPluginCspConfigurations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.PluginCspConfiguration>`

### `getCollectedCspConfigurations()`

**Returns:** `java.util.List<java.util.Map<ro.sync.exml.plugin.workspace.security.CspDirective,java.util.List<java.lang.String>>>`

### `refreshCspConfigurations()`

**Returns:** `void`

### `cleanup()`

**Returns:** `void`

### `collectPluginCspConfigurations()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.PluginCspConfiguration>`

### `collectCspConfigurations(java.util.List<ro.sync.ecss.extensions.api.webapp.PluginCspConfiguration> arg0)`

**Returns:** `java.util.List<java.util.Map<ro.sync.exml.plugin.workspace.security.CspDirective,java.util.List<java.lang.String>>>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.webapp.PluginCspConfiguration>`)

