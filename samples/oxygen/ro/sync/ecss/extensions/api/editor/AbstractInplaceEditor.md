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

**Returns:** `void`

**Parameters:**
- `event` ([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md)): Editing event.

### `fireEditingCanceled()`

**Returns:** `void`

### `fireEditingOccured()`

**Returns:** `void`

### `fireNextEditLocationRequested()`

**Returns:** `void`

### `firePreviousEditLocationRequested()`

**Returns:** `void`

### `addEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

**Returns:** `void`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

### `removeEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

**Returns:** `void`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

### `fireCommitValue(ro.sync.ecss.extensions.api.editor.EditingEvent event)`

**Returns:** `void`

**Parameters:**
- `event` ([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md)): Editing event.

### `getBoolean(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, java.lang.String key)`

**Returns:** `java.lang.Boolean`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md)): The context.
- `key` (`java.lang.String`): The property key.

### `refresh(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

### `insertContent(java.lang.String content)`

**Returns:** `boolean`

**Parameters:**
- `content` (`java.lang.String`)

### `commitValue()`

**Returns:** `void`

