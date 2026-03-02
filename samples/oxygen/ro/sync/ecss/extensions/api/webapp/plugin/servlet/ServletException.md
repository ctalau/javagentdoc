# Class: `ServletException`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletException`

**Extends:** `java.lang.Exception`

## Description

## Constructors

### `<init>()`

### `<init>(java.lang.String message)`

The message can be written to the server log and/or
 displayed for the user.

**Parameters:**
- `message` (`java.lang.String`): a `String` specifying the text of the exception message

### `<init>(java.lang.String message, java.lang.Throwable rootCause)`

**Parameters:**
- `message` (`java.lang.String`): a `String` containing the text of the exception message
- `rootCause` (`java.lang.Throwable`): the `Throwable` exception that interfered with the servlet's normal operation, making
 this servlet exception necessary

### `<init>(java.lang.Throwable rootCause)`

The exception's message is based on the localized message
 of the underlying exception.

 

 This method calls the `getLocalizedMessage` method on the `Throwable` exception to get a
 localized exception message. When subclassing `ServletException`, this method can be overridden to create
 an exception message designed for a specific locale.

**Parameters:**
- `rootCause` (`java.lang.Throwable`): the `Throwable` exception that interfered with the servlet's normal operation, making the
 servlet exception necessary

