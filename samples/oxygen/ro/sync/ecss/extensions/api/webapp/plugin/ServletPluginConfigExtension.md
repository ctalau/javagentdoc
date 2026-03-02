# Class: `ServletPluginConfigExtension`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.ServletPluginConfigExtension`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.plugin.ServletPluginExtension`](./ServletPluginExtension.md)

## Description

For common use-cases, 
 only the abstract methods should be implemented/overridden.
 
 
 
This class creates an HTML form that will be presented in the Administration Page to the user 
 to configure some options. The options will be applied for all the users. 
 
 
These options can be read from the server-side code like in the code snippet below:
 `PluginWorkspaceProvider.getPluginWorkspace().getOptionsStorage().getOption("option_name", "default_value");` 
 
 
 
The options can be read from client-side like in the code snippet below:
 `sync.options.PluginsOptions.getClientOption('option_name');`
 
 
 

 *Make sure to call super.init() in the extended class otherwise you won't be able to manipulate the options.*

## Fields

### `defaultOptions`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `optionsStorage`

**Type:** [`ro.sync.exml.workspace.api.options.WSOptionsStorage`](../../../../../exml/workspace/api/options/WSOptionsStorage.md)

## Constructors

### `<init>()`

## Methods

### `getPath()`

The path should be unique among other webapp servlet plugins paths and not an empty String.
 and should contain only lower case letters or the '-' sign.
 
 Example: "plugin-path".

**Returns:** `java.lang.String`

### `init()`

**Returns:** `void`

### `doGet(HttpServletRequest req, HttpServletResponse resp)`

**Parameters:**
- `req` ([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md)): The HTTP request
- `resp` ([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md)): The HTTP response

**Returns:** `void`

### `doPut(HttpServletRequest req, HttpServletResponse resp)`

Derived methods should use setOption in this method. And afterwards call saveOptions().

**Parameters:**
- `req` ([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md)): The HTTP request object
- `resp` ([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md)): The HTTP response object

**Returns:** `void`

### `doDelete(HttpServletRequest req, HttpServletResponse resp)`

It sets the options back to their defaults and saves them on disk.
 

 
In derived classes return your plugin to the default options and call the super method to
 set the options to the default values and save them on disk.

**Parameters:**
- `req` ([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`](servlet/http/HttpServletRequest.md)): The HTTP request object
- `resp` ([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`](servlet/http/HttpServletResponse.md)): The HTTP response object

**Returns:** `void`

### `getOption(String key, String defaultValue)`

**Parameters:**
- `key` (`java.lang.String`): The key for the option to return
- `defaultValue` (`java.lang.String`): The value to return if the key doesn't exist

**Returns:** `java.lang.String`

### `getSecretOption(String key, String defaultValue)`

**Parameters:**
- `key` (`java.lang.String`)
- `defaultValue` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getOrMigrateSecretOption(String key, String defaultValue)`

If no encrypted option is found,
 it falls back to a non-encrypted value, encrypts it, saves it securely, and removes 
 the non-encrypted version.

**Parameters:**
- `key` (`java.lang.String`): The key for the option.
- `defaultValue` (`java.lang.String`): The default value to return if no option is found.

**Returns:** `java.lang.String`

### `setOption(String key, String value)`

**Parameters:**
- `key` (`java.lang.String`): The key of the option to set
- `value` (`java.lang.String`): The value of the option to set

**Returns:** `void`

### `setSecretOption(String key, String value)`

**Parameters:**
- `key` (`java.lang.String`): The key of the option to set
- `value` (`java.lang.String`): The value of the secret option to set

**Returns:** `void`

### `saveOptions()`

**Returns:** `void`

### `getDefaultOptions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `setDefaultOptions(Map<String,String> defaultOptions)`

If you want the default values for your options to be empty/null make 
 sure to set them as empty/null, don't leave them out of the defaultOptions map.

**Parameters:**
- `defaultOptions` (`java.util.Map<java.lang.String,java.lang.String>`): the defaultOptions to set

**Returns:** `void`

### `getOptionsForm()`

The form inputs name attribute should be the option name.

**Returns:** `java.lang.String`

### `getOptionsJson()`

These options will be available for all type of users so you should
  not include sensitive options that should require authorization.

**Returns:** `java.lang.String`

### `requiresAuthorization()`

**Returns:** `boolean`

### `serializeMapToJSON(Map<String,Object> map)`

**Parameters:**
- `map` (`java.util.Map<java.lang.String,java.lang.Object>`): the map to serialize to JSON string.

**Returns:** `java.lang.String`

