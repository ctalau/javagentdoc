# Class: `BinaryImageHandler`

**Package:** [`ro.sync.exml.workspace.api.images.handlers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.BinaryImageHandler`

**Extends:** [`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](./ImageHandler.md)

## Description

The handler will receive an input stream for the image and it needs to state if it is interested in handling it...

## Constructors

### `<init>()`

## Methods

### `canHandle(java.io.InputStream inputStream)`

**Returns:** `boolean`

Ideally will read only some metadata from the stream.

**Parameters:**
- `inputStream` (`java.io.InputStream`): The binary image input stream. Never NULL.

