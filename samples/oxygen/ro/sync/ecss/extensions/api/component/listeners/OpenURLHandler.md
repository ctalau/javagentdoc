# Class: `OpenURLHandler`

**Package:** [`ro.sync.ecss.extensions.api.component.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.listeners.OpenURLHandler`

## Description

For example the user clicked on a link in the Author page.

## Constructors

### `<init>()`

## Methods

### `handleOpenURL(java.net.URL toOpen)`

For example a click was made in the Author page.

**Parameters:**
- `toOpen` (`java.net.URL`): The URL which should be opened by the developer's code.

**Returns:** `void`

### `handleOpenURLAsDITAMapTree(java.net.URL toOpen)`

For example a map is opened in the DITAMapTreeComponentProvider and the user double clicks a map referenced in the current map.
 By default this method delegates to handleOpenURL(URL) but it can be overwritten to open the URL as a DITAMapTreeComponentProvider.

**Parameters:**
- `toOpen` (`java.net.URL`): The URL which should be opened by the developer's code.

**Returns:** `void`

