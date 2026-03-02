# Interface: `AuthorHighlighterListener`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener`

## Description

To add this listener use the 
 following method: AuthorHighlighter#addListener(AuthorHighlighterListener).

## Methods

### `highlightAdded(ro.sync.ecss.extensions.api.highlights.Highlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): The added highlight.

**Returns:** `void`

### `highlightRemoved(ro.sync.ecss.extensions.api.highlights.Highlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): The removed highlight.

**Returns:** `void`

### `highlightsRemoved(ro.sync.ecss.extensions.api.highlights.Highlight[] highlights)`

**Parameters:**
- `highlights` ([`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)): The removed highlights.

**Returns:** `void`

### `allHighlightsRemoved(java.util.List<ro.sync.ecss.extensions.api.highlights.Highlight> removedHighlights)`

**Parameters:**
- `removedHighlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.Highlight>`): The list of removed highlights.

**Returns:** `void`

