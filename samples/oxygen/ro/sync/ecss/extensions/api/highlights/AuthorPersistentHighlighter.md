# Interface: `AuthorPersistentHighlighter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlighter`

## Description

## Methods

### `addHighlight(`int` startOffset, `int` endOffset, `java.util.LinkedHashMap<java.lang.String,java.lang.String>` properties)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)

The name of the processing instruction markers corresponding to this type of highlight are
 `oxy_custom_start` and `oxy_custom_end`.
 

 The type of the added persistent highlight is PersistentHighlightType#CUSTOM_HIGHLIGHT.

### `canAddHighlight(`int` startOffset, `int` endOffset)`

**Returns:** `boolean`

If one of these offsets correspond to a read-only context 
 (they are inside a content deleted with track changes, an element set as read-only from 
 CSS or a content generated from expanding a reference) the highlight cannot 
 be inserted and this method returns `false`.
 

 

 A custom persistent highlight can be added by using the 
 #addHighlight(int, int, LinkedHashMap) method. The name of the 
 processing instruction markers corresponding to the custom persistent 
 highlight are `oxy_custom_start` and `oxy_custom_end`.

### `removeHighlight([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `void`

### `removeAllHighlights()`

**Returns:** `void`

### `getHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](./AuthorPersistentHighlight.md)

### `getHighlights(`int` startOffset, `int` endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](./AuthorPersistentHighlight.md)

### `setProperties([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight, `java.util.LinkedHashMap<java.lang.String,java.lang.String>` newProperties)`

**Returns:** `void`

### `setHighlightRenderer([`ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer`](./PersistentHighlightRenderer.md) renderer)`

**Returns:** `void`

### `setHighlightsActionsProvider([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightActionsProvider`](./AuthorPersistentHighlightActionsProvider.md) provider)`

**Returns:** `void`

The actions are currently displayed in the persistent highlights associated callouts popup menu,
 but in future could be also used as actions presented for a highlight in the contextual menu 
 of the main editing area.
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.
 To associate callout information to a custom highlight the 
 AuthorCalloutsController#setCalloutsRenderingInformationProvider(CalloutsRenderingInformationProvider)
 method must be used.

