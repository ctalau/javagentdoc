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

### `getRendererComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** `java.lang.Object`

### `getRenderingInfo([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](./RendererLayoutInfo.md)

### `getTooltipText([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `int` x, `int` y)`

**Returns:** `java.lang.String`

### `getEditorComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `ro.sync.exml.view.graphics.Rectangle` allocation, `ro.sync.exml.view.graphics.Point` mouseLocation)`

**Returns:** `java.lang.Object`

### `getScrollRectangle()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `addEditingListener([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md) editingListener)`

**Returns:** `void`

### `requestFocus()`

**Returns:** `void`

### `getValue()`

**Returns:** `java.lang.Object`

### `stopEditing()`

**Returns:** `void`

### `cancelEditing()`

**Returns:** `void`

### `removeEditingListener([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md) editingListener)`

**Returns:** `void`

### `getCursorType([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

### `getCursorType(`int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

### `commitValue()`

**Returns:** `void`

