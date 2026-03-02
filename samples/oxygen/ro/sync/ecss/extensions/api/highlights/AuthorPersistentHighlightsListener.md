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

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): Added highlight.

**Returns:** `void`

### `highlightsAdded(java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight> highlights)`

**Parameters:**
- `highlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`): Added highlights.

**Returns:** `void`

### `highlightRemoved(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The removed highlight.

**Returns:** `void`

### `highlightsRemoved(java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight> highlights)`

**Parameters:**
- `highlights` (`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`): The list of highlights to be removed.

**Returns:** `void`

### `highlightUpdated(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The updated highlight.

**Returns:** `void`

### `highlightRangeReconfiguredUpdated(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, int oldStartOffset, int oldEndOffset)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The updated highlight.
- `oldStartOffset` (`int`): The old start range for the highlight.
- `oldEndOffset` (`int`): The old end range for the highlight

**Returns:** `void`

### `highlightsChanged()`

API code which inserts or deletes multiple fragments in one operation like:

 
 ro.sync.ecss.extensions.api.AuthorDocumentController.insertMultipleFragments(AuthorElement, AuthorDocumentFragment[], int[])

 ro.sync.ecss.extensions.api.AuthorDocumentController.insertMultipleElements(AuthorElement, String[], int[], String)

 ro.sync.ecss.extensions.api.AuthorDocumentController.multipleDelete(AuthorElement, int[], int[])

 
 will not fire atomic events each time a highlight is reconfigured.

 Instead, they will fire a single event after the operation has finished notifying the listener to reconfigure all its highlight data.

 
 This event will follow an:

 
  ro.sync.ecss.dom.AuthorDocumentListener.authorNodeStructureChanged(AuthorNodeStructureChangedEvent)

  
  event.

**Returns:** `void`

