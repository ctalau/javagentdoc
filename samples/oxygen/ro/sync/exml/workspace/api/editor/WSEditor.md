# Interface: `WSEditor`

**Package:** [`ro.sync.exml.workspace.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.WSEditor`

**Extends:** [`ro.sync.exml.workspace.api.editor.WSEditorBase`](./WSEditorBase.md), [`ro.sync.exml.editor.EditorPageConstants`](../../../editor/EditorPageConstants.md)

## Methods

### `getCurrentPage()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](page/WSEditorPage.md)

### `getCurrentPageID()`

**Returns:** `java.lang.String`

### `addPageChangedListener([`ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener`](../listeners/WSEditorPageChangedListener.md) arg0)`

**Returns:** `void`

### `removePageChangedListener([`ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener`](../listeners/WSEditorPageChangedListener.md) arg0)`

**Returns:** `void`

### `addEditorListener([`ro.sync.exml.workspace.api.listeners.WSEditorListener`](../listeners/WSEditorListener.md) arg0)`

**Returns:** `void`

### `getEditorListeners()`

**Returns:** [`ro.sync.exml.workspace.api.listeners.WSEditorListener[]`](../listeners/WSEditorListener.md)

### `removeEditorListener([`ro.sync.exml.workspace.api.listeners.WSEditorListener`](../listeners/WSEditorListener.md) arg0)`

**Returns:** `void`

### `changePage(`java.lang.String` arg0)`

**Returns:** `void`

### `addValidationProblemsFilter([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](validation/ValidationProblemsFilter.md) arg0)`

**Returns:** `void`

### `removeValidationProblemsFilter([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](validation/ValidationProblemsFilter.md) arg0)`

**Returns:** `void`

### `checkValid()`

**Returns:** `boolean`

### `checkValid(`boolean` arg0)`

**Returns:** `boolean`

### `getComponent()`

**Returns:** `java.lang.Object`

### `setEditable(`boolean` arg0)`

**Returns:** `void`

### `isEditable()`

**Returns:** `boolean`

### `getContentType()`

**Returns:** `java.lang.String`

### `reloadIfChangeOnDiskDetected()`

**Returns:** `void`

### `reload()`

**Returns:** `void`

