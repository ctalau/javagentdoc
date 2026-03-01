# Class: `ImageHandler`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.ImageHandler`

## Description

## Constructors

### `<init>()`

## Methods

### `getImage([`ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider`](providers/ImageContentProvider.md) contentProvider, [`ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext`](./ImageRenderingContext.md) renderingContext)`

**Returns:** `java.awt.Image`

### `canHandleFileType(`java.lang.String` extension)`

**Returns:** `boolean`

### `getImageLayoutInformation([`ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider`](providers/ImageContentProvider.md) contentProvider, [`ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext`](./ImageRenderingContext.md) renderingContext)`

**Returns:** [`ro.sync.exml.workspace.api.images.handlers.ImageLayoutInformation`](./ImageLayoutInformation.md)

Ideally the handler should compute it as fast as possible, without loading the entire image in memory.

### `clearCache()`

**Returns:** `void`

