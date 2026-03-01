# Interface: `ServletContext`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletContext`

## Description

## Methods

### `getRealPath(`java.lang.String` path)`

**Returns:** `java.lang.String`

For example, the path "/index.html" returns the absolute file path on the server's filesystem would be served by a request for "http://host/contextPath/index.html", where contextPath is the context path of this ServletContext..
 The real path returned will be in a form appropriate to the computer and operating system on which the servlet container is running, including the proper path separators. This method returns null if the servlet container cannot translate the virtual path to a real path for any reason (such as when the content is being made available from a .war archive).

### `getContextPath()`

**Returns:** `java.lang.String`

The context path is the portion of the request URI that is used to select the context of the request. The context path always comes first in a request URI. The path starts with a "/" character but does not end with a "/" character. For servlets in the default (root) context, this method returns "".

 It is possible that a servlet container may match a context by more than one context path. In such cases the HttpServletRequest.getContextPath() will return the actual context path used by the request and it may differ from the path returned by this method. The context path returned by this method should be considered as the prime or preferred context path of the application.

### `getAttribute(`java.lang.String` name)`

**Returns:** `java.lang.Object`

An attribute allows a servlet container to give the servlet additional information not already provided by this
 interface. See your server documentation for information about its attributes. A list of supported attributes can be
 retrieved using `getAttributeNames`.

 

 The attribute is returned as a `java.lang.Object` or some subclass.

 

 Attribute names should follow the same convention as package names. The Jakarta Servlet specification reserves names
 matching `java.*`, `javax.*`, and `sun.*`.

### `getAttributeNames()`

**Returns:** `java.util.Enumeration<java.lang.String>`

Use the #getAttribute method with an attribute name to get the value of an attribute.

### `setAttribute(`java.lang.String` name, `java.lang.Object` object)`

**Returns:** `void`

If the name specified is already used for an
 attribute, this method will replace the attribute with the new to the new attribute.
 

 If listeners are configured on the `ServletContext` the container notifies them accordingly.
 

 If a null value is passed, the effect is the same as calling `removeAttribute()`.

 

 Attribute names should follow the same convention as package names. The Jakarta Servlet specification reserves names
 matching `java.*`, `javax.*`, and `sun.*`.

### `removeAttribute(`java.lang.String` name)`

**Returns:** `void`

After removal, subsequent calls to
 #getAttribute to retrieve the attribute's value will return `null`.

 

 If listeners are configured on the `ServletContext` the container notifies them accordingly.

