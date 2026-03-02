# Class: `AbstractInplaceEditorWrapper`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.AbstractInplaceEditorWrapper`

**Implements:** [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

## Description

For example if in the CSS oxy_editor() function we have a **test** parameter with more possible 
 values and we must provide a different editor implementation for each one.

## Fields

### `cEditor`

**Type:** [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `createEditor(AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md)): Editing context.

**Returns:** [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

### `getEditorComponent(AuthorInplaceContext context, Rectangle allocation, Point mouseInvocationLocation)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))
- `allocation` (`ro.sync.exml.view.graphics.Rectangle`)
- `mouseInvocationLocation` (`ro.sync.exml.view.graphics.Point`)

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

### `commitValue()`

**Returns:** `void`

### `cancelEditing()`

**Returns:** `void`

### `removeEditingListener(InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `refresh(AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

**Returns:** `void`

### `insertContent(String xmlContent)`

**Parameters:**
- `xmlContent` (`java.lang.String`)

**Returns:** `boolean`

