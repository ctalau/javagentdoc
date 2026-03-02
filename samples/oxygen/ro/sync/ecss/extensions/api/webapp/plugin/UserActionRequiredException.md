# Class: `UserActionRequiredException`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.UserActionRequiredException`

**Extends:** `java.io.IOException`

## Description

## Fields

### `webappMessage`

**Type:** [`ro.sync.ecss.extensions.api.webapp.WebappMessage`](../WebappMessage.md)

## Constructors

### `<init>(WebappMessage webappMessage)`

**Parameters:**
- `webappMessage` ([`ro.sync.ecss.extensions.api.webapp.WebappMessage`](../WebappMessage.md)): The webapp message.

## Methods

### `getUserMessage()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebappMessage`](../WebappMessage.md)

### `getUserMessage(URL url)`

**Parameters:**
- `url` (`java.net.URL`): The URL of the resource for which the user action required exception 
   is thrown.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.plugin.UserActionRequiredMessage`](./UserActionRequiredMessage.md)

