# Class: `URLStreamHandlerWithContextUtil`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.URLStreamHandlerWithContextUtil`

## Description

The context ID is typically added when the user asks the webapp to open an URL
 and is stripped before displaying a URL to the user.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `instance`

**Type:** [`ro.sync.ecss.extensions.api.webapp.plugin.URLStreamHandlerWithContextUtil`](./URLStreamHandlerWithContextUtil.md)

### `field`

**Type:** `java.lang.reflect.Field`

### `handlersCache`

**Type:** `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.webapp.plugin.URLStreamHandlerWithContext>`

## Constructors

### `<init>()`

## Methods

### `getInstance()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.URLStreamHandlerWithContextUtil`](./URLStreamHandlerWithContextUtil.md)

### `setUserContext(UserContext context, URL url)`

If the URL handler for this URL
 is an URLStreamHandlerWithContext, it is used to set the context for the URL,
 otherwise the URL is left unmodified.
 
 Note: If the URL already has a context, the newly set context must have the same id.

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.webapp.plugin.UserContext`](./UserContext.md)): The context.
- `url` (`java.net.URL`): The URL.

**Returns:** `void`

### `copyContextId(URL source, URL target)`

If the two URLs have different protocols, this method does nothing.

**Parameters:**
- `source` (`java.net.URL`): The URL from which to copy the user context id.
- `target` (`java.net.URL`): The URL where to copy the user context id.

**Returns:** `void`

### `toStrippedExternalForm(URL url)`

**Parameters:**
- `url` (`java.net.URL`): The URL with the context id.

**Returns:** `java.lang.String`

### `getUrlContextId(URL url)`

**Parameters:**
- `url` (`java.net.URL`): The URL with the context id.

**Returns:** `java.lang.String`

### `getUrlHandler(URL u)`

**Parameters:**
- `u` (`java.net.URL`): The URL.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.URLStreamHandlerWithContext`](./URLStreamHandlerWithContext.md)

### `clearCacheForTC()`

Note: To be used only from TC.

**Returns:** `void`

