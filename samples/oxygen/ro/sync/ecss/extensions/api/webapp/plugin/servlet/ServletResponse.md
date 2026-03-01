# Interface: `ServletResponse`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletResponse`

## Description

## Methods

### `getCharacterEncoding()`

**Returns:** `java.lang.String`

The following
 methods for specifying the response character encoding are consulted, in decreasing order of priority: per request,
 perweb-app (using ServletContext#setResponseCharacterEncoding, deployment descriptor), and per container (for
 all web applications deployed in that container, using vendor specific configuration). The first one of these methods
 that yields a result is returned. Per-request, the charset for the response can be specified explicitly using the
 #setCharacterEncoding(String), #setCharacterEncoding(Charset) and #setContentType methods, or
 implicitly using the setLocale(java.util.Locale) method. Explicit specifications take precedence over implicit
 specifications. Calls made to these methods after `getWriter` has been called or after the response has
 been committed have no effect on the character encoding. If no character encoding has been specified,
 `ISO-8859-1` is returned.
 

 See RFC 2047 (http://www.ietf.org/rfc/rfc2047.txt) for more information about character encoding and MIME.

### `getContentType()`

**Returns:** `java.lang.String`

The content type proper must have been
 specified using #setContentType before the response is committed. If no content type has been specified, this
 method returns null. If a content type has been specified, and a character encoding has been explicitly or implicitly
 specified as described in #getCharacterEncoding or #getWriter has been called, the charset parameter
 is included in the string returned. If no character encoding has been specified, the charset parameter is omitted.

### `getOutputStream()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletOutputStream`](./ServletOutputStream.md)

The servlet container does
 not encode the binary data.

 

 Calling flush() on the ServletOutputStream commits the response.

 Either this method or #getWriter may be called to write the body, not both, except when #reset has
 been called.

### `getWriter()`

**Returns:** `java.io.PrintWriter`

The `PrintWriter`
 uses the character encoding returned by #getCharacterEncoding. If the response's character encoding has not
 been specified as described in `getCharacterEncoding` (i.e., the method just returns the default value
 `ISO-8859-1`), `getWriter` updates it to `ISO-8859-1`.
 

 Calling flush() on the `PrintWriter` commits the response.
 

 Either this method or #getOutputStream may be called to write the body, not both, except when #reset
 has been called.

### `setCharacterEncoding(`java.lang.String` encoding)`

**Returns:** `void`

If the
 response character encoding has already been set by ServletContext#setResponseCharacterEncoding, the
 deployment descriptor, or using the #setCharacterEncoding(Charset), #setContentType or
 #setLocale methods, the value set in this method overrides all of those values. Calling
 #setContentType with the `String` of `text/html` and calling this method with the
 `String` of `UTF-8` is equivalent to calling #setContentType with the
 `String` of `text/html; charset=UTF-8`.
 

 This method can be called repeatedly to change the character encoding. This method has no effect if it is called
 after `getWriter` has been called or after the response has been committed.
 

 If calling this method has an effect (as per the previous paragraph), calling this method with null clears
 any character encoding set via a previous call to this method, #setCharacterEncoding(Charset),
 #setContentType or #setLocale but does not affect any default character encoding configured via
 ServletContext#setResponseCharacterEncoding or the deployment descriptor.
 

 If this method is called with an invalid or unrecognised character encoding, then a subsequent call to
 #getWriter() will throw a UnsupportedEncodingException. Content for an unknown encoding can be sent
 with the ServletOutputStream returned from #getOutputStream().
 

 Containers may choose to log calls to this method that use an invalid or unrecognised character encoding.
 

 Containers must communicate the character encoding used for the servlet response's writer to the client if the
 protocol provides a way for doing so. In the case of HTTP, the character encoding is communicated as part of the
 `Content-Type` header for text media types. Note that the character encoding cannot be communicated via
 HTTP headers if the servlet does not specify a content type; however, it is still used to encode text written via the
 servlet response's writer.

### `setCharacterEncoding(`java.nio.charset.Charset` encoding)`

**Returns:** `void`

If the
 response character encoding has already been set by ServletContext#setResponseCharacterEncoding, the
 deployment descriptor, or using the #setCharacterEncoding(String), #setContentType or
 #setLocale methods, the value set in this method overrides all of those values. Calling
 #setContentType with the `String` of `text/html` and calling this method with
 StandardCharsets#UTF_8 is equivalent to calling #setContentType with the `String` of
 `text/html; charset=UTF-8`.
 

 This method can be called repeatedly to change the character encoding. This method has no effect if it is called
 after `getWriter` has been called or after the response has been committed.
 

 If calling this method has an effect (as per the previous paragraph), calling this method with null clears
 any character encoding set via a previous call to this method, #setCharacterEncoding(String),
 #setContentType or #setLocale but does not affect any default character encoding configured via
 ServletContext#setResponseCharacterEncoding or the deployment descriptor.
 

 Containers must communicate the character encoding used for the servlet response's writer to the client if the
 protocol provides a way for doing so. In the case of HTTP, the character encoding is communicated as part of the
 `Content-Type` header for text media types. Note that the character encoding cannot be communicated via
 HTTP headers if the servlet does not specify a content type; however, it is still used to encode text written via the
 servlet response's writer.
 

 Implementations are strongly encouraged to override this default method and provide a more efficient implementation.

### `setContentLength(`int` len)`

**Returns:** `void`

This method may be called repeatedly to change the content length. This method has no effect if called after the
 response has been committed.

### `setContentLengthLong(`long` len)`

**Returns:** `void`

This method may be called repeatedly to change the content length. This method has no effect if called after the
 response has been committed.

### `setContentType(`java.lang.String` type)`

**Returns:** `void`

The given
 content type may include a character encoding specification, for example, `text/html;charset=UTF-8`. The
 response's character encoding is only set from the given content type if this method is called before
 #getWriter() is called.
 

 This method may be called repeatedly to change content type and character encoding. This method has no effect if
 called after the response has been committed. It does not set the response's character encoding if it is called after
 `getWriter` has been called or after the response has been committed.
 

 If calling this method has an effect (as per the previous paragraph), calling this method with null clears
 any content type set via a previous call to this method and clears any character encoding set via a previous call to
 this method, #setCharacterEncoding(String), #setCharacterEncoding(Charset) or #setLocale but
 does not affect any default character encoding configured via ServletContext#setResponseCharacterEncoding or
 the deployment descriptor.
 

 If this method is called with an invalid or unrecognised character encoding, then a subsequent call to
 #getWriter() will throw a UnsupportedEncodingException. Content for an unknown encoding can be sent
 with the ServletOutputStream returned from #getOutputStream().
 

 Containers may choose to log calls to this method that use an invalid or unrecognised character encoding.
 

 Containers must communicate the content type and the character encoding used for the servlet response's writer to the
 client if the protocol provides a way for doing so. In the case of HTTP, the `Content-Type` header is
 used.

### `setBufferSize(`int` size)`

**Returns:** `void`

The servlet container will use a buffer at least as
 large as the size requested. The actual buffer size used can be found using `getBufferSize`.

 

 A larger buffer allows more content to be written before anything is actually sent, thus providing the servlet with
 more time to set appropriate status codes and headers. A smaller buffer decreases server memory load and allows the
 client to start receiving data more quickly.

 

 This method must be called before any response body content is written; if content has been written or the response
 object has been committed, this method throws an `IllegalStateException`.

### `getBufferSize()`

**Returns:** `int`

If no buffering is used, this method returns 0.

### `flushBuffer()`

**Returns:** `void`

A call to this method automatically commits the
 response, meaning the status code and headers will be written.

### `resetBuffer()`

**Returns:** `void`

If the response
 has been committed, this method throws an `IllegalStateException`.

### `isCommitted()`

**Returns:** `boolean`

A committed response has already had its status code
 and headers written.

### `reset()`

**Returns:** `void`

The state of calling
 #getWriter or #getOutputStream is also cleared. It is legal, for instance, to call
 #getWriter, #reset and then #getOutputStream. If #getWriter or
 #getOutputStream have been called before this method, then the corrresponding returned Writer or OutputStream
 will be staled and the behavior of using the stale object is undefined. If the response has been committed, this
 method throws an `IllegalStateException`.

### `setLocale(`java.util.Locale` loc)`

**Returns:** `void`

It also sets the response's character
 encoding appropriately for the locale, if the character encoding has not been explicitly set using
 #setContentType, #setCharacterEncoding(String) or #setCharacterEncoding(Charset),
 `getWriter` hasn't been called yet, and the response hasn't been committed yet. If the deployment
 descriptor contains a `locale-encoding-mapping-list` element, and that element provides a mapping for the
 given locale, that mapping is used. Otherwise, the mapping from locale to character encoding is container dependent.
 

 This method may be called repeatedly to change locale and character encoding. The method has no effect if called
 after the response has been committed. It does not set the response's character encoding if it is called after
 #setContentType has been called with a charset specification, after #setCharacterEncoding(String) has
 been called, after #setCharacterEncoding(Charset) has been called, after `getWriter` has been
 called, or after the response has been committed.
 

 If calling this method has an effect on the locale (as per the previous paragraph), calling this method with
 null clears any locale set via a previous call to this method. If calling this method has an effect on the
 character encoding, calling this method with null clears the previously set character encoding.
 

 Containers must communicate the locale and the character encoding used for the servlet response's writer to the
 client if the protocol provides a way for doing so. In the case of HTTP, the locale is communicated via the
 `Content-Language` header, the character encoding as part of the `Content-Type` header for text
 media types. Note that the character encoding cannot be communicated via HTTP headers if the servlet does not specify
 a content type; however, it is still used to encode text written via the servlet response's writer.

### `getLocale()`

**Returns:** `java.util.Locale`

Calls made to
 `setLocale` after the response is committed have no effect. If no locale has been specified, the
 container's default locale is returned.

