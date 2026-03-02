# Class: `ImageHandler`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.ImageHandler`

## Description

## Constructors

### `<init>()`

## Methods

### `getImage(ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider contentProvider, ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext renderingContext)`

**Returns:** `java.awt.Image`

**Parameters:**
- `contentProvider` ([`ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider`](providers/ImageContentProvider.md)): Provides access to the image contents. 
 If the image is embedded in the content, the content provider is an instance of EmbeddedImageContentProvider
- `renderingContext` ([`ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext`](./ImageRenderingContext.md)): The rendering context. Never `null`. Should contain the font of the parent element where 
 the equation/graphic resides. Can be ignored for raster graphics.

### `canHandleFileType(java.lang.String extension)`

**Returns:** `boolean`

**Parameters:**
- `extension` (`java.lang.String`): The extension of the file, or the type of the XML content to be rendered.
 The implementation should accept the string in a case insensitive manner. 
 Examples: "mathml", "SVG", "svg"..

### `getImageLayoutInformation(ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider contentProvider, ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext renderingContext)`

**Returns:** [`ro.sync.exml.workspace.api.images.handlers.ImageLayoutInformation`](./ImageLayoutInformation.md)

Ideally the handler should compute it as fast as possible, without loading the entire image in memory.

**Parameters:**
- `contentProvider` ([`ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider`](providers/ImageContentProvider.md)): Provides access to the image contents.
 If the image is embedded in the content, the content provider is an instance of EmbeddedImageContentProvider
- `renderingContext` ([`ro.sync.exml.workspace.api.images.handlers.ImageRenderingContext`](./ImageRenderingContext.md)): The rendering context. Should contain the font of the parent element where 
 the equation/graphic resides. Can be ignored for raster graphics.

### `clearCache()`

**Returns:** `void`

