# Interface: `IAuthorViewport`

**Package:** [`ro.sync.ecss.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.IAuthorViewport`

**Extends:** `ro.sync.ecss.component.i.m`, `ro.sync.contentcompletion.n`, `ro.sync.ecss.component.z`, `ro.sync.ecss.changetracking.l`, [`ro.sync.ecss.component.EditAttributesSupport`](./EditAttributesSupport.md)

## Fields

### `SENTINEL`

**Type:** `char`

## Methods

### `delete(int arg0, int arg1, boolean arg2)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`boolean`)

### `getDocumentTypeProvider()`

**Returns:** `ro.sync.exml.editor.xmleditor.nb`

### `getMultipleSelectionActionsSupport()`

**Returns:** `ro.sync.ecss.strictediting.IMultipleSelectionSchemaAwareActionsSupport`

### `getStringForClipboard(int arg0, int arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

### `getCurrentSelectedNode(ro.sync.ecss.dom.p arg0)`

**Returns:** `ro.sync.ecss.dom.p`

**Parameters:**
- `arg0` (`ro.sync.ecss.dom.p`)

### `getCustomPersistentHighlighter()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlighter`](../extensions/api/highlights/AuthorPersistentHighlighter.md)

### `getPersistentHighlighsRendererController()`

**Returns:** `ro.sync.ecss.component.g.b`

### `doMiddleClickPaste()`

**Returns:** `void`

### `addCaretListener(ro.sync.ecss.extensions.api.AuthorCaretListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../extensions/api/AuthorCaretListener.md))

### `removeCaretListener(ro.sync.ecss.extensions.api.AuthorCaretListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorCaretListener`](../extensions/api/AuthorCaretListener.md))

### `setEditAttributesSupport(ro.sync.ecss.component.EditAttributesSupport arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.component.EditAttributesSupport`](./EditAttributesSupport.md))

### `setMultipleSelectionMode(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

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

### `getTableCellsSelectionInformation(boolean arg0)`

**Returns:** `ro.sync.ecss.i.b.c.i`

**Parameters:**
- `arg0` (`boolean`)

### `getSelectionMetadata(ro.sync.ecss.i.b.c.i arg0)`

**Returns:** [`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md)

**Parameters:**
- `arg0` (`ro.sync.ecss.i.b.c.i`)

### `edit(ro.sync.ecss.i.l arg0, ro.sync.exml.view.k arg1, ro.sync.exml.view.graphics.Point arg2)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.ecss.i.l`)
- `arg1` (`ro.sync.exml.view.k`)
- `arg2` (`ro.sync.exml.view.graphics.Point`)

### `isEditingInplace()`

**Returns:** `boolean`

### `getWordAtCaret()`

**Returns:** `int[]`

### `findEditorBox(ro.sync.ecss.component.editor.l arg0)`

**Returns:** `ro.sync.ecss.component.w`

**Parameters:**
- `arg0` (`ro.sync.ecss.component.editor.l`)

### `switchSelectionColorToContentHighlightColor()`

**Returns:** `void`

### `switchContentHighlightColorToSelectionColor()`

**Returns:** `void`

### `joinSplits(int[] arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`int[]`)

### `getSize()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `setCaretGhostOffset(int arg0, int arg1, int arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`int`)

### `resetCaretGhostOffset()`

**Returns:** `void`

### `editAttributesInplace()`

**Returns:** `void`

### `isOffsetInFixedBox(int arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`int`)

### `getHighlightsWidgetHelper()`

**Returns:** `ro.sync.ecss.component.g.e`

### `getChangeTrackingViewMode()`

**Returns:** `int`

### `getCalloutInfo(java.lang.String arg0)`

**Returns:** `ro.sync.ecss.component.callouts.c.g`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getCalloutsWidth()`

**Returns:** `int`

### `setCalloutsImposedWidth(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

