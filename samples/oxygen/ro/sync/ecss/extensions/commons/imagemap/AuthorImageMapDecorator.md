# Class: `AuthorImageMapDecorator`

**Package:** [`ro.sync.ecss.extensions.commons.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.imagemap.AuthorImageMapDecorator`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorImageDecorator`](../../api/AuthorImageDecorator.md)

## Description

It paints the areas of the image map over the image.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `imageMapCore`

**Type:** [`ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore`](./EditImageMapCore.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore imageMapCore)`

**Parameters:**
- `imageMapCore` ([`ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore`](./EditImageMapCore.md)): The image map core.

## Methods

### `isNodeOfInterest(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.imagemap.SupportedFrameworks framework)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The current node.
- `framework` ([`ro.sync.ecss.imagemap.SupportedFrameworks`](../../../imagemap/SupportedFrameworks.md)): The current framework.

**Returns:** `boolean`

### `paint(ro.sync.exml.view.graphics.Graphics g, int x, int y, int imageWidth, int imageHeight, ro.sync.exml.view.graphics.Rectangle originalSize, ro.sync.ecss.extensions.api.node.AuthorNode element, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean wasAnnotated)`

**Parameters:**
- `g` (`ro.sync.exml.view.graphics.Graphics`)
- `x` (`int`)
- `y` (`int`)
- `imageWidth` (`int`)
- `imageHeight` (`int`)
- `originalSize` (`ro.sync.exml.view.graphics.Rectangle`)
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `wasAnnotated` (`boolean`)

**Returns:** `void`

