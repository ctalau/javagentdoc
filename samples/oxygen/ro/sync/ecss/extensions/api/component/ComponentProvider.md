# Interface: `ComponentProvider`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.ComponentProvider`

## Description

## Methods

### `load(java.net.URL url, java.io.Reader reader)`

This does not guarantee that the set content has been interpreted, you should set an
 AuthorComponentListener and listen for `documentTypeChanged()` before using
 the author extension actions.

**Parameters:**
- `url` (`java.net.URL`): URL to load, can be `null` if the reader is specified
                  If no XML content reader is given, the URL will be used both to obtain the
                  content and to solve relative references (eg: images).
                  If the XML content reader is also given, the URL will only be used to solve
                  relative references from the file.
- `reader` (`java.io.Reader`): The reader.

**Returns:** `void`

### `getEditorComponent()`

**Returns:** `java.awt.Component`

### `getStatusComponent()`

**Returns:** `java.awt.Component`

### `print(boolean preview)`

Shows the Print dialog.

**Parameters:**
- `preview` (`boolean`): `true` to show the Print Preview dialog, `false` to show the Print dialog.

**Returns:** `void`

### `getWSEditorAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](../../../../exml/workspace/api/editor/WSEditor.md)

