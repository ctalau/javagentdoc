# Interface: `WSTextBasedEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](./WSEditorPage.md)

## Description

## Methods

### `getSelectionStart()`

**Returns:** `int`

It is inclusive.

### `getSelectionEnd()`

**Returns:** `int`

It is exclusive.

### `getSelectedText()`

**Returns:** `java.lang.String`

The text does not contain XML tags for the Author page.

### `getCaretOffset()`

**Returns:** `int`

### `deleteSelection()`

**Returns:** `void`

### `hasSelection()`

**Returns:** `boolean`

### `selectWord()`

**Returns:** `void`

### `setCaretPosition(`int` offset)`

**Returns:** `void`

### `select(`int` startOffset, `int` endOffset)`

**Returns:** `void`

### `getWordAtCaret()`

**Returns:** `int[]`

### `getLocationOnScreenAsPoint(`int` x, `int` y)`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `getLocationRelativeToEditorFromScreen(`int` x, `int` y)`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `modelToViewRectangle(`int` offset)`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `viewToModelOffset(`int` x, `int` y)`

**Returns:** `int`

### `getStartEndOffsets([`ro.sync.document.DocumentPositionedInfo`](../../../../../document/DocumentPositionedInfo.md) dpInfo)`

**Returns:** `int[]`

### `createAnchor(`int` offset)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.Anchor`](./Anchor.md)

The anchor can later be used in the current or in another editing mode to identify an offset particular to it.
 For example you can create an anchor in the Author editing mode based on an Author-specific offset and then use 
 it in the Text editing mode to identify a specific offset in the Text editing page.
 A previous created anchor will not be updated dynamically when changes are made in the document so using it later on will not guarantee 
 that it will point exactly at the offset for which it was originally computed.

### `getOffsetForAnchor([`ro.sync.exml.workspace.api.editor.page.Anchor`](./Anchor.md) anchor)`

**Returns:** `int`

### `scrollCaretToVisible()`

**Returns:** `void`

### `copy()`

**Returns:** `void`

If there is no selection, this method does nothing.

