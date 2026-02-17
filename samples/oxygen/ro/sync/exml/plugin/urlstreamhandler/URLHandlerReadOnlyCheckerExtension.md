# Interface: `URLHandlerReadOnlyCheckerExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.URLHandlerReadOnlyCheckerExtension`

## Description

## Methods

### `isReadOnly(`java.net.URL` url)`

**Returns:** `boolean`

If an URL is marked as read-only Oxygen will present it with a read-only lock icon on the tab.
 The user will also be able to specify through the user interface that an opened editor over a read-only URL can be edited.
 Also when saving in Oxygen and the URL is marked as read-only the Save As dialog will be shown instead.
   
 
 This call back will usually be received often, each time focus is gained by the current editor.
 WARNING: It is advisable to cache the calls for recognized URLs as this method might be called quite often.

### `canCheckReadOnly(`java.lang.String` protocol)`

**Returns:** `boolean`

This call back will usually be received often, each time focus is gained by the current editor.

