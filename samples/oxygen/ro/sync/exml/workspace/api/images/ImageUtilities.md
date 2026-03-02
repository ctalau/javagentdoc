# Interface: `ImageUtilities`

**Package:** [`ro.sync.exml.workspace.api.images`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.ImageUtilities`

**Extends:** [`ro.sync.exml.workspace.api.images.ImageUtilitiesSpecificProvider`](./ImageUtilitiesSpecificProvider.md)

## Description

## Methods

### `clearImageCache()`

**Returns:** `void`

### `getImageHandlerFor(java.lang.String extension)`

**Returns:** [`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)

**Parameters:**
- `extension` (`java.lang.String`): The extension of the image file which should be supported by the handler.

### `addImageHandler(ro.sync.exml.workspace.api.images.handlers.ImageHandler imageHandler)`

**Returns:** `void`

It will have more priority than the builtin handlers.

**Parameters:**
- `imageHandler` ([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)): The image handler.

### `removeImageHandler(ro.sync.exml.workspace.api.images.handlers.ImageHandler imageHandler)`

**Returns:** `void`

**Parameters:**
- `imageHandler` ([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](handlers/ImageHandler.md)): The image handler to remove.

