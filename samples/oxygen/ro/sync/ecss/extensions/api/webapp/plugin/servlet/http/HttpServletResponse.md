# Interface: `HttpServletResponse`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.HttpServletResponse`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletResponse`](../ServletResponse.md)

## Description

## Fields

### `SC_CONTINUE`

**Type:** `int`

### `SC_SWITCHING_PROTOCOLS`

**Type:** `int`

### `SC_OK`

**Type:** `int`

### `SC_CREATED`

**Type:** `int`

### `SC_ACCEPTED`

**Type:** `int`

### `SC_NON_AUTHORITATIVE_INFORMATION`

**Type:** `int`

### `SC_NO_CONTENT`

**Type:** `int`

### `SC_RESET_CONTENT`

**Type:** `int`

### `SC_PARTIAL_CONTENT`

**Type:** `int`

### `SC_MULTIPLE_CHOICES`

**Type:** `int`

### `SC_MOVED_PERMANENTLY`

**Type:** `int`

### `SC_MOVED_TEMPORARILY`

**Type:** `int`

This definition is being retained for backwards compatibility. SC_FOUND is now the preferred definition.

### `SC_FOUND`

**Type:** `int`

Since the redirection might
 be altered on occasion, the client should continue to use the Request-URI for future requests.(HTTP/1.1) To represent
 the status code (302), it is recommended to use this variable.

### `SC_SEE_OTHER`

**Type:** `int`

### `SC_NOT_MODIFIED`

**Type:** `int`

### `SC_USE_PROXY`

**Type:** `int`

### `SC_TEMPORARY_REDIRECT`

**Type:** `int`

The temporary URI
 *SHOULD* be given by the `*Location*` field in the response.

### `SC_BAD_REQUEST`

**Type:** `int`

### `SC_UNAUTHORIZED`

**Type:** `int`

### `SC_PAYMENT_REQUIRED`

**Type:** `int`

### `SC_FORBIDDEN`

**Type:** `int`

### `SC_NOT_FOUND`

**Type:** `int`

### `SC_METHOD_NOT_ALLOWED`

**Type:** `int`

### `SC_NOT_ACCEPTABLE`

**Type:** `int`

### `SC_PROXY_AUTHENTICATION_REQUIRED`

**Type:** `int`

### `SC_REQUEST_TIMEOUT`

**Type:** `int`

### `SC_CONFLICT`

**Type:** `int`

### `SC_GONE`

**Type:** `int`

This condition *SHOULD* be considered permanent.

### `SC_LENGTH_REQUIRED`

**Type:** `int`

### `SC_PRECONDITION_FAILED`

**Type:** `int`

### `SC_REQUEST_ENTITY_TOO_LARGE`

**Type:** `int`

### `SC_REQUEST_URI_TOO_LONG`

**Type:** `int`

### `SC_UNSUPPORTED_MEDIA_TYPE`

**Type:** `int`

### `SC_REQUESTED_RANGE_NOT_SATISFIABLE`

**Type:** `int`

### `SC_EXPECTATION_FAILED`

**Type:** `int`

### `SC_INTERNAL_SERVER_ERROR`

**Type:** `int`

### `SC_NOT_IMPLEMENTED`

**Type:** `int`

### `SC_BAD_GATEWAY`

**Type:** `int`

### `SC_SERVICE_UNAVAILABLE`

**Type:** `int`

### `SC_GATEWAY_TIMEOUT`

**Type:** `int`

### `SC_HTTP_VERSION_NOT_SUPPORTED`

**Type:** `int`

## Methods

### `addCookie([`ro.sync.ecss.extensions.api.webapp.plugin.servlet.http.Cookie`](./Cookie.md) cookie)`

**Returns:** `void`

This method can be called multiple times to set more than one cookie.

### `containsHeader(`java.lang.String` name)`

**Returns:** `boolean`

### `encodeURL(`java.lang.String` url)`

**Returns:** `java.lang.String`

The
 implementation of this method includes the logic to determine whether the session ID needs to be encoded in the URL.
 For example, if the browser supports cookies, or session tracking is turned off, URL encoding is unnecessary.
 
 

 For robust session tracking, all URLs emitted by a servlet should be run through this method. Otherwise, URL
 rewriting cannot be used with browsers which do not support cookies.

 

 If the URL is relative, it is always relative to the current HttpServletRequest.

### `encodeRedirectURL(`java.lang.String` url)`

**Returns:** `java.lang.String`

The implementation of this method includes the logic to determine whether the session ID needs to be
 encoded in the URL. For example, if the browser supports cookies, or session tracking is turned off, URL encoding is
 unnecessary. Because the rules for making this determination can differ from those used to decide whether to encode a
 normal link, this method is separated from the `encodeURL` method.
 
 

 All URLs sent to the `HttpServletResponse.sendRedirect` method should be run through this method.
 Otherwise, URL rewriting cannot be used with browsers which do not support cookies.

 

 If the URL is relative, it is always relative to the current HttpServletRequest.

