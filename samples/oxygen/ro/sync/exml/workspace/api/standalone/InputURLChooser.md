# Interface: `InputURLChooser`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.InputURLChooser`

**Extends:** [`ro.sync.exml.workspace.api.standalone.ContextDescriptionProvider`](./ContextDescriptionProvider.md)

## Description

## Fields

### `SAVE_RESOURCE`

**Type:** `int`

### `OPEN_RESOURCE`

**Type:** `int`

### `OPEN_RESOURCE_DIRECTORY`

**Type:** `int`

## Methods

### `urlChosen(URL selectedURL)`

When the customizer is used in places where a combo box for the URL is not present 
 (like in the DITA Maps Manager view) this method performs the operation on the given URL.

**Parameters:**
- `selectedURL` (`java.net.URL`): The URL which was probably selected by the user in a custom CMS chooser.

**Returns:** `void`

### `getBrowseMode()`

**Returns:** `int`

### `getResourceFilters()`

This method is useful to decide the type of files the chooser dialog wants to browse.
 
 For example if the dialog wants to select an image to add to the Author page then the resource filters will contain image extensions.

**Returns:** [`ro.sync.exml.workspace.api.standalone.ResourceFilter[]`](./ResourceFilter.md)

