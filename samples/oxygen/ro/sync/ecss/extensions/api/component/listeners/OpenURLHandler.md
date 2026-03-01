# Class: `OpenURLHandler`

**Package:** [`ro.sync.ecss.extensions.api.component.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.listeners.OpenURLHandler`

## Description

For example the user clicked on a link in the Author page.

## Constructors

### `<init>()`

## Methods

### `handleOpenURL(`java.net.URL` toOpen)`

**Returns:** `void`

For example a click was made in the Author page.

### `handleOpenURLAsDITAMapTree(`java.net.URL` toOpen)`

**Returns:** `void`

For example a map is opened in the DITAMapTreeComponentProvider and the user double clicks a map referenced in the current map.
 By default this method delegates to handleOpenURL(URL) but it can be overwritten to open the URL as a DITAMapTreeComponentProvider.

