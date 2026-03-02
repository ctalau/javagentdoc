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

### `write(String fileName)`

This method is not guaranteed to succeed if called more than once for the same part. This allows a particular
 implementation to use, for example, file renaming, where possible, rather than copying all of the underlying data,
 thus gaining a significant performance benefit.

**Parameters:**
- `fileName` (`java.lang.String`): The location into which the uploaded part should be stored. Relative paths are relative to
   MultipartConfigElement#getLocation(). Absolute paths are used as provided. Note: that this is
   a system dependent string and URI notation may not be acceptable on all systems. For portability, this string should
   be generated with the File or Path APIs.

**Returns:** `void`

### `delete()`

**Returns:** `void`

### `getHeader(String name)`

If the Part did not include a header of the
 specified name, this method returns `null`. If there are multiple headers with the same name, this method
 returns the first header in the part. The header name is case insensitive. You can use this method with any request
 header.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the header name

**Returns:** `java.lang.String`

### `getHeaders(String name)`

Any changes to the returned `Collection` must not affect this `Part`.

 

 Part header names are case insensitive.

**Parameters:**
- `name` (`java.lang.String`): the header name whose values to return

**Returns:** `java.util.Collection<java.lang.String>`

### `getHeaderNames()`

Some servlet containers do not allow servlets to access headers using this method, in which case this method returns
 `null`

 

 Any changes to the returned `Collection` must not affect this `Part`.

**Returns:** `java.util.Collection<java.lang.String>`

