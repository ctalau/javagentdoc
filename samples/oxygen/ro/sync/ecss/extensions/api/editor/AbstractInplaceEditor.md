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

### `fireEditingStopped([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md) event)`

**Returns:** `void`

### `fireEditingCanceled()`

**Returns:** `void`

### `fireEditingOccured()`

**Returns:** `void`

### `fireNextEditLocationRequested()`

**Returns:** `void`

### `firePreviousEditLocationRequested()`

**Returns:** `void`

### `addEditingListener([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md) editingListener)`

**Returns:** `void`

### `removeEditingListener([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md) editingListener)`

**Returns:** `void`

### `fireCommitValue([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md) event)`

**Returns:** `void`

### `getBoolean([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `java.lang.String` key)`

**Returns:** `java.lang.Boolean`

### `refresh([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** `void`

### `insertContent(`java.lang.String` content)`

**Returns:** `boolean`

### `commitValue()`

**Returns:** `void`

