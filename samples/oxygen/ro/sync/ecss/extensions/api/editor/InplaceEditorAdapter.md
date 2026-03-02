# Class: `InplaceEditorAdapter`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceEditorAdapter`

**Implements:** [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

## Description

By extending this adapter you are protected if any new methods are added 
 inside InplaceEditor.

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `getEditorComponent(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, ro.sync.exml.view.graphics.Rectangle allocation, ro.sync.exml.view.graphics.Point mouseInvocationLocation)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `allocation` (`ro.sync.exml.view.graphics.Rectangle`)
- `mouseInvocationLocation` (`ro.sync.exml.view.graphics.Point`)

**Returns:** `java.lang.Object`

### `getScrollRectangle()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `addEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

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

### `removeEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `refresh(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

**Returns:** `void`

