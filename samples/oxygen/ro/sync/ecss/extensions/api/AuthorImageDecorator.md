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

### `paint(ro.sync.exml.view.graphics.Graphics g, int x, int y, int imageWidth, int imageHeight, ro.sync.exml.view.graphics.Rectangle originalSize, ro.sync.ecss.extensions.api.node.AuthorNode element, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean wasAnnotated)`

**Returns:** `void`

The image was already painted in the provided Graphics.

**Parameters:**
- `g` (`ro.sync.exml.view.graphics.Graphics`): The graphics.
- `x` (`int`): The X of the area to be painted. It is the top left corner of the image.
- `y` (`int`): The Y of the area to be painted. It is the top left corner of the image.
- `imageWidth` (`int`): The image width.
- `imageHeight` (`int`): The image height.
- `originalSize` (`ro.sync.exml.view.graphics.Rectangle`): The original size of the image.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The element to be painted.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.
- `wasAnnotated` (`boolean`): If `true` the image was annotated with previous dimensions.

### `getDescription()`

**Returns:** `java.lang.String`

