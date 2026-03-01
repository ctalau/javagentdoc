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

### `<init>(`java.net.URLConnection` delegateConnection)`

## Methods

### `getInputStream()`

**Returns:** `java.io.InputStream`

### `getOutputStream()`

**Returns:** `java.io.OutputStream`

### `connect()`

**Returns:** `void`

### `addRequestProperty(`java.lang.String` key, `java.lang.String` value)`

**Returns:** `void`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `getAllowUserInteraction()`

**Returns:** `boolean`

### `getConnectTimeout()`

**Returns:** `int`

### `getContent()`

**Returns:** `java.lang.Object`

### `getContent(`java.lang.Class[]` classes)`

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

### `getHeaderField(`int` n)`

**Returns:** `java.lang.String`

### `getHeaderField(`java.lang.String` name)`

**Returns:** `java.lang.String`

### `getHeaderFieldDate(`java.lang.String` name, `long` Default)`

**Returns:** `long`

### `getHeaderFieldInt(`java.lang.String` name, `int` Default)`

**Returns:** `int`

### `getHeaderFieldKey(`int` n)`

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

### `getRequestProperty(`java.lang.String` key)`

**Returns:** `java.lang.String`

### `getURL()`

**Returns:** `java.net.URL`

### `getUseCaches()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setAllowUserInteraction(`boolean` allowuserinteraction)`

**Returns:** `void`

### `setConnectTimeout(`int` timeout)`

**Returns:** `void`

### `setDefaultUseCaches(`boolean` defaultusecaches)`

**Returns:** `void`

### `setDoInput(`boolean` doinput)`

**Returns:** `void`

### `setDoOutput(`boolean` dooutput)`

**Returns:** `void`

### `setIfModifiedSince(`long` ifmodifiedsince)`

**Returns:** `void`

### `setReadTimeout(`int` timeout)`

**Returns:** `void`

### `setRequestProperty(`java.lang.String` key, `java.lang.String` value)`

**Returns:** `void`

### `setUseCaches(`boolean` usecaches)`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `listFolder()`

**Returns:** `java.util.List<ro.sync.net.protocol.FolderEntryDescriptor>`

