# Interface: `AuthorReviewController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorReviewController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorChangeTrackingController`](./AuthorChangeTrackingController.md), [`ro.sync.ecss.extensions.api.AuthorReviewerNameController`](./AuthorReviewerNameController.md)

## Description

## Methods

### `getAuthorCalloutsController()`

**Returns:** [`ro.sync.ecss.extensions.api.callouts.AuthorCalloutsController`](callouts/AuthorCalloutsController.md)

This controller can be used to check what types of callouts are presented in 
 Author mode. It also can be used to override the callouts display options 
 from Oxygen Preferences.

### `getAuthorReviewViewController()`

**Returns:** [`ro.sync.ecss.extensions.api.review.AuthorReviewViewController`](review/AuthorReviewViewController.md)

This controller can override review entries display options and contextual menu actions.

### `getCurrentTimestamp()`

**Returns:** `java.lang.String`

Form: `yyyyMMdd'T'HHmmssZ`

### `getReviewerAutoColor(`java.lang.String` reviewerAuthorName)`

**Returns:** `ro.sync.exml.view.graphics.Color`

It is used when in the Oxygen Preferences **Auto** coloring is set for the `Insert`, `Delete` or `Comment` reviews.

### `setReviewRenderer([`ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer`](highlights/PersistentHighlightRenderer.md) renderer)`

**Returns:** `void`

### `getCommentHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

### `getCommentHighlights(`int` startOffset, `int` endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

### `setPersistentHighlightProperties([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md) highlight, `java.util.LinkedHashMap<java.lang.String,java.lang.String>` properties)`

**Returns:** `void`

A copy of the initial properties can be obtained from AuthorPersistentHighlight#getClonedProperties()
 Please note that this method allows setting the properties of all persistent highlights, 
 whether the current author is the author of the highlight or not.
 
 The existing properties will be overwritten, excepting the ones that are specific to Oxygen XML 
 comments or track changes processing instructions, that cannot be changed. You can see the name of 
 these specific properties in AuthorPersistentHighlightConstants.

### `removePersistentHighlightProperties([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md) highlight, `java.util.List<java.lang.String>` properties)`

**Returns:** `void`

A copy of the initial properties can be obtained from AuthorPersistentHighlight#getClonedProperties()
 Please note that the properties that are specific to Oxygen XML comments or track changes 
 processing instructions cannot be removed. You can see the name of these specific properties 
 in AuthorPersistentHighlightConstants

### `addAuthorPersistentHighlightListener([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md) listener)`

**Returns:** `void`

In the persistent highlights are included:
 

  -  Change tracking markers and comments
  -  Additional persistent highlights 
    added using AuthorPersistentHighlighter#addHighlight(int, int, java.util.LinkedHashMap)

### `removeAuthorPersistentHighlightListener([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md) listener)`

**Returns:** `void`

### `addPersistentHighlightsFilter([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsFilter`](highlights/AuthorPersistentHighlightsFilter.md) persistentHighlightsFilter)`

**Returns:** `void`

A filter capable of filtering the highlights by author is present by default.

