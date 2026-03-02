# Interface: `InternalAuthorDocumentController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.InternalAuthorDocumentController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)

## Methods

### `createDocumentFragmentRaw(int arg0, int arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `setCanEditReadOnlyContext(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `boolean`

### `createContentReferenceNode(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](node/AuthorReferenceNode.md)

### `createErrorNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](node/AuthorReferenceNode.md)

### `unwrapRaw(AuthorParentNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](node/AuthorParentNode.md))

**Returns:** `void`

### `setCommentIdRaw(AuthorPersistentHighlight arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md))
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `addChangeMarker(AuthorPersistentHighlight.PersistentHighlightType arg0, int arg1, int arg2, LinkedHashMap<String,String> arg3)`

**Parameters:**
- `arg0` (`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType`)
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`java.util.LinkedHashMap<java.lang.String,java.lang.String>`)

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

### `addSelectionMarkListener(SelectionMarkListener arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.SelectionMarkListener`](./SelectionMarkListener.md))

**Returns:** `void`

### `removeSelectionMarkListener(SelectionMarkListener arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.SelectionMarkListener`](./SelectionMarkListener.md))

**Returns:** `void`

### `setReportAtomicChangesOnMultipleEdits(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setMarkerSerializationHandler(MarkerSerializationHandler arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.MarkerSerializationHandler`](./MarkerSerializationHandler.md))

**Returns:** `void`

### `getUndoManager()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorUndoManager`](./AuthorUndoManager.md)

### `setFinalDocumentFilter(AuthorDocumentFilter arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md))

**Returns:** `void`

### `getFinalDocumentFilter()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md)

### `removeFinalDocumentFilter()`

**Returns:** `void`

### `getAuthorEtagManager()`

**Returns:** `ro.sync.ecss.dom.AuthorEtagManager`

