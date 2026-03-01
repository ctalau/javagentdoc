# Class: `ServletException`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletException`

**Extends:** `java.lang.Exception`

## Description

## Constructors

### `<init>()`

### `<init>(`java.lang.String` message)`

The message can be written to the server log and/or
 displayed for the user.

### `<init>(`java.lang.String` message, `java.lang.Throwable` rootCause)`

### `<init>(`java.lang.Throwable` rootCause)`

The exception's message is based on the localized message
 of the underlying exception.

 

 This method calls the `getLocalizedMessage` method on the `Throwable` exception to get a
 localized exception message. When subclassing `ServletException`, this method can be overridden to create
 an exception message designed for a specific locale.