### `sendError(`int` sc, `java.lang.String` msg)`

**Returns:** `void`

The server defaults to
 creating the response to look like an HTML-formatted server error page containing the specified message, setting the
 content type to "text/html". The caller is **not** responsible for escaping or re-encoding the message
 to ensure it is safe with respect to the current response encoding and content type. This aspect of safety is the
 responsibility of the container, as it is generating the error page containing the message. The server will preserve
 cookies and may clear or update any headers needed to serve the error page as a valid response.
 

 

 If an error-page declaration has been made for the web application corresponding to the status code passed in, it
 will be served back in preference to the suggested msg parameter and the msg parameter will be ignored.
 

 

 If the response has already been committed, this method throws an IllegalStateException. After using this method, the
 response should be considered to be committed and should not be written to.

### `sendError(`int` sc)`

**Returns:** `void`

The server will preserve cookies and may clear or update any headers needed to serve the error page as a valid
 response.

 If an error-page declaration has been made for the web application corresponding to the status code passed in, it
 will be served back the error page
 
 

 If the response has already been committed, this method throws an IllegalStateException. After using this method, the
 response should be considered to be committed and should not be written to.

### `sendRedirect(`java.lang.String` location)`

**Returns:** `void`

The buffer will be replaced with the data set by this method. Calling this method sets the status code to
 #SC_FOUND 302 (Found). This method can accept relative URLs;the servlet container must convert the relative
 URL to an absolute URL before sending the response to the client. If the location is relative without a leading '/'
 the container interprets it as relative to the current request URI. If the location is relative with a leading '/'
 the container interprets it as relative to the servlet container root. If the location is relative with two leading
 '/' the container interprets it as a network-path reference (see [ RFC
 3986: Uniform Resource Identifier (URI): Generic Syntax](http://www.ietf.org/rfc/rfc3986.txt), section 4.2 "Relative Reference").

 

 If the response has already been committed, this method throws an IllegalStateException. After using this method, the
 response should be considered to be committed and should not be written to.

### `setDateHeader(`java.lang.String` name, `long` date)`

**Returns:** `void`

The date is specified in terms of milliseconds since the
 epoch. If the header had already been set, the new value overwrites the previous one. The `containsHeader`
 method can be used to test for the presence of a header before setting its value.

### `addDateHeader(`java.lang.String` name, `long` date)`

**Returns:** `void`

The date is specified in terms of milliseconds since the
 epoch. This method allows response headers to have multiple values.

### `setHeader(`java.lang.String` name, `java.lang.String` value)`

**Returns:** `void`

If the header had already been set, the new value overwrites
 the previous one. The `containsHeader` method can be used to test for the presence of a header before
 setting its value.

### `addHeader(`java.lang.String` name, `java.lang.String` value)`

**Returns:** `void`

This method allows response headers to have multiple values.

### `setIntHeader(`java.lang.String` name, `int` value)`

**Returns:** `void`

If the header had already been set, the new value
 overwrites the previous one. The `containsHeader` method can be used to test for the presence of a header
 before setting its value.

### `addIntHeader(`java.lang.String` name, `int` value)`

**Returns:** `void`

This method allows response headers to have multiple
 values.

### `setStatus(`int` sc)`

**Returns:** `void`

This method is used to set the return status code when there is no error (for example, for the SC_OK or
 SC_MOVED_TEMPORARILY status codes).

 

 If this method is used to set an error code, then the container's error page mechanism will not be triggered. If
 there is an error and the caller wishes to invoke an error page defined in the web application, then
 #sendError must be used instead.

 

 This method preserves any cookies and other response headers.

 

 Valid status codes are those in the 2XX, 3XX, 4XX, and 5XX ranges. Other status codes are treated as container
 specific.

### `getStatus()`

**Returns:** `int`

### `getHeader(`java.lang.String` name)`

**Returns:** `java.lang.String`

If a response header with the given name exists and contains multiple values, the value that was added first will be
 returned.

 

 This method considers only response headers set or added via #setHeader, #addHeader,
 #setDateHeader, #addDateHeader, #setIntHeader, or #addIntHeader, respectively.

### `getHeaders(`java.lang.String` name)`

**Returns:** `java.util.Collection<java.lang.String>`

This method considers only response headers set or added via #setHeader, #addHeader,
 #setDateHeader, #addDateHeader, #setIntHeader, or #addIntHeader, respectively.

 

 Any changes to the returned `Collection` must not affect this `HttpServletResponse`.

### `getHeaderNames()`

**Returns:** `java.util.Collection<java.lang.String>`

This method considers only response headers set or added via #setHeader, #addHeader,
 #setDateHeader, #addDateHeader, #setIntHeader, or #addIntHeader, respectively.

 

 Any changes to the returned `Collection` must not affect this `HttpServletResponse`.

