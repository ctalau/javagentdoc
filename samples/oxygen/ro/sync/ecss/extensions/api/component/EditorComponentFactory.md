# Class: `EditorComponentFactory`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.EditorComponentFactory`

## Fields

### `instance`

**Type:** [`ro.sync.ecss.extensions.api.component.EditorComponentFactory`](./EditorComponentFactory.md)

### `initialized`

**Type:** `boolean`

### `editorManager`

**Type:** `ro.sync.exml.workspace.b.i.j`

### `keyGenerator`

**Type:** [`ro.sync.ecss.extensions.api.component.KeyGenerator`](./KeyGenerator.md)

## Constructors

### `<init>()`

## Methods

### `getInstance()`

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentFactory`](./EditorComponentFactory.md)

### `dispose()`

**Returns:** `void`

### `setObjectProperty(java.lang.String arg0, java.lang.Object arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.Object`)

### `createEditorComponentProvider(java.lang.String[] arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md)

**Parameters:**
- `arg0` (`java.lang.String[]`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `getPublicKey()`

**Returns:** `java.security.PublicKey`

### `createEditorManager()`

**Returns:** `void`

### `disposeEditorComponentProvider(ro.sync.ecss.extensions.api.component.EditorComponentProvider arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md))

### `setOpenURLHandler(ro.sync.ecss.extensions.api.component.listeners.OpenURLHandler arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.listeners.OpenURLHandler`](listeners/OpenURLHandler.md))

### `goToReference(java.net.URL arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)

