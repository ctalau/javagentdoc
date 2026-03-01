# Interface: `ImageUtilities`

**Package:** [`ro.sync.exml.workspace.api.images`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.ImageUtilities`

**Extends:** [`ro.sync.exml.workspace.api.images.ImageUtilitiesSpecificProvider`](./ImageUtilitiesSpecificProvider.md)

## Description

## Methods

### `clearImageCache()`

**Returns:** `void`

### `getImageHandlerFor(`java.lang.String` extension)`

**Returns:** [`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)

### `addImageHandler([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md) imageHandler)`

**Returns:** `void`

It will have more priority than the builtin handlers.

### `removeImageHandler([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md) imageHandler)`

**Returns:** `void`

