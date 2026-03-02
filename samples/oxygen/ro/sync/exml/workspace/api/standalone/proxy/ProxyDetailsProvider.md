# Interface: `ProxyDetailsProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.proxy`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.proxy.ProxyDetailsProvider`

## Description

## Methods

### `getProxyConnectionInfo(java.net.URL url)`

**Returns:** [`ro.sync.exml.workspace.api.standalone.proxy.ProxyConnectionInfo`](./ProxyConnectionInfo.md)

If the URL is `null` you might not get accurate information, for example the "no proxy for..." host names information will not be used.

**Parameters:**
- `url` (`java.net.URL`): The URL to access.

