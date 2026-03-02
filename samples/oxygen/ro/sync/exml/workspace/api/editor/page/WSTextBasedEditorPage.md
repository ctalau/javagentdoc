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

### `setCaretPosition(int offset)`

**Returns:** `void`

**Parameters:**
- `offset` (`int`): The offset where the caret should be positioned, 0 based.

### `select(int startOffset, int endOffset)`

**Returns:** `void`

**Parameters:**
- `startOffset` (`int`): Inclusive start offset
- `endOffset` (`int`): Exclusive end offset

### `getWordAtCaret()`

**Returns:** `int[]`

### `getLocationOnScreenAsPoint(int x, int y)`

**Returns:** `ro.sync.exml.view.graphics.Point`

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the viewport origin.
- `y` (`int`): The "y" coordinate relative to the viewport origin.

### `getLocationRelativeToEditorFromScreen(int x, int y)`

**Returns:** `ro.sync.exml.view.graphics.Point`

**Parameters:**
- `x` (`int`): The "x" coordinate which is relative to the main application frame/display.
- `y` (`int`): The "y" coordinate which is relative to the main application frame/display.

### `modelToViewRectangle(int offset)`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

**Parameters:**
- `offset` (`int`): The document offset to get the corresponding caret shape for.

### `viewToModelOffset(int x, int y)`

**Returns:** `int`

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the editing component origin.
- `y` (`int`): The "y" coordinate relative to the editing component origin.

### `getStartEndOffsets(ro.sync.document.DocumentPositionedInfo dpInfo)`

**Returns:** `int[]`

**Parameters:**
- `dpInfo` ([`ro.sync.document.DocumentPositionedInfo`](../../../../../document/DocumentPositionedInfo.md)): The document position information.

### `createAnchor(int offset)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.Anchor`](./Anchor.md)

The anchor can later be used in the current or in another editing mode to identify an offset particular to it.
 For example you can create an anchor in the Author editing mode based on an Author-specific offset and then use 
 it in the Text editing mode to identify a specific offset in the Text editing page.
 A previous created anchor will not be updated dynamically when changes are made in the document so using it later on will not guarantee 
 that it will point exactly at the offset for which it was originally computed.

**Parameters:**
- `offset` (`int`): The offset in the edited content.

### `getOffsetForAnchor(ro.sync.exml.workspace.api.editor.page.Anchor anchor)`

**Returns:** `int`

**Parameters:**
- `anchor` ([`ro.sync.exml.workspace.api.editor.page.Anchor`](./Anchor.md)): The anchor.

### `scrollCaretToVisible()`

**Returns:** `void`

### `copy()`

**Returns:** `void`

If there is no selection, this method does nothing.

