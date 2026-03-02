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

**Returns:** `void`

**Parameters:**
- `key` (`java.lang.String`)
- `value` (`java.lang.String`)

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `getAllowUserInteraction()`

**Returns:** `boolean`

### `getConnectTimeout()`

**Returns:** `int`

### `getContent()`

**Returns:** `java.lang.Object`

### `getContent(java.lang.Class[] classes)`

**Returns:** `java.lang.Object`

**Parameters:**
- `classes` (`java.lang.Class[]`)

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

**Returns:** `java.lang.String`

**Parameters:**
- `n` (`int`)

### `getHeaderField(java.lang.String name)`

**Returns:** `java.lang.String`

**Parameters:**
- `name` (`java.lang.String`)

### `getHeaderFieldDate(java.lang.String name, long Default)`

**Returns:** `long`

**Parameters:**
- `name` (`java.lang.String`)
- `Default` (`long`)

### `getHeaderFieldInt(java.lang.String name, int Default)`

**Returns:** `int`

**Parameters:**
- `name` (`java.lang.String`)
- `Default` (`int`)

### `getHeaderFieldKey(int n)`

**Returns:** `java.lang.String`

**Parameters:**
- `n` (`int`)

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

**Returns:** `java.lang.String`

**Parameters:**
- `key` (`java.lang.String`)

### `getURL()`

**Returns:** `java.net.URL`

### `getUseCaches()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setAllowUserInteraction(boolean allowuserinteraction)`

**Returns:** `void`

**Parameters:**
- `allowuserinteraction` (`boolean`)

### `setConnectTimeout(int timeout)`

**Returns:** `void`

**Parameters:**
- `timeout` (`int`)

### `setDefaultUseCaches(boolean defaultusecaches)`

**Returns:** `void`

**Parameters:**
- `defaultusecaches` (`boolean`)

### `setDoInput(boolean doinput)`

**Returns:** `void`

**Parameters:**
- `doinput` (`boolean`)

### `setDoOutput(boolean dooutput)`

**Returns:** `void`

**Parameters:**
- `dooutput` (`boolean`)

### `setIfModifiedSince(long ifmodifiedsince)`

**Returns:** `void`

**Parameters:**
- `ifmodifiedsince` (`long`)

### `setReadTimeout(int timeout)`

**Returns:** `void`

**Parameters:**
- `timeout` (`int`)

### `setRequestProperty(java.lang.String key, java.lang.String value)`

**Returns:** `void`

**Parameters:**
- `key` (`java.lang.String`)
- `value` (`java.lang.String`)

### `setUseCaches(boolean usecaches)`

**Returns:** `void`

**Parameters:**
- `usecaches` (`boolean`)

### `toString()`

**Returns:** `java.lang.String`

### `listFolder()`

**Returns:** `java.util.List<ro.sync.net.protocol.FolderEntryDescriptor>`

