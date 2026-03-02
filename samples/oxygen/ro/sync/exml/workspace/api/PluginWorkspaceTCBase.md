# Class: `PluginWorkspaceTCBase`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.PluginWorkspaceTCBase`

## Fields

### `mainFrame`

**Type:** [`ro.sync.exml.MainFrame`](../../MainFrame.md)

### `pluginWorkspace`

**Type:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](standalone/StandalonePluginWorkspace.md)

### `XML_AUTHOR_PRODUCT`

**Type:** `int`

### `XML_EDITOR_PRODUCT`

**Type:** `int`

### `XML_DEVELOPER_PRODUCT`

**Type:** `int`

### `JSON_EDITOR_PRODUCT`

**Type:** `int`

## Constructors

### `<init>(java.io.File arg0, java.io.File arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.io.File`)
- `arg2` (`java.lang.String`)

### `<init>(java.io.File arg0, java.io.File arg1, java.io.File arg2, java.io.File arg3, java.lang.String arg4)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.io.File`)
- `arg2` (`java.io.File`)
- `arg3` (`java.io.File`)
- `arg4` (`java.lang.String`)

### `<init>(java.io.File arg0, java.io.File arg1, java.io.File arg2, java.io.File arg3, java.lang.String arg4, int arg5)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.io.File`)
- `arg2` (`java.io.File`)
- `arg3` (`java.io.File`)
- `arg4` (`java.lang.String`)
- `arg5` (`int`)

## Methods

### `tearDown()`

**Returns:** `void`

### `setUp()`

**Returns:** `void`

### `getPluginWorkspace()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](standalone/StandalonePluginWorkspace.md)

### `open(java.net.URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](editor/WSEditor.md)

### `getCurrentEditorXMLContent()`

**Returns:** `java.lang.String`

### `getCurrentAuthorEditorPageAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](editor/page/author/WSAuthorEditorPage.md)

### `invokeAuthorExtensionActionForID(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `moveCaretRelativeTo(java.lang.String arg0, int arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`int`)
- `arg2` (`boolean`)

**Returns:** `void`

