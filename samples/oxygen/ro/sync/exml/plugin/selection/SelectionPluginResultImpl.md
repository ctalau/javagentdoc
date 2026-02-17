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

### `<init>(`java.lang.String` selection)`

## Methods

### `setProcessedSelection(`java.lang.String` selection)`

**Returns:** `void`

The string can also contain editor variables available also to Oxygen code templates like ${caret} to position the caret at a certain location
 or ${selection} to surround the current selection with the processed string.

### `getProcessedSelection()`

**Returns:** `java.lang.String`

The string can also contain editor variables available also to Oxygen code templates like ${caret} to position the caret at a certain location
 or ${selection} to surround the current selection with the processed string.

