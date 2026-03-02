# Class: `FilterURLConnection`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.FilterURLConnection`

**Extends:** `java.net.URLConnection`

**Implements:** [`ro.sync.net.protocol.FileBrowsingConnection`](../../../../../net/protocol/FileBrowsingConnection.md)

## Description

## Fields

### `delegateConnection`

**Type:** `java.net.URLConnection`

## Constructors

### `<init>(java.net.URLConnection delegateConnection)`

**Parameters:**
- `delegateConnection` (`java.net.URLConnection`): The underlying connection.

## Methods

### `getInputStream()`

**Returns:** `java.io.InputStream`

### `getOutputStream()`

**Returns:** `java.io.OutputStream`

### `connect()`

**Returns:** `void`

### `addRequestProperty(java.lang.String key, java.lang.String value)`

**Parameters:**
- `key` (`java.lang.String`)
- `value` (`java.lang.String`)

**Returns:** `void`

### `equals(java.lang.Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `getAllowUserInteraction()`

**Returns:** `boolean`

### `getConnectTimeout()`

**Returns:** `int`

### `getContent()`

**Returns:** `java.lang.Object`

### `getContent(java.lang.Class[] classes)`

**Parameters:**
- `classes` (`java.lang.Class[]`)

**Returns:** `java.lang.Object`

### `getContentEncoding()`

**Returns:** `java.lang.String`

### `getContentLength()`

**Returns:** `int`

### `getContentType()`

**Returns:** `java.lang.String`

### `getDate()`

**Returns:** `long`

### `getDefaultUseCaches()`

**Returns:** `boolean`

### `getDoInput()`

**Returns:** `boolean`

### `getDoOutput()`

**Returns:** `boolean`

### `getExpiration()`

**Returns:** `long`

### `getHeaderField(int n)`

**Parameters:**
- `n` (`int`)

**Returns:** `java.lang.String`

### `getHeaderField(java.lang.String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getHeaderFieldDate(java.lang.String name, long Default)`

**Parameters:**
- `name` (`java.lang.String`)
- `Default` (`long`)

**Returns:** `long`

### `getHeaderFieldInt(java.lang.String name, int Default)`

**Parameters:**
- `name` (`java.lang.String`)
- `Default` (`int`)

**Returns:** `int`

### `getHeaderFieldKey(int n)`

**Parameters:**
- `n` (`int`)

**Returns:** `java.lang.String`

### `getHeaderFields()`

**Returns:** `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`

### `getIfModifiedSince()`

**Returns:** `long`

### `getLastModified()`

**Returns:** `long`

### `getPermission()`

**Returns:** `java.security.Permission`

### `getReadTimeout()`

**Returns:** `int`

### `getRequestProperties()`

**Returns:** `java.util.Map<java.lang.String,java.util.List<java.lang.String>>`

### `getRequestProperty(java.lang.String key)`

**Parameters:**
- `key` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getURL()`

**Returns:** `java.net.URL`

### `getUseCaches()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setAllowUserInteraction(boolean allowuserinteraction)`

**Parameters:**
- `allowuserinteraction` (`boolean`)

**Returns:** `void`

### `setConnectTimeout(int timeout)`

**Parameters:**
- `timeout` (`int`)

**Returns:** `void`

### `setDefaultUseCaches(boolean defaultusecaches)`

**Parameters:**
- `defaultusecaches` (`boolean`)

**Returns:** `void`

### `setDoInput(boolean doinput)`

**Parameters:**
- `doinput` (`boolean`)

**Returns:** `void`

### `setDoOutput(boolean dooutput)`

**Parameters:**
- `dooutput` (`boolean`)

**Returns:** `void`

### `setIfModifiedSince(long ifmodifiedsince)`

**Parameters:**
- `ifmodifiedsince` (`long`)

**Returns:** `void`

### `setReadTimeout(int timeout)`

**Parameters:**
- `timeout` (`int`)

**Returns:** `void`

### `setRequestProperty(java.lang.String key, java.lang.String value)`

**Parameters:**
- `key` (`java.lang.String`)
- `value` (`java.lang.String`)

**Returns:** `void`

### `setUseCaches(boolean usecaches)`

**Parameters:**
- `usecaches` (`boolean`)

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `listFolder()`

**Returns:** `java.util.List<ro.sync.net.protocol.FolderEntryDescriptor>`

