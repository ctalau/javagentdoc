# Class: `AuthorImageDecorator`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorImageDecorator`

**Implements:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

For instance it can overlay some meta-information 
 over the image.
 
It receives the graphics device, the size and position of the underlying image.

## Constructors

### `<init>()`

## Methods

### `paint(`ro.sync.exml.view.graphics.Graphics` g, `int` x, `int` y, `int` imageWidth, `int` imageHeight, `ro.sync.exml.view.graphics.Rectangle` originalSize, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) element, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `boolean` wasAnnotated)`

**Returns:** `void`

The image was already painted in the provided Graphics.

### `getDescription()`

**Returns:** `java.lang.String`

