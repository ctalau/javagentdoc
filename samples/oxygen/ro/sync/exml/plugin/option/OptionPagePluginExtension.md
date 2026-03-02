# Class: `OptionPagePluginExtension`

**Package:** [`ro.sync.exml.plugin.option`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.option.OptionPagePluginExtension`

**Implements:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

It receives callbacks for
 saving options, restoring default options and loading options.
 The GUI for this option page must be built in order to associated the options
 with their corresponding GUI components.

## Constructors

### `<init>()`

## Methods

### `apply(ro.sync.exml.workspace.api.PluginWorkspace pluginWorkspace)`

**Returns:** `void`

All options associated with the option page must be saved on this method.

**Parameters:**
- `pluginWorkspace` ([`ro.sync.exml.workspace.api.PluginWorkspace`](../../workspace/api/PluginWorkspace.md)): Access the entire workspace of Oxygen. It can be used to
 retrieve the OptionsStorage and perform options save operations on it.

### `restoreDefaults()`

**Returns:** `void`

All options associated with the option page must be restored to their default values.

### `getTitle()`

**Returns:** `java.lang.String`

### `getKey()`

**Returns:** `java.lang.String`

Can be overridden in order to pass the returned value
 to ro.sync.exml.workspace.api.PluginWorkspace#showPreferencesPages(String[], String, boolean),
 which is used for displaying the preferences dialog with certain pages in the table of contents.

### `init(ro.sync.exml.workspace.api.PluginWorkspace pluginWorkspace)`

**Returns:** `javax.swing.JComponent`

checkboxes) 
 from the option stored in the options storage. (ro.sync.exml.workspace.api.PluginWorkspace.getOptionsStorage()).

 If certain settings can also be changed in other parts of the code, on the first "init" callback
  you can add an options storage listener (ro.sync.exml.workspace.api.options.WSOptionsStorage.addOptionListener(WSOptionListener)) 
  and update your UI's settings

 when the stored keys are changed in other parts of the code.

**Parameters:**
- `pluginWorkspace` ([`ro.sync.exml.workspace.api.PluginWorkspace`](../../workspace/api/PluginWorkspace.md)): Access the entire workspace of Oxygen. It can be used to
 retrieve the OptionsStorage and perform options save/load operations it.

### `getProjectLevelOptionKeys()`

**Returns:** `java.lang.String[]`

### `getHelpPageURL()`

**Returns:** `java.lang.String`

Use null if no help page is available for the dialog (no help is shown).

