# Interface: `InternalAuthorDocumentController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.InternalAuthorDocumentController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md)

## Methods

### `createDocumentFragmentRaw(`int` arg0, `int` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `setCanEditReadOnlyContext(`boolean` arg0)`

**Returns:** `boolean`

### `createContentReferenceNode(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](node/AuthorReferenceNode.md)

### `createErrorNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](node/AuthorReferenceNode.md)

### `unwrapRaw([`ro.sync.ecss.extensions.api.node.AuthorParentNode`](node/AuthorParentNode.md) arg0)`

**Returns:** `void`

### `setCommentIdRaw([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md) arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `addChangeMarker(`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType` arg0, `int` arg1, `int` arg2, `java.util.LinkedHashMap<java.lang.String,java.lang.String>` arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

### `addSelectionMarkListener([`ro.sync.ecss.extensions.api.SelectionMarkListener`](./SelectionMarkListener.md) arg0)`

**Returns:** `void`

### `removeSelectionMarkListener([`ro.sync.ecss.extensions.api.SelectionMarkListener`](./SelectionMarkListener.md) arg0)`

**Returns:** `void`

### `setReportAtomicChangesOnMultipleEdits(`boolean` arg0)`

**Returns:** `void`

### `setMarkerSerializationHandler([`ro.sync.ecss.extensions.api.MarkerSerializationHandler`](./MarkerSerializationHandler.md) arg0)`

**Returns:** `void`

### `getUndoManager()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorUndoManager`](./AuthorUndoManager.md)

### `setFinalDocumentFilter([`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md) arg0)`

**Returns:** `void`

### `getFinalDocumentFilter()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md)

### `removeFinalDocumentFilter()`

**Returns:** `void`

### `getAuthorEtagManager()`

**Returns:** `ro.sync.ecss.dom.AuthorEtagManager`

