# Interface: `Cookie`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.Cookie`

## Description

## Methods

### `setComment(java.lang.String purpose)`

**Returns:** `void`

The comment is useful if the browser presents the cookie to
 the user. Comments are not supported by Netscape Version 0 cookies.

**Parameters:**
- `purpose` (`java.lang.String`): a `String` specifying the comment to display to the user

### `getComment()`

**Returns:** `java.lang.String`

### `setDomain(java.lang.String domain)`

**Returns:** `void`

The form of the domain name is specified by RFC 2109. A domain name begins with a dot (`.foo.com`) and
 means that the cookie is visible to servers in a specified Domain Name System (DNS) zone (for example,
 `www.foo.com`, but not `a.b.foo.com`). By default, cookies are only returned to the server that
 sent them.

**Parameters:**
- `domain` (`java.lang.String`): the domain name within which this cookie is visible; form is according to RFC 2109

### `getDomain()`

**Returns:** `java.lang.String`

Domain names are formatted according to RFC 2109.

### `setMaxAge(int expiry)`

**Returns:** `void`

A positive value indicates that the cookie will expire after that many seconds have passed. Note that the value is
 the *maximum* age when the cookie will expire, not the cookie's current age.

 

 A negative value means that the cookie is not stored persistently and will be deleted when the Web browser exits. A
 zero value causes the cookie to be deleted.

**Parameters:**
- `expiry` (`int`): an integer specifying the maximum age of the cookie in seconds; if negative, means the cookie is not
 stored; if zero, deletes the cookie

### `getMaxAge()`

**Returns:** `int`

By default, `-1` is returned, which indicates that the cookie will persist until browser shutdown.

### `setPath(java.lang.String uri)`

**Returns:** `void`

The cookie is visible to all the pages in the directory you specify, and all the pages in that directory's
 subdirectories. A cookie's path must include the servlet that set the cookie, for example, */catalog*, which
 makes the cookie visible to all directories on the server under */catalog*.

 

 Consult RFC 2109 (available on the Internet) for more information on setting path names for cookies.

**Parameters:**
- `uri` (`java.lang.String`): a `String` specifying a path

### `getPath()`

**Returns:** `java.lang.String`

The cookie is visible to all subpaths on the
 server.

### `setSecure(boolean flag)`

**Returns:** `void`

The default value is `false`.

**Parameters:**
- `flag` (`boolean`): if `true`, sends the cookie from the browser to the server only when using a secure protocol;
 if `false`, sent on any protocol

### `getSecure()`

**Returns:** `boolean`

### `getName()`

**Returns:** `java.lang.String`

The name cannot be changed after creation.

### `setValue(java.lang.String newValue)`

**Returns:** `void`

If you use a binary value, you may want to use BASE64 encoding.

 

 With Version 0 cookies, values should not contain white space, brackets, parentheses, equals signs, commas, double
 quotes, slashes, question marks, at signs, colons, and semicolons. Empty values may not behave the same way on all
 browsers.

**Parameters:**
- `newValue` (`java.lang.String`): the new value of the cookie

### `getValue()`

**Returns:** `java.lang.String`

### `getVersion()`

**Returns:** `int`

Version 1 complies with RFC 2109, and version 0
 complies with the original cookie specification drafted by Netscape. Cookies provided by a browser use and identify
 the browser's cookie version.

### `setVersion(int v)`

**Returns:** `void`

Version 0 complies with the original Netscape cookie specification. Version 1 complies with RFC 2109.

 

 Since RFC 2109 is still somewhat new, consider version 1 as experimental; do not use it yet on production sites.

**Parameters:**
- `v` (`int`): 0 if the cookie should comply with the original Netscape specification; 1 if the cookie should comply with
 RFC 2109

### `setHttpOnly(boolean isHttpOnly)`

**Returns:** `void`

If isHttpOnly is set to true, this cookie is marked as *HttpOnly*, by adding the
 HttpOnly attribute to it.

 

 *HttpOnly* cookies are not supposed to be exposed to client-side scripting code, and may therefore help mitigate
 certain kinds of cross-site scripting attacks.

**Parameters:**
- `isHttpOnly` (`boolean`): true if this cookie is to be marked as *HttpOnly*, false otherwise

### `isHttpOnly()`

**Returns:** `boolean`

