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

### `<init>(`ro.sync.exml.workspace.b.i.j` arg0, `java.awt.Frame` arg1, `java.lang.String[]` arg2, `java.lang.String` arg3)`

### `<init>(`ro.sync.exml.workspace.b.i.j` arg0, `java.awt.Frame` arg1, `java.lang.String[]` arg2, `java.lang.String` arg3, `java.lang.String` arg4)`

## Methods

### `save()`

**Returns:** `void`

### `load(`java.net.URL` arg0, `java.io.Reader` arg1)`

**Returns:** `void`

### `showLocation(`java.net.URL` arg0, `java.io.Reader` arg1)`

**Returns:** `void`

### `createEditor(`ro.sync.exml.workspace.b.i.j` arg0, `java.awt.Frame` arg1, `java.lang.String[]` arg2, `java.lang.String` arg3, `java.lang.String` arg4)`

**Returns:** `ro.sync.exml.editor.dd`

### `addActionsToActionMap()`

**Returns:** `void`

### `createReader()`

**Returns:** `java.io.Reader`

### `addAuthorComponentListener([`ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener`](listeners/AuthorComponentListener.md) arg0)`

**Returns:** `void`

### `removeAuthorComponentListener([`ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener`](listeners/AuthorComponentListener.md) arg0)`

**Returns:** `void`

### `getEditorComponent()`

**Returns:** `java.awt.Component`

### `getStatusComponent()`

**Returns:** `java.awt.Component`

### `isModified()`

**Returns:** `boolean`

### `setModified(`boolean` arg0)`

**Returns:** `void`

### `getWSEditorAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

### `getEditorKey()`

**Returns:** `java.lang.Object`

### `getAuthorPage()`

**Returns:** `ro.sync.exml.editor.xmleditor.pageauthor.q`

### `getAdditionalEditHelper(`int` arg0)`

**Returns:** `javax.swing.JComponent`

### `print(`boolean` arg0)`

**Returns:** `void`

### `showLocation(`java.net.URL` arg0)`

**Returns:** `void`

