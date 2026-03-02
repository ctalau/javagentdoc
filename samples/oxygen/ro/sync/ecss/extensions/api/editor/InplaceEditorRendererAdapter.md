# Class: `InplaceEditorRendererAdapter`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceEditorRendererAdapter`

**Implements:** [`ro.sync.ecss.extensions.api.editor.InplaceRenderer`](./InplaceRenderer.md), [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

## Description

By extending this adapter you are protected if any new methods are added 
 inside InplaceRenderer or InplaceEditor.

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

### `getEditorComponent(AuthorInplaceContext context, Rectangle allocation, Point mouseLocation)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `allocation` (`ro.sync.exml.view.graphics.Rectangle`)
- `mouseLocation` (`ro.sync.exml.view.graphics.Point`)

**Returns:** `java.lang.Object`

### `getScrollRectangle()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `addEditingListener(InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `requestFocus()`

**Returns:** `void`

### `getValue()`

**Returns:** `java.lang.Object`

### `stopEditing()`

**Returns:** `void`

### `cancelEditing()`

**Returns:** `void`

### `removeEditingListener(InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

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

### `commitValue()`

**Returns:** `void`

