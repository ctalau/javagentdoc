# Class: `AuthorPersistentHighlightsListener`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`

## Description

You can register such a listener using 
 AuthorReviewController#addAuthorPersistentHighlightListener(AuthorPersistentHighlightsListener),

## Constructors

### `<init>()`

## Methods

### `highlightAdded(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): Added highlight.

### `highlightsAdded(java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight> highlights)`

**Returns:** `void`

**Parameters:**
- `highlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`): Added highlights.

### `highlightRemoved(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The removed highlight.

### `highlightsRemoved(java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight> highlights)`

**Returns:** `void`

**Parameters:**
- `highlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`): The list of highlights to be removed.

### `highlightUpdated(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The updated highlight.

### `highlightRangeReconfiguredUpdated(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, int oldStartOffset, int oldEndOffset)`

**Returns:** `void`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The updated highlight.
- `oldStartOffset` (`int`): The old start range for the highlight.
- `oldEndOffset` (`int`): The old end range for the highlight

### `highlightsChanged()`

**Returns:** `void`

API code which inserts or deletes multiple fragments in one operation like:

 
 ro.sync.ecss.extensions.api.AuthorDocumentController.insertMultipleFragments(AuthorElement, AuthorDocumentFragment[], int[])

 ro.sync.ecss.extensions.api.AuthorDocumentController.insertMultipleElements(AuthorElement, String[], int[], String)

 ro.sync.ecss.extensions.api.AuthorDocumentController.multipleDelete(AuthorElement, int[], int[])

 
 will not fire atomic events each time a highlight is reconfigured.

 Instead, they will fire a single event after the operation has finished notifying the listener to reconfigure all its highlight data.

 
 This event will follow an:

 
  ro.sync.ecss.dom.AuthorDocumentListener.authorNodeStructureChanged(AuthorNodeStructureChangedEvent)

  
  event.

