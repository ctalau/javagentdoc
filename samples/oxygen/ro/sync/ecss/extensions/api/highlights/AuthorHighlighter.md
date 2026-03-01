# Interface: `AuthorHighlighter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`

## Description

To have access to this highlighter use the following method:
 AuthorEditorAccess#getHighlighter()

## Methods

### `addHighlight(`int` startOffset, `int` endOffset, [`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md) painter, `java.lang.Object` additionalData)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)

Returns a tag that can be used
 to refer to the highlight.

### `removeHighlight([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md) highlight)`

**Returns:** `void`

### `removeHighlights([`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md) highlights)`

**Returns:** `void`

### `removeAllHighlights()`

**Returns:** `void`

### `getHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)

### `findNonPersistentHighlights(`int` startOffset, `int` endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)

### `addListener([`ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener`](./AuthorHighlighterListener.md) listener)`

**Returns:** `void`

