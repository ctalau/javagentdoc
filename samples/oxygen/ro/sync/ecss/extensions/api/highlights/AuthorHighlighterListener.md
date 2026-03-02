# Interface: `AuthorHighlighterListener`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener`

## Description

To add this listener use the 
 following method: AuthorHighlighter#addListener(AuthorHighlighterListener).

## Methods

### `highlightAdded(ro.sync.ecss.extensions.api.highlights.Highlight highlight)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): The added highlight.

### `highlightRemoved(ro.sync.ecss.extensions.api.highlights.Highlight highlight)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): The removed highlight.

### `highlightsRemoved(ro.sync.ecss.extensions.api.highlights.Highlight[] highlights)`

**Returns:** `void`

**Parameters:**
- `highlights` ([`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)): The removed highlights.

### `allHighlightsRemoved(java.util.List<ro.sync.ecss.extensions.api.highlights.Highlight> removedHighlights)`

**Returns:** `void`

**Parameters:**
- `removedHighlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.Highlight>`): The list of removed highlights.

