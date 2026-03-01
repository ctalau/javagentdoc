# Class: `AuthorPersistentHighlightsListener`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`

## Description

You can register such a listener using 
 AuthorReviewController#addAuthorPersistentHighlightListener(AuthorPersistentHighlightsListener),

## Constructors

### `<init>()`

## Methods

### `highlightAdded([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `void`

### `highlightsAdded(`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` highlights)`

**Returns:** `void`

### `highlightRemoved([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `void`

### `highlightsRemoved(`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` highlights)`

**Returns:** `void`

### `highlightUpdated([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight)`

**Returns:** `void`

### `highlightRangeReconfiguredUpdated([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md) highlight, `int` oldStartOffset, `int` oldEndOffset)`

**Returns:** `void`

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

