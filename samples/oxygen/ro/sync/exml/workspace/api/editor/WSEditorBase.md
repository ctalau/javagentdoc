# Interface: `WSEditorBase`

**Package:** [`ro.sync.exml.workspace.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.WSEditorBase`

**Extends:** [`ro.sync.exml.workspace.api.base.ModifiedStatusProvider`](../base/ModifiedStatusProvider.md), [`ro.sync.exml.workspace.api.editor.ScenarioInvoker`](./ScenarioInvoker.md)

## Methods

### `getEncodingForSerialization()`

**Returns:** `java.lang.String`

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `save()`

**Returns:** `void`

### `saveAs(`java.net.URL` arg0)`

**Returns:** `void`

### `close(`boolean` arg0)`

**Returns:** `boolean`

### `setModified(`boolean` arg0)`

**Returns:** `void`

### `isNewDocument()`

**Returns:** `boolean`

### `createContentReader()`

**Returns:** `java.io.Reader`

### `createContentInputStream()`

**Returns:** `java.io.InputStream`

### `reloadContent(`java.io.Reader` arg0)`

**Returns:** `void`

### `reloadContent(`java.io.Reader` arg0, `boolean` arg1)`

**Returns:** `void`

### `setEditorTabText(`java.lang.String` arg0)`

**Returns:** `void`

### `setEditorTabTooltipText(`java.lang.String` arg0)`

**Returns:** `void`

### `getDocumentTypeInformation()`

**Returns:** [`ro.sync.exml.workspace.api.editor.documenttype.DocumentTypeInformation`](documenttype/DocumentTypeInformation.md)

