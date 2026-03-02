# Class: `SelectionPluginResultImpl`

**Package:** [`ro.sync.exml.plugin.selection`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.selection.SelectionPluginResultImpl`

**Implements:** [`ro.sync.exml.plugin.selection.SelectionPluginResult`](./SelectionPluginResult.md)

## Description

## Fields

### `selection`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(String selection)`

**Parameters:**
- `selection` (`java.lang.String`): The processed selection.
   The string can also contain editor variables available also to Oxygen code templates like ${caret} to position the caret at a certain location
   or ${selection} to surround the current selection with the processed string.

## Methods

### `setProcessedSelection(String selection)`

The string can also contain editor variables available also to Oxygen code templates like ${caret} to position the caret at a certain location
 or ${selection} to surround the current selection with the processed string.

**Parameters:**
- `selection` (`java.lang.String`): The current selection.

**Returns:** `void`

### `getProcessedSelection()`

The string can also contain editor variables available also to Oxygen code templates like ${caret} to position the caret at a certain location
 or ${selection} to surround the current selection with the processed string.

**Returns:** `java.lang.String`

