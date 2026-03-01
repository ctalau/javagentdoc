# Class: `InplaceRendererAdapter`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceRendererAdapter`

**Implements:** [`ro.sync.ecss.extensions.api.editor.InplaceRenderer`](./InplaceRenderer.md)

## Description

By extending this adapter you are protected if any new methods are added 
 inside InplaceRenderer.

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `getRendererComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** `java.lang.Object`

### `getRenderingInfo([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](./RendererLayoutInfo.md)

### `getTooltipText([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `int` x, `int` y)`

**Returns:** `java.lang.String`

### `getCursorType([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

### `getCursorType(`int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

