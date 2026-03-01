# Class: `URLChooserEditorSWT`

**Package:** [`ro.sync.ecss.extensions.commons.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.editor.URLChooserEditorSWT`

**Extends:** [`ro.sync.ecss.extensions.api.editor.AbstractInplaceEditor`](../../api/editor/AbstractInplaceEditor.md)

**Implements:** `org.eclipse.jface.text.ITextOperationTarget`

## Fields

### `urlChooserComposite`

**Type:** `org.eclipse.swt.widgets.Composite`

### `browseButton`

**Type:** `org.eclipse.swt.widgets.Button`

### `textViewer`

**Type:** `org.eclipse.jface.text.source.SourceViewer`

### `buttonImage`

**Type:** `org.eclipse.swt.graphics.Image`

### `isBrowsing`

**Type:** `boolean`

### `utilAccess`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](../../api/access/AuthorUtilAccess.md)

### `swtFont`

**Type:** `org.eclipse.swt.graphics.Font`

### `foregroundColor`

**Type:** `org.eclipse.swt.graphics.Color`

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `getEditorComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md) arg0, `ro.sync.exml.view.graphics.Rectangle` arg1, `ro.sync.exml.view.graphics.Point` arg2)`

**Returns:** `java.lang.Object`

### `getScrollRectangle()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `requestFocus()`

**Returns:** `void`

### `getValue()`

**Returns:** `java.lang.Object`

### `stopEditing()`

**Returns:** `void`

### `commitValue()`

**Returns:** `void`

### `stopEditing(`boolean` arg0)`

**Returns:** `void`

### `cancelEditing()`

**Returns:** `void`

### `prepareComponents([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md) arg0)`

**Returns:** `void`

### `setInitialValue([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md) arg0)`

**Returns:** `void`

### `dispose()`

**Returns:** `void`

### `canDoOperation(`int` arg0)`

**Returns:** `boolean`

### `doOperation(`int` arg0)`

**Returns:** `void`

### `refresh([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md) arg0)`

**Returns:** `void`

