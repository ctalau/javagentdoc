# Interface: `WSTextBasedEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](./WSEditorPage.md)

## Description

## Methods

### `getSelectionStart()`

It is inclusive.

**Returns:** `int`

### `getSelectionEnd()`

It is exclusive.

**Returns:** `int`

### `getSelectedText()`

The text does not contain XML tags for the Author page.

**Returns:** `java.lang.String`

### `getCaretOffset()`

**Returns:** `int`

### `deleteSelection()`

**Returns:** `void`

### `hasSelection()`

**Returns:** `boolean`

### `selectWord()`

**Returns:** `void`

### `setCaretPosition(int offset)`

**Parameters:**
- `offset` (`int`): The offset where the caret should be positioned, 0 based.

**Returns:** `void`

### `select(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): Inclusive start offset
- `endOffset` (`int`): Exclusive end offset

**Returns:** `void`

### `getWordAtCaret()`

**Returns:** `int[]`

### `getLocationOnScreenAsPoint(int x, int y)`

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the viewport origin.
- `y` (`int`): The "y" coordinate relative to the viewport origin.

**Returns:** `ro.sync.exml.view.graphics.Point`

### `getLocationRelativeToEditorFromScreen(int x, int y)`

**Parameters:**
- `x` (`int`): The "x" coordinate which is relative to the main application frame/display.
- `y` (`int`): The "y" coordinate which is relative to the main application frame/display.

**Returns:** `ro.sync.exml.view.graphics.Point`

### `modelToViewRectangle(int offset)`

**Parameters:**
- `offset` (`int`): The document offset to get the corresponding caret shape for.

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `viewToModelOffset(int x, int y)`

**Parameters:**
- `x` (`int`): The "x" coordinate relative to the editing component origin.
- `y` (`int`): The "y" coordinate relative to the editing component origin.

**Returns:** `int`

### `getStartEndOffsets(ro.sync.document.DocumentPositionedInfo dpInfo)`

**Parameters:**
- `dpInfo` ([`ro.sync.document.DocumentPositionedInfo`](../../../../../document/DocumentPositionedInfo.md)): The document position information.

**Returns:** `int[]`

### `createAnchor(int offset)`

The anchor can later be used in the current or in another editing mode to identify an offset particular to it.
 For example you can create an anchor in the Author editing mode based on an Author-specific offset and then use 
 it in the Text editing mode to identify a specific offset in the Text editing page.
 A previous created anchor will not be updated dynamically when changes are made in the document so using it later on will not guarantee 
 that it will point exactly at the offset for which it was originally computed.

**Parameters:**
- `offset` (`int`): The offset in the edited content.

**Returns:** [`ro.sync.exml.workspace.api.editor.page.Anchor`](./Anchor.md)

### `getOffsetForAnchor(ro.sync.exml.workspace.api.editor.page.Anchor anchor)`

**Parameters:**
- `anchor` ([`ro.sync.exml.workspace.api.editor.page.Anchor`](./Anchor.md)): The anchor.

**Returns:** `int`

### `scrollCaretToVisible()`

**Returns:** `void`

### `copy()`

If there is no selection, this method does nothing.

**Returns:** `void`

