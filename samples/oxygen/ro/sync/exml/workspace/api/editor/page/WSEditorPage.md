# Interface: `WSEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.WSEditorPage`

## Description

## Methods

### `setReadOnly(ro.sync.exml.workspace.api.editor.ReadOnlyReason reason)`

**Parameters:**
- `reason` ([`ro.sync.exml.workspace.api.editor.ReadOnlyReason`](../ReadOnlyReason.md)): The reason for making the document read-only. 
   If `null` is passed, a default message will be displayed.

**Returns:** `void`

### `setReadOnly(java.lang.String reason)`

**Parameters:**
- `reason` (`java.lang.String`): The reason for making the document read-only. It will be displayed 
   to the user. If `null` is passed, a default message will be displayed.

**Returns:** `void`

### `setEditable(boolean editable)`

It is recommended to use #setReadOnly(String) if you plan to make 
 the page read-only.

**Parameters:**
- `editable` (`boolean`): `true` if the page should be editable.

**Returns:** `void`

### `isEditable()`

A document can be set as read-only from API, by using the 
 #setEditable(boolean) method.

**Returns:** `boolean`

### `getParentEditor()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../WSEditor.md)

### `requestFocus()`

Works for all editing modes (Text/Grid/Author) in the standalone and Eclipse-based Oxygen and Author Component distributions.
 Does not do anything in the WebAuthor online editor.

**Returns:** `void`

### `hasFocus()`

**Returns:** `boolean`

