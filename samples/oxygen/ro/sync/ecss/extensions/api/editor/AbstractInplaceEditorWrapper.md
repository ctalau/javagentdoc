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

### `createEditor([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

### `getEditorComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `ro.sync.exml.view.graphics.Rectangle` allocation, `ro.sync.exml.view.graphics.Point` mouseInvocationLocation)`

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

### `commitValue()`

**Returns:** `void`

### `cancelEditing()`

**Returns:** `void`

### `removeEditingListener([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md) editingListener)`

**Returns:** `void`

### `refresh([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** `void`

### `insertContent(`java.lang.String` xmlContent)`

**Returns:** `boolean`

