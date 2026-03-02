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

### `getRendererComponent(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `java.lang.Object`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

### `getRenderingInfo(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](./RendererLayoutInfo.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

### `getTooltipText(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, int x, int y)`

**Returns:** `java.lang.String`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

### `getCursorType(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, int x, int y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

### `getCursorType(int x, int y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

**Parameters:**
- `x` (`int`)
- `y` (`int`)

