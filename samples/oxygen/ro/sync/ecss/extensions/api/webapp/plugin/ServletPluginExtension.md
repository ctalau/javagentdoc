# Class: `ServletPluginExtension`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.ServletPluginExtension`

**Implements:** [`ro.sync.exml.plugin.PluginExtension`](../../../../../exml/plugin/PluginExtension.md)

## Description

To register the servlet you just have to declare an extension of type "WebappServlet"
 in the plugin's plugin.xml file. For example: 
  `<extension type="WebappServlet" class="com.domain.example.ServletPluginExtensionImpl"/>`
 
 
Web Author installs servlet extensions automatically, each one receiving requests from specific URLs 
 based on the path returned by the #getPath() method.
 
 
For example, if the Web Author is available at `https://example.com/oxygen-xml-web-author/` and
 the #getPath() method returns `custom-path`, the servlet handles requests for the
 URLs starting with: `https://example.com/oxygen-xml-web-author/plugins-dispatcher/custom-path/`.

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

**Type:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletConfig`](servlet/ServletConfig.md)

## Constructors

### `<init>()`

## Methods

### `getPath()`

**Returns:** `java.lang.String`

The path should be unique among other webapp servlet plugins paths
 and should contain only lower case letters or the '-' sign.
 
 Example: "plugin-path"

### `init([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletConfig`](servlet/ServletConfig.md) config)`

**Returns:** `void`

Consider overriding the #init() method instead. If you decide to override this one,
 call the super implementation.

### `init()`

**Returns:** `void`

### `service([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md) req, [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md) resp)`

**Returns:** `void`

### `doGet([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md) req, [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md) resp)`

**Returns:** `void`

### `doPost([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md) req, [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md) resp)`

**Returns:** `void`

### `doPut([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md) req, [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md) resp)`

**Returns:** `void`

### `doDelete([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md) req, [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md) resp)`

**Returns:** `void`

### `getServletConfig()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletConfig`](servlet/ServletConfig.md)

### `requiresAuthorization()`

**Returns:** `boolean`

