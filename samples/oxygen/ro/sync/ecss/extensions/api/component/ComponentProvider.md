# Interface: `ComponentProvider`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.ComponentProvider`

## Description

## Methods

### `load(`java.net.URL` url, `java.io.Reader` reader)`

**Returns:** `void`

This does not guarantee that the set content has been interpreted, you should set an
 AuthorComponentListener and listen for `documentTypeChanged()` before using
 the author extension actions.

### `getEditorComponent()`

**Returns:** `java.awt.Component`

### `getStatusComponent()`

**Returns:** `java.awt.Component`

### `print(`boolean` preview)`

**Returns:** `void`

Shows the Print dialog.

### `getWSEditorAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

