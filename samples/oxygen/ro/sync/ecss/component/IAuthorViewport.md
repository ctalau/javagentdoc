# Interface: `IAuthorViewport`

**Package:** [`ro.sync.ecss.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.IAuthorViewport`

**Extends:** `ro.sync.ecss.component.i.m`, `ro.sync.contentcompletion.n`, `ro.sync.ecss.component.z`, `ro.sync.ecss.changetracking.l`, [`ro.sync.ecss.component.EditAttributesSupport`](./EditAttributesSupport.md)

## Fields

### `SENTINEL`

**Type:** `char`

## Methods

### `delete(`int` arg0, `int` arg1, `boolean` arg2)`

**Returns:** `boolean`

### `getDocumentTypeProvider()`

**Returns:** `ro.sync.exml.editor.xmleditor.nb`

### `getMultipleSelectionActionsSupport()`

**Returns:** `ro.sync.ecss.strictediting.IMultipleSelectionSchemaAwareActionsSupport`

### `getStringForClipboard(`int` arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getCurrentSelectedNode(`ro.sync.ecss.dom.p` arg0)`

**Returns:** `ro.sync.ecss.dom.p`

### `getCustomPersistentHighlighter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlighter`](../extensions/api/highlights/AuthorPersistentHighlighter.md)

### `getPersistentHighlighsRendererController()`

**Returns:** `ro.sync.ecss.component.g.b`

### `doMiddleClickPaste()`

**Returns:** `void`

### `addCaretListener([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../extensions/api/AuthorCaretListener.md) arg0)`

**Returns:** `void`

### `removeCaretListener([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../extensions/api/AuthorCaretListener.md) arg0)`

**Returns:** `void`

### `setEditAttributesSupport([`ro.sync.ecss.component.EditAttributesSupport`](./EditAttributesSupport.md) arg0)`

**Returns:** `void`

### `setMultipleSelectionMode(`boolean` arg0)`

**Returns:** `void`

### `isMultipleSelectionMode()`

**Returns:** `boolean`

### `getRootBox()`

**Returns:** `ro.sync.ecss.i.ub`

### `getAuthorHighlightsProvider()`

**Returns:** `ro.sync.ecss.component.g.h`

### `getCalloutActionsProviders()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.callouts.CalloutActionsProvider>`

### `getCalloutsController()`

**Returns:** `ro.sync.ecss.component.callouts.b.c`

### `getTableCellsSelectionInformation(`boolean` arg0)`

**Returns:** `ro.sync.ecss.i.b.c.i`

### `getSelectionMetadata(`ro.sync.ecss.i.b.c.i` arg0)`

**Returns:** [`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md)

### `edit(`ro.sync.ecss.i.l` arg0, `ro.sync.exml.view.k` arg1, `ro.sync.exml.view.graphics.Point` arg2)`

**Returns:** `boolean`

### `isEditingInplace()`

**Returns:** `boolean`

### `getWordAtCaret()`

**Returns:** `int[]`

### `findEditorBox(`ro.sync.ecss.component.editor.l` arg0)`

**Returns:** `ro.sync.ecss.component.w`

### `switchSelectionColorToContentHighlightColor()`

**Returns:** `void`

### `switchContentHighlightColorToSelectionColor()`

**Returns:** `void`

### `joinSplits(`int[]` arg0)`

**Returns:** `boolean`

### `getSize()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `setCaretGhostOffset(`int` arg0, `int` arg1, `int` arg2)`

**Returns:** `void`

### `resetCaretGhostOffset()`

**Returns:** `void`

### `editAttributesInplace()`

**Returns:** `void`

### `isOffsetInFixedBox(`int` arg0)`

**Returns:** `boolean`

### `getHighlightsWidgetHelper()`

**Returns:** `ro.sync.ecss.component.g.e`

### `getChangeTrackingViewMode()`

**Returns:** `int`

### `getCalloutInfo(`java.lang.String` arg0)`

**Returns:** `ro.sync.ecss.component.callouts.c.g`

### `getCalloutsWidth()`

**Returns:** `int`

### `setCalloutsImposedWidth(`int` arg0)`

**Returns:** `void`

