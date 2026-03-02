# Interface: `HttpServletRequest`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletRequest`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletRequest`](../ServletRequest.md)

## Description

## Methods

### `getCookies()`

This method
 returns `null` if no cookies were sent.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.Cookie[]`](./Cookie.md)

### `getDateHeader(String name)`

Use this method with headers that contain dates, such as `If-Modified-Since`.

 

 The date is returned as the number of milliseconds since January 1, 1970 GMT. The header name is case insensitive.

 

 If the request did not have a header of the specified name, this method returns -1. If there are multiple headers
 with the same name, this method returns the value of the first header in the request. If the header can't be
 converted to a date, the method throws an `IllegalArgumentException`.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the name of the header

**Returns:** `long`

### `getHeader(String name)`

If the request did not include a header
 of the specified name, this method returns `null`. If there are multiple headers with the same name, this
 method returns the value of the first header in the request. The header name is case insensitive. You can use this
 method with any request header.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the header name

**Returns:** `java.lang.String`

### `getHeaders(String name)`

Some headers, such as `Accept-Language` can be sent by clients as several headers each with a different
 value rather than sending the header as a comma separated list.

 

 If the request did not include any headers of the specified name, this method returns an empty
 `Enumeration`. The header name is case insensitive. You can use this method with any request header.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the header name

**Returns:** `java.util.Enumeration<java.lang.String>`

### `getHeaderNames()`

If the request has no headers, this method
 returns an empty enumeration.

 

 Some servlet containers do not allow servlets to access headers using this method, in which case this method returns
 `null`

**Returns:** `java.util.Enumeration<java.lang.String>`

### `getIntHeader(String name)`

If the request does not have a header of
 the specified name, this method returns -1. If there are multiple headers with the same name, this method returns the
 value of the first header in the request. If the header cannot be converted to an integer, this method throws a
 `NumberFormatException`.

 

 The header name is case insensitive.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the name of a request header

**Returns:** `int`

### `getMethod()`

**Returns:** `java.lang.String`

### `getPathInfo()`

The extra path
 information follows the servlet path but precedes the query string and will start with a "/" character.

 

 This method returns `null` if there was no extra path information.

**Returns:** `java.lang.String`

### `getPathTranslated()`

If the URL does not have any extra path information, this method returns `null` or the servlet container
 cannot translate the virtual path to a real path for any reason (such as when the web application is executed from an
 archive).

 The web container does not decode this string.

**Returns:** `java.lang.String`

### `getContextPath()`

The context path always comes first
 in a request URI. The path starts with a "/" character but does not end with a "/" character. For servlets in the
 default (root) context, this method returns "". The container does not decode this string.

 

 It is possible that a servlet container may match a context by more than one context path. In such cases this method
 will return the actual context path used by the request and it may differ from the path returned by the
 ServletContext#getContextPath() method. The context path returned by
 ServletContext#getContextPath() should be considered as the prime or preferred context path
 of the application.

**Returns:** `java.lang.String`

### `getQueryString()`

This method returns `null`
 if the URL does not have a query string.

**Returns:** `java.lang.String`

### `getRequestURI()`

The web container does not decode this String. For example:

 
 
 First line of HTTP request
 Returned Value
 
 POST /some/path.html HTTP/1.1
 
 /some/path.html
 
 GET http://foo.bar/a.html HTTP/1.0
 
 /a.html
 
 HEAD /xyz?a=b HTTP/1.1
 
 /xyz

**Returns:** `java.lang.String`

### `getRequestURL()`

The returned URL contains a protocol, server name, port
 number, and server path, but it does not include query string parameters.

 

 If this request has been forwarded using RequestDispatcher#forward, the server path in the
 reconstructed URL must reflect the path used to obtain the RequestDispatcher, and not the server path specified by
 the client.

 

 Because this method returns a `StringBuffer`, not a string, you can modify the URL easily, for example, to
 append query parameters.

 

 This method is useful for creating redirect messages and for reporting errors.

**Returns:** `java.lang.StringBuffer`

### `getServletPath()`

This path starts with a "/" character and includes the
 path to the servlet, but does not include any extra path information or a query string.

 

 This method will return an empty string ("") if the servlet used to process this request was matched using the "/*"
 pattern.

**Returns:** `java.lang.String`

### `getSession(boolean create)`

If `create` is `false` and the request has no valid `HttpSession`, this method
 returns `null`.

 

 To make sure the session is properly maintained, you must call this method before the response is committed. If the
 container is using cookies to maintain session integrity and is asked to create a new session when the response is
 committed, an IllegalStateException is thrown.

**Parameters:**
- `create` (`boolean`): `true` to create a new session for this request if necessary; `false` to return
   `null` if there's no current session

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpSession`](./HttpSession.md)

### `getSession()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpSession`](./HttpSession.md)

### `getParts()`

If this request is of type `multipart/form-data`, but does not contain any `Part` components,
 the returned `Collection` will be empty.

 

 Any changes to the returned `Collection` must not affect this `HttpServletRequest`.

**Returns:** `java.util.Collection<ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.Part>`

### `getPart(String name)`

**Parameters:**
- `name` (`java.lang.String`): the name of the requested `Part`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.Part`](./Part.md)

