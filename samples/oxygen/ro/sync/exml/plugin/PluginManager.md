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

### `setPluginsDir(`java.lang.String` arg0)`

**Returns:** `void`

### `setUserPluginsDir(`java.lang.String` arg0)`

**Returns:** `void`

### `getInstance()`

**Returns:** [`ro.sync.exml.plugin.PluginManager`](./PluginManager.md)

### `setInstanceFromTC([`ro.sync.exml.plugin.PluginManager`](./PluginManager.md) arg0)`

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

### `disableLateDelegationCLForTests(`boolean` arg0)`

**Returns:** `void`

### `getExceptions()`

**Returns:** `java.util.List<java.lang.String>`

### `clearExceptions()`

**Returns:** `void`

### `removePluginExceptions(`java.lang.String` arg0)`

**Returns:** `boolean`

### `getExceptionsWebapp()`

**Returns:** `java.util.List<java.util.Map<java.lang.String,java.lang.Object>>`

### `db()`

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `eb(`java.io.File` arg0, `java.util.HashSet<java.lang.String>` arg1, `java.util.HashSet<java.lang.String>` arg2, `java.util.Set<java.lang.String>` arg3)`

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

### `l([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg0, `java.lang.ClassLoader` arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.exml.plugin.Plugin`](./Plugin.md)

### `c([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg0)`

**Returns:** `boolean`

### `n(`java.io.File` arg0, `boolean` arg1)`

**Returns:** `org.w3c.dom.Document`

### `o(`org.w3c.dom.NodeList` arg0)`

**Returns:** `void`

### `h(`java.lang.String` arg0, [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg1, `java.util.Set<java.lang.String>` arg2)`

**Returns:** `void`

### `i(`org.w3c.dom.Element` arg0, `java.io.File` arg1)`

**Returns:** `java.lang.ClassLoader`

### `p([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg0, `org.w3c.dom.NodeList` arg1, `java.lang.ClassLoader` arg2)`

**Returns:** `void`

### `m(`org.w3c.dom.NodeList` arg0, [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg1, `java.lang.ClassLoader` arg2)`

**Returns:** `void`

### `s(`java.lang.Class` arg0)`

**Returns:** `boolean`

### `w(`org.w3c.dom.NodeList` arg0, `java.io.File` arg1)`

**Returns:** `java.util.List<java.net.URL>`

### `q(`org.w3c.dom.NodeList` arg0, [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg1, `java.util.HashSet<java.lang.String>` arg2)`

**Returns:** `void`

### `g(`java.lang.String` arg0)`

**Returns:** `int`

### `j(`org.w3c.dom.NodeList` arg0, [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg1, `java.util.HashSet<java.lang.String>` arg2)`

**Returns:** `void`

### `x([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg0)`

**Returns:** `boolean`

### `createPluginClassLoader(`java.net.URL[]` arg0, `java.lang.ClassLoader` arg1, `boolean` arg2)`

**Returns:** `java.lang.ClassLoader`

### `e(`java.io.File` arg0, `org.w3c.dom.Element` arg1)`

**Returns:** `java.net.URL[]`

### `fb(`java.io.File` arg0, `java.net.URL` arg1)`

**Returns:** `boolean`

### `f(`java.io.File` arg0, `java.lang.String` arg1)`

**Returns:** `java.util.List<java.net.URL>`

### `ab(`java.io.File` arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `r(`java.io.File` arg0, `java.lang.String` arg1)`

**Returns:** `java.net.URL`

### `bb(`java.net.URL` arg0)`

**Returns:** `void`

### `hasCustomURLHandlerPlugin(`java.lang.String` arg0)`

**Returns:** `boolean`

### `z(`java.lang.String` arg0)`

**Returns:** `java.util.List<ro.sync.exml.plugin.Plugin>`

### `getPluginsAlreadyLoadedExceptions()`

**Returns:** `java.util.List<java.lang.Exception>`

### `u(`java.lang.String` arg0, `java.lang.Throwable` arg1, [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg2)`

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

### `openConnectionWithTargetedURLHandler(`java.net.URL` arg0, `java.net.Proxy` arg1)`

**Returns:** `java.net.URLConnection`

### `gb(`java.lang.String` arg0, `java.lang.Class[]` arg1, `java.lang.Object` arg2)`

**Returns:** `java.lang.reflect.Method`

### `cb([`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg0, [`ro.sync.exml.plugin.PluginDescriptor`](./PluginDescriptor.md) arg1)`

**Returns:** `int`

### `getPluginFolderLocation(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `getExtraTranslationLanguageFiles()`

**Returns:** `java.io.File[]`

### `getPluginLicense(`org.w3c.dom.Element` arg0, `java.io.File` arg1)`

**Returns:** `java.lang.String`

### `createInstanceFromPlugins(`java.lang.String` arg0)`

**Returns:** `java.lang.Object`

### `b([`ro.sync.exml.plugin.Plugin`](./Plugin.md) arg0)`

**Returns:** `java.lang.ClassLoader`

### `y()`

**Returns:** `void`

### `getPluginID(`java.io.File` arg0)`

**Returns:** `java.util.Optional<java.lang.String>`

