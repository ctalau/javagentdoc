# Interface: `Part`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.Part`

## Description

## Methods

### `getInputStream()`

**Returns:** `java.io.InputStream`

### `getContentType()`

**Returns:** `java.lang.String`

### `getName()`

**Returns:** `java.lang.String`

### `getSubmittedFileName()`

**Returns:** `java.lang.String`

### `getSize()`

**Returns:** `long`

### `write(`java.lang.String` fileName)`

**Returns:** `void`

This method is not guaranteed to succeed if called more than once for the same part. This allows a particular
 implementation to use, for example, file renaming, where possible, rather than copying all of the underlying data,
 thus gaining a significant performance benefit.

### `delete()`

**Returns:** `void`

### `getHeader(`java.lang.String` name)`

**Returns:** `java.lang.String`

If the Part did not include a header of the
 specified name, this method returns `null`. If there are multiple headers with the same name, this method
 returns the first header in the part. The header name is case insensitive. You can use this method with any request
 header.

### `getHeaders(`java.lang.String` name)`

**Returns:** `java.util.Collection<java.lang.String>`

Any changes to the returned `Collection` must not affect this `Part`.

 

 Part header names are case insensitive.

### `getHeaderNames()`

**Returns:** `java.util.Collection<java.lang.String>`

Some servlet containers do not allow servlets to access headers using this method, in which case this method returns
 `null`

 

 Any changes to the returned `Collection` must not affect this `Part`.

