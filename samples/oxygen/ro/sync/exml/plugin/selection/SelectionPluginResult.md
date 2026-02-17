# Interface: `SelectionPluginResult`

**Package:** [`ro.sync.exml.plugin.selection`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.selection.SelectionPluginResult`

## Description

Provides the plugin processed data.

## Methods

### `getProcessedSelection()`

**Returns:** `java.lang.String`

The string can also contain editor variables available also to Oxygen code templates like ${caret} to position the caret at a certain location
 or ${selection} to surround the current selection with the processed string.

