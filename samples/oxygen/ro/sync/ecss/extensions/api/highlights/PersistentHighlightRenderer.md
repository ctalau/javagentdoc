# Interface: `PersistentHighlightRenderer`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer`

## Description

Persistent highlights get serialized as processing instructions in the XML content.

## Methods

### `getHighlightPainter([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.HighlightPainter`](./HighlightPainter.md)

If a `null` value is returned the default highlight 
 painter will be used.
 

 You can use or customize instances of the default ColorHighlightPainter.

### `getTooltip([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `java.lang.String`

If a `null` value is returned the default tooltip text will be used.

