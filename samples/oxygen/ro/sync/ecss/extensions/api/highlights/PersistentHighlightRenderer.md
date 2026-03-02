# Interface: `PersistentHighlightRenderer`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer`

## Description

Persistent highlights get serialized as processing instructions in the XML content.

## Methods

### `getHighlightPainter(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

If a `null` value is returned the default highlight 
 painter will be used.
 

 You can use or customize instances of the default ColorHighlightPainter.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The AuthorPersistentHighlight to get the painter for.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md)

### `getTooltip(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

If a `null` value is returned the default tooltip text will be used.

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The AuthorPersistentHighlight to get the tooltip for.

**Returns:** `java.lang.String`

