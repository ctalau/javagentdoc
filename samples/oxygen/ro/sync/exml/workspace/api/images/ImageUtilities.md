# Interface: `ImageUtilities`

**Package:** [`ro.sync.exml.workspace.api.images`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.ImageUtilities`

**Extends:** [`ro.sync.exml.workspace.api.images.ImageUtilitiesSpecificProvider`](./ImageUtilitiesSpecificProvider.md)

## Description

## Methods

### `clearImageCache()`

**Returns:** `void`

### `getImageHandlerFor(java.lang.String extension)`

**Parameters:**
- `extension` (`java.lang.String`): The extension of the image file which should be supported by the handler.

**Returns:** [`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)

### `addImageHandler(ro.sync.exml.workspace.api.images.handlers.ImageHandler imageHandler)`

It will have more priority than the builtin handlers.

**Parameters:**
- `imageHandler` ([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)): The image handler.

**Returns:** `void`

### `removeImageHandler(ro.sync.exml.workspace.api.images.handlers.ImageHandler imageHandler)`

**Parameters:**
- `imageHandler` ([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)): The image handler to remove.

**Returns:** `void`

