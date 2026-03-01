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

### `<init>(`java.io.File` arg0, `java.io.File` arg1, `java.lang.String` arg2)`

### `<init>(`java.io.File` arg0, `java.io.File` arg1, `java.io.File` arg2, `java.io.File` arg3, `java.lang.String` arg4)`

### `<init>(`java.io.File` arg0, `java.io.File` arg1, `java.io.File` arg2, `java.io.File` arg3, `java.lang.String` arg4, `int` arg5)`

## Methods

### `tearDown()`

**Returns:** `void`

### `setUp()`

**Returns:** `void`

### `getPluginWorkspace()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](standalone/StandalonePluginWorkspace.md)

### `open(`java.net.URL` arg0)`

**Returns:** [`ro.sync.exml.workspace.api.editor.WSEditor`](editor/WSEditor.md)

### `getCurrentEditorXMLContent()`

**Returns:** `java.lang.String`

### `getCurrentAuthorEditorPageAccess()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](editor/page/author/WSAuthorEditorPage.md)

### `invokeAuthorExtensionActionForID(`java.lang.String` arg0)`

**Returns:** `void`

### `moveCaretRelativeTo(`java.lang.String` arg0, `int` arg1, `boolean` arg2)`

**Returns:** `void`

