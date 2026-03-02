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

### `fireEditingStopped(EditingEvent event)`

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

### `addEditingListener(InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `removeEditingListener(InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md))

**Returns:** `void`

### `fireCommitValue(EditingEvent event)`

**Parameters:**
- `event` ([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md)): Editing event.

**Returns:** `void`

### `getBoolean(AuthorInplaceContext context, String key)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md)): The context.
- `key` (`java.lang.String`): The property key.

**Returns:** `java.lang.Boolean`

### `refresh(AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

**Returns:** `void`

### `insertContent(String content)`

**Parameters:**
- `content` (`java.lang.String`)

**Returns:** `boolean`

### `commitValue()`

**Returns:** `void`

