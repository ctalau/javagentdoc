# Interface: `WebappAuthorSchemaAwareActionsHandler`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappAuthorSchemaAwareActionsHandler`

## Description

## Methods

### `handleHtmlPaste(java.lang.String html)`

**Parameters:**
- `html` (`java.lang.String`): The HTML content.

**Returns:** `void`

### `handleXmlPaste(java.lang.String xml)`

**Parameters:**
- `xml` (`java.lang.String`): the XML content.

**Returns:** `void`

### `handleTextPaste(java.lang.String text)`

**Parameters:**
- `text` (`java.lang.String`): the text content.

**Returns:** `void`

### `handlePaste(ro.sync.ecss.component.AuthorClipboardObject toPaste, boolean removeSelection, boolean pasteAsXml)`

**Parameters:**
- `toPaste` ([`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)): The fragment to paste
- `removeSelection` (`boolean`): Remove the selection
- `pasteAsXml` (`boolean`): If `true` treat the pasted text as an xml fragment. Else escape it
   and insert it.

**Returns:** `void`

### `handleCopy()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `handleCut()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `handleCopyAsMarkdown()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `insertCharAtCurrentOffset(char ch)`

Any
 selected content is first deleted.

**Parameters:**
- `ch` (`char`): The character to insert.

**Returns:** `void`

### `insertCodePointAtCurrentOffset(int codePoint)`

Any selected content is first deleted.

**Parameters:**
- `codePoint` (`int`): The code point to insert.

**Returns:** `void`

### `delete(boolean del, boolean wordLevel)`

**Parameters:**
- `del` (`boolean`): `true` if  the deletion was triggered by a DEL.
- `wordLevel` (`boolean`): Whether we should delete an entire word.

**Returns:** `void`

### `handleDragAndDrop(int start, int end, int target)`

**Parameters:**
- `start` (`int`): The start offset of the dragged fragment.
- `end` (`int`): The end offset of the dragged fragment.
- `target` (`int`): The location where the fragment is dropped.

**Returns:** `void`

### `handleDragAndDrop(int targetOffset, boolean doCut)`

**Parameters:**
- `targetOffset` (`int`): The location where the fragment is dropped.
- `doCut` (`boolean`): True to cut, otherwise copy.

**Returns:** `void`

