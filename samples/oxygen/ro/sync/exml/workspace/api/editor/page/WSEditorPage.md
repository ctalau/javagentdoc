# Interface: `WSEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.WSEditorPage`

## Description

## Methods

### `setReadOnly([`ro.sync.exml.workspace.api.editor.ReadOnlyReason`](../ReadOnlyReason.md) reason)`

**Returns:** `void`

### `setReadOnly(`java.lang.String` reason)`

**Returns:** `void`

### `setEditable(`boolean` editable)`

**Returns:** `void`

It is recommended to use #setReadOnly(String) if you plan to make 
 the page read-only.

### `isEditable()`

**Returns:** `boolean`

A document can be set as read-only from API, by using the 
 #setEditable(boolean) method.

### `getParentEditor()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../WSEditor.md)

### `requestFocus()`

**Returns:** `void`

Works for all editing modes (Text/Grid/Author) in the standalone and Eclipse-based Oxygen and Author Component distributions.
 Does not do anything in the WebAuthor online editor.

### `hasFocus()`

**Returns:** `boolean`

