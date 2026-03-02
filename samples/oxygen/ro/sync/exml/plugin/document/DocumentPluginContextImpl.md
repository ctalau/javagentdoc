# Class: `DocumentPluginContextImpl`

**Package:** [`ro.sync.exml.plugin.document`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.document.DocumentPluginContextImpl`

**Implements:** [`ro.sync.exml.plugin.document.DocumentPluginContext`](./DocumentPluginContext.md)

## Fields

### `b`

**Type:** `javax.swing.text.Document`

### `d`

**Type:** `java.awt.Frame`

### `c`

**Type:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../../workspace/api/standalone/StandalonePluginWorkspace.md)

### `e`

**Type:** [`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../../workspace/api/editor/page/text/WSTextEditorPage.md)

## Constructors

### `<init>()`

### `<init>(WSTextEditorPage arg0, Document arg1, Frame arg2, StandalonePluginWorkspace arg3)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../../workspace/api/editor/page/text/WSTextEditorPage.md))
- `arg1` (`javax.swing.text.Document`)
- `arg2` (`java.awt.Frame`)
- `arg3` ([`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../../workspace/api/standalone/StandalonePluginWorkspace.md))

## Methods

### `setDocument(Document arg0)`

**Parameters:**
- `arg0` (`javax.swing.text.Document`)

**Returns:** `void`

### `setFrame(Frame arg0)`

**Parameters:**
- `arg0` (`java.awt.Frame`)

**Returns:** `void`

### `getDocument()`

**Returns:** `javax.swing.text.Document`

### `getFrame()`

**Returns:** `java.awt.Frame`

### `getPluginWorkspace()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace`](../../workspace/api/standalone/StandalonePluginWorkspace.md)

### `getTextPage()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../../workspace/api/editor/page/text/WSTextEditorPage.md)

