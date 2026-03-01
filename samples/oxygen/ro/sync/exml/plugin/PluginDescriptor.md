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

### `getExtensions(`java.lang.String` key)`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription>`

Available extensions for the moment are: SELECTION_PROCESSOR & GENERAL_EXTENSION.

### `getExtensions()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription>`

### `addExtension(`ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription` descr)`

**Returns:** `void`

Available extensions for the moment are: SELECTION_PROCESSOR & GENERAL_EXTENSION.

### `addContextInstance(`java.lang.Object` contextInstance)`

**Returns:** `void`

### `getContextInstances()`

**Returns:** `java.util.List<java.lang.Object>`

### `getDescription()`

**Returns:** `java.lang.String`

### `setDescription(`java.lang.String` description)`

**Returns:** `void`

### `getName()`

**Returns:** `java.lang.String`

### `setName(`java.lang.String` name)`

**Returns:** `void`

### `setID(`java.lang.String` id)`

**Returns:** `void`

Empty string is treated as no ID.

### `getID()`

**Returns:** `java.lang.String`

### `getVendor()`

**Returns:** `java.lang.String`

### `setVendor(`java.lang.String` vendor)`

**Returns:** `void`

### `getVersion()`

**Returns:** `java.lang.String`

### `setVersion(`java.lang.String` version)`

**Returns:** `void`

### `isEnabledStatus()`

**Returns:** `boolean`

### `setEnabledStatus(`boolean` enabledStatus)`

**Returns:** `void`

### `isDisabledFromFile()`

**Returns:** `boolean`

### `setDisabledFromFile(`boolean` isDisabledFromFile)`

**Returns:** `void`

### `getBaseDir()`

**Returns:** `java.io.File`

### `setBaseDir(`java.io.File` baseDir)`

**Returns:** `void`

### `getConfigUrlPath()`

**Returns:** `java.lang.String`

### `setConfigUrlPath(`java.lang.String` configUrlPath)`

**Returns:** `void`

### `addPluginContributedView([`ro.sync.exml.plugin.PluginContributedView`](./PluginContributedView.md) viewInfo)`

**Returns:** `void`

### `getContributedViews()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginContributedView>`

### `addPluginContributedToolbar([`ro.sync.exml.plugin.PluginContributedToolbar`](./PluginContributedToolbar.md) toolbarInfo)`

**Returns:** `void`

### `getContributedToolbars()`

**Returns:** `java.util.List<ro.sync.exml.plugin.PluginContributedToolbar>`

### `shouldAcceptLicense()`

**Returns:** `boolean`

### `setShouldAcceptLicense(`boolean` shouldAcceptLicense)`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `getLicense()`

**Returns:** `java.lang.String`

### `setLicense(`java.lang.String` license)`

**Returns:** `void`

