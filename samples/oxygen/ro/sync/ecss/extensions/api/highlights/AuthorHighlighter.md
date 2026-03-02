# Interface: `AuthorHighlighter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`

## Description

To have access to this highlighter use the following method:
 AuthorEditorAccess#getHighlighter()

## Methods

### `addHighlight(int startOffset, int endOffset, HighlightPainter painter, Object additionalData)`

Returns a tag that can be used
 to refer to the highlight.

**Parameters:**
- `startOffset` (`int`): the beginning of the range >= 0
- `endOffset` (`int`): the inclusive end of the range >= startOffset
- `painter` ([`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md)): the painter to use for the actual highlighting
- `additionalData` (`java.lang.Object`): The additional data which can be stored in the highlight. May be null.
   In Web Author, if the provided additional data is a map, all the keys/value pairs of 
   String/String type are inserted as attributes in the generated HTML span element 
   (excepting the "class" key, all keys are inserted as attributes names with a "data-" prefix).

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)

### `removeHighlight(Highlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): which highlight to remove

**Returns:** `void`

### `removeHighlights(Highlight[] highlights)`

**Parameters:**
- `highlights` ([`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)): which highlights to be removed

**Returns:** `void`

### `removeAllHighlights()`

**Returns:** `void`

### `getHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)

### `findNonPersistentHighlights(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): The start offset of the range.
- `endOffset` (`int`): The end offset of the range.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)

### `addListener(AuthorHighlighterListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener`](./AuthorHighlighterListener.md)): The listener

**Returns:** `void`

