# Interface: `OpenRedirectExtension`

**Package:** [`ro.sync.exml.plugin.openredirect`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.openredirect.OpenRedirectExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `redirect(java.net.URL url)`

**Returns:** [`ro.sync.exml.plugin.openredirect.OpenRedirectInformation[]`](./OpenRedirectInformation.md)

For example if you want to open a certain XML file from a ZIP archive, when the callback is received for the archive URL
 you can return two OpenRedirectInformation objects (one with the URL of the archive and the content type of the archive browser
 and the other with the URL of the file inside the archive and the content type "null" for auto-detection or text/xml).

**Parameters:**
- `url` (`java.net.URL`): The URL which will get opened in Oxygen

