# Class: `AbstractInplaceEditor`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.AbstractInplaceEditor`

**Implements:** [`ro.sync.ecss.extensions.api.editor.InplaceEditor`](./InplaceEditor.md)

## Description

## Fields

### `editingListeners`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.editor.InplaceEditingListener>`

## Constructors

### `<init>()`

## Methods

### `fireEditingStopped(ro.sync.ecss.extensions.api.editor.EditingEvent event)`

**Parameters:**
- `event` ([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md)): Editing event.

**Returns:** `void`

### `fireEditingCanceled()`

**Returns:** `void`

### `fireEditingOccured()`

**Returns:** `void`

### `fireNextEditLocationRequested()`

**Returns:** `void`

### `firePreviousEditLocationRequested()`

**Returns:** `void`

### `addEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `removeEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `fireCommitValue(ro.sync.ecss.extensions.api.editor.EditingEvent event)`

**Parameters:**
- `event` ([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md)): Editing event.

**Returns:** `void`

### `getBoolean(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, java.lang.String key)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md)): The context.
- `key` (`java.lang.String`): The property key.

**Returns:** `java.lang.Boolean`

### `refresh(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

**Returns:** `void`

### `insertContent(java.lang.String content)`

**Parameters:**
- `content` (`java.lang.String`)

**Returns:** `boolean`

### `commitValue()`

**Returns:** `void`

