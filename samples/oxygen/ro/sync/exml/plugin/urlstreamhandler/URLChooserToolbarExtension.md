# Interface: `URLChooserToolbarExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.URLChooserToolbarExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

Provides toolbar icon and toolbar tooltip for the button to be inserted in the "File" toolbar.
 When pressing the button, the `URLChooserPluginExtension`'s `chooseURL()`
 will be invoked.

## Methods

### `getToolbarIcon()`

The action will be placed in the "File" toolbar. Return `null`
 if the action should not be included in the toolbar.

**Returns:** `javax.swing.Icon`

### `getToolbarTooltip()`

If the tooltip is `null` but 
 there is an icon provided, the `URLChooserPluginExtension.getMenuName()` will be 
 used instead.

**Returns:** `java.lang.String`

