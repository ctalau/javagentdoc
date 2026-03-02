# Interface: `ServletRequest`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletRequest`

## Description

## Methods

### `getAttribute(String name)`

Attributes can be set two ways. The servlet container may set attributes to make available custom information about a
 request. For example, for requests made using HTTPS, the attribute
 `jakarta.servlet.request.X509Certificate` can be used to retrieve information on the certificate of the
 client. Attributes can also be set programmatically using ServletRequest#setAttribute. This allows
 information to be embedded into a request before a RequestDispatcher call.

 

 Attribute names should follow the same conventions as package names. The Jakarta Servlet specification reserves names
 matching `jakarta.*`.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the name of the attribute

**Returns:** `java.lang.Object`

### `getAttributeNames()`

This method
 returns an empty `Enumeration` if the request has no attributes available to it.

**Returns:** `java.util.Enumeration<java.lang.String>`

### `getCharacterEncoding()`

This method returns `null` if
 no request encoding character encoding has been specified. The following methods for specifying the request character
 encoding are consulted, in decreasing order of priority: per request, per web app (using
 ServletContext#setRequestCharacterEncoding, deployment descriptor), and per container (for all web
 applications deployed in that container, using vendor specific configuration).

**Returns:** `java.lang.String`

### `setCharacterEncoding(String encoding)`

This method must be called prior to
 reading request parameters or reading input using getReader(). Otherwise, it has no effect.

**Parameters:**
- `encoding` (`java.lang.String`): `String` containing the name of the character encoding.

**Returns:** `void`

### `setCharacterEncoding(Charset encoding)`

This method must be called prior to reading
 request parameters or reading input using getReader(). Otherwise, it has no effect.
 

 Implementations are strongly encouraged to override this default method and provide a more efficient implementation.

**Parameters:**
- `encoding` (`java.nio.charset.Charset`): `Charset` representing the character encoding.

**Returns:** `void`

### `getContentLength()`

**Returns:** `int`

### `getContentLengthLong()`

**Returns:** `long`

### `getContentType()`

**Returns:** `java.lang.String`

### `getInputStream()`

Either this method or
 #getReader may be called to read the body, not both.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletInputStream`](./ServletInputStream.md)

### `getParameter(String name)`

Request parameters are extra information sent with the request. For HTTP servlets, parameters are contained in
 the query string or posted form data.

 

 You should only use this method when you are sure the parameter has only one value. If the parameter might have more
 than one value, use #getParameterValues.

 

 If you use this method with a multivalued parameter, the value returned is equal to the first value in the array
 returned by `getParameterValues`.

 

 If the parameter data was sent in the request body, such as occurs with an HTTP POST request, then reading the body
 directly via #getInputStream or #getReader can interfere with the execution of this method.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the name of the parameter

**Returns:** `java.lang.String`

### `getParameterNames()`

If the request has no parameters, the method returns an empty `Enumeration`.

**Returns:** `java.util.Enumeration<java.lang.String>`

### `getParameterValues(String name)`

If the parameter has a single value, the array has a length of 1.

**Parameters:**
- `name` (`java.lang.String`): a `String` containing the name of the parameter whose value is requested

**Returns:** `java.lang.String[]`

### `getParameterMap()`

Request parameters are extra information sent with the request. For HTTP servlets, parameters are contained in the
 query string or posted form data.

**Returns:** `java.util.Map<java.lang.String,java.lang.String[]>`

### `getProtocol()`

**Returns:** `java.lang.String`

### `getScheme()`

Different schemes have different rules for constructing URLs, as noted in RFC 1738.

**Returns:** `java.lang.String`

### `getServerName()`

It may be derived from a protocol specific
 mechanism, such as the `Host` header, or the HTTP/2 authority, or
 [RFC 7239](https://tools.ietf.org/html/rfc7239), otherwise the resolved server name or the server IP
 address.

**Returns:** `java.lang.String`

### `getServerPort()`

It may be derived from a protocol specific mechanism, such as
 the `Host` header, or HTTP authority, or [RFC 7239](https://tools.ietf.org/html/rfc7239),
 otherwise the server port where the client connection was accepted on.

**Returns:** `int`

### `getReader()`

The reader translates the
 character data according to the character encoding used on the body. Either this method or #getInputStream
 may be called to read the body, not both.

**Returns:** `java.io.BufferedReader`

### `getRemoteAddr()`

By default
 this is either the address of the client or last proxy that sent the request. In some cases a protocol specific
 mechanism, such as [RFC 7239](https://tools.ietf.org/html/rfc7239), may be used to obtain an address
 different to that of the actual TCP/IP connection.

**Returns:** `java.lang.String`

### `getRemoteHost()`

If the engine cannot or chooses
 not to resolve the hostname (to improve performance), this method returns the IP address.

**Returns:** `java.lang.String`

### `setAttribute(String name, Object o)`

Attributes are reset between requests. This method is most often used in
 conjunction with RequestDispatcher.

 

 Attribute names should follow the same conventions as package names. 

 If the object passed in is null, the effect is the same as calling #removeAttribute. 

 It is warned that when the request is dispatched from the servlet resides in a different web application by
 `RequestDispatcher`, the object set by this method may not be correctly retrieved in the caller servlet.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the name of the attribute
- `o` (`java.lang.Object`): the `Object` to be stored

**Returns:** `void`

### `removeAttribute(String name)`

This method is not generally needed as attributes only persist as long as the
 request is being handled.

 

 Attribute names should follow the same conventions as package names. Names beginning with `jakarta.*` are
 reserved for use by the Jakarta Servlet specification.

**Parameters:**
- `name` (`java.lang.String`): a `String` specifying the name of the attribute to remove

**Returns:** `void`

### `getLocale()`

If the client request doesn't provide an Accept-Language header, this method returns the default locale for
 the server.

**Returns:** `java.util.Locale`

### `getLocales()`

If the client
 request doesn't provide an Accept-Language header, this method returns an `Enumeration` containing one
 `Locale`, the default locale for the server.

**Returns:** `java.util.Enumeration<java.util.Locale>`

### `isSecure()`

**Returns:** `boolean`

### `getRemotePort()`

By
 default this is either the port of the client or last proxy that sent the request. In some cases, protocol specific
 mechanisms such as [RFC 7239](https://tools.ietf.org/html/rfc7239) may be used to obtain a port different
 to that of the actual TCP/IP connection.

**Returns:** `int`

### `getLocalName()`

If the engine cannot or chooses
 not to resolve the hostname (to improve performance), this method returns the IP address.

**Returns:** `java.lang.String`

### `getLocalAddr()`

In some
 cases a protocol specific mechanism, such as [RFC 7239](https://tools.ietf.org/html/rfc7239), may be used
 to obtain an address different to that of the actual TCP/IP connection.

**Returns:** `java.lang.String`

### `getLocalPort()`

In some
 cases, a protocol specific mechanism such as [RFC 7239](https://tools.ietf.org/html/rfc7239) may be used
 to obtain an address different to that of the actual TCP/IP connection.

**Returns:** `int`

### `getServletContext()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletContext`](./ServletContext.md)

