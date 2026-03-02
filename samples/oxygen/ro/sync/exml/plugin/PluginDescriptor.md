# Class: `PluginDescriptor`

**Package:** [`ro.sync.exml.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.PluginDescriptor`

## Description

A plugin is characterised by:

    - name          The plugin name as it will appear in the oXygen menus.

    - description   A short description of what the plugin does.

    - vendor        The name of the vendor.

    - version       The current version.

    - baseDir       The base dir used for file crreation.

    - extensions    A set of extensions.

## Fields

### `WEBAPP_CSS_RESOURCE`

**Type:** `java.lang.String`

### `SELECTION_PROCESSOR`

**Type:** `java.lang.String`

### `WEBAPP_SERVLET_FILTER`

**Type:** `java.lang.String`

### `WEBAPP_SERVLET`

**Type:** `java.lang.String`

### `WEBAPP_STATIC_RESOURCE_FOL`

**Type:** `java.lang.String`

### `GENERAL_EXTENSION`

**Type:** `java.lang.String`

### `DOCUMENT_PROCESSOR`

**Type:** `java.lang.String`

### `URL_STREAM_HANDLER`

**Type:** `java.lang.String`

### `URL_HANDLER`

**Type:** `java.lang.String`

### `TARGETED_URL_HANDLER`

**Type:** `java.lang.String`

### `TRANSFORMER`

**Type:** `java.lang.String`

### `XQUERY_TRANSFORMER`

**Type:** `java.lang.String`

### `URL_CHOOSER`

**Type:** `java.lang.String`

### `URL_CHOOSER_TOOLBAR`

**Type:** `java.lang.String`

### `COMPONENTS_VALIDATOR_EXTENSION`

**Type:** `java.lang.String`

### `OPEN_REDIRECTOR`

**Type:** `java.lang.String`

### `WORKSPACE_ACCESS`

**Type:** `java.lang.String`

### `WORKSPACE_ACCESS_JS`

**Type:** `java.lang.String`

### `WORKSPACE_ACCESS_JS_MODULE`

**Type:** `java.lang.String`

### `OPTION_PAGE`

**Type:** `java.lang.String`

### `OPTION_PAGE_GROUP`

**Type:** `java.lang.String`

### `GENERAL_STYLES_FILTER`

**Type:** `java.lang.String`

This filter will be used to filter CSS styles
 for any document presented in author mode.

### `LOCK_HANDLER_FACTORY`

**Type:** `java.lang.String`

### `REFACTORING_OPERATIONS_PROVIDER`

**Type:** `java.lang.String`

### `ADDITIONAL_DITA_OT`

**Type:** `java.lang.String`

### `ADDITIONAL_XPROC_ENGINE`

**Type:** `java.lang.String`

### `AUTHOR_STYLESHEET`

**Type:** `java.lang.String`

### `ADDITIONAL_FRAMEWORKS`

**Type:** `java.lang.String`

### `ADDITIONAL_UI_TRANSLATIONS`

**Type:** `java.lang.String`

### `TRUSTED_HOSTS`

**Type:** `java.lang.String`

### `CSP`

**Type:** `java.lang.String`

### `DOCUMENT_VALIDATOR`

**Type:** `java.lang.String`

### `AI_FUNCTIONS`

**Type:** `java.lang.String`

### `AI_CONNECTORS`

**Type:** `java.lang.String`

### `CONFIGURATION_OPTIONS_PROVIDER`

**Type:** `java.lang.String`

### `extensions`

**Type:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription>`

### `contextInstances`

**Type:** `java.util.List<java.lang.Object>`

### `description`

**Type:** `java.lang.String`

### `name`

**Type:** `java.lang.String`

### `vendor`

**Type:** `java.lang.String`

### `version`

**Type:** `java.lang.String`

### `enabledStatus`

**Type:** `boolean`

### `isDisabledFromFile`

**Type:** `boolean`

`false`
 otherwise.

### `baseDir`

**Type:** `java.io.File`

### `configUrlPath`

**Type:** `java.lang.String`

### `contributedViews`

**Type:** `java.util.List<ro.sync.exml.plugin.PluginContributedView>`

### `contributedToolbars`

**Type:** `java.util.List<ro.sync.exml.plugin.PluginContributedToolbar>`

### `id`

**Type:** `java.lang.String`

### `shouldAcceptLicense`

**Type:** `boolean`

### `license`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `getExtensions(java.lang.String key)`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription>`

Available extensions for the moment are: SELECTION_PROCESSOR & GENERAL_EXTENSION.

**Parameters:**
- `key` (`java.lang.String`): The extension key.

### `getExtensions()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription>`

### `addExtension(ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription descr)`

**Returns:** `void`

Available extensions for the moment are: SELECTION_PROCESSOR & GENERAL_EXTENSION.

**Parameters:**
- `descr` (`ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription`): The plugin extension description.

### `addContextInstance(java.lang.Object contextInstance)`

**Returns:** `void`

**Parameters:**
- `contextInstance` (`java.lang.Object`): a context instance.

### `getContextInstances()`

**Returns:** `java.util.List<java.lang.Object>`

### `getDescription()`

**Returns:** `java.lang.String`

### `setDescription(java.lang.String description)`

**Returns:** `void`

**Parameters:**
- `description` (`java.lang.String`): The description of the plugin.

### `getName()`

**Returns:** `java.lang.String`

### `setName(java.lang.String name)`

**Returns:** `void`

**Parameters:**
- `name` (`java.lang.String`): The name of the plugin.

### `setID(java.lang.String id)`

**Returns:** `void`

Empty string is treated as no ID.

**Parameters:**
- `id` (`java.lang.String`): ID of the plugin.

### `getID()`

**Returns:** `java.lang.String`

### `getVendor()`

**Returns:** `java.lang.String`

### `setVendor(java.lang.String vendor)`

**Returns:** `void`

**Parameters:**
- `vendor` (`java.lang.String`): The vendor of the plugin.

### `getVersion()`

**Returns:** `java.lang.String`

### `setVersion(java.lang.String version)`

**Returns:** `void`

**Parameters:**
- `version` (`java.lang.String`): The version of the plugin.

### `isEnabledStatus()`

**Returns:** `boolean`

### `setEnabledStatus(boolean enabledStatus)`

**Returns:** `void`

**Parameters:**
- `enabledStatus` (`boolean`): `true` if the plugin is enabled. 
 `false` if the plugin is disabled.

### `isDisabledFromFile()`

**Returns:** `boolean`

### `setDisabledFromFile(boolean isDisabledFromFile)`

**Returns:** `void`

**Parameters:**
- `isDisabledFromFile` (`boolean`): The `true` if the plugin
 is disabled using 'plugin.disable' file.

### `getBaseDir()`

**Returns:** `java.io.File`

### `setBaseDir(java.io.File baseDir)`

**Returns:** `void`

**Parameters:**
- `baseDir` (`java.io.File`): The base dir of the plugin.

### `getConfigUrlPath()`

**Returns:** `java.lang.String`

### `setConfigUrlPath(java.lang.String configUrlPath)`

**Returns:** `void`

**Parameters:**
- `configUrlPath` (`java.lang.String`): The configUrl to set.

### `addPluginContributedView(ro.sync.exml.plugin.PluginContributedView viewInfo)`

**Returns:** `void`

**Parameters:**
- `viewInfo` ([`ro.sync.exml.plugin.PluginContributedView`](./PluginContributedView.md)): Information about the view

### `getContributedViews()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginContributedView>`

### `addPluginContributedToolbar(ro.sync.exml.plugin.PluginContributedToolbar toolbarInfo)`

**Returns:** `void`

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.plugin.PluginContributedToolbar`](./PluginContributedToolbar.md)): Information about the new toolbar.

### `getContributedToolbars()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginContributedToolbar>`

### `shouldAcceptLicense()`

**Returns:** `boolean`

### `setShouldAcceptLicense(boolean shouldAcceptLicense)`

**Returns:** `void`

**Parameters:**
- `shouldAcceptLicense` (`boolean`): The shouldAcceptLicense to set.

### `toString()`

**Returns:** `java.lang.String`

### `getLicense()`

**Returns:** `java.lang.String`

### `setLicense(java.lang.String license)`

**Returns:** `void`

**Parameters:**
- `license` (`java.lang.String`): The license to set.

