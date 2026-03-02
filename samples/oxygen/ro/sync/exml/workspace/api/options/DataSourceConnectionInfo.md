# Interface: `DataSourceConnectionInfo`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.DataSourceConnectionInfo`

## Description

## Fields

### `DRIVER_NAME`

**Type:** `java.lang.String`

It can not be `null`.

### `HOST_NAME`

**Type:** `java.lang.String`

For relational databases it can be `null`.

### `INITIAL_DATABASE`

**Type:** `java.lang.String`

It can be `null`.

### `PORT`

**Type:** `java.lang.String`

For relational databases can be included into the URL.

### `CONNECTION_NAME`

**Type:** `java.lang.String`

### `URL`

**Type:** `java.lang.String`

It can be `null`.

### `WEBDAV_URL`

**Type:** `java.lang.String`

Some databases can be accessed using a WEBDAV URL.
 It can be `null`.

## Methods

### `getProperty(java.lang.String propertyId)`

**Parameters:**
- `propertyId` (`java.lang.String`): The property identifier.

**Returns:** `java.lang.Object`

