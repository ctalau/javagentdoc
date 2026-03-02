# Class: `PluginManager`

**Package:** [`ro.sync.exml.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.PluginManager`

**Implements:** [`ro.sync.exml.plugin.ExternalTransformerProvider`](./ExternalTransformerProvider.md), `ro.sync.util.editorvars.i`, `ro.sync.i18n.q`, [`ro.sync.exml.plugin.PluginConstants`](./PluginConstants.md)

## Fields

### `ub`

**Type:** `java.lang.String`

### `bc`

**Type:** `org.slf4j.Logger`

### `cc`

**Type:** [`ro.sync.exml.plugin.PluginManager`](./PluginManager.md)

### `qb`

**Type:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `pb`

**Type:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor>`

### `ac`

**Type:** `java.util.Map<java.lang.String,java.util.Map<java.lang.String,java.lang.Object>>`

### `yb`

**Type:** `java.lang.String`

### `zb`

**Type:** `java.util.List<java.io.File>`

### `xb`

**Type:** `boolean`

### `wb`

**Type:** `boolean`

### `nb`

**Type:** `java.util.concurrent.atomic.AtomicBoolean`

### `tb`

**Type:** `java.util.Map<java.lang.String,java.util.List<ro.sync.exml.plugin.Plugin>>`

### `sb`

**Type:** `java.util.List<ro.sync.exml.plugin.transform.XSLTTransformerPluginExtension>`

### `ob`

**Type:** `java.util.List<ro.sync.exml.plugin.transform.XQueryTransformerPluginExtension>`

### `vb`

**Type:** `java.util.Set<java.lang.String>`

### `rb`

**Type:** `java.util.List<java.lang.Exception>`

## Constructors

### `<init>()`

## Methods

### `setPluginsDir(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setUserPluginsDir(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getInstance()`

**Returns:** [`ro.sync.exml.plugin.PluginManager`](./PluginManager.md)

### `setInstanceFromTC(ro.sync.exml.plugin.PluginManager arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginManager`](./PluginManager.md))

### `getPlugins()`

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `getPluginDescriptors()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor>`

### `getAllPluginDirs()`

**Returns:** `java.util.List<java.io.File>`

### `getAllContributedViewIDs()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginContributedView>`

### `getDefaultPluginsDir()`

**Returns:** `java.lang.String`

### `disableLateDelegationCLForTests(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `getExceptions()`

**Returns:** `java.util.List<java.lang.String>`

### `clearExceptions()`

**Returns:** `void`

### `removePluginExceptions(java.lang.String arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getExceptionsWebapp()`

**Returns:** `java.util.List<java.util.Map<java.lang.String,java.lang.Object>>`

### `db()`

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `eb(java.io.File arg0, java.util.HashSet<java.lang.String> arg1, java.util.HashSet<java.lang.String> arg2, java.util.Set<java.lang.String> arg3)`

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.util.HashSet<java.lang.String>`)
- `arg2` (`java.util.HashSet<java.lang.String>`)
- `arg3` (`java.util.Set<java.lang.String>`)

### `l(ro.sync.exml.plugin.PluginDescriptor arg0, java.lang.ClassLoader arg1, java.lang.String arg2)`

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg1` (`java.lang.ClassLoader`)
- `arg2` (`java.lang.String`)

### `c(ro.sync.exml.plugin.PluginDescriptor arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

### `n(java.io.File arg0, boolean arg1)`

**Returns:** `org.w3c.dom.Document`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`boolean`)

### `o(org.w3c.dom.NodeList arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)

### `h(java.lang.String arg0, ro.sync.exml.plugin.PluginDescriptor arg1, java.util.Set<java.lang.String> arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.util.Set<java.lang.String>`)

### `i(org.w3c.dom.Element arg0, java.io.File arg1)`

**Returns:** `java.lang.ClassLoader`

**Parameters:**
- `arg0` (`org.w3c.dom.Element`)
- `arg1` (`java.io.File`)

### `p(ro.sync.exml.plugin.PluginDescriptor arg0, org.w3c.dom.NodeList arg1, java.lang.ClassLoader arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg1` (`org.w3c.dom.NodeList`)
- `arg2` (`java.lang.ClassLoader`)

### `m(org.w3c.dom.NodeList arg0, ro.sync.exml.plugin.PluginDescriptor arg1, java.lang.ClassLoader arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.lang.ClassLoader`)

### `s(java.lang.Class arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.Class`)

### `w(org.w3c.dom.NodeList arg0, java.io.File arg1)`

**Returns:** `java.util.List<java.net.URL>`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` (`java.io.File`)

### `q(org.w3c.dom.NodeList arg0, ro.sync.exml.plugin.PluginDescriptor arg1, java.util.HashSet<java.lang.String> arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.util.HashSet<java.lang.String>`)

### `g(java.lang.String arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` (`java.lang.String`)

### `j(org.w3c.dom.NodeList arg0, ro.sync.exml.plugin.PluginDescriptor arg1, java.util.HashSet<java.lang.String> arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.util.HashSet<java.lang.String>`)

### `x(ro.sync.exml.plugin.PluginDescriptor arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

### `createPluginClassLoader(java.net.URL[] arg0, java.lang.ClassLoader arg1, boolean arg2)`

**Returns:** `java.lang.ClassLoader`

**Parameters:**
- `arg0` (`java.net.URL[]`)
- `arg1` (`java.lang.ClassLoader`)
- `arg2` (`boolean`)

### `e(java.io.File arg0, org.w3c.dom.Element arg1)`

**Returns:** `java.net.URL[]`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`org.w3c.dom.Element`)

### `fb(java.io.File arg0, java.net.URL arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.net.URL`)

### `f(java.io.File arg0, java.lang.String arg1)`

**Returns:** `java.util.List<java.net.URL>`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)

### `ab(java.io.File arg0, java.net.URL arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.net.URL`)

### `r(java.io.File arg0, java.lang.String arg1)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)

### `bb(java.net.URL arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)

### `hasCustomURLHandlerPlugin(java.lang.String arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)

### `z(java.lang.String arg0)`

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getPluginsAlreadyLoadedExceptions()`

**Returns:** `java.util.List<java.lang.Exception>`

### `u(java.lang.String arg0, java.lang.Throwable arg1, ro.sync.exml.plugin.PluginDescriptor arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.Throwable`)
- `arg2` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

### `k()`

**Returns:** `java.util.List<java.io.File>`

### `pluginsUpdateInProgress()`

**Returns:** `boolean`

### `getAllContributedToolbarIDs()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginContributedToolbar>`

### `getXSLTTransformers()`

**Returns:** `java.util.List<ro.sync.exml.plugin.transform.XSLTTransformerPluginExtension>`

### `getXQueryTransformers()`

**Returns:** `java.util.List<ro.sync.exml.plugin.transform.XQueryTransformerPluginExtension>`

### `openConnectionWithTargetedURLHandler(java.net.URL arg0, java.net.Proxy arg1)`

**Returns:** `java.net.URLConnection`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.Proxy`)

### `gb(java.lang.String arg0, java.lang.Class[] arg1, java.lang.Object arg2)`

**Returns:** `java.lang.reflect.Method`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.Class[]`)
- `arg2` (`java.lang.Object`)

### `cb(ro.sync.exml.plugin.PluginDescriptor arg0, ro.sync.exml.plugin.PluginDescriptor arg1)`

**Returns:** `int`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

### `getPluginFolderLocation(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getExtraTranslationLanguageFiles()`

**Returns:** `java.io.File[]`

### `getPluginLicense(org.w3c.dom.Element arg0, java.io.File arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`org.w3c.dom.Element`)
- `arg1` (`java.io.File`)

### `createInstanceFromPlugins(java.lang.String arg0)`

**Returns:** `java.lang.Object`

**Parameters:**
- `arg0` (`java.lang.String`)

### `b(ro.sync.exml.plugin.Plugin arg0)`

**Returns:** `java.lang.ClassLoader`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.Plugin`](./Plugin.md))

### `y()`

**Returns:** `void`

### `getPluginID(java.io.File arg0)`

**Returns:** `java.util.Optional<java.lang.String>`

**Parameters:**
- `arg0` (`java.io.File`)

