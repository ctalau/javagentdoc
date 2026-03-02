# Interface: `TargetedURLStreamHandlerPluginExtension`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.TargetedURLStreamHandlerPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md), [`ro.sync.exml.plugin.urlstreamhandler.URLStreamHandlerPluginExtensionConstants`](./URLStreamHandlerPluginExtensionConstants.md)

## Description

This URL stream handler plugin extension provides the possibility to impose 
 custom stream handlers for specific URLs.
 

 

 If the plugin decides that it could handle connections for a particular protocol
 (#canHandleProtocol(String)), it will be asked to provide the handler 
 for each opened connection of an URL having that protocol(#getURLStreamHandler(URL)).
 

 

 This extension can be useful in situations when opened connections from a 
 specific host must be handled in a particular way. 
 

 For example, the Oxygen HTTP URLStreamHandler may not be compatible for sending 
 and receiving SOAP using the SUN Webservices implementation. 
 In this case you can override the stream handler set by Oxygen for HTTP to 
 use the default SUN URLStreamHandler which is more compatible with sending 
 and receiving SOAP requests.
 

 

 This extension can handle the following protocols: `http`, `https`, 
 `ftp` or `sftp`. 
 

 

 If it is necessary to impose the application stream URL handlers for  
 protocols different than the one handled by the application, the 
 URLStreamHandlerPluginExtension can be used.

## Methods

### `canHandleProtocol(java.lang.String protocol)`

If this method returns `true` for a specific protocol,
 the #getURLStreamHandler(URL) method will be called for each opened 
 connection of an URL having this protocol.
 

 The plugin can handle multiple protocols like: `http`, `https`, 
 `ftp`, `sftp`.

**Parameters:**
- `protocol` (`java.lang.String`): The protocol.

**Returns:** `boolean`

### `getURLStreamHandler(java.net.URL url)`

This method is called for each opened connection of an URL with a protocol 
 for which the #canHandleProtocol(String) method returns `true`.
 If this method returns `null`, the Oxygen URLStreamHandler 
 is used.

**Parameters:**
- `url` (`java.net.URL`): The URL to provide a handler for.

**Returns:** `java.net.URLStreamHandler`

