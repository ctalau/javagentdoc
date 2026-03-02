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

### `getRendererComponent(AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

**Returns:** `java.lang.Object`

### `getRenderingInfo(AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](./RendererLayoutInfo.md)

### `getTooltipText(AuthorInplaceContext context, int x, int y)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

**Returns:** `java.lang.String`

### `getCursorType(AuthorInplaceContext context, int x, int y)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

### `getCursorType(int x, int y)`

**Parameters:**
- `x` (`int`)
- `y` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

