# Interface: `WebappAuthorSchemaAwareActionsHandler`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappAuthorSchemaAwareActionsHandler`

## Description

## Methods

### `handleHtmlPaste(java.lang.String html)`

**Returns:** `void`

**Parameters:**
- `html` (`java.lang.String`): The HTML content.

### `handleXmlPaste(java.lang.String xml)`

**Returns:** `void`

**Parameters:**
- `xml` (`java.lang.String`): the XML content.

### `handleTextPaste(java.lang.String text)`

**Returns:** `void`

**Parameters:**
- `text` (`java.lang.String`): the text content.

### `handlePaste(ro.sync.ecss.component.AuthorClipboardObject toPaste, boolean removeSelection, boolean pasteAsXml)`

**Returns:** `void`

**Parameters:**
- `toPaste` ([`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)): The fragment to paste
- `removeSelection` (`boolean`): Remove the selection
- `pasteAsXml` (`boolean`): If `true` treat the pasted text as an xml fragment. Else escape it
 and insert it.

### `handleCopy()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `handleCut()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `handleCopyAsMarkdown()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `insertCharAtCurrentOffset(char ch)`

**Returns:** `void`

Any
 selected content is first deleted.

**Parameters:**
- `ch` (`char`): The character to insert.

### `insertCodePointAtCurrentOffset(int codePoint)`

**Returns:** `void`

Any selected content is first deleted.

**Parameters:**
- `codePoint` (`int`): The code point to insert.

### `delete(boolean del, boolean wordLevel)`

**Returns:** `void`

**Parameters:**
- `del` (`boolean`): `true` if  the deletion was triggered by a DEL.
- `wordLevel` (`boolean`): Whether we should delete an entire word.

### `handleDragAndDrop(int start, int end, int target)`

**Returns:** `void`

**Parameters:**
- `start` (`int`): The start offset of the dragged fragment.
- `end` (`int`): The end offset of the dragged fragment.
- `target` (`int`): The location where the fragment is dropped.

### `handleDragAndDrop(int targetOffset, boolean doCut)`

**Returns:** `void`

**Parameters:**
- `targetOffset` (`int`): The location where the fragment is dropped.
- `doCut` (`boolean`): True to cut, otherwise copy.

