# Interface: `URLHandlerReadOnlyCheckerExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.URLHandlerReadOnlyCheckerExtension`

## Description

## Methods

### `isReadOnly(URL url)`

If an URL is marked as read-only Oxygen will present it with a read-only lock icon on the tab.
 The user will also be able to specify through the user interface that an opened editor over a read-only URL can be edited.
 Also when saving in Oxygen and the URL is marked as read-only the Save As dialog will be shown instead.
   
 
 This call back will usually be received often, each time focus is gained by the current editor.
 WARNING: It is advisable to cache the calls for recognized URLs as this method might be called quite often.

**Parameters:**
- `url` (`java.net.URL`): The URL for which the implementor will decide if it is read-only or not.

**Returns:** `boolean`

### `canCheckReadOnly(String protocol)`

This call back will usually be received often, each time focus is gained by the current editor.

**Parameters:**
- `protocol` (`java.lang.String`): The URL protocol (like "http" or "file")

**Returns:** `boolean`

