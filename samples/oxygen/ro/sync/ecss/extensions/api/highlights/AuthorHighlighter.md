# Interface: `AuthorHighlighter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`

## Description

To have access to this highlighter use the following method:
 AuthorEditorAccess#getHighlighter()

## Methods

### `addHighlight(int startOffset, int endOffset, ro.sync.ecss.extensions.api.highlights.HighlightPainter painter, java.lang.Object additionalData)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)

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

### `removeHighlight(ro.sync.ecss.extensions.api.highlights.Highlight highlight)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): which highlight to remove

### `removeHighlights(ro.sync.ecss.extensions.api.highlights.Highlight[] highlights)`

**Returns:** `void`

**Parameters:**
- `highlights` ([`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)): which highlights to be removed

### `removeAllHighlights()`

**Returns:** `void`

### `getHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)

### `findNonPersistentHighlights(int startOffset, int endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)

**Parameters:**
- `startOffset` (`int`): The start offset of the range.
- `endOffset` (`int`): The end offset of the range.

### `addListener(ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener`](./AuthorHighlighterListener.md)): The listener

