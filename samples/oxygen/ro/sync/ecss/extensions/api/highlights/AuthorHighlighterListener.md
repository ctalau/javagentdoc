# Interface: `AuthorHighlighterListener`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorHighlighterListener`

## Description

To add this listener use the 
 following method: AuthorHighlighter#addListener(AuthorHighlighterListener).

## Methods

### `highlightAdded(Highlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): The added highlight.

**Returns:** `void`

### `highlightRemoved(Highlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.Highlight`](./Highlight.md)): The removed highlight.

**Returns:** `void`

### `highlightsRemoved(Highlight[] highlights)`

**Parameters:**
- `highlights` ([`ro.sync.ecss.extensions.api.highlights.Highlight[]`](./Highlight.md)): The removed highlights.

**Returns:** `void`

### `allHighlightsRemoved(List<Highlight> removedHighlights)`

**Parameters:**
- `removedHighlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.Highlight>`): The list of removed highlights.

**Returns:** `void`

