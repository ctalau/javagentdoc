# Class: `AbstractComponentProvider`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.AbstractComponentProvider`

**Extends:** [`ro.sync.ecss.extensions.api.component.InternalComponentProvider`](./InternalComponentProvider.md)

**Implements:** [`ro.sync.exml.workspace.api.editor.page.author.DisplayModeConstants`](../../../../exml/workspace/api/editor/page/author/DisplayModeConstants.md), [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `messages`

**Type:** `ro.sync.i18n.c`

### `authorComponentListeners`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener>`

### `editor`

**Type:** `ro.sync.exml.editor.dd`

### `statusPanel`

**Type:** `ro.sync.exml.editor.s.j`

### `detectionFinished`

**Type:** `boolean`

### `editorAccess`

**Type:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

### `untitledFilesCounter`

**Type:** `int`

## Constructors

### `<init>(ro.sync.exml.workspace.b.i.j arg0, java.awt.Frame arg1, java.lang.String[] arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`ro.sync.exml.workspace.b.i.j`)
- `arg1` (`java.awt.Frame`)
- `arg2` (`java.lang.String[]`)
- `arg3` (`java.lang.String`)

### `<init>(ro.sync.exml.workspace.b.i.j arg0, java.awt.Frame arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String arg4)`

**Parameters:**
- `arg0` (`ro.sync.exml.workspace.b.i.j`)
- `arg1` (`java.awt.Frame`)
- `arg2` (`java.lang.String[]`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)

## Methods

### `save()`

**Returns:** `void`

### `load(java.net.URL arg0, java.io.Reader arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)

### `showLocation(java.net.URL arg0, java.io.Reader arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.Reader`)

### `createEditor(ro.sync.exml.workspace.b.i.j arg0, java.awt.Frame arg1, java.lang.String[] arg2, java.lang.String arg3, java.lang.String arg4)`

**Returns:** `ro.sync.exml.editor.dd`

**Parameters:**
- `arg0` (`ro.sync.exml.workspace.b.i.j`)
- `arg1` (`java.awt.Frame`)
- `arg2` (`java.lang.String[]`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)

### `addActionsToActionMap()`

**Returns:** `void`

### `createReader()`

**Returns:** `java.io.Reader`

### `addAuthorComponentListener(ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener`](listeners/AuthorComponentListener.md))

### `removeAuthorComponentListener(ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener`](listeners/AuthorComponentListener.md))

### `getEditorComponent()`

**Returns:** `java.awt.Component`

### `getStatusComponent()`

**Returns:** `java.awt.Component`

### `isModified()`

**Returns:** `boolean`

### `setModified(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `getWSEditorAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

### `getEditorKey()`

**Returns:** `java.lang.Object`

### `getAuthorPage()`

**Returns:** `ro.sync.exml.editor.xmleditor.pageauthor.q`

### `getAdditionalEditHelper(int arg0)`

**Returns:** `javax.swing.JComponent`

**Parameters:**
- `arg0` (`int`)

### `print(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `showLocation(java.net.URL arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)

