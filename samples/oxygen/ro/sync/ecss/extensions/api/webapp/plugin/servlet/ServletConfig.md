# Interface: `ServletConfig`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletConfig`

## Description

## Methods

### `getServletName()`

**Returns:** `java.lang.String`

The name may be provided via server administration, assigned in the web
 application deployment descriptor, or for an unregistered (and thus unnamed) servlet instance it will be the
 servlet's class name.

### `getServletContext()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.servlet.ServletContext`](./ServletContext.md)

### `getInitParameter(java.lang.String name)`

**Returns:** `java.lang.String`

**Parameters:**
- `name` (`java.lang.String`): the name of the initialization parameter whose value to get

### `getInitParameterNames()`

**Returns:** `java.util.Enumeration<java.lang.String>`

