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

### `<init>([`ro.sync.ecss.extensions.commons.imagemap.EditImageMapCore`](./EditImageMapCore.md) imageMapCore)`

## Methods

### `isNodeOfInterest([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, [`ro.sync.ecss.imagemap.SupportedFrameworks`](../../../imagemap/SupportedFrameworks.md) framework)`

**Returns:** `boolean`

### `paint(`ro.sync.exml.view.graphics.Graphics` g, `int` x, `int` y, `int` imageWidth, `int` imageHeight, `ro.sync.exml.view.graphics.Rectangle` originalSize, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) element, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `boolean` wasAnnotated)`

**Returns:** `void`

