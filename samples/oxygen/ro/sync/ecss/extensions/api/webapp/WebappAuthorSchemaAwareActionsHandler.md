# Interface: `WebappAuthorSchemaAwareActionsHandler`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappAuthorSchemaAwareActionsHandler`

## Description

## Methods

### `handleHtmlPaste(`java.lang.String` html)`

**Returns:** `void`

### `handleXmlPaste(`java.lang.String` xml)`

**Returns:** `void`

### `handleTextPaste(`java.lang.String` text)`

**Returns:** `void`

### `handlePaste([`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md) toPaste, `boolean` removeSelection, `boolean` pasteAsXml)`

**Returns:** `void`

### `handleCopy()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `handleCut()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `handleCopyAsMarkdown()`

**Returns:** [`ro.sync.ecss.component.AuthorClipboardObject`](../../../component/AuthorClipboardObject.md)

### `insertCharAtCurrentOffset(`char` ch)`

**Returns:** `void`

Any
 selected content is first deleted.

### `insertCodePointAtCurrentOffset(`int` codePoint)`

**Returns:** `void`

Any selected content is first deleted.

### `delete(`boolean` del, `boolean` wordLevel)`

**Returns:** `void`

### `handleDragAndDrop(`int` start, `int` end, `int` target)`

**Returns:** `void`

### `handleDragAndDrop(`int` targetOffset, `boolean` doCut)`

**Returns:** `void`

