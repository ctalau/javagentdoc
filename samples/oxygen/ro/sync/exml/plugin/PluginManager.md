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

### `setPluginsDir(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setUserPluginsDir(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getInstance()`

**Returns:** [`ro.sync.exml.plugin.PluginManager`](./PluginManager.md)

### `setInstanceFromTC(PluginManager arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginManager`](./PluginManager.md))

**Returns:** `void`

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

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `getExceptions()`

**Returns:** `java.util.List<java.lang.String>`

### `clearExceptions()`

**Returns:** `void`

### `removePluginExceptions(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `boolean`

### `getExceptionsWebapp()`

**Returns:** `java.util.List<java.util.Map<java.lang.String,java.lang.Object>>`

### `db()`

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `eb(File arg0, HashSet<String> arg1, HashSet<String> arg2, Set<String> arg3)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.util.HashSet<java.lang.String>`)
- `arg2` (`java.util.HashSet<java.lang.String>`)
- `arg3` (`java.util.Set<java.lang.String>`)

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

### `l(PluginDescriptor arg0, ClassLoader arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg1` (`java.lang.ClassLoader`)
- `arg2` (`java.lang.String`)

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

### `c(PluginDescriptor arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

**Returns:** `boolean`

### `n(File arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`boolean`)

**Returns:** `org.w3c.dom.Document`

### `o(NodeList arg0)`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)

**Returns:** `void`

### `h(String arg0, PluginDescriptor arg1, Set<String> arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.util.Set<java.lang.String>`)

**Returns:** `void`

### `i(Element arg0, File arg1)`

**Parameters:**
- `arg0` (`org.w3c.dom.Element`)
- `arg1` (`java.io.File`)

**Returns:** `java.lang.ClassLoader`

### `p(PluginDescriptor arg0, NodeList arg1, ClassLoader arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg1` (`org.w3c.dom.NodeList`)
- `arg2` (`java.lang.ClassLoader`)

**Returns:** `void`

### `m(NodeList arg0, PluginDescriptor arg1, ClassLoader arg2)`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.lang.ClassLoader`)

**Returns:** `void`

### `s(Class arg0)`

**Parameters:**
- `arg0` (`java.lang.Class`)

**Returns:** `boolean`

### `w(NodeList arg0, File arg1)`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` (`java.io.File`)

**Returns:** `java.util.List<java.net.URL>`

### `q(NodeList arg0, PluginDescriptor arg1, HashSet<String> arg2)`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.util.HashSet<java.lang.String>`)

**Returns:** `void`

### `g(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `int`

### `j(NodeList arg0, PluginDescriptor arg1, HashSet<String> arg2)`

**Parameters:**
- `arg0` (`org.w3c.dom.NodeList`)
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg2` (`java.util.HashSet<java.lang.String>`)

**Returns:** `void`

### `x(PluginDescriptor arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

**Returns:** `boolean`

### `createPluginClassLoader(URL[] arg0, ClassLoader arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.net.URL[]`)
- `arg1` (`java.lang.ClassLoader`)
- `arg2` (`boolean`)

**Returns:** `java.lang.ClassLoader`

### `e(File arg0, Element arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`org.w3c.dom.Element`)

**Returns:** `java.net.URL[]`

### `fb(File arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.net.URL`)

**Returns:** `boolean`

### `f(File arg0, String arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)

**Returns:** `java.util.List<java.net.URL>`

### `ab(File arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.net.URL`)

**Returns:** `void`

### `r(File arg0, String arg1)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)

**Returns:** `java.net.URL`

### `bb(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `void`

### `hasCustomURLHandlerPlugin(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `boolean`

### `z(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `getPluginsAlreadyLoadedExceptions()`

**Returns:** `java.util.List<java.lang.Exception>`

### `u(String arg0, Throwable arg1, PluginDescriptor arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.Throwable`)
- `arg2` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

**Returns:** `void`

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

### `openConnectionWithTargetedURLHandler(URL arg0, Proxy arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.Proxy`)

**Returns:** `java.net.URLConnection`

### `gb(String arg0, Class[] arg1, Object arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.Class[]`)
- `arg2` (`java.lang.Object`)

**Returns:** `java.lang.reflect.Method`

### `cb(PluginDescriptor arg0, PluginDescriptor arg1)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))
- `arg1` ([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md))

**Returns:** `int`

### `getPluginFolderLocation(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getExtraTranslationLanguageFiles()`

**Returns:** `java.io.File[]`

### `getPluginLicense(Element arg0, File arg1)`

**Parameters:**
- `arg0` (`org.w3c.dom.Element`)
- `arg1` (`java.io.File`)

**Returns:** `java.lang.String`

### `createInstanceFromPlugins(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.Object`

### `b(Plugin arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.plugin.Plugin`](./Plugin.md))

**Returns:** `java.lang.ClassLoader`

### `y()`

**Returns:** `void`

### `getPluginID(File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `java.util.Optional<java.lang.String>`

